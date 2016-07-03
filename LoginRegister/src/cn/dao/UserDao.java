/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.dao;

import cn.pojo.User;

/**
 *
 * @author lenovo
 */
public interface UserDao {
    public abstract boolean login(String Username,String Password);
    public abstract void register(User user);
}
