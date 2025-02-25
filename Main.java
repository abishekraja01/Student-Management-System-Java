package com.studentmanagement;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new StudentForm().setVisible(true));
    }
}
