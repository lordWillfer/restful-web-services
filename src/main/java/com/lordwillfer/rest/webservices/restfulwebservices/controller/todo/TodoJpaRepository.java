package com.lordwillfer.rest.webservices.restfulwebservices.controller.todo;

import com.lordwillfer.rest.webservices.restfulwebservices.bean.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUsername(String username);
}
