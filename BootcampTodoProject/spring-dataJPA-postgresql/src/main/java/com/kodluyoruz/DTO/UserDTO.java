package com.kodluyoruz.DTO;

import com.kodluyoruz.Entity.Todo;
import com.sun.istack.NotNull;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@Getter
public class UserDTO {
    private Long userId;

    @NotNull
    private String userName;

    private String userPassword;

    private Boolean isLogin;

    private List<String> TodoList ;
}
