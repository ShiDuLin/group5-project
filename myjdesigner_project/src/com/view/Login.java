/*
 * Created by JFormDesigner on Sat Mar 27 10:50:53 CST 2021
 */

package com.view;

import com.bean.User;
import com.dao.UserDao;
import com.util.DbUtil;
import com.util.StringUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;

/**
 * @author sd'l
 */
public class Login extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel 用户名;
    private JLabel 密码;
    private JTextField userName;
    private JPasswordField password;
    private JButton 登录;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private DbUtil dbUtil = new DbUtil();
    private UserDao userDao = new UserDao();
    public Login() {
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setVisible(true);
        initComponents();
    }

    private void LoginActionPerformed(ActionEvent e) {
        String userName = this.userName.getText();
        String password = String.valueOf(this.password.getPassword());
        if (StringUtil.isEmpty(userName)) {
            JOptionPane.showMessageDialog(null, "用户名不能为空");
        }
        if (StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "密码不能为空");
        }
        Connection conn = null;
        try {
            conn = dbUtil.getConnection();
            User currentUser = userDao.login(conn, userName,password);
            if (currentUser != null) {
                new MainFrm().setVisible(true);
                super.setVisible(false);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        用户名 = new JLabel();
        密码 = new JLabel();
        userName = new JTextField();
        password = new JPasswordField();
        登录 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- 用户名 ----
        用户名.setText("\u7528\u6237\u540d");
        contentPane.add(用户名);
        用户名.setBounds(70, 60, 45, 35);

        //---- 密码 ----
        密码.setText("\u5bc6\u7801");
        contentPane.add(密码);
        密码.setBounds(70, 120, 45, 35);
        contentPane.add(userName);
        userName.setBounds(165, 60, 120, userName.getPreferredSize().height);
        contentPane.add(password);
        password.setBounds(165, 120, 120, password.getPreferredSize().height);

        //---- 登录 ----
        登录.setText("\u767b\u5f55");
        登录.addActionListener(e -> LoginActionPerformed(e));
        contentPane.add(登录);
        登录.setBounds(new Rectangle(new Point(170, 195), 登录.getPreferredSize()));

        contentPane.setPreferredSize(new Dimension(400, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    
    public static void main(String[] args) throws Exception {
        DbUtil dbUtil = new DbUtil();
        try {
            dbUtil.getConnection();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            System.out.println("数据库连接失败");
            JOptionPane.showMessageDialog(null,"数据库连接失败");
            return;
        }
        new Login();

    }
}
