package pe.edu.cibertec.ws_soap_basedatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;

@Repository
public interface DomicilioRepository
        extends JpaRepository<Domicilio, Integer> {
}
