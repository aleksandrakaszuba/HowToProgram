package chapter5;

/**
 * Created by ola on 9/3/17.
 * Exercise 5.29
 * Displays lyrics of The Twelve Days of Christmas
 */
public class Ch529_TwelveDayOfChristmas {

    public void displaySong() {
        System.out.println("The Twelve Days of Christmas - Song\n");
        String ending = new String("and a Partridge in a Pear Tree");

        for (int day = 1; day <= 12; day++) {
            System.out.printf("On the %s day of Christmas my true love sent to me:\n", dayOfChristmas(day));
            for (int j = 1; j <= day; j++) {
                System.out.printf("%s\n", lyricsForTheDay(j));
            }
            if (day != 1) {
                System.out.println(ending);
            }
            System.out.println();
        }
    }

    private String dayOfChristmas(int day) {
        String s = new String();
        switch (day) {
            case 1:
                s = "first";
                break;
            case 2:
                s = "second";
                break;
            case 3:
                s = "third";
                break;
            case 4:
                s = "fourth";
                break;
            case 5:
                s = "fifth";
                break;
            case 6:
                s = "sixth";
                break;
            case 7:
                s = "seventh";
                break;
            case 8:
                s = "eight";
                break;
            case 9:
                s = "ninth";
                break;
            case 10:
                s = "tenth";
                break;
            case 11:
                s = "eleventh";
                break;
            case 12:
                s = "twelfth";
                break;
        }
        return s;
    }

    private String lyricsForTheDay(int day) {
        String s = new String();

        switch (day) {
            case 1:
                s = "A Partridge in a Pear Tree";
                break;
            case 2:
                s = "2 Turtle Doves";
                break;
            case 3:
                s = "3 French Hens";
                break;
            case 4:
                s = "4 Calling Birds";
                break;
            case 5:
                s = "5 Golden Rings";
                break;
            case 6:
                s = "6 Geese a Laying";
                break;
            case 7:
                s = "7 Swans a Swimming";
                break;
            case 8:
                s = "8 Maids a Milking";
                break;
            case 9:
                s = "9 Ladies Dancing";
                break;
            case 10:
                s = "10 Lords a Leaping";
                break;
            case 11:
                s = "11 Pipers Piping";
                break;
            case 12:
                s = "12 Drummers Drumming";
                break;
        }
        return s;
    }

    public static void main(String[] args) {
        Ch529_TwelveDayOfChristmas song = new Ch529_TwelveDayOfChristmas();
        song.displaySong();
    }
}
