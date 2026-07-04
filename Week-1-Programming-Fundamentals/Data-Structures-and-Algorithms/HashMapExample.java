import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Aman");
        students.put(103, "Priya");

        System.out.println(students);

        System.out.println("Student 102: " + students.get(102));
    }
}