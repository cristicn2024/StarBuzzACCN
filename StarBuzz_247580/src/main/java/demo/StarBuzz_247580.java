/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package demo;

import bebidas.Beverage;
import bebidas.DarkRoastDecorador;
import bebidas.DecafDecorador;
import bebidas.EspressoDecorador;
import bebidas.HouseBlendDecorador;
import bebidas.IBeverage;
import extras.AlmondDecorador;
import extras.ChocolateDecorador;
import extras.MilkDecorador;
import extras.SoyDecorador;
import extras.WhippedCreamDecorador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class StarBuzz_247580 {

     public static void main(String[] args) {
        // Uso de try-with-resources para manejar el recurso Scanner correctamente
        try (Scanner scanner = new Scanner(System.in)) {
            List<IBeverage> carrito = new ArrayList<>();
            boolean continuar = true;

            // Bucle principal del menú
            while (continuar) {
                int opcion = mostrarMenuYObtenerOpcion(scanner, "Menu principal:",
                        new String[]{"Agregar bebida base", "Mostrar pedido", "Salir"});

                switch (opcion) {
                    case 1 -> {
                        IBeverage bebidaBase = seleccionarBebida(scanner);
                        if (bebidaBase != null) {
                            carrito.add(bebidaBase);
                        } else {
                            System.out.println("No se seleccionó una bebida válida.");
                        }
                    }
                    case 2 -> mostrarPedido(carrito);
                    case 3 -> {
                        continuar = false;
                        System.out.println("Gracias por su compra!!!");
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }

    /**
     * Método para mostrar el menú y obtener la opción seleccionada por el usuario.
     *
     * @param scanner El Scanner para capturar la entrada del usuario.
     * @param titulo  El título del menú.
     * @param opciones Las opciones a mostrar.
     * @return La opción seleccionada por el usuario.
     */
    private static int mostrarMenuYObtenerOpcion(Scanner scanner, String titulo, String[] opciones) {
        System.out.println("----------------------------------");
        System.out.println(titulo);
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d. %s\n", i + 1, opciones[i]);
        }
        System.out.print("Seleccione una opción: ");
        return obtenerOpcionValida(scanner);
    }

    /**
     * Método para validar que la entrada sea un número válido.
     *
     * @param scanner El Scanner para capturar la entrada del usuario.
     * @return La opción seleccionada por el usuario.
     */
    private static int obtenerOpcionValida(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            scanner.next(); // Limpiar la entrada inválida
        }
        return scanner.nextInt();
    }

    /**
     * Método para seleccionar una bebida base.
     *
     * @param scanner El Scanner para capturar la entrada del usuario.
     * @return La bebida seleccionada con los condimentos aplicados.
     */
    private static IBeverage seleccionarBebida(Scanner scanner) {
        int tipoBebida = mostrarMenuYObtenerOpcion(scanner, "Seleccione el tipo de bebida base:",
                new String[]{"House Blend", "Dark Roast", "Espresso", "Decaf"});

        IBeverage bebidaBase;
        switch (tipoBebida) {
            case 1 -> bebidaBase = new HouseBlendDecorador(new Beverage());
            case 2 -> bebidaBase = new DarkRoastDecorador(new Beverage());
            case 3 -> bebidaBase = new EspressoDecorador(new Beverage());
            case 4 -> bebidaBase = new DecafDecorador(new Beverage());
            default -> {
                System.out.println("Opción no válida.");
                return null;
            }
        }

        return agregarCondimentos(scanner, bebidaBase);
    }

    /**
     * Método para agregar condimentos a una bebida.
     *
     * @param scanner El Scanner para capturar la entrada del usuario.
     * @param bebidaBase La bebida base seleccionada.
     * @return La bebida decorada con los condimentos aplicados.
     */
    private static IBeverage agregarCondimentos(Scanner scanner, IBeverage bebidaBase) {
        boolean agregarCondimentos = true;
        IBeverage bebidaDecoradora = bebidaBase;

        while (agregarCondimentos) {
            int tipoCondimento = mostrarMenuYObtenerOpcion(scanner, "Seleccione condimentos:",
                    new String[]{"Milk", "Soy", "Chocolate", "Whipped Cream", "Almond Milk"});

            switch (tipoCondimento) {
                case 1 -> bebidaBase = new MilkDecorador(bebidaBase);
                case 2 -> bebidaBase = new SoyDecorador(bebidaBase);
                case 3 -> bebidaBase = new ChocolateDecorador(bebidaBase);
                case 4 -> bebidaBase = new WhippedCreamDecorador(bebidaBase);
                case 5 -> bebidaBase = new AlmondDecorador(bebidaBase);
                case 6 -> agregarCondimentos = false;
                default -> System.out.println("Opción no válida.");
            }
        }

        return bebidaDecoradora;
    }

    /**
     * Método para mostrar el pedido actual y el costo total.
     *
     * @param carrito La lista de bebidas seleccionadas.
     */
    private static void mostrarPedido(List<IBeverage> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("----------------------------------");
        System.out.println("Pedido:");
        float costoTotal = 0;
        for (IBeverage bebida : carrito) {
            bebida.enviar("Bebida:");
            costoTotal += bebida.getCosto();
        }
        System.out.printf("Costo total: %.2f\n", costoTotal);
    }
}
