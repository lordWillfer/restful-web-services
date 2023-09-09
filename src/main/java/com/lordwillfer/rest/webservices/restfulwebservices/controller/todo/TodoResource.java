package com.lordwillfer.rest.webservices.restfulwebservices.controller.todo;

import com.lordwillfer.rest.webservices.restfulwebservices.bean.todo.Todo;
import com.lordwillfer.rest.webservices.restfulwebservices.helper.todo.TodoHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TodoResource {

    @Autowired
    private TodoHardcodedService todoService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username) {
        return todoService.findAll();
    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
        Todo todo = todoService.deleteById(id);
        if (todo != null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.notFound().build();
    }
}
