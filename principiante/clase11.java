//Estructuras de control (Switch - Case)
import java.util.Scanner;

public class clase11 {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int num1=0, num2=0, resultado=0;
    int parametro=0;

    System.out.println("Cual es su primer numero");
    num1=in.nextInt();
    System.out.println("Cual es su segundo numero");
    num2=in.nextInt();
    System.out.println("Cual es la operacion que quiere realizar; Multiplicar: 1, resta: 2, suma: 3");
    parametro=in.nextInt();

    switch(parametro){
      case 1: resultado=num1*num2;
      System.out.println("El resultado de la multiplicacion es de "+resultado);
      break;
      case 2: resultado=num1-num2;
      System.out.println("El resultado de la resta es de "+resultado);
      break;
      case 3: resultado=num1+num2;
      System.out.println("El resultado de la suma es de "+resultado);
      break;

      default: System.out.println("ERROR, la opcion no existe");
    }
  }
}
