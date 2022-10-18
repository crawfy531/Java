public class Inheritance {

    private String name = "cat";
    private String sound = "meow";
    
    public String GetName(){
        return name;
    }    

    public String GetSound(){
        return sound;
    }

}
//java usus the word extends for inheritance, otherwise it is just like c#
class CatDetail extends Inheritance{
    private String fur;
    private String color;
    private String eyecolor;
    private int age;

    public void setFur(String type){
        fur = type;
    }
    public void setColor(String type){
        color = type;
    }
    public void setEyeColor(String type){
        eyecolor = type;
    }
    public void setage(int type){
        age = type;
    }
    public String getFur(){
        return fur;
    }
    public String getColor(){
        return color;
    }
    public String getEyeColor(){
        return eyecolor;
    }
    public int getAge(){
        return age;
    }
}
