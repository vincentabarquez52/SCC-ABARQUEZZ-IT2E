
package abarquez;


public class Grades {
      int S_ID;
    String S_NAME;
    double PRE, MID, PREFI, FIN, AVERAGE;
    
    public void addGrades(int id, String name, double p, double m, double pf, double f){
        this.S_ID = id;
        this.S_NAME = name;
        this.PRE = p;
        this.MID = m;
        this.PREFI = pf;
        this.FIN = f;
    }
    
    public void getGrades(){
        
        AVERAGE = (this.PRE+this.MID+this.PREFI+this.FIN)/4;
        String remarks = (AVERAGE > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-5d %-10s %-5.1f %-5.1f %-5.1f %-5.1f %-5.1f %s\n", S_ID, S_NAME, PRE, MID, PREFI, FIN, AVERAGE, remarks);
    }
}

