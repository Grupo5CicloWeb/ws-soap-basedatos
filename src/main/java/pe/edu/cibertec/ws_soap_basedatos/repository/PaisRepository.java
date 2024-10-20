package pe.edu.cibertec.ws_soap_basedatos.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws.objects.Moneda;
import pe.edu.cibertec.ws.objects.Pais;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PaisRepository {

    private static  final Map<String, Pais> paises = new HashMap<>();

    @PostConstruct
    public void cargarPaises(){
        Pais objPais = new Pais();
        objPais.setNombre("Argentina");
        objPais.setCapital("Buenos Aires");
        objPais.setMoneda(Moneda.PESO);
        objPais.setPoblacion("36000000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Perú");
        objPais.setCapital("Lima");
        objPais.setMoneda(Moneda.SOL);
        objPais.setPoblacion("33000000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Italia");
        objPais.setCapital("Roma");
        objPais.setMoneda(Moneda.EURO);
        objPais.setPoblacion("43000000");
        paises.put(objPais.getNombre(), objPais);

        objPais = new Pais();
        objPais.setNombre("Ecuador");
        objPais.setCapital("Quito");
        objPais.setMoneda(Moneda.DOLAR);
        objPais.setPoblacion("20000000");
        paises.put(objPais.getNombre(), objPais);
    }

    public Pais buscarPaisXnombre(String nombre){
        return paises.get(nombre);
    }

}
