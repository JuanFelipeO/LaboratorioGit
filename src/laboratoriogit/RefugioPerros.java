/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriogit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class RefugioPerros implements Serializable {

    //Atributos 
    private String nombrePerro;
    private String edadPerro;
    private String generoPerro;
    private String nombrePropietarioPerro;
    ArrayList listaPerros = new ArrayList();

    public RefugioPerros() {
    }

    //constructores 
    public RefugioPerros(String nombrePerro, String edadPerro, String generoPerro, String nombrePropietarioPerro, List<RefugioPerros> listaPerros) {
        this.nombrePerro = nombrePerro;
        this.edadPerro = edadPerro;
        this.generoPerro = generoPerro;
        this.nombrePropietarioPerro = nombrePropietarioPerro;
    }

    //getter & setter 
    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getEdadPerro() {
        return edadPerro;
    }

    public void setEdadPerro(String edadPerro) {
        this.edadPerro = edadPerro;
    }

    public String getGeneroPerro() {
        return generoPerro;
    }

    public void setGeneroPerro(String generoPerro) {
        this.generoPerro = generoPerro;
    }

    public String getNombrePropietarioPerro() {
        return nombrePropietarioPerro;
    }

    public void setNombrePropietarioPerro(String nombrePropietarioPerro) {
        this.nombrePropietarioPerro = nombrePropietarioPerro;
    }

    public ArrayList getListaPerros() {
        return listaPerros;
    }

    public void setListaPerros(ArrayList listaPerros) {
        this.listaPerros = listaPerros;
    }

    //Metodos 
    public void llenarRefugio() {

        listaPerros = new ArrayList<>();
        Scanner entradaEscaner = new Scanner(System.in);

        for (int i = 3; i > 0; i--) {
            System.out.println("Ingrese el nombre del perro");
            nombrePerro = entradaEscaner.nextLine();
            System.out.println("Ingrese edad del perro");
            edadPerro = entradaEscaner.nextLine();
            System.out.println("Ingrese genero del perro");
            generoPerro = entradaEscaner.nextLine();
            System.out.println("Ingrese nombre del propietario del perro");
            nombrePropietarioPerro = entradaEscaner.nextLine();
            listaPerros.add(listaPerros);
        }
        
        System.out.println("");
        System.out.println("Lista de nombres de los perros: ");
        System.out.println(nombrePerro.toString());
        System.out.println("");
        System.out.println("Edad de los perros ingresadas: ");
        System.out.println(edadPerro.toString());
        System.out.println("");
        System.out.println("Generos de los perros ingresados: ");
        System.out.println(generoPerro.toString());
        System.out.println("Nombre de los propietarios de los perros: ");
        System.out.println(nombrePropietarioPerro.toString());

    }

}


