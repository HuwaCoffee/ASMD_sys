package DataBaseGet;

import exercise.BinaryOperation;
import exercise.MysqlTool;
import user.Student;
import user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DataBaseGet {
    private MysqlTool mysql=new MysqlTool();
    private Connection con;
    private PreparedStatement ps;

    //获取普通练习的题目，默认10道题，返回题目类型数组。
    //优化内容：【如果想要定向出题（如只有加，只有减，或者只有乘除），可以限定随机数的范围】，【可以修改方法让用户输入题目数】
    public ArrayList<BinaryOperation> GetQuestions(){
        ArrayList<BinaryOperation> questions=new ArrayList<>();
        //读取数据库，根据题目id，随机抽取10道题，并存入questions
        //随机可以使用Random类，进行id的随机，然后取出对应id的题目

        /*待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成*/




        return questions;
    }

    //获取错题，最多10道题，返回题目类型数组。
    public ArrayList<BinaryOperation> GetWrongQuestions(){
        ArrayList<BinaryOperation> wrongQuestions=new ArrayList<>();
        //读取数据库，获取错题集的前10道题，（如果不够10道就取完），并存入wrongQuestions


        /*待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成*/




        return wrongQuestions;
    }

    //返回所有学生信息数组
    public ArrayList<Student> GetUser()throws Exception{
        ArrayList<Student> StudentMassage=new ArrayList<>();
        //读取数据库的所有学生信息，并存入StudentMassage
        int userid=1;
        con= mysql.openDB();
        String sql = "select * from student ";
        ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
          Student user=new Student();
            user.setUserID(rs.getInt("studentid"));
            user.setUserName(rs.getString("username"));
            user.setPassWord(rs.getString("password"));
            user.setStudentName(rs.getString("studentname"));
            user.setPhoneNumber(rs.getString("tel"));
            user.setAuthority(rs.getString("permissions"));
            StudentMassage.add(user);
        }
        return StudentMassage;
    }

    public static void main(String[] args) {
        DataBaseGet a=new DataBaseGet();
        try {
            ArrayList<Student> stu=a.GetUser();
            for (int i = 0; i < stu.size(); i++) {
                System.out.println(stu.get(i).getUserName());
                System.out.println(stu.get(i).getPassWord());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

