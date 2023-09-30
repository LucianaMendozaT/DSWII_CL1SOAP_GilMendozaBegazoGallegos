package pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Integer> {

}
