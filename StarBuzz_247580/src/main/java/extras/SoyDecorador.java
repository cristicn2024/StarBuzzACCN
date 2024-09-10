/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import bebidas.IBeverage;

/**
 *
 * @author crist
 */
public class SoyDecorador extends CondimentDecorador{

    private final float costo = 15.00f;

    public SoyDecorador(IBeverage base) {
        super(base);
    }

     @Override
    public void enviar(String msj){
        msj = "Leche de Soya...........";
        System.out.println(msj+costo);
        super.enviar(msj);
    }
    
    @Override
    public float getCosto(){
        return super.getCosto() + costo;
    }
}
