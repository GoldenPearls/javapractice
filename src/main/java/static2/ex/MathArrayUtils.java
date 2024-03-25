package static2.ex;

public class MathArrayUtils {
    static int sum = 0;

    public static int sum(int[] arrayUtils){
        for(int i =0; i<5; i++) {
            sum += arrayUtils[i];
        }
        return sum;
    }

    public static float average(int[] arrayUtils) {
        float average = 0.0f;

        average = (float)sum/arrayUtils.length;
        return average;
    }

    public static int min(int[] arrayUtils) {
        int min = arrayUtils[0];

        for (int i = 1; i < arrayUtils.length; i++) {
            if (arrayUtils[i] < min) {
                min = arrayUtils[i];
            }
        }

        return min;
    }

    public static int max(int[] arrayUtils) {
        int max = arrayUtils[0];

        for (int i = 1; i <arrayUtils.length; i++) {
            if (arrayUtils[i] > max) {
                max = arrayUtils[i];
            }
        }

        return max;
    }
}
