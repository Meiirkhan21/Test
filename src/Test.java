import java.util.Random;
public class Test {
    public static void main(String[] args)
    {
        for(int i = 0; i<20; i++) {
            Random rand = new Random();
            System.out.println(rand.nextInt(10));

        }
    }
}
