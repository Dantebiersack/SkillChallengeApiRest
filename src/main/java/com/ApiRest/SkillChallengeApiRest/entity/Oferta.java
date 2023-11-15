package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Entity
@NoArgsConstructor
@Table (name = "oferta")
@Data
public class Oferta {
    @Id
    @Column
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idOferta;
    @Column
    @NotEmpty(message = "El descuento no puede estar en blanco")
    @Min(value = 0)
    private float descuento;
    @Column
    @NotEmpty(message = "la fecha no puede estar en blanco")
    private Date fechaValidez;
    @Column
    @NotEmpty(message = "El producto id no puede estar en blanco")
    private long producto_id;
}
