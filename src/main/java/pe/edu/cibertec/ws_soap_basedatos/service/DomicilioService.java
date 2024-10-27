package pe.edu.cibertec.ws_soap_basedatos.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;
import pe.edu.cibertec.ws_soap_basedatos.repository.DomicilioRepository;
import pe.edu.cibertec.ws_soap_basedatos.util.convert.DomicilioConvert;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService {

    private final DomicilioRepository domicilioRepository;
    private final DomicilioConvert domicilioConvert;


    @Override
    public GetListDomiciliosResponse obtenerDomicilios() {
        GetListDomiciliosResponse response = new GetListDomiciliosResponse();
        response.getListdomicilios().addAll(
                domicilioConvert.convertDomicilioSoapList(
                        domicilioRepository.findAll()
                )
        );
        return response;
    }
    @Override
    public GetDomicilioResponse obtenerDomicilio(int id) {
        GetDomicilioResponse response = new GetDomicilioResponse();
        Domicilio domicilio = domicilioRepository.findById(id).orElse(null);
        if (domicilio != null) {
            response.setDomicilio(domicilioConvert.convertDomicilioSoap(domicilio));
        }
        return response;
    }

    @Override
    public PostDomicilioResponse guardarDomicilio(PostDomicilioRequest domicilio) {
        PostDomicilioResponse response = new PostDomicilioResponse();
        Domicilio nuevoDomicilio = domicilioRepository.save(
                domicilioConvert.convertDomicilioBD(domicilio.getDomicilio())
        );
        response.setDomicilio(
                domicilioConvert.convertDomicilioSoap(nuevoDomicilio));
        return response;
    }
}
