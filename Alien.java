public class Alien {
    public static void main(String[] args) {

        System.out.println("Hello Jyoth");

        boolean isAllien = true;
        if (isAllien = true)  {
            System.out.println("This is an alien");
            System.out.println("Affraid");

        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the top score!");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My Total =  " + myTotal);
        double myRemainder = myTotal % 40.00d;
        System.out.println("Remainder = " + myRemainder);

        boolean isNoRemainder = (myRemainder == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some Remainder");
        }

    }
}
