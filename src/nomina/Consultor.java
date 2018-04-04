/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author ESTUDIANTE
 */
public class Consultor extends Contrato{
    private double salario;

    public Consultor(int ID) {
        this.salario = 220.0;
        this.ID = ID;
    }
    
    

    @Override
    public double obtenerSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
