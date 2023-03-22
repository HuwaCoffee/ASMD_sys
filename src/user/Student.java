package user;

import java.util.ArrayList;

public class Student extends User {
    private String LearningClass;                            //班级
    private String studentGrade;                             //年级
    private ArrayList<Object> studentWrongQuestion;  //错题数组
    private String studentSchool;                            //学校
    private String studentName;
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public String getLearningClass() {
        return LearningClass;
    }

    public void setLearningClass(String learningClass) {
        LearningClass = learningClass;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public ArrayList<Object> getStudentWrongQuestion() {
        return studentWrongQuestion;
    }

    public void setStudentWrongQuestion(ArrayList<Object> studentWrongQuestion) {
        this.studentWrongQuestion = studentWrongQuestion;
    }

    public String getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(String studentSchool) {
        this.studentSchool = studentSchool;
    }


    //正常练习，输入题目数目，返回题目类型数组(方法先这样写，等梦珂分析好返回值和参数再改，-2023.3.10魔理沙)
    public ArrayList<Object> normalPractice(int number) {
        ArrayList<Object> answ = new ArrayList<>();
        return answ;
    }

    //复习练习，输入题目数量，返回题目类型数组
    public ArrayList<Object> reviewPractice(int number) {
        ArrayList<Object> answ = new ArrayList<>();
        return answ;
    }

    //困难练习，输入题目数量，返回题目类型数组
    public ArrayList<Object> hardPractice(int number) {
        ArrayList<Object> answ = new ArrayList<>();
        return answ;
    }

    //做作业，通过查询数据库，看老师是否布置作业，如果布置了，学生选择试卷并返回题目类型数组，如果没有，弹出窗口提示没有作业
    public ArrayList<Object> doHomework() {
        ArrayList<Object> answ = new ArrayList<>();
        return answ;
    }

    //查看历史错题，输入题目数量，返回题目类型数组
    public ArrayList<Object> viewWrongQuestion(int number) {
        ArrayList<Object> answ = new ArrayList<>();
        return answ;
    }
}
