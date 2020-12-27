package com.layout;

import javax.swing.JLabel;

public interface Dashboard {
    JLabel getLabelSessionNama();
    JLabel getLabelSessionLevel();
    
    void setLocationRelativeTo(java.awt.Component c);
    void setVisible(boolean b);
}
