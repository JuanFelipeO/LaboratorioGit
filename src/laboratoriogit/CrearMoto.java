/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriogit;

/**
 *
 * @author PIPE
 */
public class CrearMoto 
{
    private String numeroChasis;
    private String placa;
    private String pasajeros;

    public CrearMoto(String numeroChasis, String placa, String pasajeros)
    {
        this.numeroChasis = numeroChasis;
        this.placa = placa;
        this.pasajeros = pasajeros;
    }

    public String getNumeroChasis()
    {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) 
    {
        this.numeroChasis = numeroChasis;
    }

    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public String getPasajeros() 
    {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) 
    {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() 
    {
        return "CrearMoto{" + "numeroChasis=" + numeroChasis + ", placa=" + placa + ", pasajeros=" + pasajeros + '}';
    }
}
