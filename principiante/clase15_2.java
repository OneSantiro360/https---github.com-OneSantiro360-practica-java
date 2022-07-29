public class clase15_2 {
  public static void main(String args[]){
    int i=1, j=99;
    System.out.println("Serie con for");
    for(i=1; i<=100; i++){
      if(i<100){
        System.out.print(i+",");
        System.out.print(j+",");
      }
      else{
        System.out.print(i+",");
        System.out.print(j);
      }
      j--;
    }
    System.out.println("");
    i=1;
    j=99;
    System.out.println("Serie con while");
    while(i<=100){
      if(i<100){
        System.out.print(i+",");
        System.out.print(j+",");
      }
      else{
        System.out.print(i+",");
        System.out.print(j);
      }
      i++;
      j--;
    }
    System.out.println("");
    i=1;
    j=99;
    System.out.println("Serie con do-while");
    do{
      if(i<100){
        System.out.print(i+",");
        System.out.print(j+",");
      }
      else{
        System.out.print(i+",");
        System.out.print(j);
      }
      i++;
      j--;
    }
    while(i<=100 );
  }
}
