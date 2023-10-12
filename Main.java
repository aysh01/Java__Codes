import java.util.*;

// A class to represent a product
class Product {
    // Instance variables
    private String name; // The name of the product
    private int rating; // The rating of the product (1 to 5)
    private String review; // The review of the product

    // Constructor
    public Product(String name, int rating, String review) {
        this.name = name;
        this.rating = rating;
        this.review = review;
    }


    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReview(String review) {
        this.review = review;
    }

    // A method to return the rating as a string
    public String getRatingString() {
        switch (rating) {
            case 1:
                return "Not Satisfactory";
            case 2:
                return "Average";
            case 3:
                return "Good";
            case 4:
                return "Very Good";
            case 5:
                return "Excellent";
            default:
                return "Invalid Rating";
        }
    }

    // A method to print the product details
    public void printProduct() {
        System.out.println("Name: " + name);
        System.out.println("Rating: " + getRatingString());
        System.out.println("Review: " + review);
        System.out.println();
    }
}

// A class to implement the application logic
class Application {
    // A list to store the products
    private List<Product> p;

    // Constructor
    public Application() {
        p = new ArrayList<>();
        // Add some sample products
        p.add(new Product("ABC", 5, "This is a great product!"));
        p.add(new Product("DEF", 4, "This is a good product."));
        p.add(new Product("GHI", 3, "This is an average product."));
        p.add(new Product("JKL", 2, "This is a below average product."));
        p.add(new Product("MNO", 1, "This is a bad product."));
        p.add(new Product("PQR", 4, "This is another good product."));
        p.add(new Product("STU", 2, "This is another below average product."));
        p.add(new Product("VWX", 3, "This is another average product."));
        p.add(new Product("YZA", 5, "This is another great product!"));
        p.add(new Product("BCD", 1, "This is another bad product."));
    }

    // A method to evaluate the rating and review of a given product
    public void evaluateProduct(String productName) {
        // Find the product with the given name
        for (Product pro : p) {
            if (pro.getName().equals(productName)) {
                // Print the rating and review of the product
                pro.printProduct();
                return;
            }
        }
        // If the product is not found, print a message
        System.out.println("Product not found.");
    }

    // A method to display the list of the top 5 products according to their rating and review
    public void displayTopProducts() {
        // Sort the products in descending order of their rating
        Collections.sort(p, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p2.getRating() - p1.getRating();
            }
        });
        
        // Print the first 5 products in the list
        System.out.println("Top 5 Products:");
        for (int i = 0; i < 5; i++) {
            p.get(i).printProduct();
        }
        
    }

    // A method to display a list of products whose rating is not satisfactory
    public void displayBadProducts() {
        
         // Filter the products whose rating is equal to 1
         List<Product> badProducts = new ArrayList<>();
         for (Product pro : p) {
             if (pro.getRating() == 1) {
                 badProducts.add(pro);
             }
         }
         
         // Print the bad products in the list
         System.out.println("Products with Not Satisfactory Rating:");
         for (Product pro : badProducts) {
             pro.printProduct();
         }
         
     }
}

// A class to test the application
class Main {

     public static void main(String[] args) {

         // Create an instance of the application class
         Application app = new Application();

         // Test some sample cases

         // Evaluate a product with name ABC
         app.evaluateProduct("ABC");

         // Evaluate a product with name EFG
         app.evaluateProduct("EFG");

         // Display the top 5 products
         app.displayTopProducts();

         // Display the products with not satisfactory rating
         app.displayBadProducts();
     }
}