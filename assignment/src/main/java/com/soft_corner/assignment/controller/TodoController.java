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
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<ToDo> getAllTodos(){
        return toDoService.getAllToDos();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ToDo createToDo(@RequestBody ToDo todo) {
        System.out.print("here");
        System.out.println("Received Request Body: " + todo.toString());
        return toDoService.createToDo(todo);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping
    public ToDo saveToDo(@RequestBody ToDo todo) {
        return toDoService.saveToDo(todo);

    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping
    public void deleteToDo(@RequestBody ToDo todo){
         toDoService.deleteToDo(todo);
    }
}

