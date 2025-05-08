package feariasa.biblioteca1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Biblioteca1 {
    String nombreLibro;
    String nombreUsuario;
    long numeroLibro;
    int numeroUsuario;
    String catLibro;

    public String getNombreLibro() {
        return nombreLibro;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public long getNumeroLibro() {
        return numeroLibro;
    }
    public int getNumeroUsuario() {
        return numeroUsuario;
    }
    public String getCatLibro(){
        return catLibro;
    }
    
    public void setNombreLibro(String nombreLibro) {
           this.nombreLibro = nombreLibro;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public void setNumeroLibro(long numeroLibro) {
        this.numeroLibro = (int) numeroLibro; 
    }
    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }
    public void setCatLibro(String catLibro){
        this.catLibro = catLibro;
    }

    
    public Biblioteca1(String nombreLibro, String nombreUsuario, long numeroLibro1, int numeroUsuario, String catLibro) {
        this.nombreLibro = nombreLibro;
        this.nombreUsuario = nombreUsuario;
        this.numeroLibro = numeroLibro1;
        this.numeroUsuario = numeroUsuario;
        this.catLibro = catLibro;
    }

    public static void guardarEnArchivo(Biblioteca1 biblioteca){
        try {
            try (FileWriter escritor = new FileWriter("registro_biblioteca.txt", true)) {
                escritor.write("Nombre del libro: " + biblioteca.nombreLibro + "\n");
                escritor.write("Nombre del usuario: " + biblioteca.nombreUsuario + "\n");
                escritor.write("Numero ISBN del libro: " + biblioteca.numeroLibro + "\n");
                escritor.write("Numero de identificacion del usuario: " + biblioteca.numeroUsuario + "\n");
                escritor.write("Categoría del libro es: " + biblioteca.catLibro + "\n");
                escritor.write("-------------------------------------------\n");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }
    
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el nombre del libro: ");
            String nombreLibro = scanner.nextLine();
            System.out.println("Ingrese el nombre del usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese el numero ISBN del libro: ");
            long numeroLibro = scanner.nextInt();
            System.out.println("Ingrese su numero de identificacion: ");
            int numeroUsuario = scanner.nextInt();
            
            String catLibro = "";
            boolean opcionValida = false;
            
            while (!opcionValida){
                System.out.println("Seleccione la categoria del libro: ");
                System.out.println("1. Ficcion");
                System.out.println("2. No ficcion");
                System.out.println("3. Ciencia");
                System.out.println("4. Historia ");
                System.out.println("5. Tecnologia");
                System.out.print("Ingrese el numero de la categoria: ");
                
                int opcion = scanner.nextInt();
                scanner.nextLine();
                
                switch (opcion) {
                case 1 -> {
                    catLibro = "Ficcion";
                    opcionValida = true;
                    }
                case 2 -> {
                    catLibro = "No Ficcion";
                    opcionValida = true;
                    }
                case 3 -> {
                    catLibro = "Ciencia";
                    opcionValida = true;
                    }
                case 4 -> {
                    catLibro = "Historia";
                    opcionValida = true;
                    }
                case 5 -> {
                    catLibro = "Tecnologia";
                    opcionValida = true;
                    }
                default -> System.out.println("Opción invalida. Intente nuevamente.");
            }
        }
                
            Biblioteca1 biblioteca = new Biblioteca1(nombreLibro, nombreUsuario, numeroLibro, numeroUsuario, catLibro);
            
            System.out.println("\n Los datos que ingreso son los siguientes:");
            System.out.println("Nombre del libro: " + biblioteca.getNombreLibro());
            System.out.println("Nombre del usuario: " + biblioteca.getNombreUsuario());
            System.out.println("ISBN del libro: " + biblioteca.getNumeroLibro());
            System.out.println("El ID del usuario es: " + biblioteca.getNumeroUsuario());
            System.out.println("La categoria elegida del libro es: " + biblioteca.getCatLibro());
            
            guardarEnArchivo(biblioteca);
            System.out.println("Datos guardados correctamente. \n");
            System.out.println("Registro finalizado. Gracias por usar el sistema.");
        } 
    }
}