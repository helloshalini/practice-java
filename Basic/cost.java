import java.util.*;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float sum = (pencil + pen + eraser);
        System.out.println(sum);

        float newTotal = sum + (0.18f * sum);
        System.out.println(newTotal);

        sc.close();
    }
}
