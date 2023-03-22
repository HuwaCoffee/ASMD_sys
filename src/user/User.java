package user;


import java.util.ArrayList;

/*User抽象类是所有人员类的基类，包含人员所必须的基本信息
 *User类的子类有，Teacher类，Student类，Administrator类
 *Administrator类又有子类，SchoolAdministrator类，SuperAdministrator类*/
public abstract class User {
    private int userID;         //用户Id
    private String userName;    //用户名
    private String passWord;    //密码
    private String phoneNumber; //电话
    private String authority;   //权值

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }


}




