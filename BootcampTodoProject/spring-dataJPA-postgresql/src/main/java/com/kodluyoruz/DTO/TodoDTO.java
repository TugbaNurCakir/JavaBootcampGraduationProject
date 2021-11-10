package com.kodluyoruz.DTO;

import lombok.Data;
import lombok.Getter;

import java.util.List;


@Data
@Getter
public class TodoDTO {
    private Long todoId;

    private String todoTitle;

    private String todoDesc;

    private Boolean isCompleted;

    private List<String> TodoList ;
}
