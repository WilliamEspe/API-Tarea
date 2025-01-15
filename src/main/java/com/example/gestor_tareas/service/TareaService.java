package com.example.gestor_tareas.service;

import com.example.gestor_tareas.entity.Tarea;
import com.example.gestor_tareas.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> findAll() {
        return tareaRepository.findAll();
    }

    public Tarea findById(int id) {
        return tareaRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public Tarea save(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void deleteById(int id) {
        tareaRepository.deleteById(id);
    }
}
