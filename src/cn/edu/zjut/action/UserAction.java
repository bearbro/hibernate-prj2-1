package cn.edu.zjut.action;

import cn.edu.zjut.po.Customer;
import cn.edu.zjut.service.UserService;

/**
 * Created by Bro、小熊 on 2017/10/2.
 */
public class UserAction {
    private Customer loginUser;



    public Customer getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(Customer loginUser) {
        this.loginUser = loginUser;
    }

    public String register() {
        UserService userServ = new UserService();
        userServ.register(loginUser);
        return "regsuccess";

    }

    public String login() {
        UserService userServ = new UserService();

        if (userServ.login(loginUser)) {
            return "logsuccess";
        } else {
            return "logfail";
        }
    }
    public String update() {
        UserService userServ = new UserService();

        if (userServ.update(loginUser)) {
            return "upsuccess";
        } else {
            return "upfail";
        }
    }
    public String delete() {
        UserService userServ = new UserService();

        if (userServ.delete(loginUser)) {
            return "delsuccess";
        } else {
            return "delfail";
        }
    }
}
