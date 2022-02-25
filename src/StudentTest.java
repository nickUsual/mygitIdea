import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请选择是否输入学生列表(输入y/n)");
            String s = scanner.nextLine();
            if(s.equals("n")){
                if(students.size() == 0) {
                    System.out.println("当前学生列表为空请至少填充一个学生信息");
                }
                else break;
            }
            Student student = new Student();
            System.out.println("请输入学生的姓名");
            student.setName(scanner.nextLine());
            System.out.println("请输入学生的年龄");
            student.setAge(scanner.nextLine());
            System.out.println("请输入学生的学号");
            student.setNum(scanner.nextLine());
            students.add(student);

        }
        System.out.println("遍历输出当前的学生列表信息");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

    }
}
