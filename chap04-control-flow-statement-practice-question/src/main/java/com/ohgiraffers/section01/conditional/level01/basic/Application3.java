package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력해주세요. (-포함 뒷자리 첫번호 까지 공백없이 입력해주세요.)");
        char ch = sc.nextLine().charAt(7);
        if(ch =='1' || ch == '3'){
            System.out.println("남자입니다.");

        }   if (ch == '2' || ch == '4'){
            System.out.println("여자입니다.");
        }
        System.out.println();
        System.out.println("시스템종료합니다.");
        /*
        * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
        *
        * 힌트 : charAt()
        * 예시)
        * 주민등록번호를 입력해주세요(- 포함) : 881122-1
        *
        * ---출력----
        * 남자 입니다
        * */
    }
}
