package PracticeTest;

import java.util.ArrayList;

public class ListTest03 {
public static void main(String[] args) {
        

        RandomService test= new RandomService();
        ArrayList<Integer> list1 = test.makeRandomInt(test.list1);
        ArrayList<Integer> list2 = test.makeRandomInt(test.list2);
        test.printArrayList();
               }
  

}
