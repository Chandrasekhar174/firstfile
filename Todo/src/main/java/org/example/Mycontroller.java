package org.example;

import org.example.MyObject.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Mycontroller {
    private List<Todo>myTodo;
    public Mycontroller()
    {
        myTodo=new ArrayList<>();
    }


    @GetMapping("AllTodo")
    public List<Todo> getTodo()
    {
        return  myTodo;
    }
    @PostMapping("Insert_Todo")
    public String addTodo(@RequestBody Todo todo)
    {
        myTodo.add(todo);
        return "Insert Successfully";
    }
    @GetMapping("DoneTodo")
    public List<Todo> getDoneTodo()
    {
        List<Todo> todos=new ArrayList<>();
        for(Todo todo:todos)
        {
            if(todo.isStatus())
            {
                todos.add(todo);
            }
        }
        return todos;
    }
    @GetMapping("UnDoneTodo")
    public List<Todo> getUnDoneTodo()
    {
        List<Todo> todos=new ArrayList<>();
        for(Todo todo:todos)
        {
            if(!todo.isStatus())
            {
                todos.add(todo);
            }
        }
        return todos;
    }
    @PutMapping("updateTodo/{Id}/{status}")
    public String update(@PathVariable int Id,@PathVariable boolean status)
    {
        for(Todo todo:myTodo)
        {
            if(todo.getTodoId()==Id)
            {
                todo.setStatus(true);
                return "Update Successfully";
            }
        }
        return "TodoId"+Id+"Not found";
    }
    @DeleteMapping("DeleteTodo")
    public String deleteTodo(@RequestParam int Id)
    {
        for(Todo todo:myTodo)
        {
            if(todo.getTodoId()==Id)
            {
                myTodo.remove(todo);
                return "Delete Successfully";
            }
        }
        return "TodoId"+Id+"not found to delete";
    }
}
