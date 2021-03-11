package laboratoriogit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jagud
 */
public class IngresarPersona implements Serializable
{
    private String nombre;
    private String telefono;
    private String cedula;
    ArrayList nombres = new ArrayList();
    ArrayList telefonos = new ArrayList();
    ArrayList cedulas = new ArrayList();
    
    
    public void IngresarDatos()
    {
       String teclado;
       Scanner entradaEscaner = new Scanner (System.in);
       teclado = entradaEscaner.nextLine();
       
       for(int i=3; i>0; i--)
       {
           System.out.println("Ingrese el nombre de la persona:");
           nombre = teclado;
           nombres.add(nombre);
           System.out.println("Ingrese el telefono de la persona ingresada:");
           telefono = teclado;
           telefonos.add(telefono);
           System.out.println("Ingrese el # de C.C de la persona ingresada:");
           cedula = teclado;
           cedulas.add(cedula);
       }
       
        System.out.println("Lista de nombres ingresados:");
        System.out.println(nombres.toString());
        System.out.println("Telefonso de las personas ingresadas:");
        System.out.println(telefonos.toString());
        System.out.println("Cedulas de las personas ingresadas:");
        System.out.println(cedulas.toString());
    }
    
    
}
