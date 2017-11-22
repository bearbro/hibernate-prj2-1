package cn.edu.zjut.dao;

import cn.edu.zjut.po.Customer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.query.Query;


import java.util.List;


public class CustomerDAO extends BaseHibernateDAO {
    private Log log = LogFactory.getLog(CustomerDAO.class);

    public List findByHql(String hql) {
        log.debug("finding LoginUser instance by hql");

        try {
            String queryString = hql;
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            log.error("find by hql failed", re);
            throw re;
        }
    }
    public void save(Customer instance){
        log.debug("saving customer instance");

        try{
//            Transaction ts=session.beginTransaction();
//            session.save(customer);
//            session.flush();
//            ts.commit();
            getSession().save(instance);
            log.debug("save successdul");
        }catch (RuntimeException re){
            log.error("save failed",re);
            throw re;
        }
    }

    public void update(Customer instance){
        log.debug("updating customer instance");

        try {
            getSession().update(instance);
            log.debug("update successdul");
        }catch (RuntimeException re){
            log.error("update failed",re);
            throw re;
        }
    }
    public void delete(Customer instance){
        log.debug("deleting customer instance");

        try {
            getSession().delete(instance);
            log.debug("delete successdul");
        }catch (RuntimeException re){
            log.error("delete failed",re);
            throw re;
        }
    }
}
