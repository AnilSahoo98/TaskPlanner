package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
	
}
