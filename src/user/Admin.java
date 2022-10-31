package src.user;

import src.user.User;
import java.util.Scanner;

public class Admin extends User {

    public Admin(String name, int id) {
        super(name, id);
    }

    public void menu(){
        System.out.println("管理员菜单");
        System.out.println("--------------");
        System.out.println("1.显示所有图书");
        System.out.println("2.增加图书");
        System.out.println("3.编辑图书");
        System.out.println("4.删除图书");
        System.out.println("5.查找图书");
        System.out.println("--------------");
        System.out.println("请选择需要进行的操作：");
        Scanner curActionScan = new Scanner(System.in);
        int curAction = curActionScan.nextInt();
        this.action = curAction;
    }
}