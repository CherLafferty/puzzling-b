import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {

    public static void main(String[] args) {

        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println(generator.getRandomLetter());
        System.out.println(generator.generatePassowrd());
        System.out.println(generator.getNewPasswordSet(8));

    }
}
