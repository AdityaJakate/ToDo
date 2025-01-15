package com.soft_corner.assignment.entity;



import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name="todo")
public class ToDo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user_name",nullable=true,length=32)
    private String user_name;

    @Column(name="task",nullable=false)
    private String task;

    @CreationTimestamp
    @Column(name="created_date",nullable=false)
    private Timestamp created_date;

    @CreationTimestamp
    @Column(name="updated_date",nullable=false)
    private  Timestamp updated_date;

    public  ToDo(){

    }
    public  void setId(){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public  void setTask(String task){
        this.task=task;
    }
    public  String getTask(){
        return task;
    }
    public Timestamp getCreated_date(){
        return created_date;
    }
    public void  setCreated_date(){
        this.created_date=created_date;
    }
    public Timestamp getUpdated_date(){
        return updated_date;
    }
    public void setUpdated_date(){
        this.updated_date=updated_date;
    }

    public String getUse_namer(){
        return user_name;
    }
    public void setUser_name(){
        this.user_name=user_name;
    }
}
