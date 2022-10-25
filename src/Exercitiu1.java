import org.w3c.dom.ls.LSOutput;

public class Exercitiu1 {
    public static void main(String[] args) {
        //problema1
/*        int x, y;
        x = 9 / 2;
        y = 10 / 4 + x;
        double z = 11 / 4;
        System.out.println(x + y + z);*/

        //problema2
        int a[] = new int[10];
        a[0] = 1;
        a[9] = 9;

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
