//each new class has a new file
class SecondClass{
    //this is a constructor class
    final String FINALSARECONSTANT = "finals are constant";
    public SecondClass(){

    }
    public int publicClass(){
        System.out.println("A public class must have the object made before calling");
        return 1;
    }
    public static void main(String[] args){
        //calling from a class in a diferent file
        MethodsAndClasses myObject = new MethodsAndClasses();
        //overriding an existing value
        myObject.name = "Another Name";
        System.out.println(myObject.name);
        // creating an object to call a function
        SecondClass second = new SecondClass();
        int returnValue = second.publicClass();
        System.out.println(returnValue);
        System.out.println(second.FINALSARECONSTANT);
    }
}