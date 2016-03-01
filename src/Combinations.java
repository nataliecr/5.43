import java.util.Scanner;

public class Combinations {
  public static void main(String[] args){
    int count = 0;
    
    for (int i = 1; i < 8; i++){
      for (int j = 1; j < i; j++){  
        if (j != i)
            System.out.println(j + " " + i);
        count++;
      } // for j
    } // for i
    
    System.out.println("The total number of all combinations is " + count);
  }   // main 
}    // Combinations
