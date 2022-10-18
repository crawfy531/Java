public class LogicLoop{

    //String[] args must be in the main parameters
    public static void main(String[] args){
        boolean Testtrue = true;
        // if else statements are like C#
        String result;
        if(Testtrue){
            result = "this is true";
        }
        else{
            result = "this is false";
        }
        System.out.println(result);
        boolean TestFalse = false;
        // if else statements can be made into one line
        String Result = (TestFalse) ? "this is true" : "this is false";
        System.out.println(Result);
        // case statements are also like c//#
        char letter = 'c';
        int WhichLetterNumber = 0;
        //need to include breaks
        switch(letter){
            case 'a':
                WhichLetterNumber = 1;
                break;
            case 'b':
                WhichLetterNumber = 2;
                break;
            case 'c':
                WhichLetterNumber = 3;
                break;
            case 'd':
                WhichLetterNumber = 4;
                break;
            
        }
        System.out.println(WhichLetterNumber);
        //while loops are also the same
        int count = 0;
        //can also have a separate do loop which a while statement at the end
        do{
            //++ is used to increment by 1
            count++;
            System.out.println(count);

        }
        while((count!=5));
        //continue statement is like break but only breaks one iteration
        for(int i = 0; i != 5; i++){
            if(i == 2){
                continue; //works like a skip
            }
            System.out.println(i);
        }
    }
}