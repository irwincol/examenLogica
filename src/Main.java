import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Contextualización: La tienda GameWorld vende productos y ofrece servicios especiales a sus clientes.
//        El programa debe permitir seleccionar entre varias opciones para calcular descuentos o beneficios.
//                Menú de opciones:
//        1. Comprar videojuego
//        2. Comprar accesorio
//        3. Solicitar membresía
//        Condiciones:
//        Opción 1 - Comprar videojuego: Solicitar el valor del juego y si el cliente es recurrente.
//• Si el valor del juego es mayor a $150000, aplicar 10% de descuento.
//• Si es cliente recurrente, aplicar 5% adicional.
//                Opción 2 - Comprar accesorio: Solicitar tipo de accesorio y su valor.
//• Si el valor supera $200000, aplicar 8% de descuento.
//• Si el valor está entre $50000 y $200000, aplicar 5% de descuento.
//                Opción 3 - Solicitar membresía: Solicitar edad del cliente.
//• Menores de 18 años no pueden solicitar.
//• Entre 18 y 49 años pueden solicitar membresía estándar.
//• A partir de 50 años obtienen membresía premium.
//        Resultados esperados: Mostrar opción elegida, datos ingresados y resultado final.
//
        Scanner sc = new Scanner(System.in);
        System.out.println("bienvenido a GameWordl, seleccione las siguientes opciones para continuar: ");
        System.out.println("Seleccione las siguiente opciones para continuar:\n1 - Comprar Videojuegos\n2 - Comprar accesorios\n3- Solicitar membresia");
        String menuOpciones = sc.nextLine();
        switch (menuOpciones) {
            case "1":
                System.out.println("elegiste comprar un videojuego");
                System.out.print("Ingrese el valor del videojuego: ");
                double valorJuego = sc.nextDouble();
                System.out.print("marque 1 por ser cliente recurrente ");
                int clienteRecurrente = sc.nextInt();
                double descuento = 0.0;
                if (valorJuego > 150000) {
                    descuento = valorJuego * 0.10;
                    valorJuego = valorJuego - descuento;
                }
                if (clienteRecurrente ==1) {
                    double descuentoRecurrente = valorJuego * 0.05;
                    valorJuego = valorJuego - descuentoRecurrente;
                    descuento += descuentoRecurrente;
                    System.out.println("Descuento total aplicado: " + descuento);
                    System.out.println("Precio final del videojuego: " + valorJuego);
                }
                break;
            case "2":
                System.out.println("Opción elegida: Comprar accesorio");
                System.out.print("Ingrese tipo de accesorio: ");
                String tipo = sc.nextLine();
                System.out.print("Ingrese el valor del accesorio: ");
                int valorAccesorio = sc.nextInt();
                double descuentoAccesorio = 0;
                if (valorAccesorio > 200000) {
                    descuentoAccesorio = valorAccesorio * 0.08;
                }
                else if (valorAccesorio >= 50000 && valorAccesorio <= 200000) {
                    descuentoAccesorio = valorAccesorio * 0.05;
                }
                int precioFinalAcc = (int)(valorAccesorio - descuentoAccesorio);
                System.out.println(" el accesorio que compro es: " + tipo);
                System.out.println("Descuento total: " + descuentoAccesorio);
                System.out.println("Precio final del accesorio: " + precioFinalAcc);

                break;
            case "3":
                System.out.println("Opción elegida: Solicitar membresía");
                System.out.print("Ingrese su edad: ");
                int edad = sc.nextInt();
                String membresia = "";
                if (edad < 18) {
                    System.out.println("No puede solicitar la membresía.");
                }
                else if (edad >= 18 && edad <= 49) {
                    System.out.println( membresia= "Puede solicitar la membresía estándar.");
                }
                else {
                    System.out.println( membresia = "Puede solicitar la membresía premium.");
                }
                break;
        }
    }
}