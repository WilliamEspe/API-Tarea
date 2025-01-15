package com.example.gestor_tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestor_tareas.entity.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
