//Code by Dabeer Masood 
import java.util.*;
import java.io.*;  
public class HappyNumbers

{
   public static void main(String[] args)throws FileNotFoundException{
       Scanner inFile = new Scanner (new FileReader("C:\\Users\\dabee_000\\Documents\\practiceinput.txt"));
       numbers(inFile);
    }
    
    
    
    public static void numbers(Scanner inFile){
        int counter =0;
        ArrayList<Integer> checker = new ArrayList<Integer>();
        while(inFile.hasNext()){
            checker.clear();
            counter =0;
        int number = inFile.nextInt();
        int determine = 0;
        checker.add(number);
        while(number!=1){
                    int solution = 0;
        while(number!=0){
    solution+=(number%10)*(number%10);
    number= number/10;

    }
    number = solution;
    if(checker.contains(number)){
        determine =1;
        counter++;
    System.out.println("unhappy " + counter);
    number =1;
    }else{
    checker.add(number);
    counter++;
}
}
        if(number == 1 && determine ==0){
                    System.out.println("happy " + counter);
        }
        
        }
    }
}
