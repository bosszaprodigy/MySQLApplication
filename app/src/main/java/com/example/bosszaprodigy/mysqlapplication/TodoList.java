package com.example.bosszaprodigy.mysqlapplication;

/**
 * Created by bosszaprodigy on 2/9/2017.
 */
import java.io.Serializable;

public class TodoList implements Serializable{
    public int taskid;
    public String taskname;

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }
}