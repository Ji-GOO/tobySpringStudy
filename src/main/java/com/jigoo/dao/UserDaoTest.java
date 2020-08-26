package com.jigoo.dao;

import com.jigoo.domain.User;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDAO dao = new UserDAO(connectionMaker);

        User user = new User();
        user.setId("jigoo211");
        user.setName("정지수121");
        user.setPassword("12345222");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공!");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공!");
    }
}
