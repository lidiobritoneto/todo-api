package io.github.bubz.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.bubz.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
