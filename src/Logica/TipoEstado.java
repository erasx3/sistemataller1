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
public class TipoEstado {
    
    private int codTipoEstado;
    private String tipoEstado;
    
    private Turno turno[]; /* relacion n a n con turno */
    
    private DetallePedido detallePedido[];
    private Pedido pedido[];
    private Estado estado[];
    
}
