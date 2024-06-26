import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("是否偶数: Is it even");
        System.out.println("开发者: EggFine | Development By EggFine");
        System.out.println("GitHub: https://github.com/EggFine");
        System.out.print("\n请输入一个数以判断是否是偶数: ");
        int num = new Scanner(System.in).nextInt();
        if(num % 2 == 0){
            System.out.printf("[√] 您输入的数 %s 是偶数.",num);
        }else{
            System.err.printf("[×] 您输入的数 %s 不是偶数.",num);
        }
    }
}

