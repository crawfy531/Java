

// this creates a character that the player controls
// inherits from item class
public class Character extends Item {
    
    public Character(){
        // initalized start player position
        setPosition(2, 2);;
    }
    // receives input from the user
    // checks to see if input is valid
    // moves player position based off of input
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
    // based on the input, either the X position or Y position changes
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
