package com.kodluyoruz.Service;

import com.kodluyoruz.DTO.UserDTO;
import com.kodluyoruz.Entity.Todo;
import com.kodluyoruz.Repository.TodoRepository;
import com.kodluyoruz.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import com.kodluyoruz.Entity.User;
import com.kodluyoruz.Entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final TodoRepository todoRepository;

    @Override
    @Transactional
    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setUserPassword(userDTO.getUserPassword());
        final User userdb = userRepository.save(user);
       List<Todo> todoList = new ArrayList<>();

       userDTO.getTodoList().forEach(item->{
          Todo todo = new Todo();
          todo.setTodoDesc(item);
          todo.setUser(userdb);
          todoList.add(todo);
      });
       todoRepository.saveAll(todoList);
        userDTO.setUserId(userdb.getUserId());
        return userDTO;
    }
/*
    @Override
    public void delete(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(()->new NoSuchElementException());
        userRepository.delete(user);
    }
    */
    @Override
    public void delete(Long userId){
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();
        users.forEach(item->{
                UserDTO userDTO = new UserDTO();
                userDTO.setUserId(item.getUserId());
                userDTO.setUserName(item.getUserName());
                userDTO.setTodoList(item.getTodoList().stream().map(Todo::getTodoDesc).collect(Collectors.toList()));
                userDTOS.add(userDTO);
        });
        return userDTOS;
    }

    @Override
    public Page<UserDTO> getAll(Pageable pageable) {
        return null;
    }



}
