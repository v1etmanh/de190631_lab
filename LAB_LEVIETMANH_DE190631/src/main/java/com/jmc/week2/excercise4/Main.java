package com.jmc.week2.excercise4;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo ngăn xếp
        ArrayStack stack = new ArrayStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Push (Thêm phần tử vào stack)");
            System.out.println("2. Pop (Xóa phần tử ở đỉnh stack)");
            System.out.println("3. Traversal (Hiển thị các phần tử trong stack)");
            System.out.println("4. Exit (Thoát chương trình)");
            System.out.print("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập giá trị để thêm vào stack: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    System.out.println(value + " đã được thêm vào stack.");
                    break;

                case 2:
                    try {
                        int poppedValue = stack.pop();
                        System.out.println("Phần tử vừa được xóa: " + poppedValue);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Các phần tử trong stack (từ đỉnh đến đáy):");
                    stack.traversal();
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
