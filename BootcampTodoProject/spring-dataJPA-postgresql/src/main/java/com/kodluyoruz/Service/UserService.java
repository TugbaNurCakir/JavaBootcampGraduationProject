package com.kodluyoruz.Service;

import com.kodluyoruz.DTO.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    UserDTO save(UserDTO userDTO);

    void delete(Long userId);

    List<UserDTO> getAll();

    Page<UserDTO> getAll(Pageable pageable);

}
