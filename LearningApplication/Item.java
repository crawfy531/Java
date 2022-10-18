import java.util.Random;
public class Item {
    protected int X;
    protected int Y;
    public Item(){
    setPosition(randomInt(0, 4),randomInt(0, 4));
    }
    public void setX(int x){
        X = x;
        return;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    public void setY(int y){
        Y = y;
        return;
    }

    public void setPosition(int x, int y){
        X = x;
        Y  = y;
        return;
    }
    public String getPosition(){
        return String.format("%d %d",X ,Y);
    }
    public int randomInt(int low, int high){
        Random random = new Random();
        int newInt = random.nextInt(low,high);
        return newInt;
    }
}
