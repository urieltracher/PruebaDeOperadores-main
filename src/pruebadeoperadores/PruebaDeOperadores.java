package pruebadeoperadores;

/**
 *
 * @author Tracher
 * 
 * Programa pruebaDeOperadores y su flujo asociado. 
 * 
 */
public class PruebaDeOperadores {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        double z = 3.0;

        System.out.println("x + y + z = " + (x + y + z));
        x += y;
        z--;

        System.out.println("x + y + z = " + (x + y + z));
        x -= y;
        z++;

        System.out.println("x + y + z = " + (x + y + z));
    }

}
