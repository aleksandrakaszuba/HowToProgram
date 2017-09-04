/**
 * Created by ola on 8/22/17.
 Table of squares and cubes
 */
public class Ch231 {
    void printExpoTable(){
        System.out.printf("number square cube\n");
        for (int i = 0; i <= 10; i++) {
            if (i<3) {
                System.out.printf("%d      %d      %d\n", i, i * i, i * i * i);
            }else if(i==3){
                System.out.printf("%d      %d      %d\n", i, i * i, i * i * i);
            }
            else if(i>3 & i<10){
                System.out.printf("%d      %d     %d\n", i, i * i, i * i * i);
            }else {
                System.out.printf("%d     %d    %d\n", i, i * i, i * i * i);

            }
        }

    }

    public static void main(String[] args){
        Ch231 ch231 = new Ch231();
        ch231.printExpoTable();
    }
}
