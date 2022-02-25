import org.junit.Test;

import java.util.Scanner;

public class java01 {
    /**
     * 通过本次学习获得编程能力的提升
     * 1.成员变量和局部变量
     *  (1)成员变量：类中方法外的变量
     *  (2)局部变量：方法中的变量
     * 2.private关键字
     *  ()
     *
     *
     *
     */
    /**
     * 创建一个登录的案例
     *
     */
    public static void main(String[] args) {
        String name = "张三";
        String pwd = "1234";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String myname = scanner.nextLine();
            System.out.println("请输入密码");
            String mypwd = scanner.nextLine();
            if(name.equals(myname) && pwd.equals(mypwd)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("对不起，登录失败，你还有"+ (2-i)+"次机会");
            }
            if(i == 2){
                System.out.println("对不起，登录失败，登录的机会已用尽");
            }
        }

    }

    /**
     * 本例中主要完成对字符串的遍历的过程
     *
     */
    @Test
    public void test01(){
       String a = "sghiuaig";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }




}
