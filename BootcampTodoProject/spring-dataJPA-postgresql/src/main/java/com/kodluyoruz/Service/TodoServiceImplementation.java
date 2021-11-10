package com.kodluyoruz.Service;

import com.kodluyoruz.DTO.TodoDTO;
import com.kodluyoruz.Entity.Todo;
import com.kodluyoruz.Repository.TodoRepository;
import com.kodluyoruz.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoServiceImplementation implements TodoService{

    private TodoRepository todoRepository;
    private UserRepository userRepository;

    /*
    @Override
    public TodoDTO save(TodoDTO todoDTO) {
        Todo todo = new Todo();
        todo.setTodoDesc(todoDTO.getTodoDesc());
        final Todo todoDb = todoRepository.save(todo);

        List<Todo> todoList = new ArrayList<>();



        return null;
    }
    */


    @Override
    public TodoDTO save(TodoDTO todoDTO) {
        return null;
    }

    @Override
    public void deleteTodo(Long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow(()->new NoSuchElementException());
        todoRepository.delete(todo);
    }

    @Override
    public Page<TodoDTO> getAll(Pageable pageable) {
        return null;
    }
/*
    @Override
    public Todo changeDoneStateForTodoItem(Long todoId) {
        Todo todo = todoRepository.findById(todoId);
        if(todo!=null){
            todo.setIsCompleted(!todo.getIsCompleted());
            todoRepository.save(todo);
            return todo;
        }
        return null;
    }

 */
}
