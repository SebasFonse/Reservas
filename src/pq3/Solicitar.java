package pq3;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
