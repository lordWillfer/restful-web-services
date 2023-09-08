package com.lordwillfer.rest.webservices.restfulwebservices.helper.todo;

import com.lordwillfer.rest.webservices.restfulwebservices.bean.todo.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    private static final List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new Todo(++idCounter, "lordWillfer", "Learn Javascript", new Date(), false));
        todos.add(new Todo(++idCounter, "lordWillfer", "Learn Typescript", new Date(), false));
        todos.add(new Todo(++idCounter, "lordWillfer", "Learn Angular", new Date(), false));
        todos.add(new Todo(++idCounter, "lordWillfer", "Learn React", new Date(), false));
        todos.add(new Todo(++idCounter, "lordWillfer", "Learn Spring Boot", new Date(), false));
    }

    public List<Todo> findAll() {
        return todos;
    }
}
