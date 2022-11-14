
// checks if objects collide
public class Collision {
    public Collision(){

    }
    // creates a boolean that checks if the player wins
    private boolean win = false;
    // checks if the player, treasure, or villan have collided
    public boolean senceCollision(int treasureX, int treasureY, int playerX, int playerY, int villanX, int villanY){
        // if player collided with villan the method returns true
        if( villanX == playerX && villanY == playerY){
            return true;
        }
        // if the player collided with treasure then win is set to true and returns true
        else if(playerX == treasureX && playerY == treasureY){
            win = true;
            return true;
        }
        // if no collition happens the method returns false
        return false;
    }
    // returns the value of win
    public boolean GetWin(){
        return win;
    }

}
