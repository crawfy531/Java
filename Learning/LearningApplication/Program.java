public class Program {
    // creates two bools where the game is over or the player has won
    private boolean isOver = false;
    private boolean win = false;
    //creates a collition, character, villan, interface, and item objects
    Collision collision = new Collision();
    Character player = new Character();
    Villan villan = new Villan();
    Interface myinterface = new Interface();
    Item treasure = new Item();
    // constructor for the class program
    public Program(){
        
    }
    // runs the game until either the game is over or the player has won
    public void running(){
        while(!isOver){
            // displays what the board looks like
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
            // moves the player based off of input
            player.makeMove();
            // randomly moves the villan
            villan.makeMove();
            // checks to see if the villan, player, or treasure have collided
            isOver = collision.senceCollision(treasure.getX(),treasure.getY(),player.getX(),player.getY(),villan.getX(),villan.getY());
        }
        // checks to see if the player has won or lost
        win = collision.GetWin();
        // tells the user if they have won or lost based on the bool win
        if(win){
            // displays what the board looks like
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
            // tells the user they have won
        myinterface.displayMesssage("You won!");
        }
        else{
            // displays what the board looks like
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
            // tells the user they have lost
            myinterface.displayMesssage("Game Over");
        }
    }
    // sets the value of bool isOver
    public void setIsOver(boolean newValue){
        isOver = newValue;
    }
    // gets the value of bool isOver
    public boolean getIsOver(){
        return isOver;
    }
    
}