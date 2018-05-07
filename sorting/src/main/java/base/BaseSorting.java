package base;

public abstract class BaseSorting {

    public static void swap1(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void swap2(int[] data, int i, int j) {
        data[i] = data[i] + data[j];
        data[j] = data[i] - data[j];
        data[i] = data[i] - data[j];
    }

    public static void swap3(int[] data, int i, int j) {
        data[i] = data[i] ^ data[j];
        data[j] = data[i] ^ data[j];
        data[i] = data[i] ^ data[j];
    }

    public static void print(int[] data) {
        if (data != null && data.length > 0) {
            int index = 0;
            for (int i : data) {
                System.out.print(i);
                if (index++ != data.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.println();
                }
            }
        }
    }

}
