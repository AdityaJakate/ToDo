package com.soft_corner.assignment.repo;

import com.soft_corner.assignment.entity.ToDo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface ToDoRepository  extends  JpaRepository<ToDo,Integer >{
}
