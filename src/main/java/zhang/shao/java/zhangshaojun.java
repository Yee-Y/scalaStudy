package zhang.shao.java;

import java.lang.reflect.Field;

// AAAAAA
// 222222

public class zhangshaojun {
    public int age = 20
    public static void main(String[] args)throws  Exception {
        User user = new User();
        user.clone();
    }

    public static void login(){
        System.out.println("hello hahahha");
    }

    String aa= "10";
    public  void test(){
        System.out.println("hello java");
        System.out.println(aa);
        login();


    }
}
class User{
    public User(){}
    private String userName;
    public void setUsername(String username){
        this.userName = username;
    }
    public String getUserName(){
        return this.userName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
