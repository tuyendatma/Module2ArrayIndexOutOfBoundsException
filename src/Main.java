import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("nhap index cua 1 pt bat ki");
        int num = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + num + " là " + arr[num]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
