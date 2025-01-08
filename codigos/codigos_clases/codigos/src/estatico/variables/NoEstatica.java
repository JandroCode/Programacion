package estatico.variables;

import java.util.UUID;

public class NoEstatica {


    private String uuid = UUID.randomUUID().toString();

    public String getUUID(){
        return uuid;
    }

    public static void main(String[] args) {
        NoEstatica noEstaticaUno = new NoEstatica();
        NoEstatica noEstaticaDos = new NoEstatica();
        NoEstatica noEstaticaTres = new NoEstatica();


        System.out.println("UUID del primer objeto:" + noEstaticaUno.getUUID());
        System.out.println("UUID del segundo objeto:" + noEstaticaDos.getUUID());
        System.out.println("UUID del tercero objeto:" + noEstaticaTres.getUUID());



    }

}
