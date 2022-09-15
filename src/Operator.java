import java.util.Scanner;

public class Operator {
    public  static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 10;
        int b = 20;

        int c = a + b;
        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = 10 / 3;
        System.out.println("10 / 3 = " + c);

        c = 10 % 3;
        System.out.println("10 % 3 = " + c);

        System.out.println("\n\n");


        System.out.print("정수를 입력하세요 : ");
        int time = s.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분,36 ");
        System.out.println(second + "초입니다. ");

        s.close();
        
        
        System.out.println("----- 문자열 연결 연산자 -----");
        
        System.out.println("하나의 긴 문자열을 표현하기 위해서는 String 타입의 변수에 긴 문자열을 저장하여 출력");

        System.out.println("여러개의 문자열 변수에 저장된 내용을 한줄로 표현하고 싶을 경우 사용하는 것이 문자열 연결 연산자");
        
        String str1 = "String 타입의 변수에 긴 문자열을 입력하여 println() 함수를 통해서 화면에 출력";
        System.out.println(str1);

        System.out.println("2개 이상의 " + "문자열을  + 연산자를 사용하여" + " 연산을 진행하면 " + "하나의 긴 문자열로 출력 됨");

        String str2 = "2개 이상의 ";
        String str3 = "문자열을 + 연사자를 사용하여";
        String str4 = " 연산을 진행하면 ";
        String str5 = "하나의 긴 문자열로 출력 됨";
        System.out.println(str2 + str3 + str4 + str5);

        String str6 = str2 + str3 + str4 + str5;
        System.out.println(str6);

//      문자열과 기본 데이터타입을 연산 시 모두 문자열로 변환됨
        String menu = "로세티리 바베큐 ";
        String menu2 = "세트 ";
        int price = 6500;
        int price2 = 2000;

        System.out.println(menu + price + "원");
//        () 안에 있는 데이터를 먼저 연산
        System.out.println(menu + menu2 + (price + price2) + "원");
//        연산자의 우선 순위 때문에 왼쪽부터 차례대로 연산을 진행하여 문자열과 숫자(6500)의 연산이 먼저 발생하고,
//        그 이후에 문자열과 두번째 숫자(2000)과의 연산이 발생하여 '로세티리 바베큐 세트 65002000원' 이라는 형태로 화면에 출력 됨
        System.out.println(menu + menu2 + price + price2 + "원");


        System.out.println("\n -------- 증감 연산자 -------- \n");

//        전위 연산 혹은 후위 연산이 단독으로 사용될 경우에는 일반 연산자를 통해서 값을 증감시키는 것과 차이가 없음
//        전위 연산 혹은 후위 연산을 다른 연산식과 함께 사용할 경우 실행되는 시점이 달라짐
        int op = 10;
        System.out.println("변수 op의 값 : " + op);
        op++;
        System.out.println("op++ 이후의 값 : " + op);
        ++op;
        System.out.println("++op 이후의 값 : " + op);
        --op;
        System.out.println("--op 이후의 값 : " + op);
        op--;
        System.out.println("op-- 이후의 값 : " + op);

        System.out.println("\n");

        op = 10;
        System.out.println("현재 변수 op의 값 : " + op);
        System.out.println("++op 실행 이후의 값 : " + ++op);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op++ 실행 시 : " + op++);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("op-- 실행 시 : " + op--);
        System.out.println("현재 op의 값 : " + op);
        System.out.println("--op 실행 시 : " + --op);
        System.out.println("현재 op의 값 : " + op);

        System.out.println("\n ------- 비교 연산자 ------- \n");

        System.out.println('a' > 'b'); //아스키 코드로 적용
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 !=2);

        System.out.println(" \n -------- 논리 연산자 -------- \n");

        System.out.println(!(3 != 2));
        System.out.println((3 > 2) && (3 >4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));


        System.out.println(" \n -------- 조건 연산자(3항연산자) -------- \n");

        int num1 = 3;
        int num2 = 5;

        System.out.println("두 수의 차는 : " + ((num1 > num2) ? (num1 - num2) : (num2 - num1)));

//        if else문
        if (num1 > num2) {
            System.out.println("두 수의 차는 : " + (num1 - num2));
        }
        else {
            System.out.println("두 수의 차는 : " + (num2 - num1));
        }



    }
}
