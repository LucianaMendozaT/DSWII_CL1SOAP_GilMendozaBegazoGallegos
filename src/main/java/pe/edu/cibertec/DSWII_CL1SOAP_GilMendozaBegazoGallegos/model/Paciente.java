package pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaciente;
    @Column(name = "nompaciente")
    private String nompaciente;
    @Column(name = "apepaciente")
    private String apepaciente;
    @Column(name = "docpaciente")
    private String docpaciente;
    @Column(name = "fechanacpaciente")
    private Date  fechanacpaciente;
    @Column(name = "emailpaciente")
    private String emailpaciente;
}
