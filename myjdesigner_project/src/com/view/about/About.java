/*
 * Created by JFormDesigner on Fri Apr 10 17:49:13 CST 2020
 */

package com.view.about;

import javax.swing.*;
import java.awt.*;

/**
 * @author vigilr
 */
public class About extends JFrame {
    public About() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setTitle("\u5173\u4e8e\u5f00\u53d1\u8005");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("\u5f00\u53d1\u56e2\u961f\uff1a\u7b2c\u4e94\u7ec4");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1, BorderLayout.CENTER);

        //---- label2 ----
        label2.setText("\u5f00\u53d1\u65e5\u671f\uff1a2021\u5e744\u6708");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
        contentPane.add(label2, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
