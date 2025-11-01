// AT Java Liam Cesar 10/30/2025

public class CDecay {
    public static void main(String[] args) {
       double material = 100.0;   
       int years = 0;           
 

       while (material > 1.0) {
          material = material / 2;
          years = years + 30;
       }
 
       System.out.println("Years: " + years);
       System.out.println("Material left: " + material + "%");
    }
 } 