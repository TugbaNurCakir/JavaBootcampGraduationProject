package com.kodluyoruz.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Column
    @Id
    @SequenceGenerator(name="sequnce_user", allocationSize = 1)
    @GeneratedValue(generator = "sequence_user", strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(length = 100, name="userName", unique = true, nullable = false)
    private String userName;

    @Column(length = 100, name="userPassword", nullable = false)
    private String userPassword;

    @Column(name="isLogin ")
    private Boolean isLogin;

    @OneToMany
    @JoinColumn(name="user_todo_id")
    private List<Todo> TodoList = new ArrayList<Todo>();

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
