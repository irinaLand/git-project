package EnumHome;

/**
 * Created by Ирина on 18.01.2016.
 */
public enum Directry {
    RIGHT,DOWN,LEFT,UP;
   public  Directry nextDirectory(){
         Directry mas[]=Directry.values();
         return mas[(this.ordinal()+1)%4];
     }
}
