public class MethodsAndClasses{
    public String name = "";

    // static means it belongs to the Main method and void means that the method returns nothing
    static int myMethod(int first, int second){
        System.out.println("Method is called");
        System.out.println(first+second);
        if(first == 1){
            System.out.println("recursion is happening");
            myMethod(first +1, second);
        }
        return first - second;

    }
    static double myMethod(double first, double second){
        return first - second;
    }
    //two methods can have the same name, it is called overloading

    // call the method just like c#
    public static void main(String[] args) {
        int theResult = myMethod(1,2);
        // creating a new object and adjusting an attribute in it
        MethodsAndClasses myObject = new MethodsAndClasses();
        myObject.name = "My name";
        System.out.println(myObject.name);
        double OverloadResult = myMethod(1.2, 5.9);
        System.out.println(theResult);
        System.out.println(OverloadResult);
        Abstraction applyingAbstraction = new Abstraction();
        applyingAbstraction.thisIsAbstraction();
        //the variable is not directly avalable so get and set functions are used
        GetSet getset = new GetSet();
        // displays the private int
        System.out.println(getset.getInt());
        // sets the private int to a new value using a method
        getset.setInt(16);
        // displays new value of the private int
        System.out.println(getset.getInt());
        CatDetail Tom = new CatDetail();
        Tom.setColor("Black");
        Tom.setEyeColor("Green");
        Tom.setFur("Short");
        Tom.setage(12);
        System.out.print("This is Tom, he is a " + Tom.GetName()
         + ". He has " + Tom.getFur() + ", " + Tom.getColor() + " fur and "
          + Tom.getEyeColor() + " eyes. It may not show, but Tom is " + Tom.getAge()
           + " years old. Say hi Tom! " + Tom.GetSound());
    }
}

