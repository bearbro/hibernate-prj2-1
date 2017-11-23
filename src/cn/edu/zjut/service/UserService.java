package cn.edu.zjut.service;

import cn.edu.zjut.dao.CustomerDAO;
import cn.edu.zjut.po.Customer;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Map;

/**
 * Created by Bro、小熊 on 2017/10/2.
 */
public class UserService {
    private Map<String, Object> request, session;

    private void setSessionAndRequest() {
        ActionContext ctx = ActionContext.getContext();
        session = (Map) ctx.getSession();
        request = (Map) ctx.get("request");
    }

    public boolean login(Customer loginUser) {
        setSessionAndRequest();
        String account = loginUser.getAccount();
        String password = loginUser.getPassword();
        String hql = "from Customer as user where account='" + account +
                "' and password='" + password + "'";
        CustomerDAO dao = new CustomerDAO();
        List list = dao.findByHql(hql);
        dao.getSession().close();
        if (list.isEmpty())
            return false;
        else {
            session.put("user", account);
            request.put("tip", "登录成功");
            loginUser = (Customer) list.get(0);
            request.put("loginUser", loginUser);
            return true;
        }
    }

    public boolean register(Customer regUser) {
        setSessionAndRequest();
        CustomerDAO dao = new CustomerDAO();
        Transaction tran =null;
        try {
            tran =dao.getSession().beginTransaction();
            dao.save(regUser);
            tran.commit();
            String account = regUser.getAccount();
            session.put("user", account);
            request.put("tip", "注册成功");
            request.put("loginUser", regUser);
            return true;
        } catch (Exception e) {
            if (tran!=null)tran.rollback();
            return false;
        }finally {
            dao.getSession().close();
        }
    }

    public boolean update(Customer loginUser) {
        setSessionAndRequest();
        CustomerDAO dao = new CustomerDAO();
        Transaction tran =null;
        try {
            tran =dao.getSession().beginTransaction();
            dao.update(loginUser);
            tran.commit();
            String account = loginUser.getAccount();
            session.put("user", account);
            request.put("tip", "更新成功");
            request.put("loginUser", loginUser);
            return true;
        } catch (Exception e) {
            if (tran!=null)tran.rollback();
            return false;
        }finally{
            dao.getSession().close();
        }
    }
public boolean delete(Customer loginUser){
    setSessionAndRequest();
    CustomerDAO dao = new CustomerDAO();
    Transaction tran =null;
    try {
        tran =dao.getSession().beginTransaction();
        dao.delete(loginUser);
        tran.commit();
        session.remove("user");
        request.put("tip","删除个人信息成功，请重新登录！");
        return true;
    }catch (Exception e){
        if (tran!=null)tran.rollback();
        return false;
    }finally {
        dao.getSession().close();
    }
}
}
