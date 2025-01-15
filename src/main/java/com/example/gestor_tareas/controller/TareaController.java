package com.example.gestor_tareas.controller;

import com.example.gestor_tareas.entity.Tarea;
import com.example.gestor_tareas.service.TareaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> getAll() {
        return tareaService.findAll();
    }

    @GetMapping("/{id}")
    public Tarea getById(@PathVariable int id) {
        return tareaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea create(@Valid @RequestBody Tarea tarea) {
        return tareaService.save(tarea);
    }

    @PutMapping("/{id}")
    public Tarea update(@PathVariable int id, @Valid @RequestBody Tarea tarea) {
        tarea.setId(id);
        return tareaService.save(tarea);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        tareaService.deleteById(id);
    }
}
