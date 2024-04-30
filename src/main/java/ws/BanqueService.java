package ws;

import java.time.LocalDate;
import java.util.List;

public class BanqueService {
    private double conversion (double mt){
        return mt*100;
    }
    public Compte getCompte(int code){
        return new Compte(code,Math.random()*6000, LocalDate.now());
    }
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1,Math.random()*6000,LocalDate.now()),
                new Compte(2,Math.random()*6000,LocalDate.now()),
                new Compte(3,Math.random()*6000,LocalDate.now()),
                new Compte(4,Math.random()*6000,LocalDate.now())
        );
    }
}
