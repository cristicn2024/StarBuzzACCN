/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 * Clase abstracta que representa un decorador base para una bebida.
 * Esta clase implementa la interfaz IBeverage y delega las operaciones
 * a un componente base que también implementa dicha interfaz. 
 * Los decoradores que extienden esta clase pueden agregar funcionalidad adicional
 * sin alterar el comportamiento del componente base
 * @author crist
 */
public abstract class BaseBeverageDecorador implements IBeverage{
    
    private final IBeverage base;

    /**
     *Constructor que inicializa el decorador con un componente base.
     * @param base
     */
    public BaseBeverageDecorador(IBeverage base) {
        this.base = base;
    }
    
    /**
     * Método que delega el envío de un mensaje a la bebida base.
     * @param msj
     */
    @Override
    public void enviar(String msj) {
        base.enviar(msj);
    }

    /**
     *Método que obtiene el costo de la bebida decorada.
     * @return
     */
    @Override
    public float getCosto() {
        return base.getCosto();
    }
    
}
