package sk.stuba.fei.uim.oop;

import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();
        okno.setVisible(true);
        okno.setSize(300, 300);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Klikni");
        button.addActionListener(new MyPanel());
        okno.add(button);
    }
}


















