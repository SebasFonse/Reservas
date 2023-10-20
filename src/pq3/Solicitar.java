package pq3;

import pq1.Usuario;
import pq2.Reserva;

import java.util.Scanner;

public class Solicitar {
    public static void main(String[] args) {
        ejecutarPrograma();
    }

    public static void ejecutarPrograma() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Reserva de Salas de Videojuegos");
            
            Usuario usuario = new Usuario();
            usuario.solicitarInformacion(scanner);
            
            Reserva reserva = new Reserva();
            reserva.solicitarDetalles(scanner);
            
            reserva.mostrarRecibo(usuario);
        }
    }
}
