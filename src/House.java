public class House implements Comparable<House>, Cloneable {
   int area;
   
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
    return super.clone();
   }
}
