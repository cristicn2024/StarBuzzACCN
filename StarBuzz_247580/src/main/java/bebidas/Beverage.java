/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *
 * @author crist
 */
public class Beverage implements IBeverage{
    
    private float costo = 0.00f;

    @Override
    public void enviar(String msj) {
       
    }

    @Override
    public float getCosto() {
        return costo;
    }
    
    public void setCosto(float costo){
        this.costo = costo;
    }
}
