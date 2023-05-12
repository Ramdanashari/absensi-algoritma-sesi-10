public class App {
    public static void public static void main(String[] args)throws Exception {
        int[] arr = {64, 34 ,25, 12, 22, 11, 90};
        bubblesort(arr);
        system.out.printIn("array setelah diurutkan");
        printArray (arr);

        int[]arr2 = {64, 34, 25, 12, 22, 11, 90};
        insertionsort(arr2);
        system.out.printIn("array 2 setelah diurutkan");
        printArray(arr2);

        int[]arr3 = {64, 34, 25, 12, 22, 11, 90};
        selectionsort(arr3);
        system.out.printIn("array 3 setelah diurutkan");
        printArray(arr3);
}

public static void insertionsort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] >key) {
            arr[j + 1] = arr[j];
            j = j - 1; 
        }
        arr[j + 1] = key;
    }
}

public static void selectionsort(int arr[])
{
    int pos;
    int temp;
    for(int i = 0; i < arr.length; i++)
    {
        pos = i;
        for (int j = i + 1; j < arr.length; j++)
        {
            if (arr[j] < arr[pos])
            {
                pos = j;
            }
        }

        temp = arr[pos];
        arr[pos] = arr[i];
        arr[i] = temp;
    }
}

public static void bubblesort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}