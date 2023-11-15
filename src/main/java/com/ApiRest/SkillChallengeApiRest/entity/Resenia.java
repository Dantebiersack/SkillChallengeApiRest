package com.ApiRest.SkillChallengeApiRest.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "resenia")
@Data
@NoArgsConstructor
public class Resenia {
    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idResenia;
    @Column
    @NotEmpty(message = "El contenido no puede estar en blanco")
    private String contenido;
    @Column
    @NotEmpty(message = "La puntuacion no puede estar en blanco")
    @Min(value = 0, message = "Puntuacion minima = 0")
    @Max(value = 5, message = "Puntuacion maxima = 5")
    private int puntuacion;
    @Column
    private int estatus;
    @Column
    @NotEmpty(message = "El comprador id no puede estar en blanco")
    private long comprador_id;
}
