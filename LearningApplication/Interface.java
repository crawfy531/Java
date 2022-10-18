import java.util.Scanner;

public class Interface {
    public Interface(){

    }
    public void displayMesssage(String message){
        System.out.println(message);
    }
    public char userInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        char userinput = input.next().charAt(0);
        return userinput;

    }
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
