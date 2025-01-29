
// import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class java {

    public static void main(String[] args) {
        // System.out.println(System.out);
        // System.out.println(System.getProperties());
        List<Integer> primeNumbers; // = new ArrayList<Integer>();
        List<Integer> squarePrimeNumbers; // = new ArrayList<Integer>();
        // Stream.iterate(1, elem -> ++elem)
        // .filter((elem) -> {
        // for (int i = 2; i <= Math.sqrt(elem); i++)
        // if (elem % i == 0)
        // return false;
        // return true;
        // })
        // .limit(500)
        // .forEach((elem) -> {
        // // System.out.println(elem);
        // primeNumbers.add(elem);
        // squarePrimeNumbers.add(elem * elem);
        // });
        primeNumbers = Stream.iterate(1, num -> num + 1)
                .filter((num) -> {
                    for (int i = 2; i <= Math.sqrt(num); i++)
                        if (num % i == 0)
                            return false;
                    return true;
                })
                .toList();
        squarePrimeNumbers = primeNumbers.stream()
                .map(num -> num * num)
                .toList();

        System.out.println(primeNumbers);
        System.out.println(squarePrimeNumbers);
    }
}