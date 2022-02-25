import org.junit.Test;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要改变的字符");
        String s = sc.nextLine();
        System.out.println(myReverse(s));

    }

    public  static  String myReverse(String  S){
        StringBuilder sb = new StringBuilder(S);
        //将String转换成StringBuilder
        sb.reverse();//将StringBuilder字符的类型进行转换
        return sb.toString();//返回对应值
    }
    //创建一个集合的包

}
