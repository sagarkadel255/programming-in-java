import java.util.ArrayList;


public class ArrayListClass {
    public static void main (String[]args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);
        numbers.set(1,210);
        numbers.set(2,420);
        System.out.println(numbers);
    }
}