
public class Arrays {
    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count1 = count1 + 1;
            }

        }
        if (count1 > arr.length / 2) {
            System.out.println("sir, we have the element:" + element);
        }
        // Happy DSA, Sir//
    }
}