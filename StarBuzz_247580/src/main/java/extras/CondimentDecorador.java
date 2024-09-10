/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import bebidas.BaseBeverageDecorador;
import bebidas.IBeverage;


/**
 * La clase `CondimentDecorador` extiende de `BaseBeverageDecorador` y actúa como un decorador
 * para agregar funcionalidad adicional a una bebida base (`IBeverage`).
 * Este decorador en particular representa un condimento con un costo fijo.

 * @author crist
 */
public class CondimentDecorador extends BaseBeverageDecorador{
    
    private final float costo = 15.00f;

    /**
     * Constructor que crea una instancia de `CondimentDecorador` para una bebida base.
     * @param base
     */
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
