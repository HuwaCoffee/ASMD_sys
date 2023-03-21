package DataBaseGet;

import exercise.BinaryOperation;
import user.User;
import java.util.ArrayList;


public class DataBaseGet {


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

    //返回所有学生信息数组
    public ArrayList<User> GetUser(){
        ArrayList<User> StudentMassage=new ArrayList<>(); 
        //读取数据库的所有学生信息，并存入StudentMassage
        
        /*待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成
                待完成*/




        return StudentMassage;
    }
}
