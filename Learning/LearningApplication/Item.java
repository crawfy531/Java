import java.util.Random;

// creates an item in the program
// this is what the treasure will be based off of

public class Item {
    // X and Y can be inherited and are the position of the item
    protected int X;
    protected int Y;
    // initalized the item and sets it to a random position within the board
    public Item(){
    setPosition(randomInt(0, 4),randomInt(0, 4));
    }
    // changes the value of X
    public void setX(int x){
        X = x;
        return;
    }
    // returnes the value of X
    public int getX(){
        return X;
    }
    // returns the value of Y
    public int getY(){
        return Y;
    }
    // sets the value of Y
    public void setY(int y){
        Y = y;
        return;
    }
    // sets the value of both X and Y
    public void setPosition(int x, int y){
        X = x;
        Y  = y;
        return;
    }
    // returns the value of both X and Y
    public String getPosition(){
        return String.format("%d %d",X ,Y);
    }
    // creates a random integer within a set range
    public int randomInt(int low, int high){
        Random random = new Random();
        int newInt = random.nextInt(low,high);
        return newInt;
    }
}
