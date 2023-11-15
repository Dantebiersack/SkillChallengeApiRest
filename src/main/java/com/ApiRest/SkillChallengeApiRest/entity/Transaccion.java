package com.ApiRest.SkillChallengeApiRest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "transaccion")
@Data
@NoArgsConstructor
public class Transaccion {
    @Id
    @Column(name = "id")
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTransaccion;
    @Column
    @Min(value = 0, message = " monto no puede ser negativo = 0")
    private float montoTotal;
    @Column
    @NotEmpty(message = "El pais no puede estar en blanco")
    private String paisEnvio;
    @Column
    @NotEmpty(message = "El estado no puede estar en blanco")
    private String estadoEnvio;
    @Column
    @NotEmpty(message = "La calle no puede estar en blanco")
    private String calleEnvio;
    @Column
    @NotEmpty(message = "La colonia no puede estar en blanco")
    private String coloniaEnvio;
    @Column
    @NotEmpty(message = "El numero no puede estar en blanco")
    private String numEnvio;
    @Column
    @NotEmpty(message = "fecha no puede estar en blanco")
    private Date fechaEnvio;
    @Column
    @NotEmpty(message = "El metodo de pago no puede estar en blanco")
    private String metodoPago;
    @Column
    @NotEmpty(message = "El numero de tarjeta no puede estar en blanco")
    private String noTarjeta;
    @Column
    private int estatus;
    @Column
    @NotEmpty(message = "El comprador id no puede estar en blanco")
    private long comprador_id;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "transaccion_id")
    Set<DetalleTransaccion> detalles;
}
