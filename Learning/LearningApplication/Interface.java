import java.util.Scanner;
// this class is used to interact with the user
public class Interface {
    public Interface(){

    }
    // displays message to the user
    public void displayMesssage(String message){
        System.out.println(message);
    }
    // gathers input from the user
    public char userInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        char userinput = input.next().charAt(0);
        return userinput;

    }
    // displays the game board for a set size
    // displays where player(X) and villan(V) are but not the treasure
    public void displayBord(int x, int y, int vx, int vy){
        int p = 4;
        for (int j = 0; j<5; j++){

            for(int i = 0; i<4; i++ ){
                    if(x == i && y == j){
                    System.out.print("X " );
                }
                else if(vx == i && vy == j){
                    System.out.print("V " );
                }
                else{
                    System.out.print("O ");
                }
            }
            if(x == p && y == j){
                System.out.println("X" );
            }
            else if(vx == p && vy == j){
                System.out.println("V " );
            }
            else{
                System.out.println("O ");
            }
        }
    }
    
}
