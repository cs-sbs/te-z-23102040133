package org.example;
import java.util.Scanner;
public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个非负整数（0-1000000）：");
        int number = scanner.nextInt();
        if (number < 0 || number > 1000000) {
            System.out.println("输入的数字超出范围，请输入一个在0到1000000之间的整数。");
        }
        else {
            int result = calculateParityFeature(number);
            System.out.println("计算结果为：" + result);
        }
        scanner.close();
    }
    private static int calculateParityFeature(int number) {
        int result = 0;
        int position = 1; // 数位编号，从个位开始为1

        while (number > 0) {
            int digit = number % 10; // 获取当前最低位的数字
            int parity = digit % 2 == position % 2 ? 1 : 0; // 判断奇偶性是否一致
            result = result + (parity * (int) Math.pow(2, position - 1)); // 计算二进制位值并累加到结果中
            number /= 10; // 移除当前最低位的数字
            position++; // 数位编号增加
        }
        return result;

    }
}
