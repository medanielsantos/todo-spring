package br.com.davile.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRespository extends JpaRepository<TaskModel, UUID> {

}
