package pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.model.Paciente;
import pe.edu.cibertec.DSWII_CL1SOAP_GilMendozaBegazoGallegos.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacieneteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacienteXId(Integer id){
        Optional<Paciente> paciente = pacienteRepository
                .findById(id);
        if(paciente.isEmpty()){
            return null;
        }
        return paciente.get();
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }



}
