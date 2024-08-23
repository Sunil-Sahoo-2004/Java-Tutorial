package DatetimeAPI;
import java.lang.annotation.*;

// Syntex of Creating Annetation
   //This Annetation is called META
   @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})     // ** This is for where you use this Annetation
   @Retention(RetentionPolicy.RUNTIME)         // ** Power Distance of Anetation 
   @interface CricketPlayer{
       // String country();
       String country() default "India";
       int age() default 34;
   }
   
   // @CricketPlayer(country = "India")
   @CricketPlayer
   class Virat{
       @CricketPlayer
       private int innings;
       private int runs;
   
       @CricketPlayer
       public int getInnings(){
           return innings;
       }
       public void setInnings(int innings){
           this.innings = innings;
       }
       public int getRuns(){
           return runs;
       }
       public void setRuns(int runs){
           this.runs = runs;
       }
   }
   

public class Castom_Annotation {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setInnings(300);
        v.setRuns(13000);

        System.out.println("Total Innengs of VIRAT are : " + v.getInnings());
        System.out.println("Total Runs of VIRAT are : " + v.getRuns());


        
        
        // ** Use Reflection API code to Print Annetation Value
        Class c = v.getClass();
        // Annotation a = c.getAnnotation(CricketPlayer.class);
        Annotation a = (Annotation) c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer)a;  // DownCasting

        String country = cp.country();
        System.out.println("VIRAT belongs from " + country);
        int age = cp.age();
        System.out.println("VIRATS age is " + age);
    }
}