import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class EjemploExcepciones {
    public static void main(String []args){ // throws FileNotFoundException{
        try {
            File archivo = new File ("entrada.txt");
            Scanner teclado = new Scanner(archivo);
            System.out.print("ingresa un numero");
            int num1 = teclado.nextInt(); //nextInt toma el siguiente numero
            System.out.print("ingresa un numero");
            int num2 = teclado.nextInt(); //nextInt toma el siguiente numero
            System.out.print("la division es: " + num1 / num2);
        }
        catch(ArithmeticException e) {
            System.out.println("Division por 0");
        }
        catch(InputMismatchException e){
                System.out.println("Entrada incorrecta");
         }
        catch (FileNotFoundException e){
                System.out.println("No existe el archivo");
         }

        }

        //Correr el programa y probarlo con diferentes valores
        //¿Que ocurre cuando num2 es 0? ¿Como se llama la excepcion?
        //Buscar la excepcion en la documentacion de Java
        //y revisar de quien es subclase...
    }


