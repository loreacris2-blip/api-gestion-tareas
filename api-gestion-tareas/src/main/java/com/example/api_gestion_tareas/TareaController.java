package com.example.api_gestion_tareas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TareaController {

    @GetMapping("/tareas")
    public List<String> obtenerTareas() {
        return List.of(
                "1. Configurar GitHub y Portafolio Web",
                "2. Crear primera API REST con Java y Spring Boot",
                "3. Conectar base de datos SQL"
        );
    }
}

