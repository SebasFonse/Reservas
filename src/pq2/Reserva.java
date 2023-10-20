package pq2;

import pq1.Usuario;

import java.util.Scanner;

public class Reserva {
    private int salaSeleccionada;
    private String fechaReserva;
    private int duracionHoras;
    private String serviciosAdicionales;

    public void solicitarDetalles(Scanner scanner) {
        System.out.println("\nDetalles de la reserva:");
        System.out.println("1. Sala Estandar - $100,000");
        System.out.println("2. Sala Vip - $200,000");
        System.out.println("3. Sala Platinum - $300,000");

        System.out.print("Seleccione la sala (1-3): ");
        this.salaSeleccionada = scanner.nextInt();

        System.out.print("Ingrese la fecha de la reserva (YYYY-MM-DD): ");
        this.fechaReserva = scanner.next();

        System.out.print("Seleccione la duración en horas (1-3): ");
        this.duracionHoras = scanner.nextInt();

        System.out.println("\nServicios adicionales:");
        System.out.println("1. Servicio de dormitorios - $50,000");
        System.out.println("2. Servicio de duchas - $50,000");
        System.out.println("3. Servicio de streaming - $50,000");
        System.out.println("4. Comida y Bebidas Ilimitadas - $50,000");

        System.out.print("Seleccione servicios adicionales (separados por comas, 0 si ninguno): ");
        scanner.nextLine();  // Consumir el salto de línea pendiente
        this.serviciosAdicionales = scanner.nextLine();
    }

    public void mostrarRecibo(Usuario usuario) {
        // Lógica para calcular el total y mostrar el recibo
    }
}
