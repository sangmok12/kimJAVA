package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = input.nextLine();

        System.out.print("음식 가격을 입력해주세요 : ");
        int foodPrice = input.nextInt();

        System.out.print("음식 수량을 입력해주세요 : ");
        int foodQuantity  = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println("이름 : " + foodName + " 가격 :" + foodPrice + " 총 가격 : " + totalPrice + "원 입니다.");

    }
}
