package estatico.variables;

public class Main {

    public static void main(String[] args) {

        EstaticaDos contador1 = new EstaticaDos();
        EstaticaDos contador2 = new EstaticaDos();
        EstaticaDos contador3 = new EstaticaDos();
        EstaticaDos contador4 = new EstaticaDos();

        contador1.contar();
        contador2.contar();
        contador3.contar();
        contador4.contar();

        //System.out.println(EstaticaDos.getContador());


        System.out.println(contador1.getContador());
        System.out.println(contador2.getContador());
        System.out.println(contador3.getContador());
        System.out.println(contador4.getContador());



    }
}
