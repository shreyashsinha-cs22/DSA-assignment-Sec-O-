import java.util.*;

class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int H = sc.nextInt();
            if (H == 0) {
                break; 
            }
            
            int node = (1 << H) - 1; 
            long[] val = new long[node];
            for (int i=0;i<node;i++) {
                val[i] = sc.nextLong();
            }
            
            long[] P = new long[node];
            for (int i=node-1;i>=0;i--) {
                if (2*i+1>=node) {
                    P[i] = val[i];
                } else {
                    P[i] = Math.max(val[i]*P[2*i+1],val[i]*P[2*i+2]);
                }
            }

            System.out.println(P[0] % 1000000007);
            sc.close();
        }
    }
}

