import java.util.Date;

public class House implements Comparable<House>, Cloneable {
   int area;
   Date built;
   
   public House(int area){
    this.area = area;
   }

   public int getArea(){
    return area;
   }

   @Override
   public int compareTo(House o){
        if(this.area < o.getArea()){
            return -1;
        }
        else if (this.area > o.getArea()){
            return 1;
        }
        else{
            return 0;
        }
   }

   @Override
   public Object clone() throws CloneNotSupportedException{
        House houseClone = (House)super.clone();
        houseClone.built = (Date)this.built; // performing deep copy
        return houseClone; 
   }
}
