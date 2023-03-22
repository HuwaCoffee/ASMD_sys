package Action;

import DataBaseGet.DataBaseGet;
import com.opensymphony.xwork2.Action;
import user.Student;
import java.util.ArrayList;


public class RegisterAction implements Action {
    private String username;   //用户名
    private String password;   //密码
    private String studentname;//学生姓名
    private String tel;        //学生电话
    private String permissions="a";  //权限
    private String schoolName; //学校名称
    private String className;  //班级名称

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getStudentname() {
        return studentname;
    }
    public String getTel() {
        return tel;
    }
    public String getPermissions() {
        return permissions;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public String getClassName() {
        return className;
    }

    @Override
    public String execute() throws Exception {
        //username如果重复的话，返回ERROR，重新填写信息
        DataBaseGet db=new DataBaseGet();
        ArrayList<Student> students =db.GetUser();
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getUserName().equals(username)){
                return ERROR;//用户名重复
            }
        }

        /*在这里将类中的各个属性填入数据库，想想学生id该怎么存？怎样可以设置递增
        * 还有学校id和班级id，学生注册的时候填写中文，从school表和class表中对应到目标id，再存入
        * 《如果没有找到对应班级或学校，是不是可以返回一个别的值如NONE？需要在DateBaseGet中写一个获取School和CLass信息的方法，然后
        将用户输入与库中所有学校班级信息比较》
        
        
        * 待完成
        * 待完成
        * 待完成
        * 待完成
        * 待完成
        * 待完成
        * 待完成
        *
        * */


        return SUCCESS;

    }

}
