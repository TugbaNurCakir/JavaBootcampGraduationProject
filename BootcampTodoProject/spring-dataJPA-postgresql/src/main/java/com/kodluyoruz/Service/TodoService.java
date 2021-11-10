package com.kodluyoruz.Service;

import com.kodluyoruz.DTO.TodoDTO;
import com.kodluyoruz.DTO.UserDTO;
import com.kodluyoruz.Entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TodoService {
    TodoDTO save(TodoDTO todoDTO);

    void deleteTodo(Long todoId);

    //List<TodoDTO> getAll();

    Page<TodoDTO> getAll(Pageable pageable);

    //Todo changeDoneStateForTodoItem(Long id);
}
