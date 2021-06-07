package com.company;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class mainFrame {

    public static void main(String[] args) {
	JFrame main_frame = new JFrame("Лабораторная 4. Колесников Иван ПРИ-18/1");
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(800, 600);
        main_frame.setResizable(false);

        Box labels_box = new Box(BoxLayout.X_AXIS);
        JLabel label1 = new JLabel("Метка 1");
        JLabel label2 = new JLabel("Метка 2");
        JLabel label3 = new JLabel("Метка 3");
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));
        labels_box.add(label1);
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));
        labels_box.add(label2);
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));
        labels_box.add(label3);
        labels_box.add(Box.createHorizontalGlue());
        JLabel label4 = new JLabel("Метка 4");
        JLabel label5 = new JLabel("Метка 5");
        JLabel label6 = new JLabel("Метка 6");
        labels_box.add(label4);
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));
        labels_box.add(label5);
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));
        labels_box.add(label6);
        labels_box.add(Box.createRigidArea(new Dimension(5,0)));

        Box buttons_box = new Box(BoxLayout.Y_AXIS);
        ArrayList<JButton> masButton = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            buttons_box.add(Box.createRigidArea(new Dimension(0,15)));
            masButton.add(new JButton("Кнопка " + (i+1)));
            buttons_box.add(masButton.get(i));
        }

        Box radio_buttons_box = new Box(BoxLayout.Y_AXIS);
        ArrayList<JRadioButton> masRadioButton = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            radio_buttons_box.add(Box.createRigidArea(new Dimension(0,15)));
            masRadioButton.add(new JRadioButton("Выбор " + (i+1)));
            radio_buttons_box.add(masRadioButton.get(i));
        }
        masRadioButton.get(6).setSelected(true);

        JPanel two_buttons = new JPanel();
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        layout.setHgap(170);
        two_buttons.setLayout(layout);
        two_buttons.add(new JButton("Кнопка"));
        two_buttons.add(new JButton("Кнопка"));


        JPanel center = new JPanel(new GridLayout(2, 1));

        center.add(new JTextArea("Область текста"), BorderLayout.NORTH);
        center.add(two_buttons, BorderLayout.NORTH);

        JPanel main = new JPanel(new BorderLayout());
        main_frame.add(labels_box, BorderLayout.NORTH);
        main.add(buttons_box, BorderLayout.WEST);
        main.add(radio_buttons_box, BorderLayout.EAST);
        main.add(center, BorderLayout.CENTER);
        main_frame.add(main);


        JPanel end_frame = new JPanel();
        end_frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        end_frame.add(new JPasswordField(10));
        end_frame.add(new JButton("Кнопка"));

        main.add(end_frame, BorderLayout.SOUTH);

        main_frame.setVisible(true);//делаем окно видимым
        main_frame.setMinimumSize(main_frame.getSize());
    }
}
