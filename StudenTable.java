package com.studentmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
public class StudenTable extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public StudenTable(List<Student> students){
        setTitle("Student List");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Age", "Grade"};
        tableModel = new DefaultTableModel(columnNames,0);
        table = new JTable(tableModel);

        for (Student student : students){
            Object[] rowData = {student.getId(), student.getName(), student.getAge(), student.getGrade()};
            tableModel.addRow(rowData);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);


        setVisible(true);
    }
}
