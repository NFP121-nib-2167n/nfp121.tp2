package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author Pierre Abi Chedid 
 * @version 10-6-20
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
        int fahrenheit = 0;
        float celsius = 0;
        for(String s : args){
            
            fahrenheit = Integer.parseInt(s);
            celsius= fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 

        }   
          
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         
       float c = (float)((f - 32)*5)/9;
       c = (float) Math.floor(c * 10) / 10;
       return c;   
     }

}
