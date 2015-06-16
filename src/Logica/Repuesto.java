/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author eras
 */
public class Repuesto {
    
    private int codRepuesto;
    private String descripcion;
    private String caracteristica;
    private Double precio;
    
    private Garantia garantia;
    private Impuesto impuesto;
    private GrupoParte grupoParte;
    
    private DetallePedido detallePedido[];
}
