package Action;

import DataBaseGet.DataBaseGet;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import exercise.MysqlTool;
import user.Student;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class loginAction implements Action {
    private String username;   //用户名
    private String password;   //密码

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }



    @Override
    public String execute() throws Exception {
        int login=1;//默认登录成功
        //将属性与Student数据库中的账号密码比对
        DataBaseGet db=new DataBaseGet();
        ArrayList<Student> students =db.GetUser();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getUserName().equals(username)&&students.get(i).getPassWord().equals(password)){
                return SUCCESS;//返回SUCCESS，通过struts.xml进入登录成功页面（即进入学生主页面）
            }
            if(students.get(i).getUserName().equals(username)&&!students.get(i).getPassWord().equals(password)){
                return INPUT;//登录失败，密码错误
            }
            if(!students.get(i).getUserName().equals(username)&&students.get(i).getPassWord().equals(password)){
                return ERROR;//登录失败，账号错误
            }
        }
        return NONE;//账号密码都错误
    }
}
