//Estructuras de control (Switch - Case)
import java.util.Scanner;

public class clase11 {
  public static void main(String args[]){
    try (Scanner in=new Scanner(System.in)){
      int num1=0, num2=0, resultado=0;
      int parametro=0;

      System.out.println("Cual es su primer número");
      num1=in.nextInt();
      System.out.println("Cual es su segundo número");
      num2=in.nextInt();
      System.out.println("Cual es la operación que quiere realizar; Multiplicar: 1, Resta: 2, Suma: 3");
      parametro=in.nextInt();

      switch(parametro){
        case 1: resultado=num1*num2;
        System.out.println("El resultado de la multiplicación es de "+resultado);
        break;
        case 2: resultado=num1-num2;
        System.out.println("El resultado de la resta es de "+resultado);
        break;
        case 3: resultado=num1+num2;
        System.out.println("El resultado de la suma es de "+resultado);
        break;

        default: System.out.println("ERROR, la opción no existe");
      }
    }
  }
}
