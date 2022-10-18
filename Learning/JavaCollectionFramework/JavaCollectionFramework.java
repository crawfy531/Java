import java.util.*;
//araylists are resizable arrays (like lists in c#)
public class JavaCollectionFramework {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        System.out.println(fruits); //this will print the list (you will see all items in [])
        fruits.add("banana"); //adding stacks onto the array list
        fruits.add(0,"orange"); //can also be added at a specific index
        fruits.add("mango");
        System.out.println(fruits); //the array list will be displayed in the order the items were added
        fruits.set(0,"apple"); //this will repalce the item at the desired index with the wanted item
        System.out.println(fruits);
        System.out.println(fruits.get(1)); //remember the index starts at 0. get will get desired item at desired index
        System.out.println(fruits.size());
        fruits.remove(1); //removes an item at desired index
        System.out.println(fruits);
        fruits.add("grape");
        Collections.sort(fruits);
        System.out.println(fruits);
        fruits.clear(); //this will clear the array list making it empty
        System.out.println(fruits);
        //this is how you get user input
        Scanner input = new Scanner(System.in);
        System.out.println("put in input:");
        String userInput = input.nextLine();
        input.close(); // scanners need to be closed
        System.out.println(userInput);
    }
    
}
