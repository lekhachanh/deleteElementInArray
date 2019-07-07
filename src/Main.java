import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao kich thuoc mang: ");
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int X;
        System.out.println("nhap vao phan tu muon xoa trong mang: ");
        X = sc.nextInt();
        System.out.println("mang khi da xoa la: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                continue;
            }
            System.out.print(arr[i] + " ");

        }
    }
}
