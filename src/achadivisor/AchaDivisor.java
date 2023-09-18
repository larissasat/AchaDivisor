
package achadivisor;

public class AchaDivisor {
  
    public static void main(String[] args) {
       int dividendo = 3147;
       int divisor;
        
        
       for (divisor =1; divisor < dividendo; divisor++)
       {
       if (dividendo % divisor != 0){ //resto divisão diferente de 0
           continue;
       }
       else {
           System.out.println("divisores de " + dividendo + " : " + divisor);
       }
    }      
               
    }
    
}
