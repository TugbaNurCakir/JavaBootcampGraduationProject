package com.kodluyoruz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kodluyoruz.Entity.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
