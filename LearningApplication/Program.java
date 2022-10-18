public class Program {

    private boolean isOver = false;
    private boolean win = false;

    Collision collision = new Collision();
    Character player = new Character();
    Villan villan = new Villan();
    Interface myinterface = new Interface();
    Item treasure = new Item();

    public Program(){
        
    }

    public void running(){
        while(!isOver){
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
            player.makeMove();
            villan.makeMove();
            isOver = collision.senceCollision(treasure.getX(),treasure.getY(),player.getX(),player.getY(),villan.getX(),villan.getY());
        }
        win = collision.GetWin();
        if(win){
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
        myinterface.displayMesssage("You won!");
        }
        else{
            myinterface.displayBord(player.getX(),player.getY(),villan.getX(),villan.getY());
            myinterface.displayMesssage("Game Over");
        }
    }
    public void setIsOver(boolean newValue){
        isOver = newValue;
    }
    public boolean getIsOver(){
        return isOver;
    }
    
}