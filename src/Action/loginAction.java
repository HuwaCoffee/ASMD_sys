package Action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import exercise.MysqlTool;

import java.sql.Connection;
import java.sql.Statement;

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
        con=mysql.openDB();
        int login=1;//默认登录成功
        //将属性与Student数据库中的账号密码比对
        /*

          待完成
           待完成
           待完成
           待完成

             嗨嗨嗨

           待完成
           待完成
           待完成
           待完成
            待完成
            待完成
            你好
                */



        if(login==1){
        //返回SUCCESS，通过struts.xml进入登录成功页面（即进入学生主页面）
            return SUCCESS;
        }
        if(login==2){
            //登录失败，账号错误
            return ERROR;
        
        }
        if(login==3){
            //登录失败，密码错误
            return INPUT;
        
        }

        
    }
}
