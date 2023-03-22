package user;

import java.util.ArrayList;

public class Teacher extends User {
    private String teachingClass;  //班级
    private String teacherSchool;  //学校

    public String getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String teachingClass) {
        this.teachingClass = teachingClass;
    }

    public String getTeacherSchool() {
        return teacherSchool;
    }

    public void setTeacherSchool(String teacherSchool) {
        this.teacherSchool = teacherSchool;
    }

    //管理班级，进入该界面之后有三个选项，包括删除学生，修改学生信息，查询学生信息，教师需要再次选择
    void managementClass() {

    }

    //出试卷，教师通过自己输入题目内容，整合出一张试卷存入数据库
    void publishPaper(ArrayList<Object> problems) {

    }

    //添加学生，输入学生信息，存入数据库。因为用的比较频繁，与管理学生的方法分离开
    void addStudent(Student stu) {

    }

}
