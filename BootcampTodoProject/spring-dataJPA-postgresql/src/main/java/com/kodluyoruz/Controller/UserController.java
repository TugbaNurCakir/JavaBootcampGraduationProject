package com.kodluyoruz.Controller;

import com.kodluyoruz.DTO.UserDTO;
import com.kodluyoruz.Entity.User;
import com.kodluyoruz.Repository.UserRepository;
import com.kodluyoruz.Service.UserService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController extends Exception{

    private final UserService userService;
    private final UserRepository userRepository;
    /*
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId){
        User user = (User) userService.getAll();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    */

    @PostMapping
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.save(userDTO));
    }
    @GetMapping("/get")
    public ResponseEntity<List<UserDTO>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody Long userId){
        userService.delete(userId);

    }
}
