
package abarquez;

import java.util.Scanner;


public class Grade {
      public void getGrades(){
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];
        
        System.out.println("Running Grade program: \n");
        System.out.print("Enter no. of students: ");
        int snum = sc.nextInt();
        
        for(int i = 0; i < snum; i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pre = sc.nextDouble();
            System.out.print("Midterm: ");
            double mid = sc.nextDouble();
            System.out.print("Prefi: ");
            double pref = sc.nextDouble();
            System.out.print("Final: ");
            double fin = sc.nextDouble();
            
            gr[i] = new Grades();
            gr[i].addGrades(id, name, pre, mid, pref, fin);
        }
        
        double TCA = 0;
        int passed = 0;
        int failed = 0;
        
        System.out.printf("\n%-5s %-10s %-5s %-5s %-5s %-5s %-5s %-5s\n", "ID", "Student", "Pre", "Mid", "Prefi", "Final", "Average", "Remarks");
        
        for(int i = 0; i < snum; i++){
            gr[i].AVERAGE = (gr[i].PRE+gr[i].MID+gr[i].PREFI+gr[i].FIN)/4;
            TCA = TCA + gr[i].AVERAGE;
            gr[i].getGrades();
            
            if(gr[i].AVERAGE > 3.0){
                failed++;
            } else{
                passed++;
            }
        }
        
        System.out.println("\n--------------------------------------"
                + "\nNo. of students: "+snum
                + "\nTotal class average: "+TCA/snum
                + "\nNo. of passed: "+passed
                + "\nNo. of failed: "+failed);
    }
}