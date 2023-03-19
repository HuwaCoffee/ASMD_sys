import exercise.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.function.BinaryOperator;

public class Exam {//当学生进入系统时，存1000道题到数据库，1-250为加法，251-500为减法，501到750为乘法，751到1000为除法
    private ArrayList<AdditionOperation> operationList01 = new ArrayList<>();    //加法
    private ArrayList<SubstractOperation> operationList02 = new ArrayList<>();  //减法
    private ArrayList<MultiplyOperation> operationList03 = new ArrayList<>();  //乘法
    private ArrayList<DivisionOperation> operationList04 = new ArrayList<>();  //除法

    //数据库相关属性
    private MysqlTool mysql=new MysqlTool();
    private Connection con;
    private PreparedStatement ps;
    private Statement statement;
    private ResultSet rs;
    private DefaultTableModel model;


    Exam(){ //构造函数后，自动存入1000道题入数据库
        con= mysql.openDB();
        int num=1;
        while (num<=1000) {
            if(num>=1&&num<=250){
                AdditionOperation anOperation=null;
                do {
                    anOperation=new AdditionOperation();
                } while (operationList01.contains(anOperation));
                operationList01.add(anOperation);
            }
            if(num>=251&&num<=500){
                SubstractOperation anOperation=null;
                do {
                    anOperation=new SubstractOperation();
                } while (operationList02.contains(anOperation));
                operationList02.add(anOperation);
            }
            if(num>=501&&num<=750){
                MultiplyOperation anOperation=null;
                do {
                    anOperation=new MultiplyOperation();
                } while (operationList03.contains(anOperation));
                operationList03.add(anOperation);
            }
            if(num>=751&&num<=1000){
                DivisionOperation anOperation=null;
                do {
                    anOperation=new DivisionOperation();
                } while (operationList04.contains(anOperation));
                operationList04.add(anOperation);
            }
            num++;
        }


            try {
                statement=con.createStatement();

                for(int i=0;i<250;i++){
                    String sql="INSERT INTO problems VALUES (\'"+operationList01.get(i).asString()+"\',\'"+i+1+" \')";
                    int n=statement.executeUpdate(sql);
                }
                for(int i=0;i<250;i++){
                    String sql="INSERT INTO problems VALUES (\'"+operationList02.get(i).asString()+"\',\'"+i+1+" \')";
                    int n=statement.executeUpdate(sql);
                }
                for(int i=0;i<250;i++){
                    String sql="INSERT INTO problems VALUES (\'"+operationList03.get(i).asString()+"\',\'"+i+1+" \')";
                    int n=statement.executeUpdate(sql);
                }
                for(int i=0;i<250;i++){
                    String sql="INSERT INTO problems VALUES (\'"+operationList04.get(i).asString()+"\',\'"+i+1+" \')";
                    int n=statement.executeUpdate(sql);
                }


                statement.close();
                con.close();


            } catch (SQLException ex) {
                ex.printStackTrace();
            }





    }

    public ArrayList<AdditionOperation> getOperationList01() {
        return operationList01;
    }

    public ArrayList<SubstractOperation> getOperationList02() {
        return operationList02;
    }

    public ArrayList<MultiplyOperation> getOperationList03() {
        return operationList03;
    }

    public ArrayList<DivisionOperation> getOperationList04() {
        return operationList04;
    }

    //测试代码，看是否能将题目正确生成，且存入四种List中
    /*public static void main(String[] args) {
        Exam ex=new Exam();
        System.out.println(ex.getOperationList01().size());
        System.out.println(ex.getOperationList02().size());
        System.out.println(ex.getOperationList03().size());
        System.out.println(ex.getOperationList04().size());
        for(int i=0;i<250;i++){
            System.out.println(ex.getOperationList01().get(i).asString());
        }
        for(int i=0;i<250;i++){
            System.out.println(ex.getOperationList02().get(i).toString());
        }
        for(int i=0;i<250;i++){
            System.out.println(ex.getOperationList03().get(i).toString());
        }
        for(int i=0;i<250;i++){
            System.out.println(ex.getOperationList04().get(i).toString());
        }
    }*/
}
