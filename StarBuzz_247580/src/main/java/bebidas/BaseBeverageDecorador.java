/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *
 * @author crist
 */
public class BaseBeverageDecorador implements IBeverage{
    
    private final IBeverage base;

    public BaseBeverageDecorador(IBeverage base) {
        this.base = base;
    }
    
    

    @Override
    public void enviar(String msj) {
        base.enviar(msj);
    }

    @Override
    public float getCosto() {
        return base.getCosto();
    }
    
}
