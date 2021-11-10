package com.kodluyoruz.Controller;

import com.kodluyoruz.DTO.TodoDTO;
import com.kodluyoruz.DTO.UserDTO;
import com.kodluyoruz.Entity.Todo;
import com.kodluyoruz.Repository.TodoRepository;
import com.kodluyoruz.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {
    private TodoService todoService;
    private TodoRepository todoRepository;

    /*
    @GetMapping("/get")
    public ResponseEntity<List<TodoDTO>> getAll(){
        return ResponseEntity.ok(todoService.getAll());
    }

     */
    @DeleteMapping("/delete")
    public void deleteTodo(Long todoId){
        todoService.deleteTodo(todoId);
    }

    // Change done state

    @PostMapping("{todoId}")
    public ResponseEntity<Todo> todoCompleted(@PathVariable Long todoId){
        Todo todo = todoRepository.findById(todoId).orElseThrow(()->new NoSuchElementException());
        todo.setIsCompleted(!todo.getIsCompleted());
        todoRepository.save(todo);
        return new ResponseEntity<>(todo, HttpStatus.CHECKPOINT);
    }
}
