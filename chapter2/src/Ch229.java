import java.util.Scanner;

/**
 * Created by ola on 8/22/17.
    Integer value of character
 */
public class Ch229 {

    void charToInt(){
        Scanner s = new Scanner(System.in);
        int a[] = {'A', 'B', 'C', 'a', 'b','c', '0','1', '2','$', '*', '+'};

        for (int i = 0; i<a.length; i++){
            System.out.printf("%c = %d\n", a[i], (int)a[i]);
        }

    }

    public static void main(String[] args){
        Ch229 ch229 = new Ch229();
        ch229.charToInt();
    }
}
