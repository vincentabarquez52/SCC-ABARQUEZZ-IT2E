
package abarquez;

import java.util.Scanner;


public class ABARQUEZ {

   
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        Grade grd = new Grade();
        Sale sl = new Sale();
        Product pr = new Product();
        Account ac = new Account();
        
        String Confirm;
        
        do{
            System.out.print("\nSelect Program to run:"
                + "\n1. Products"
                + "\n2. Sales"
                + "\n3. Grades"
                + "\n4. Accounts"
                + "\nEnter selection: ");
        int select = sc.nextInt();
                
        switch(select){
            case 1:
                pr.getProduct();
                break;
            case 2:
                sl.getSales();
                break;
            case 3:
                grd.getGrades();
                break;
            case 4:
                ac.getAccounts();
                break;
        }   
        
            System.out.print("Make another transaction? (y/n): ");
            Confirm = sc.next();
            
        } while(Confirm.equals("y"));
        
        System.out.println("\nThank you for using the system!");
    }
}
    
    
    