/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extras;

import bebidas.IBeverage;

/**
 * Clase que representa un decorador de la leche de almendra para una bebida.
 * Extiende la clase CondimentDecorador, proporcionando un costo adicional
 * y una personalización en la forma en que se envía el mensaje de la bebida.
 * @author crist
 */
public class AlmondDecorador extends CondimentDecorador{

    private final float costo = 15.00f;

    /**
     * Constructor que inicializa el decorador con una bebida base.
     * @param base
     */
    public AlmondDecorador(IBeverage base) {
        super(base);
    }
    
     @Override
    public void enviar(String msj){
        msj = "Leche de Almendra.......";
        System.out.println(msj+costo);
        super.enviar(msj);
    }
    
    @Override
    public float getCosto(){
        return super.getCosto() + costo;
    }
}
