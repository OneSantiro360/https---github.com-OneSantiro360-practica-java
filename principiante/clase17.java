//Cadenas de caracteres con el método equals
import java.util.Scanner;
public class clase17{
  public static void main(String args[]){
    try (Scanner in = new Scanner(System.in)){
      String name="", name2="";

      System.out.print("Cual es su Nombre de usuario: ");
      name=in.nextLine();

      System.out.print("Cual es su Nombre de usuario2: ");
      name2=in.nextLine();

      if(name.equals(name2)){
        System.out.println("Los nombres son iguales");
      }
      else{
        System.out.println("Los nombres no son iguales");
      }
    }
  }
}