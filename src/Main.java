import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[1000];
        int max = 0;
        int max_2 = 0;
        int max_7 = 0;
        int max_14 = 0;
        int prod_max;
        int prod_max2;
        for(int i = 0;i < num.length;i++){
            num[i] = random.nextInt(10000);
            if (num[i] > max) {
                max = num[i];
            }
            if ((num[i] % 2 == 0) && (num[i] > max_2)) {
                max_2 = num[i];
            }
            if ((num[i] % 7 == 0) && (num[i] > max_7)) {
                max_7 = num[i];
            }
            if ((num[i] % 14 == 0) && (num[i] > max_14)) {
                max_14 = num[i];
            }
        }
        prod_max = max * max_14;
        prod_max2 = max_2 * max_7;
        if (prod_max == 0 && prod_max2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.max(prod_max, prod_max2));
        }
    }
}