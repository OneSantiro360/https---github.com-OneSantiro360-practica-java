import java.util.Scanner;
public class clase17_5 {
  public static void main(String args[]){
    try (Scanner in = new Scanner(System.in)){
      String name="", password="";

      System.out.print("Cual es su nombre de usuario: ");
      name=in.nextLine();

      if(name.equals("OneSantiro360")){
        System.out.print("Cual es su contraseña: ");
        password=in.nextLine();

        if(password.equals("jrD71bhFu5$t")){
          System.out.println("Bienvenido de nuevo "+name);
        }
        else{
          System.out.println("Contraseña incorrecta");
        }
      }
      else{
        System.out.println("El usuario no está registrado");
      }
    }
  }
}
