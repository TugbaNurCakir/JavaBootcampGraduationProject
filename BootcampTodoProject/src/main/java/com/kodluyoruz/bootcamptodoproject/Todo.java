package com.kodluyoruz.bootcamptodoproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Todo")
public class Todo {
    @Id
    @Column
    private Long todoId;

    @Column
    private String todoTitle;

    @Column
    private String todoDesc;


}
