package JavaStudy.part2.IfBasic;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {

        // Q. 정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요.(IfElseTest.java)
        Scanner scan = new Scanner(System.in);

        int su = scan.nextInt();

        if (su%2 == 0){
            System.out.print("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }

        // Q. 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요.
        System.out.println("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if (num%12 == 0){
            System.out.println("12의 배수입니다.");
        }else {
            System.out.println("12의 배수가 아닙니다.");
        }


    }
}
