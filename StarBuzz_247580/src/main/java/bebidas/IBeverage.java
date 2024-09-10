/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bebidas;

/**
 * Interfaz que representa una bebida y define los métodos asociados a las acciones que 
 * se pueden realizar con una bebida, como enviar un mensaje relacionado con la bebida 
 * o calcular su costo.
 * @author crist
 */
public interface IBeverage {
    
    /**
     * Envía un mensaje relacionado con la bebida.
     * @param msj
     */
    public void enviar(String msj);

    /**
     * Obtiene el costo de la bebida.
     * @return
     */
    public float getCosto();
}
