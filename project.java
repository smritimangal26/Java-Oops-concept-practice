 class pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice =100;
    private int extraToppingsPrice =150;
    private int backPackPrice =20;


    
    public pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;

        }
        
        }



             
    public void addExtraCheese(){
        
        System.out.println("extra cheese added ");
        this.price += extraCheesePrice;

    }
    public void addExtraToppings(){
       
        System.out.println("extra toppings added ");
    this.price += extraToppingsPrice;


    }
    public void takeAway(){
       
        System.out.println("Take away opted");
    this.price += backPackPrice;

    }
    public void getBill(){
        System.out.println(this.price);

    }

 }
    

    
    public class project{
        public static void main(String args[]){
            pizza basePizza = new pizza(true);
            basePizza.addExtraToppings();
            basePizza.addExtraCheese();
            basePizza.takeAway();
            basePizza.getBill();
        }
    
    }
        
