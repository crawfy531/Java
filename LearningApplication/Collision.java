

public class Collision {
    public Collision(){

    }
    private boolean win = false;
    public boolean senceCollision(int treasureX, int treasureY, int playerX, int playerY, int villanX, int villanY){
        if( villanX == playerX && villanY == playerY){
            return true;
        }
        else if(playerX == treasureX && playerY == treasureY){
            win = true;
            return true;
        }
        return false;
    }
    public boolean GetWin(){
        return win;
    }

}
