import java.util.*;
 public class billing {
    
    public static Scanner input = new Scanner(System.in);
    public static int choice;
    private static int quantity=1;
    private static String again;
    private static double total=0;
   

    public static void menu(){
        System.out.println("welcome to the store");
        System.out.println("available in the store");
        System.out.println("wheat");
        System.out.println("Icecream");
        System.out.println("Sugar");
    }
    public static void order(){
        System.out.println("1 for wheat ,2 for Icecream, 3 for sugar") ;
        System.out.println("Press the number for the order");
        choice= input.nextInt();
        if(choice==1){
            System.out.println("your order is wheat");
            System.out.println("write the quantity");
            quantity=input.nextInt();
            
            System.out.println("you want to buy again");
            System.out.println("Press y for yess and n for no");
            again=input.next();
            if(again.equals("y"))
            order();
            else{
                System.out.println("total payment");
                total= total+(quantity*80);
                System.out.println(total);

            }
            
        }
        else if(choice==2){
            System.out.println("your order is icecream");
            System.out.println("the amount of the quantity");
            quantity=input.nextInt();
            System.out.println("you want to buy again");
            System.out.println("Press y for yess and n for no");
            again=input.next();
            if(again.equals("y"))
            order();
            else{
                System.out.println("total payment");
                total= total+(quantity*20);
                System.out.println(total);

            }
            
        }
        else if(choice==3){
            System.out.println("your order is sugar");
            System.out.println("the amount of the quantity");
            quantity=input.nextInt();
            total= total+(quantity*40);
            System.out.println("you want to buy again");
            System.out.println("Press y for yess and n for no");
            again=input.next();
            if(again.equals("y"))
            order();
            else{
                System.out.println("total payment");
                total= total+(quantity*40);
                System.out.println(total);

            }

            
        }
        

        
    }
    public class main {
        public static void main (String args[]){
            menu();
            order();
           
        }
    }
}
   
    


    

    




