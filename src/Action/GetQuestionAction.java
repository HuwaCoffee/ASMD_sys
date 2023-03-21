package Action;

import DataBaseGet.DataBaseGet;
import com.opensymphony.xwork2.ActionContext;
import exercise.BinaryOperation;
import java.util.ArrayList;
import com.opensymphony.xwork2.Action;



//当学生点击练习或查看试卷时，前端调用此类，获取题目数组，并显示给用户
public class GetQuestionAction implements Action {
    private ArrayList<BinaryOperation> questions;//题目数组

    public ArrayList<BinaryOperation> getQuestions() {
        return questions;
    }

    //获取普通练习的题目，默认10道题。可以修改方法让用户输入题目数
    @Override
    public String execute() {
        //从数据库中随机抽10道题，存入questions
        DataBaseGet db=new DataBaseGet();
        questions=db.GetQuestions();

        ActionContext ac=ActionContext.getContext();
        //把習題保存到application中
        ac.getApplication().put("questions",getQuestions());
        //返回SUCCESS，题目返回成功
        return SUCCESS;
    }



}
