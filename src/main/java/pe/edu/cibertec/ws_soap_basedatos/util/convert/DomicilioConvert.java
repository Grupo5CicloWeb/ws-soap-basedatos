package pe.edu.cibertec.ws_soap_basedatos.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Domiciliosoap;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;

import java.util.ArrayList;
import java.util.List;

@Component
public class DomicilioConvert {

    public Domicilio convertDomicilioBD(Domiciliosoap domiciliosoap){
        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliosoap.getId());
        domicilio.setDescdomicilio(domiciliosoap.getDescripcion());
        domicilio.setNrodomicilio(domiciliosoap.getNumero());
        domicilio.setRefdomicilio(domiciliosoap.getReferencia());
        return  domicilio;
    }
    public Domiciliosoap convertDomicilioSoap(Domicilio domicilio){
        Domiciliosoap domiciliosoap = new Domiciliosoap();
        domiciliosoap.setId(domicilio.getIddomicilio());
        domiciliosoap.setDescripcion(domicilio.getDescdomicilio());
        domiciliosoap.setNumero(domicilio.getNrodomicilio());
        domiciliosoap.setReferencia(domicilio.getRefdomicilio());
        return domiciliosoap;
    }

    public List<Domicilio> convertDomicilioBdList(List<Domiciliosoap>
                                                          domiciliosoap){
        List<Domicilio> domicilios = new ArrayList<Domicilio>();
        for (Domiciliosoap domicilio : domiciliosoap) {
            domicilios.add(convertDomicilioBD(domicilio));
        }
        return domicilios;
    }

    public List<Domiciliosoap> convertDomicilioSoapList(List<Domicilio>
                                                          domicilios){
        List<Domiciliosoap> domiciliosoap = new ArrayList<Domiciliosoap>();
        for (Domicilio domicilio : domicilios) {
            domiciliosoap.add(convertDomicilioSoap(domicilio));
        }
        return domiciliosoap;
    }


}
