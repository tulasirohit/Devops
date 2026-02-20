import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer (full range)
        int randomInt = random.nextInt();
        System.out.println("Random integer (full range): " + randomInt);

        // Generate a random integer between 0 (inclusive) and 100 (exclusive)
        int randomIntLimited = random.nextInt(100);
        System.out.println("Random integer (0 to 99): " + randomIntLimited);

        // Generate a random integer between 1 and 10 (inclusive)
        int min = 1;
        int max = 10;
        // Formula: random.nextInt((max - min) + 1) + min
        int randomInRange = random.nextInt((max - min) + 1) + min;
        System.out.println("Random integer (1 to 10): " + randomInRange);

        // Generate a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble();
        System.out.println("Random double: " + randomDouble);
        
        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random boolean: " + randomBoolean);
    }
}

