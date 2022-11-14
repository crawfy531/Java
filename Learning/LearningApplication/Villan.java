
// this is a villan class that inherits the character class
public class Villan extends Character{
    public Villan(){
        setPosition(randomInt(0, 5), randomInt(0, 4));
    }
    // moves the villan in a random direction (one space)
    // makes sure the direction is valid
    public void makeMove(){
            boolean wrongInput = true;
            char choice = randomMove();
            while(wrongInput == true){
                if(choice != 'a' && choice != 's' && choice != 'd' && choice != 'w' ){
                    choice = randomMove();
                }
                else if((choice == 'a' && X == 0)||
                (choice == 's' && Y == 4)||
                (choice == 'd' && X == 4)||
                (choice == 'w' && Y == 0)){
                    choice = randomMove();
                }
                else{
                    wrongInput = false;
                } 
            }
            convertMove(choice);
    }
    // generates a random direction
    public char randomMove(){
        int move = randomInt(0, 4);
        char input = 'w';
        switch(move){
            case 0:
                input = 'a';
                break;
            case 1:
                input = 's';
                break;
            case 2:
                input = 'd';
                break;
            case 3:
                input = 'w';
                break;
        }
        return input;

    }
}