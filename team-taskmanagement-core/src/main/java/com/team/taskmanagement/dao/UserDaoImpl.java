package com.team.taskmanagement.dao;

import com.team.taskmanagement.modal.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl  implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findById(Long id) {

        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        User user = session.get(User.class, id);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public Long save(User newUser) {

        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        Long newId = (Long)session.save(newUser);
        session.getTransaction().commit();
        return newId;

    }

    @Override
    public List<User> findAll () {
        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();
        List<User> users = session.createNamedQuery("All_users").list();
//        List<User> users = query.getResultList(); //returns object list

        session.getTransaction().commit();
        return users;

    }

    @Override
    public void update(User updatedUser) {
        Session session = sessionFactory.getCurrentSession();
        session.getTransaction().begin();
//        Query<User> query = session.createNamedQuery("User_byId");
//        query.setParameter("id", updatedUser.getId());

        session.update(updatedUser);
        session.getTransaction().commit();
    }
}
