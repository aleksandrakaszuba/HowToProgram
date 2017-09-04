/**
 * Created by ola on 9/3/17.
 */
public class Ch522_StarsSideBySide {

    public void stars(int num) {

        for (int i = 0; i < num; i++) {
            //type1
            for (int j = 0; j < num; j++) {
                if(j<=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            //type2
          for (int j = 0; j < num; j++) {
                if (j < num - i && j>=0) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 0; j < num; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= num; j++) {
                if (j < num - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ch522_StarsSideBySide stars = new Ch522_StarsSideBySide();

        int side = 10;
         stars.stars(side);
    }

}
