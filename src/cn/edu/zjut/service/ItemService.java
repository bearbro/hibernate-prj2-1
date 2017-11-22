package cn.edu.zjut.service;

import cn.edu.zjut.dao.ItemDAO;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List items = new ArrayList();

    public List findByHql() {
        ItemDAO dao = new ItemDAO();
        String hql = "select title,cost from Item where cost =( " +
                "select Max(item.cost) from Item as item )";
        List list = dao.findByHql(hql);
        dao.getSession().close();
        return list;
    }
}
