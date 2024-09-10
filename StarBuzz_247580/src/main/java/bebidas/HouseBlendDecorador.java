/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *
 * @author crist
 */
public class HouseBlendDecorador extends BaseBeverageDecorador{
    
    private final float costo = 59.00f;

    public HouseBlendDecorador(IBeverage base) {
        super(base);
    }
    
    @Override
    public void enviar(String msj){
        msj = "House Blend              ";
        System.out.println(msj+costo);
        super.enviar(msj);
    }
    
    @Override
    public float getCosto(){
        return super.getCosto() + costo;
    }
}
