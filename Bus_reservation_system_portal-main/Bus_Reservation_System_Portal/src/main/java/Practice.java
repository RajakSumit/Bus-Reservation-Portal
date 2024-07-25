import java.util.*;
import java.util.stream.Stream;

public class Practice {

    public static void main(String[] args) {

//        List<String> name = Arrays.asList("12","45","44","12");
//
//        Set<String> nameSet = new HashSet<>(name);
//        System.out.println(nameSet);

//        Write a Java program to sort a list of strings using a lambda expression.

//        List<String> names = Arrays.asList("Sumit","Aman","Rahul","Arbaaz");
//         names.sort((a,b)->a.compareTo(b));
//       names.forEach(System.out::println);

//        Given a list of integers, write a Java program to find
//        the sum of all even numbers using the Streams API


//        List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        int sum = numbers.stream().filter(n -> n % 2 == 0)
//                .mapToInt(Integer::intValue)
////                .mapToInt(Integer::intValue): Maps each integer in the stream to an int.
////                This is necessary because sum() is a method on the IntStream,
////                which operates on primitive int values, not Integer objects.
//                .sum();
//        System.out.println("Sum of all even numbers is = "+ sum);

//        List<String> strings = Arrays.asList(null,null,"sumit","secondNonNull");
//        Optional<String> first = strings.stream().filter(s -> s != null)
//                        .findFirst();
//
//        first.ifPresent(System.out::println);


        List<String> names = Arrays.asList("sumit","rahul","ajay");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        }

    }


