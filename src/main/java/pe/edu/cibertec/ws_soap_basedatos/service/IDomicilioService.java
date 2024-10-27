package pe.edu.cibertec.ws_soap_basedatos.service;

import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws_soap_basedatos.model.bd.Domicilio;


public interface IDomicilioService {

    GetListDomiciliosResponse obtenerDomicilios();

    GetDomicilioResponse obtenerDomicilio(int id);

    PostDomicilioResponse guardarDomicilio(PostDomicilioRequest domicilio);

}
