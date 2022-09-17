package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Task;
import service.TaskService;

@Controller

public class TaskController {
	@Autowired
	TaskService service;
	@PostMapping(path="/createtask",consumes="application/json")
	public void  CreateTask(@RequestBody Task task) {
		 service.saveTask(task);
		
	}
	@PostMapping(path="/hello")
	public String  hello() {
		return "hwllo ";
	}
	
	
	
}
