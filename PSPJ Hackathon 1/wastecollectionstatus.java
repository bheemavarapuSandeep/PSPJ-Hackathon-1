import java.util.Scanner;
 public class wastecollectionstatus{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter wastecollected (Kg)");
        double wastecollected = sc.nextDouble();
        if(wastecollected >=100){
            System.out.println("Collection Target Achieved");
        }else{
            System.out.println("More Waste Collection Required");
        }

        sc.close();
        
     }
 }