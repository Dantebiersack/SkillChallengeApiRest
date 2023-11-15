package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perfil_tienda")
@Data
@NoArgsConstructor
public class PerfilTienda {
    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPerfilTienda;
    @Column
    @NotEmpty(message = "El nombre no puede estar en blanco")
    private String nombreTienda;
    @Column
    @NotEmpty(message = "La descipcion no puede estar en blanco")
    private String descripcion;
    @Column
    @NotEmpty(message = "El telefono no puede estar en blanco")
    private String telefono;
    @Column
    private int estatus;
    @Column
    @NotEmpty(message = "El vendedor id no puede estar en blanco")
    private long vendedor_id;
}
