
import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int number; Bai 1.1
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập số vào đi");
//            number = scanner.nextInt();
//            if (number % 2 == 0) {
//                System.out.println(number + "Là số chẵn ");
//            } else {
//                System.out.println(number + "Là số lẻ");
//            }
//            while (number != 0);
//
//        }
//
//        Bai 1,2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("htpt số 1 ");
//        int number1 = scanner.nextInt();
//        System.out.println("http số 2");
//        int number2 = scanner.nextInt();
//        System.out.println("http số 3 ");
//        int number3 = scanner.nextInt();
//        int[] arr = {number1, number2, number3};
//        int max = arr[0];
//        for (int j : arr) {
//            if (max < j) {
//                max = j;
//
//            }
//        }
//
//        System.out.println("Số lớn nhất là " + max);
//    }
//}

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập cạnh thứ 1");
//        int edge1 = scanner.nextInt();//a
//        System.out.println("Nhập cạnh thứ 2 ");
//        int edge2 = scanner.nextInt();//b
//        System.out.println("Nhập cạnh thứ 3 ");
//        int edge3 = scanner.nextInt();//c
//
//        if (edge1 + edge2 < edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
//            if (edge1 > 0 && edge2 > 0 && edge3 > 0) {
//                System.out.println("Là một tam giác thường");
//            } else {
//                System.out.println("Không phải tam giác");
//            }
//        } else if (edge1 == edge2 & edge1 != edge3 || edge1 == edge3 && edge1 != edge2 || edge2 == edge3 & edge2 != edge1) {
//            System.out.println("Là một tam giác cân");
//        } else {
//            System.out.println("không tạo thành tam giác");
//        }
//    }
//}
        //bài 2: lever 1:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số bánh bạn muốn rán");
//        int numberOfcakes = scanner.nextInt();
//        System.out.println("Thời gian mà bạn cần rán " + numberOfcakes +" bánh này là ");
//        System.out.println(numberOfcakes*0.764);

        //bài 2 : lever2:

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số tiền muốn gửi");
//        double money = scanner.nextDouble();
//        System.out.println("Nhập số năm muốn gửi");
//        double year = scanner.nextInt();
//        double  dual = Math.pow(1+6.65,year);
//        double numberDual = money * dual;
//        double a = (double) Math.round(numberDual * 100) /100;
//        System.out.println("Số tiền lãi sau " + year + " năm " + "là" + a );

        // bài 2: lever3:

//        Scanner =  new Scanner(System.in);
//        System.out.println("Nhập điểm của bạn");
//        double score = scanner.nextDouble();
//        if (score ==10){
//            System.out.println("Con nhà người ta");
//        }
//        else if (score <=9 && score >=8){
//            System.out.println("Học sinh giỏi");
//        } else if (score <=7.9 && score >=6.5) {
//            System.out.println("Học sinh khá");
//        }
//        else {
//            System.out.println("Học sinh trung bình");
//        }

        // bài 3 : lever1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b");
//        int b = scanner.nextInt();
//
//        for (int i = a; i < b; i++) {
//            if (i % 2 != 0) {
//                System.out.println("Số lẻ là " + i);
//            }
//        }

        // bài 3: lever 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b");
//        int b = scanner.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println("FizzBuzz");
//            }
//        }

        //bài 3 : lever 3
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b");
//        int b = scanner.nextInt();
//
//        for (int i = a ; i < b; i++) {
//            int official = i * i;
//            System.out.println(official);
//        }
        // bài 4 : lever 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b");
//        int b = scanner.nextInt();
//
//        int sum = 0 ;
//        for (int i = a; i < b; i++) {
//            sum += i;
//        }
//        System.out.println("Tổng là " + sum);

        //bài 4 : lever 2 :
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số a");
//        int a = scanner.nextInt();
//        System.out.println("Nhập số b");
//        int b = scanner.nextInt();
//
//        int sum = 0 ;
//        for (int i = a; i < b; i++) {
//           if (i%2==0){
//               sum += i;
//           }
//        }
//        System.out.println("Tổng các số chẵn là " +sum);
//
//         bài 4 : lever 3 :
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số x");
//        int x= scanner.nextInt();
//        System.out.println("Nhập số y");
//        int y = scanner.nextInt();
//        int sum = 0 ;
//        for (int i = x; i < y ; i++) {
//            sum += (int) Math.pow(i,2);
//        }
//        System.out.println(sum);
//
        //         bài 5 : lever 1
//          Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n");
//        int sum = 0;
//        int n = scanner.nextInt();
//        for (int i = 1; i < n ; i++) {
//             sum += i * ( i + 1);
//        }
//        System.out.println(sum);

        //bài 5 : lever 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n");
//      double n = scanner.nextDouble();
//        double sum = 0 ;
//        for (double i = 15; i < n; i++) {
//            sum += (2 * i + 1) /(2 * i + 2);
//        }
//        System.out.println(sum);

        // bài 5 : lever 3
//         Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n");
//        double n = scanner.nextDouble();
//        double sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += (double) (i * (i + 1)) /(i+1)*(i+2);
//        }
//        System.out.println(sum);

        // bài 6 lever 1:
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập a");
//        int a = scanner.nextInt();
//        for (int i = 2; i <= a; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (i % j ==0){
//                    System.out.println("Ước  của " + i + " là "  + j);
//                }
//            }
//        }



