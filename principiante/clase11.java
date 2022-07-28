//Estructuras de control (Switch - Case)

public class clase11 {
  public static void main(String args[]){
    int num1=5, num2=3, resultado=0;
    int parametro=3;

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

      default: System.out.println("ERROr, la opcion no existe");
    }
  }
}
