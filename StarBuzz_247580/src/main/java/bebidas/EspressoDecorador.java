/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 * Una clase que extiende la funcionalidad de una bebida base,
 * aplicando un decorador que añade características adicionales. 
 * En este caso, se implementa un "Espresso" con un costo establecido.
 * @author crist
 */
public class EspressoDecorador extends BaseBeverageDecorador{
    
    private final float costo = 69.00f;

    /**
     *Crea una instancia de EspressoDecorador que envuelve una bebida base.
     * @param base
     */
    public EspressoDecorador(IBeverage base) {
        super(base);
    }
    
     @Override
    public void enviar(String msj){
        msj = "Espresso                   ";
        System.out.println(msj+costo);
        super.enviar(msj);
    }
    
    @Override
    public float getCosto(){
        return super.getCosto() + costo;
    }
    
}
