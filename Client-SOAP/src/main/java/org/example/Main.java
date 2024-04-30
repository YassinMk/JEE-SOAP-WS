package org.example;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.ConversionEuroToDH(90));
        Compte compte = proxy.getCompte(4);
        System.out.println("------------------------");
        System. out. printin (compte. getCode() ) ;
        System. out. printin (compte. getSoIde() ) ;
        System. out. printin (compte. getDateCreation()) ;
        proxy.listCompte().forEach(cp->{
            System.out.println("------------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getSolde());
            System.out.println(cp.getDate());

        })
    }
}