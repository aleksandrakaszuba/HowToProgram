/**
 * Created by ola on 8/22/17.
    Printing a Checkerboard
 */
public class Ch227 {

    void checkerboard(int width){
        for (int j = 0; j<width; j++) { //rows
            for (int i = 0; i < width; i++) {// stars in a row
                if ((j % 2 > 0 & i == 0) || (j % 2 == 0 & i == width-1)) {
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }



public  static void main(String[] args){
    Ch227 ch227 = new Ch227();
    ch227.checkerboard(10);

}
}
