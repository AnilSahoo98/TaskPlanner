package service;

import org.springframework.stereotype.Component;

import model.Task;
import repository.TaskRepository;
@Component
public class TaskService {
	TaskRepository taskrepository;
	public void saveTask(Task task) {
		taskrepository.save(task);
		
	}

}
