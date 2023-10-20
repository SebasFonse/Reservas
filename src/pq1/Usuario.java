package pq1;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String numero;

    public void solicitarInformacion(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        this.apellido = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        this.direccion = scanner.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        this.numero = scanner.nextLine();
    }

    // Getters para acceder a la información del usuario
}
