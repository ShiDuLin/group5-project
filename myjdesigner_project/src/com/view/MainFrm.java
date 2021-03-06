/*
 * Created by JFormDesigner on Fri Apr 10 16:43:38 CST 2020
 */

package com.view;

import com.util.DbUtil;
import com.util.StringUtil;
import com.view.about.About;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author vigilr
 */
public class MainFrm extends JFrame {
    public MainFrm() {
        initComponents();
    }

    private void thisWindowClosing(WindowEvent e) {
        System.exit(1);
    }

    /**
     * 关于开发者
     *
     * @return void
     * @since 2020/4/12
     */
    private void menuItem1ActionPerformed(ActionEvent e) {
        About about = new About();
        about.setVisible(true);
    }
    /**
     * 安全退出事件处理
     *
     * @return void
     * @since 2020/4/12
     */
    private void menuItem2ActionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null, "是否退出系统");
        System.out.println(result);
        if (result == 0) {
            System.exit(1);
        }
    }


    /**
     * 图书类别管理
     *
     * @return void
     * @since 2020/4/12
     */
    private void menuItem5ActionPerformed(ActionEvent e) {
//        dispose();
//        BookTypeManagerFrm bookTypeManagerFrm = new BookTypeManagerFrm();
//        bookTypeManagerFrm.setVisible(true);
    }

    /**
     * 图书添加
     *
     * @return void
     * @since 2020/4/12
     */
    private void menuItem3ActionPerformed(ActionEvent e) {
//        BookAddFrm bookAddFrm = new BookAddFrm();
//        bookAddFrm.setVisible(true);
//        this.table.add(bookAddFrm);
    }

    /**
     * 查询事件处理
     *
     * @return void
     * @since 2020/4/12
     */
    private void button1ActionPerformed(ActionEvent e) {

    }


    /**
     * 图书修改事件处理
     *
     * @return void
     * @since 2020/4/12
     */
    private void updateButtonActionPerformed(ActionEvent e) {

    }

    /**
     * 图书删除事件处理
     *
     * @return void
     * @since 2020/4/12
     */
    private void delButtonActionPerformed(ActionEvent e) {

    }



    DbUtil dbUtil = new DbUtil();

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu5 = new JMenu();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menu2 = new JMenu();
        menuItem1 = new JMenuItem();

        //======== this ========
        setTitle("\u4e3b\u754c\u9762");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u83dc\u5355");

                //---- menuItem5 ----
                menuItem5.setText("\u8d26\u53f7\u4fe1\u606f\u67e5\u8be2");
                menuItem5.addActionListener(e -> menuItem5ActionPerformed(e));
                menu1.add(menuItem5);

                //---- menuItem2 ----
                menuItem2.setText("\u5b89\u5168\u9000\u51fa");
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);

            //======== menu5 ========
            {
                menu5.setText("\u5546\u54c1\u7ba1\u7406");

                //---- menuItem3 ----
                menuItem3.setText("\u4e0a\u67b6\u5546\u54c1");
                menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
                menu5.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("\u4e0b\u67b6\u5546\u54c1");
                menu5.add(menuItem4);

                //---- menuItem7 ----
                menuItem7.setText("\u67e5\u8be2\u5546\u54c1");
                menu5.add(menuItem7);

                //---- menuItem8 ----
                menuItem8.setText("\u4fee\u6539\u5546\u54c1");
                menu5.add(menuItem8);
            }
            menuBar1.add(menu5);

            //======== menu2 ========
            {
                menu2.setText("\u5173\u4e8e");

                //---- menuItem1 ----
                menuItem1.setText("\u5173\u4e8e\u5f00\u53d1\u8005");
                menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
                menu2.add(menuItem1);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(830, 735);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem5;
    private JMenuItem menuItem2;
    private JMenu menu5;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenu menu2;
    private JMenuItem menuItem1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new MainFrm().setVisible(true);
    }
}
