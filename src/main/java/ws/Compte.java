package ws;

import java.time.LocalDate;

public class Compte {
    private int code ;
    private double solde ;
    private LocalDate date;

    public Compte(int code, double solde, LocalDate date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
