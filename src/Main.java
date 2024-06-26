import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 程序自白
        System.out.println("是否偶数: Is it even");
        System.out.println("开发者: EggFine | Development By EggFine");
        System.out.println("GitHub: https://github.com/EggFine");
        System.out.print("\n请输入一个数以判断是否是偶数: ");
        // 调用输入器来监听用户在终端的输入，并创建变量num用于存储用户输入的数值
        int num = new Scanner(System.in).nextInt();
        // 使用取余的方式判断余数是否为 0 ，为 0 则为偶数
        if(num % 2 == 0){
            // 输出偶数结果
            System.out.printf("[√] 您输入的数 %s 是偶数.",num);
        //如果取余不为 0 则输出错误信息
        }else{
            // 输出错误信息
            System.err.printf("[×] 您输入的数 %s 不是偶数.",num);
        }
    }
}

