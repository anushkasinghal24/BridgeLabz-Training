import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String name;
    double price;
    int quantity;


    Product(String name,double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    double getValue(){
        return price*quantity;
    }

    void display() {
        System.out.println(name + " - Price: " + price + ", Quantity: " + quantity);
    }
}

  class Electronics extends Product{

      int warranty;
      Electronics(String name, double price, int quantity, int warranty) {

          super(name, price, quantity);

          this.warranty = warranty;
      }

      void display() {

          System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Warranty: "+warranty+" months");
      }

  }


class Clothing extends Product{

    String size;
    Clothing(String name, double price, int quantity, String size) {

        super(name, price, quantity);

        this.size = size;
    }

    void display() {

        System.out.println(name+" - Price: "+price+", Quantity: "+quantity+", Size: "+size);
    }

}



public class SupermarketStoreInventorySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num = Integer.parseInt(sc.nextLine());


        ArrayList<Product> inventory = new ArrayList<>();


        for (int i = 0; i < num; i++) {

            String line = sc.nextLine();

            String[] data = line.split(", ");


            String type = data[0];

            if (type.equals("Electronics")) {
                String name=data[1];

                double price=Double.parseDouble(data[2]);

                int quantity=Integer.parseInt(data[3]);

                int warranty=Integer.parseInt(data[4]);

                Electronics e=new Electronics(name,price,quantity,warranty);

                inventory.add(e);

                System.out.println("Product added to inventory: "+name);

            } else if (type.equals("Clothing")){

                String name=data[1];

                double price=Double.parseDouble(data[2]);

                int quantity=Integer.parseInt(data[3]);

                String size=data[4];

                Clothing c = new Clothing(name,price,quantity,size);

                inventory.add(c);

                System.out.println("Product added to inventory: "+name);
            }
        }

        System.out.println("Inventory:");

        double total=0;

        for(Product p:inventory) {

            p.display();

            total+=p.getValue();

        }

        System.out.printf("Total value of the inventory: %.2f",total);
    }
}
