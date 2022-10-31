package src.user;
import java.util.Scanner;

public class User {
    public String name;
    public int id;
    public int action;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void menu(){
        System.out.println("普通用户菜单");
        System.out.println("--------------");
        System.out.println("1.查找图书");
        System.out.println("2.租借图书");
        System.out.println("3.归还图书");
        System.out.println("--------------");
        System.out.println("请选择需要进行的操作：");
        Scanner curActionScan = new Scanner(System.in);
        int curAction = curActionScan.nextInt();
        this.action = curAction;
    }

    public int getAction(){
        return this.action;
    }
}
