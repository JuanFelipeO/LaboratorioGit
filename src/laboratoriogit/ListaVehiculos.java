package laboratoriogit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PIPE
 */
public class ListaVehiculos implements Serializable
{
    //Se crean las variables que se utilizzan para pedir el ingreso de info
    private String placa;
    private String tipoVehiculo;
    
    //Se crean las listas que almacenaran la info ingresada por teclado
    ArrayList placas = new ArrayList();
    ArrayList tipoVehiculos = new ArrayList();
    
    //Se crea el metodo para registrar los vehiculos
    public void registrarVehiculos()
    {
        Scanner entradaEscaner = new Scanner(System.in);
        
        for(int i=3; i>0; i--)
        {
            System.out.println("Ingrese la placa del vehiculo:");
            placa = entradaEscaner.nextLine();
            placas.add(placa);
            System.out.println("Ingrese el tipo de vehiculo:");
            tipoVehiculo = entradaEscaner.nextLine();
            tipoVehiculos.add(tipoVehiculo);
        }
    
        //Se imprimen las listas con la información almacenada
        System.out.println("");
        System.out.println("Lista de placas:");
        System.out.println(placas.toString());
        System.out.println("");
        System.out.println("Lista de tipo de vehiculos:");
        System.out.println(tipoVehiculos.toString());
    }
}
