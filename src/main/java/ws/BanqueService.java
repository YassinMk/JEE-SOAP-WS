package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    private double conversion (@WebParam(name = "montant") double mt){
        return mt*11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code")int code){
        return new Compte(code,Math.random()*6000, LocalDate.now());
    }
    @WebMethod
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1,Math.random()*6000,LocalDate.now()),
                new Compte(2,Math.random()*6000,LocalDate.now()),
                new Compte(3,Math.random()*6000,LocalDate.now()),
                new Compte(4,Math.random()*6000,LocalDate.now())
        );
    }
}
