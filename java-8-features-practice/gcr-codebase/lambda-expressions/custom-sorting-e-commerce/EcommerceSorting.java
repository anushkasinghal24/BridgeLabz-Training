import java.util.*;

public class EcommerceSorting {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 80000, 4.5, 10));
        products.add(new Product(2, "Mobile", 25000, 4.2, 15));
        products.add(new Product(3, "Tablet", 30000, 4.0, 20));
        products.add(new Product(4, "TV", 50000, 4.8, 5));
        products.add(new Product(5, "Digital Watch", 15000, 4.8, 5));

        while(true){
            System.out.println("Sorting the products by: ");
            System.out.println("1. Price");
            System.out.println("2. Rating");
            System.out.println("3. Discount");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine()); // safer
            } catch(Exception e){
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            Comparator<Product> comparator = null;

            switch(choice){
                case 1:
                    comparator = (p1,p2) -> Double.compare(p1.price, p2.price);
                    break;
                case 2:
                    comparator = (p1,p2) -> Double.compare(p2.rating, p1.rating);
                    break;
                case 3:
                    comparator = (p1,p2) -> Double.compare(p1.discount, p2.discount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            products.sort(comparator); // modern way

            System.out.println("Sorted products: ");
            for(Product p : products){
                System.out.printf(
                    "Product id: %d | Name: %s | Price: %.2f | Discount: %.1f | Rating: %.1f%n",
                    p.id, p.name, p.price, p.discount, p.rating
                );
            }
        }
    }
}

// Non-public class inside the same file
class Product {
    int id;
    String name;
    double price;
    double rating;
    double discount;

    Product(int id, String name, double price, double rating, double discount){
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}
