
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random ();

        int x = random.nextInt();
        System.out.println("random x value: "+x);

        x = random.nextInt(15);
        System.out.println("restricted x value:" +x);

        double y = random.nextDouble();
        System.out.println("random double value: "+y);

        boolean z = random.nextBoolean();
        System.out.println("random boolean: "+z);


    }
}