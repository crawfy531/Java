
public class VariablesAndListsWithLoops{

    public static void main(String[] args){
        //String must be capatilized
        //variables can not be named the variable type
        String MyString = "This is a string variable";
        int MyInt = 1;
        // floats must include f at the end. This is also needed for doubles by adding d
        float MyFloat = 1.1f;
        boolean MyBoolean = true;
        char MyChar = 'C';
        //for misc variable list, use Object
        Object[] allVariables = new Object[]{MyBoolean,MyChar,MyFloat,MyInt,MyString};
        // plus add variables together just not two numbers together
        System.out.println(MyString + MyFloat + MyBoolean);
        System.out.println(MyInt + MyFloat);
        for(Object i : allVariables){
            System.out.println(i);
        }
        char[] listOfChar = {'C','h','a','r'};
        //for and foreach loops both use "for" but foreach uses a ":"
        for(char i : listOfChar){
            //System needs to be capitalized
            //print does not write on a new line
            System.out.print(i);
        }
        //arrays can be multi-demensional
        System.out.println(" ");
        int[][] manyNumbers = { {1,3,5,7}, {2,4,6,8} };
        int countList = 0;
        int countposition = 0;
        while( countposition != 4){
            System.out.println(manyNumbers[countList][countposition]);
            countList ++;
            System.out.println(manyNumbers[countList][countposition]);
            countposition ++;
            countList --;
        }


    }

}