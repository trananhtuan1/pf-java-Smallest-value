public class MinimumValue {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {12, 55, 47, 25, 14};
        int index = minValue(array);
        System.out.println("Smallest value: " + array[index]);
    }
}
