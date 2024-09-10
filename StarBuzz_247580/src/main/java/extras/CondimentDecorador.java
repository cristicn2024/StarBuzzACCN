/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import bebidas.BaseBeverageDecorador;
import bebidas.IBeverage;


/**
 *
 * @author crist
 */
public class CondimentDecorador extends BaseBeverageDecorador{
    
    private final float costo = 15.00f;

    public CondimentDecorador(IBeverage base) {
        super(base);
    }
    
     @Override
    public void enviar(String msj){
        super.enviar(msj);
    }
    
    @Override
    public float getCosto(){
        return super.getCosto();
    }
}
