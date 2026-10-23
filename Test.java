
package test;

 import java.util.ArrayList;
import java.util.List;
public class Test {
 public static void addNumbers(List<? super Number> list) {
        list.add(10);
        list.add(20.5);
        list.add(30L);
    }


    public static void main(String[] args) {
          List<Number> numbers = new ArrayList<>();
          

        addNumbers(numbers);

        for (Object number : numbers) {
            System.out.println(number);
    }
    

    }
}