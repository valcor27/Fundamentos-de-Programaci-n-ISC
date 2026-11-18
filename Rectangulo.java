import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double altura, base, area, perimetro;
        int opcion;

        System.out.println("\n Ingresa la altura");
        altura = leer.nextDouble();
        System.out.println("\n Ingresa la base");
        base = leer.nextDouble();

        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Calcular el Área");
        System.out.println("2. Calcular el Perímetro");

        opcion = leer.nextInt();
        if (opcion == 1){
            area = base * altura;
            System.out.println("El área es: " + area);
        }else if (opcion == 2){
            perimetro = base + altura + base + altura;
            System.out.println("El perimetro es: " + perimetro);
        }else{
            System.out.println("Error: Datos invalidos");
        }

        leer.close();
    }
}
