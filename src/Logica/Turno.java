/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import java.util.*;
/**
 *
 * @author eras
 */
public class Turno {
    
    private int codTurno;
    private Date fecha;  
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Taller taller;
    
    private Empleado empleado[];
    private Pedido pedido[];
    private TipoEstado tipoEstado[]; /* relacion n a n con tipo de estado */
}
