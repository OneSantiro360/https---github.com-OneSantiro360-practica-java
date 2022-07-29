//Estructuras condicionales con if-else
public class clase06 {
  public static void main(String args[]){
    int math=5;
    int bio=8;
    int qui=7;
    int promedio=0;

    promedio=(math+bio+qui)/3; //sacar promedio de notas
    if(promedio>=6){ //if es para positivo
      System.out.println("El alumno aprobo el año 2022 con: "+promedio);
    }
    else{ //else para negativo
      System.out.println("El alumno reprobo el año 2022 con: "+promedio);
    }
  } 
}