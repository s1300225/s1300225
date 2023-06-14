import java.util.Random;
import java.util.Scanner;
class dice{
  public static void main(String[] args){
    System.out.println("Rolling dice...");
    int j,num=0;
    for(int i=1;i<3;i++){
     System.out.print("Die "+i+": ");
      Random ran = new Random();
      j = ran.nextInt(6)+1;
      System.out.println(j);
      num+=j;
    }
    System.out.println("Total value: "+num);
    if(num>7){
      System.out.println("You won");
    }
    if(num<=7){
      System.out.println("You lost");
    }
  }
}
