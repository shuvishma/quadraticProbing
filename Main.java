import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int capacity = sc.nextInt() ;
            int n = sc.nextInt();
            int[] arr = new int[capacity];
            for (int i = 0; i < capacity; i++) {
                arr[i] = -1;
            }
            for (int i = 0; i < n; i++) {
                int key = sc.nextInt();
                int hashKey = key % capacity;
                if (arr[hashKey] == -1) {
                    arr[hashKey] = key;
                } else {
                    for (int j = 0; j < capacity; j++) {
                        int temp = (key + j * j) % capacity;
                        if (arr[temp] == -1) {
                            arr[temp] = key;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < capacity; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}