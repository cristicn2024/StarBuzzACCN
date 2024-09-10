/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *Clase que representa una bebida, implementando la interfaz IBeverage.
 * 
 * @author crist
 */
public class Beverage implements IBeverage{
    
    private float costo;

    /**
     * Envía un mensaje específico.
     * @param msj
     */
    @Override
    public void enviar(String msj) {
       
    }

    /**
     * Obtiene el costo de la bebida.
     * @return
     */
    @Override
    public float getCosto() {
        return costo;
    }
    
    /**
     * Establece el costo de la bebida.
     * @param costo
     */
    public void setCosto(float costo){
        this.costo = costo;
    }
}
