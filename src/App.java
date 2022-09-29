import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
      
        House h1 = new House(5);
        House h2 = new House(10);

        h1.compareTo(h2);


        ArrayList<House> houses1 = new ArrayList<>();
        houses1.add(h1);
        houses1.add(h2);

        ArrayList<House> houses2 = (ArrayList<House>)houses1.clone();
        houses2.add(new House(15)); // it won't affect the houses1 as it's a clone of houses1 and not holding the same reference


        
    }
}
