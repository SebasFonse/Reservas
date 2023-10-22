package pq1;

import java.util.Scanner;

public class Reserva {
    private int salaSeleccionada;
    private String fechaReserva;
    private int duracionHoras;
    private String serviciosAdicionales;
    private int total; 
    
     // Método para solicitar detalles de la reserva desde la consola
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

        // Calcular el total al solicitar los detalles
        this.total = calcularTotal();
    }
    // Método para mostrar el recibo 
    public void mostrarRecibo(Usuario usuario) {
        
    }

    public int getTotal() {
        return total;
    }
    // Método privado para calcular el total basado en las opciones seleccionadas
    private int calcularTotal() {
        int costoSala = 0;
        switch (this.salaSeleccionada) {
            case 1 -> costoSala = 100000;
            case 2 -> costoSala = 200000;
            case 3 -> costoSala = 300000;
        }

        int costoServicios = 0;
        if (!this.serviciosAdicionales.equals("0")) {
            String[] serviciosSeleccionados = this.serviciosAdicionales.split(",");
            for (String servicio : serviciosSeleccionados) {
                costoServicios += 50000;
            }
        }

        return costoSala + costoServicios + (this.duracionHoras * 50000);  // Agregar costo por hora
    }

    // Resto de la clase

    int getSalaSeleccionada() {
        return salaSeleccionada;
    }

    String getFechaReserva() {
        return fechaReserva;
    }

    int getDuracionHoras() {
        return duracionHoras;
    }

    String getServiciosAdicionales() {
        return serviciosAdicionales;
    }
}
