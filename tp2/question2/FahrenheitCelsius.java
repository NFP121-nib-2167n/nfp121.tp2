package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Pierre Abi Chedid 
 * @version 10-6-20
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         
       float c = (float)((f - 32)*5)/9;
       c = (float) Math.floor(c * 10) / 10;
       return c;   
     }

}
