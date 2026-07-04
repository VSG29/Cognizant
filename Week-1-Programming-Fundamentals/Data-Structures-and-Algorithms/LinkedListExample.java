import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");

        System.out.println("Cities: " + cities);

        cities.remove("Mumbai");

        System.out.println("After Removal: " + cities);

        System.out.println("First City: " + cities.getFirst());
    }
}