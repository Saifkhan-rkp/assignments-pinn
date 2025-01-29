import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

// Employee class
class Emp {
    String name;
    int age;
    double bs; // Basic Salary

    // Constructor
    public Emp(String name, int age, double bs) {
        this.name = name;
        this.age = age;
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bs=" + bs +
                '}';
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Comparator to prioritize employees with the largest basic salary (bs)
        // Comparator<Emp> empComparator = (e1, e2) -> Double.compare(e2.bs, e1.bs);
        Comparator<Emp> comparator = new Comparator<Emp>() {
            @Override
            public int compare(Emp e1, Emp e2) {
                return Double.compare(e2.bs, e1.bs);
            }
        };

        // PriorityQueue with custom comparator
        PriorityQueue<Emp> pq = new PriorityQueue<Emp>(comparator);

        // Adding employees
        pq.add(new Emp("Alice", 30, 60000));
        pq.add(new Emp("Bob", 25, 75000));
        pq.add(new Emp("Charlie", 28, 50000));
        pq.offer(new Emp("Diana", 35, 80000));

        // List<Integer> lst = new LinkedList<>();
        // pq.

    
        

        // Removing employees in order of largest basic salary
        System.out.println("Employees removed from the priority queue in order of largest bs:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
