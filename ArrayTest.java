import java.util.*;

public class ArrayTest {

    protected static int[] array;

    public static void main(String[] args) {
        System.out.println ("Do you create new array? (1/2)");
        int word = new Scanner(System.in).nextInt ();
        if(word == 1){
            System.out.println ("What's size your array?");
            int sizeOfArray = new Scanner(System.in).nextInt ();
            array = new int[sizeOfArray];
            System.out.println ("Do you want to do it?");
            Menu.menu ();
        }else if(word ==2 ){
            System.exit (0);
        }else{
            System.out.println ("Fail");
        }
    }

}



