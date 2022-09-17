package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {
	@Id
	@Column
	private int taskId;
	@Column
	private String title;
	@Column
	private String  description;
	@Column
	private String createdBy;
	@Column
	private String assignedTo;
	@Column
	private String completedOn;
	@Column
	private String status;
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Column
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getCompletedOn() {
		return completedOn;
	}
	public void setCompletedOn(String completedOn) {
		this.completedOn = completedOn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TaskPlannerModel [taskId=" + taskId + ", title=" + title + ", description=" + description
				+ ", createdBy=" + createdBy + ", assignedTo=" + assignedTo + ", completedOn=" + completedOn
				+ ", status=" + status + "]";
	}

	
	

}
