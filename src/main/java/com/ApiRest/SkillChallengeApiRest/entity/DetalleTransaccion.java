package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "detalle_transaccion")
public class DetalleTransaccion {

    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDetalle;

    @Column
    @NotEmpty(message = "El producto id no puede estar en blanco")
    private long producto_id;
    @Column
    @NotEmpty(message = "El transaccion id no puede estar en blanco")
    private long transaccion_id;

    @Column
    @Min(value = 1, message = "El valor mínimo es 1")
    private int cantidad;

}