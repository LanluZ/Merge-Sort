import java.util.Random;

public class Merge extends Sort{
    public static void main(String[] args){
        int max=100;
        int min=1;
        int[] ra = new int[100];
        Random random = new Random();
        for (int i=0; i<100; i++) {
            int s = random.nextInt(max)%(max-min+1) + min;
            ra[i]=s;
        }

        System.out.print("原数组:");
        for (int j : ra) {
            System.out.print(j + " ");
        }
        System.out.print("\n长度:"+ra.length);

        int[] na=merge(ra);
        System.out.print("\n新数组:");
        for (int j : na) {
            System.out.print(j + " ");
        }
        System.out.print("\n长度:"+na.length);
    }
}

