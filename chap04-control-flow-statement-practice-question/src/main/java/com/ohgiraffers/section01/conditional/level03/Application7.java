package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application7 {//어려워서 gpt선생님한테 물어보았음

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();

        if (num1 >= 1) {

            for (int i = num1; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("1이상의 숫자를 입력하세요.");
        }

        /*
            사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
            단, 입력한 수는 1보다 크거나 같아야 합니다.

            ex.
            1이상의 숫자를 입력하세요 : 4			1이상의 숫자를 입력하세요 : 0
            4 3 2 1						1 이상의 숫자를 입력해주세요.
		*/


    }
}
