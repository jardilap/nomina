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
public abstract class Empleado extends Contrato{
    protected String nombre;

    /**
     *
     * @return
     */
    @Override
    public abstract double obtenerSalario();
    
    
}
