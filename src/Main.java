package src;

import src.user.Admin;
import src.user.User;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("请输入用户名");
        Scanner loginName = new Scanner(System.in);
        String name = loginName.nextLine();
        System.out.println(name + " 你好，请输入用户角色，0代表管理员，1代表普通用户：");
        Scanner roleScan = new Scanner(System.in);
        int role = roleScan.nextInt();
        if(role == 0){
            Admin admin = new Admin(name,role);
            admin.menu();
            int action = admin.getAction();
            System.out.println("当前选择的操作是：" + action);
        }else if(role == 1){
            User user = new User(name,role);
            user.menu();
            int action = user.getAction();
            System.out.println("当前选择的操作是：" + action);
        }
    }
}
