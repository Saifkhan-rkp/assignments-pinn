/** Using the class arrayList defined in package java.util
 * create a list of double values and implement the functions add() remove() set() get(), sort() and print the list
 * using index method and forEach loop  
 */

import java.util.*;


class ArrayLists {
    private ArrayList<Double> list = new ArrayList<Double>();

    void add(double a){
        list.add(a);
    }
    void remove(double a){
        list.remove(a);
    }
    //set methods
    void set(double val, int pos){
        list.set(pos, val);
    }
    void set(ArrayList<Double> lst){
        list = lst;
    }

    //get methods
    double get(int pos){
        return list.get(pos);
    }
    ArrayList<Double> get(){
        return list;
    }

    //sort method
    void sort(){
        list.sort(null);
    }

    public static void main(String[] args) {
        ArrayLists dl = new ArrayLists();
        dl.add(234);
        dl.add(234535.4536);
        dl.add(7654.5467);
        dl.add(23456.98765);
        dl.add(314645674.564);

        System.out.println(dl.get());

        dl.set(1111.65, 3);

        System.out.println(dl.get(3));
        System.out.println(dl.get());

        dl.sort();
        System.out.println(dl.get());

        ArrayList<Double> al = dl.get();

        for (int i = 0; i < al.size(); i++) {
           System.out.println(al.get(i));
        }
        for (double elm : al) {
            System.out.println(elm);
        }
    }
}

// class DoublesList extends ArrayList<Double> {

//     DoublesList(){
//         super();
//     }
// }