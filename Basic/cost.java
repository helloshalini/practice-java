import java.util.*;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float sum = (pencil + pen + eraser) + 0.18f;
        System.out.println(sum);

        sc.close();
    }
}
