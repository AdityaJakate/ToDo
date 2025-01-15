package com.soft_corner.assignment.controller;
import com.soft_corner.assignment.entity.ToDo;
import com.soft_corner.assignment.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> getAllTodos(){
        return toDoService.getAllToDos();
    }
    @PostMapping
    public ToDo createToDo(@RequestBody ToDo todo){
        return toDoService.createToDo(todo);
    }


}

