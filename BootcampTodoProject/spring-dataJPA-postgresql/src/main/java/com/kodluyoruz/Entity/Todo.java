package com.kodluyoruz.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.util.backoff.BackOff;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="todos")
public class Todo {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long todoId;

    @Column(length = 100, name="todoDesc")
    private String todoDesc;

    @Column(name="isCompleted")
    private Boolean isCompleted = false;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_todo_id")
    private User user;



}
