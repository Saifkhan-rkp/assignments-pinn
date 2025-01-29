package testing2;

import com.pinnacle.project1.MyDate;

public class Main {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2024, 12, 19);

        myDate.setTime(10, 54, 544);
        // System.out.println(myDate.toString());
        myDate.display();
    }
}
