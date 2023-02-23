package com.ista.guachi.app.model;

import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "estudiantes")
@Data
public class Estudiante {
    @Id
    private String id;
    private String nombre;
    private int numero;
    private String correo;
    private String  listCursos;
    private int gpa;
}
