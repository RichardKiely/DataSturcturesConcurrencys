package Lab4;

public class MyArrays {
    public static void main(String[] args) {

        int [] array = {10,20,30};

        int result = sum(array);

        System.out.println(result);

    }
    public static int sum(int [] values){
        return sum(values,0);
    }
    private static int sum(int[] values, int i) {
        if (values.length == i) {
            return 0;
        } else {
            return values[i] + sum(values, i + 1);
        }
    }
}
