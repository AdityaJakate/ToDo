package com.soft_corner.assignment.services;

import com.soft_corner.assignment.entity.ToDo;
import com.soft_corner.assignment.repo.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToDoService {
    private final ToDoRepository todoRepository;

public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<ToDo> getAllToDos(){
        return todoRepository.findAll();
    }
    public ToDo createToDo(ToDo todo){
        return todoRepository.save(todo);
    }
}

