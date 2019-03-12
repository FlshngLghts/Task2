import java.util.Random;

public class Main {

    public static void main(String[] args) {
        taskMain(-7, 7);
    }

    private static void taskMain(int from, int to){
        Random rand = new Random();

        int[] arr = new int[20];
        int[] stat = new int[20];
        int i;

        System.out.print("Массив: ");
        for(i = 0; i < 20; i++){
            arr[i] = (rand.nextInt((to - from) + 1) + from);
            System.out.printf("%d ", arr[i]);
        }
        elemCalc(arr, stat);
        maxValue(arr, stat);
    }

    private static void elemCalc(int[] arr, int[] stat){
        int i, j;
        for(i = 0; i < 20; i++){
            int cnt = 1;
            for(j = i + 1; j < 20; j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    stat[j] = -1;
                }
            }
            if(stat[i]!= -1){
                stat[i] = cnt;
            }
        }
        System.out.println("\n/----------------------------------------/");
        for(i = 0; i < 20; i++){
            if(stat[i]!= -1){
                System.out.println("Число '" + arr[i] + "' встречается " + stat[i] + " раз(а)");
            }
        }
        System.out.println("/----------------------------------------/");
    }

    private static void maxValue(int[] arr, int[] stat){
        int i;
        int maxIndex = 0;
        for(i = 1; i < 20; i++) {
            if (stat[i] > stat[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Чаще всего встречается '" + arr[maxIndex] + "' ---> " + stat[maxIndex] + " раз(а)");
        for(i = 0; i < 20; i++){
            if((stat[maxIndex] == stat [i]) && (maxIndex != i)){
                System.out.println("Чаще всего встречается '" + arr[i] + "' ---> " + stat[i] + " раз(а)");
            }
        }
    }
}


