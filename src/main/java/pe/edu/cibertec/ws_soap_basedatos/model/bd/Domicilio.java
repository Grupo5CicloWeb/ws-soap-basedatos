package pe.edu.cibertec.ws_soap_basedatos.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddomicilio;
    private String descdomicilio;
    private Integer nrodomicilio;
    private String refdomicilio;
}
