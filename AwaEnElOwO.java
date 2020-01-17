import java.util.*;
/**
 * Esta clase te pide que metas algo por teclado. Dependiendo de lo que pongas, devuelve cosas diferentes.
 * 
 * @author (David)
 * 
 * @version(17/01/2020 1.0v)
 */
public class AwaEnElOwO
{

    /**
     * Constructor vacío de la clase
     */
    public AwaEnElOwO()
    {

    }

    /**
     * Esta método te pide que metas algo por teclado. Dependiendo de lo que pongas, devuelve cosas diferentes.
     * 
     * @param name es una cadena que se introduce por un escaner
     * 
     * @return devuelve una cadena, dependiendo de la cadena introducida
     */
    public void ewe()
    {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while(!end)
        {
            System.out.println("Introduce un nombre.(ewe para salir de la aplicación)");
            String name = sc.nextLine().toLowerCase();
            if(name.equalsIgnoreCase("ewe"))
            {
                System.out.println("Chao pescao");
                end = true;
            }
            else
            {
                switch(name)
                {
                    case "owo":
                        System.out.println("UwU");
                        break;
                    case "awa":
                        System.out.println("OwO");
                        break;
                    case "arturo":
                        System.out.println("ojoooooo");
                        break;
                    default:
                        System.out.println("Ezo no eh un nonvre balído");
                }
            }
        }
    }
}
