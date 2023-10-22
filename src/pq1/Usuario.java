package pq1;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String apellido;
    private String direccion;
    private String numero;

     // Método para solicitar información del usuario desde la consola
    public void solicitarInformacion(Scanner scanner) {
    //un medio para interactuar con el usuario y recopilar información de entrada desde la consola.
        System.out.print("Ingrese su nombre: ");
        this.nombre = scanner.nextLine(); 
        //se utiliza para capturar el nombre ingresado por el usuario desde la consola y 
        //asignarlo a la propiedad nombre de la instancia actual de la clase

        System.out.print("Ingrese su apellido: ");
        this.apellido = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        this.direccion = scanner.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        this.numero = scanner.nextLine();
    }

  
}
