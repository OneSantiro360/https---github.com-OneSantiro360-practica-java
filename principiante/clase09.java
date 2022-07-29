//Condiciones compuestas con operadores lógicos & relacionales "|| and &&"
import java.util.Scanner;

public class clase09 {
  
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String nombre="";
    int clave=0;
    int antiguedad=0;


    System.out.println("Cual es el nombre del trabajador");
    nombre=in.nextLine();

    System.out.println("Cuantos años tiene el trabajador con la empresa");
    antiguedad=in.nextInt();

    System.out.println("Cual es la clave del TRabajador");
    clave=in.nextInt();

    if(clave==1){
      if(antiguedad==1){
        System.out.println("El trabajador "+nombre+" tiene derecho a 6 dias de vacaciones");
      }
      else if(antiguedad>=2&&antiguedad<=6){
        System.out.println("El trabajador "+nombre+" tiene derecho a 14 dias de vacaciones");
      }
      else if(antiguedad>=7){
        System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
      }
      else{
        System.out.println("El trabajador "+nombre+" todavia no tiene derecho a las vacaciones");
      }
    }
    else if(clave==2){
      if(antiguedad==1){
        System.out.println("El trabajador "+nombre+" tiene derecho a 7 dias de vacaciones");
      }
      else if(antiguedad>=2&&antiguedad<=6){
        System.out.println("El trabajador "+nombre+" tiene derecho a 15 dias de vacaciones");
      }
      else if(antiguedad>=7){
        System.out.println("El trabajador "+nombre+" tiene derecho a 22 dias de vacaciones");
      }
      else{
        System.out.println("El trabajador "+nombre+" todavia no tiene derecho a las vacaciones");
      }
    }
    else if(clave==3){
      if(antiguedad==1){
        System.out.println("El trabajador "+nombre+" tiene derecho a 10 dias de vacaciones");
      }
      else if(antiguedad>=2&&antiguedad<=6){
        System.out.println("El trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
      }
      else if(antiguedad>=7){
        System.out.println("El trabajador "+nombre+" tiene derecho a 30 dias de vacaciones");
      }
      else{
        System.out.println("El trabajador "+nombre+" todavia no tiene derecho a las vacaciones");
      }
    }
    else{
      System.out.println("Error, la clave de departamento no existe");
    }
  };
}
