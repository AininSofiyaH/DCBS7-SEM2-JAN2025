import java.util.Scanner;

public class CHAPTER2_TASK5_NURAZREEN {

    public static void main (String[] args) {
 
//declare type of data for variable
   String item_name ;
   float price, quantity, total_price, discount_rate, price_after_discount; 

   Scanner baca = new Scanner(System.in);

        // nak bagi nampak cantik
        System.out.println("Hi ! welcome to senja libcafe");
        System.out.println("We offer variety of coffee and dessert here !");
        System.out.println(" 1.matcha strawberry \n 2.hazelnut latte \n 3.sparkling lemonade \n Dessert \n 1.tart cheese strawberry \n 2.burntcheese cake \n 3.rainbowcheese cake");

        System.out.println("Do Choose Your Favorite One !     : ");
        item_name = baca.nextLine();
        System.out.println("Kindly Enter The Price For Those Lovely  Choice        : ");
        price = baca.nextInt();
        System.out.println("Do Enter The Quantity Of Your Choice      : ");
        quantity = baca.nextInt();
        System.out.println("Kindly Enter The Price Rate XOXO : ");
        discount_rate = baca.nextInt();
        
        System.out.println("item name            : " +item_name);
        System.out.println("price               : " +price);
        System.out.println("quantity           : " +quantity);
        float total = price * quantity; // nak kira item 
        System.out.println("total price          : " +total);
        System.out.println("discount rate        : " +discount_rate);
         float tdisc = (total * discount_rate / 100); // formula untuk disc
        float  aftdisc = total - tdisc;
        System.out.println("price afteeeeer discount : " +aftdisc);

        baca.close();
    }
}
