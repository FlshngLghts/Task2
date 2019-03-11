import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = {-1, 0, 1, 1, 1};
        //int[] arr = new int[5];
        int[] stat = new int[5];
        int i;
        int j;
        int cnt;

        /*for(i = 0; i < 5; i++){
            arr[i] = (rand.nextInt(3) - 1);
        }*/

        for(i = 0; i < 5; i++){
            cnt = 1;
            for(j = i + 1; j < 5; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    stat[j] = -1;
                }
            }
            if(stat[i]!= -1){
                stat[i] = cnt;
            }
        }
        System.out.println("Array");
        for(i = 0; i < 5; i++){
            if(stat[i]!= -1){
                System.out.println("Число " + arr[i] + " выводится " + stat[i] + " раз(а)");
            }

        }

        for(i=0;i<5;i++){
            System.out.println(arr[i]+"       "+stat[i]);
        }

        int maxIndex = 0;
        for(i=1; i<5; i++){
            if(stat[i] > stat[maxIndex]){
                maxIndex = i;
                System.out.println("Чаще всего встречается: " + arr[maxIndex] + " ---> " + stat[maxIndex] + " раз(а)");
            }
        }

        System.out.println(maxIndex);

    }
}
