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

    public Todo save(Todo todo) {
        if (todo.getId() == -1 || todo.getId() == 0) {
            todo.setId(++idCounter);
            todos.add(todo);
        } else {
            deleteById(todo.getId());
            todos.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id) {
        Todo todo = findById(id);

        if (todo == null)
            return null;

        if (todos.remove(todo))
            return todo;

        return null;
    }

    public Todo findById(long id) {
        for (Todo todo:todos) {
            if (todo.getId() == id)
                return todo;
        }
        return null;
    }
}
