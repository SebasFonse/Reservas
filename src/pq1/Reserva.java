package pq1;

import java.util.Scanner;

public class Reserva {
    private int salaSeleccionada;
    private String fechaReserva;
    private int duracionHoras;
    private String serviciosAdicionales;
    private int total;
    private SalaSeleccionada sala;
    private ServiciosAdicionales serviciosAdicionalesObj;

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

        // Cambios para utilizar las nuevas clases
        this.sala = obtenerSalaSeleccionada();
        this.serviciosAdicionalesObj = obtenerServiciosAdicionales();

        // Calcular el total al solicitar los detalles
        this.total = calcularTotal();
    }

    // Método privado para obtener la sala seleccionada
    private SalaSeleccionada obtenerSalaSeleccionada() {
        int costoSala = 0;
        switch (this.salaSeleccionada) {
            case 1 -> costoSala = 100000;
            case 2 -> costoSala = 200000;
            case 3 -> costoSala = 300000;
        }
        return new SalaSeleccionada(this.salaSeleccionada, costoSala);
    }

    // Método privado para obtener los servicios adicionales
    private ServiciosAdicionales obtenerServiciosAdicionales() {
        String[] serviciosSeleccionados = this.serviciosAdicionales.equals("0") ?
                new String[0] : this.serviciosAdicionales.split(",");
        int costoServicios = serviciosSeleccionados.length * 50000;
        return new ServiciosAdicionales(serviciosSeleccionados, costoServicios);
    }

    // Método para mostrar el recibo
    public void mostrarRecibo(Usuario usuario) {
        // Implementar la lógica para mostrar el recibo
        System.out.println("Recibo:");
        System.out.println("Fecha de reserva: " + this.fechaReserva);
        System.out.println("Sala seleccionada: " + this.sala.getNumero());
        System.out.println("Costo de la sala: $" + this.sala.getCosto());
        System.out.println("Duración en horas: " + this.duracionHoras);
        System.out.println("Servicios adicionales: " + String.join(", ", this.serviciosAdicionalesObj.getServicios()));
        System.out.println("Costo de servicios adicionales: $" + this.serviciosAdicionalesObj.getCostoPorServicio());
        System.out.println("Total a pagar: $" + this.total);
        // Agregar más detalles según sea necesario
    }

    public int getTotal() {
        return total;
    }

    // Resto de la clase...

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

    // Resto de la clase...

    private int calcularTotal() {
        // Calcular el total sumando el costo de la sala y el costo de los servicios adicionales
        return this.sala.getCosto() + this.serviciosAdicionalesObj.getCostoPorServicio();
    }
}




