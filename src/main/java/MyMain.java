public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        if (y > x && y > z) {
            return y;
        }
        return z;
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
    public static boolean flipCoin() {
        return (Math.random() < 0.5);
    }

    // This method simulates the flip of a weighted coin,round
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        return (Math.random() < 0.7);
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        return (int) Math.round(d);
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        return (int) (Math.random()*(6) + 1);
    }

    // This method carries out the quadratic formula and *prints* out the answers
    public static void quadForm(int a, int b, int c) {
        double secondRoot, firstRoot;
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);

        if (determinant>0) {
            firstRoot = (-b + sqrt)/(2*a);
            secondRoot = (-b - sqrt)/(2*a);
            System.out.println(firstRoot +" " + secondRoot);
        } else if (determinant == 0) {
            System.out.println((-b + sqrt) / (2 * a));
        }
    }

    public static void main(String[] args) {
        // Test the add5 method
        System.out.print(add5(1) + " " + findBiggestNumber(1, 2, 3) + " " + flipCoin() + " " + flipWeightedCoin() + " " + round(2.3) + " " + rollDie() + " ");
        quadForm(1,8,16);
    }
}
