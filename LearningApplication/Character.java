

public class Character extends Item {
    
    public Character(){
        setPosition(2, 2);;
    }
    public void makeMove(){
        Interface myinterface = new Interface();
        char choice = myinterface.userInput("please enter an \"a\" (left), \"s\" (down), \"d\" (right), or \"w\" (up)");
            boolean wrongInput = true;
            while(wrongInput == true){
                if(choice != 'a' && choice != 's' && choice != 'd' && choice != 'w' ){
                    choice = myinterface.userInput("please enter an \"a\" (left), \"s\" (down), \"d\" (right), or \"w\" (up)");
                }
                else if((choice == 'a' && X == 0)||
                (choice == 's' && Y == 4)||
                (choice == 'd' && X == 4)||
                (choice == 'w' && Y == 0)){
                    myinterface.displayMesssage("Can't go any farther in this direction");
                    choice = myinterface.userInput("please enter an \"a\" (left), \"s\" (down), \"d\" (right), or \"w\" (up)");                }
                else{
                    wrongInput = false;
                } 
            }
            convertMove(choice);
    }
    public void convertMove(char input){
        switch(input){
            case 'a':
                    X--;
                break;
            case 'w':
                    Y--;
                break;
            case 'd':
                    X++;
                break;
            case 's':
                    Y++;
                break;
        }
    }
}
