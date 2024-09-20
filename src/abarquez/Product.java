
package abarquez;

import java.util.Scanner;


public class Product {
          public void getProduct(){
        Scanner sc = new Scanner(System.in);
        Products pds = new Products();
        
        System.out.println("Running Product Program:\n");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Product name: ");
        String product = sc.next();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the number of stocks: ");
        int stock = sc.nextInt();
        System.out.print("Enter the number of sold products: ");
        int sold = sc.nextInt();
        
        System.out.printf("\n%-5s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Product", "Price", "Stocks", "Sold", "Proft", "TEP", "Status");
        
        pds.addProducts(id, product, price, stock, sold);
        pds.viewProducts();
    }
}