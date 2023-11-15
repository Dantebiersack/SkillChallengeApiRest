package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Carrito")
@Data
@NoArgsConstructor
public class Carrito {

    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCarrito;
    @Column
    @NotEmpty
    @Min(value = 1, message = "El valor mínimo debe ser 1")
    private int cantidad;
    @Column
    @Min(value = 1, message = "el id 0 no existe")
    private long producto_id;
    @Column
    @Min(value = 0, message = "el id 0 no existe")
    private long comprador_id;
}
