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
       
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         
       float c = (float)((f - 32)*5)/9;
       return c;   
     }

}
