abstract public class AbstractPractice {
    public String parentString = "this is a parent string";
    public abstract void thisIsAbstraction(); //esablish abstract

}
class Abstraction extends AbstractPractice{
    public void thisIsAbstraction(){ //make the abstract body
        System.out.println("This uses abstraction");
    }
}
