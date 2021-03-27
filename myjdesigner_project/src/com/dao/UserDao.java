package com.dao;
import com.bean.User;
import com.util.DbUtil;
import com.dao.UserDao;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName UserDao
 * Description
 *
 * @author 阿木木
 * @date 2021/3/27 9:52
 * Version 1.0
 */
public class UserDao {

    /**
     * 用户登录
     *
     * @param connection 数据库连接
     * @param userName 用户名
     * @param password 密码
     * @return entity.User
     * @since 2021/3/27
     */
    public User login(Connection connection, String userName,String password) throws SQLException {
        User resultUser = null;
        String sql = "select * from users where user_name=? and user_password=?";
        PreparedStatement psmt = connection.prepareStatement(sql);
        psmt.setString(1, userName);
        psmt.setString(2, password);
        ResultSet resultSet = psmt.executeQuery();
        if (resultSet.next()) {
            resultUser = new User();
            resultUser.setUserName(resultSet.getString("user_name"));
            resultUser.setPassword(resultSet.getString("user_password"));
        }
        return resultUser;
    }

    public User select(Connection connection, String userName)throws SQLException{
        User resultUser = null;
        String sql = "select * from users where user_name=? ";
        PreparedStatement psmt = connection.prepareStatement(sql);
        psmt.setString(1, userName);
        ResultSet resultSet = psmt.executeQuery();
        if (resultSet.next()) {
            resultUser = new User();
            resultUser.setId(resultSet.getInt("id"));
            resultUser.setUserName(resultSet.getString("user_name"));
            resultUser.setPassword(resultSet.getString("user_password"));
            resultUser.setAddress(resultSet.getString("user_add"));
            resultUser.setTel(resultSet.getString("user_tel"));
        }
        return resultUser;

    }
        public static void main(String[] args) throws Exception {
            DbUtil dbUtil = new DbUtil();
            try {
                Connection connection= dbUtil.getConnection();
                String sql = "select * from users";
                PreparedStatement psmt = connection.prepareStatement(sql);
                ResultSet resultSet = psmt.executeQuery();
                while (resultSet.next()) {// 当结果集不为空时
                    System.out.println(resultSet.getString("user_name"));
                }
                System.out.println("数据库连接成功");
            } catch (Exception e) {
                System.out.println("数据库连接失败");
                JOptionPane.showMessageDialog(null,"数据库连接失败");
                return;
            }
        }
}
