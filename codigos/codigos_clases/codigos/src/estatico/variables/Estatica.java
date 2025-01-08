package estatico.variables;

import java.util.UUID;

public class Estatica {

    private static String uuid = UUID.randomUUID().toString();

    public Estatica(){}

    public String getUUID(){
        return uuid;
    }


    public static void main(String[] args) {

        Estatica estaticaUno = new Estatica();
        Estatica estaticaDos = new Estatica();
        Estatica estaticaTres = new Estatica();

        System.out.println("UUID del primer objeto:" + estaticaUno.getUUID());
        System.out.println("UUID del segundo objeto:" + estaticaDos.getUUID());
        System.out.println("UUID del tercero objeto:" + estaticaTres.getUUID());

    }



}
