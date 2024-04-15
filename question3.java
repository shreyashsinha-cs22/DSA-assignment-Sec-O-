import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        boolean[] red = new boolean[1000000000];
        boolean[] black = new boolean[1000000000];
        black[1] = true;

        for (int i=0;i<Q;i++) {
            char type = sc.next().charAt(1);
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (type == 'i') {
                change(red,black,x,y);
            } else {
                int count = 0;
                for (int j=x; j<=y;j++) {
                    if ((type == 'b' && black[j]) ||
                            (type == 'r' && red[j])) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }

    static void change(boolean[] red,boolean[] black,int x,int y) {
        for (int i = x; i <= y; i++) {
            red[i] = !black[i];
            black[i] = !red[i];
        }
    }
}
