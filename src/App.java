import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        System.out.println("Array List Demo");

        // Create anArrayList object
        ArrayList<String> mylist = new ArrayList<String>();
        
        //add items
        mylist.add("apples");
        mylist.add("orange");

        // Loop over and print the items
        for (String item : mylist) {
            System.out.println("Item ->" + item);
        }
        
        //Remove "aaples" from this list
        mylist.remove("apples");

        //Print the no. of item inside the list
        int count = mylist.size();
        System.out.println(count);


    }
} 