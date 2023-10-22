package pq1;

import pq1.Usuario;
import pq1.Reserva;

import java.util.Scanner;

public class Solicitar {
    public static void main(String[] args) {
        ejecutarPrograma();
    }
    
     // Método principal para ejecutar el programa
    public static void ejecutarPrograma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Reserva de Salas de Videojuegos");

        Usuario usuario = new Usuario();
        usuario.solicitarInformacion(scanner);

        Reserva reserva = new Reserva();
        reserva.solicitarDetalles(scanner);

        reserva.mostrarRecibo(usuario);
        imprimirOpciones(reserva);
      
        scanner.close();
    }
    
    private static void imprimirOpciones(Reserva reserva) {
        System.out.println("\nOpciones seleccionadas:");
        System.out.println("Sala seleccionada: " + reserva.getSalaSeleccionada());
        System.out.println("Fecha de reserva: " + reserva.getFechaReserva());
        System.out.println("Duración en horas: " + reserva.getDuracionHoras());
        System.out.println("Servicios adicionales: " + reserva.getServiciosAdicionales());
        System.out.println("Total a pagar: $" + reserva.getTotal());  // Obtener el total directamente
    }
}
