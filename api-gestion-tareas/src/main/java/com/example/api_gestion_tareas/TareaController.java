package com.example.api_gestion_tareas;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    private final List<String> tareas = new ArrayList<>(List.of(
            "Configurar GitHub y Portafolio Web",
            "Crear API REST con Java y Spring Boot"
    ));

    @GetMapping
    public List<String> obtenerTareas() {
        return tareas;
    }

    @PostMapping
    public List<String> agregarTarea(@RequestBody String nuevaTarea) {
        if (nuevaTarea != null && !nuevaTarea.isBlank()) {
            tareas.add(nuevaTarea.trim());
        }
        return tareas;
    }

    @DeleteMapping("/{indice}")
    public List<String> eliminarTarea(@PathVariable int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        }
        return tareas;
    }
}


