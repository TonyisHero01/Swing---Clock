package cz.cuni.mff.java.hw.swingclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = frame.getContentPane();

        JClock clock = new JClock();

        content.add(clock);

        content.setSize(clock.getMinimumSize());

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Main::createAndShowGUI);
        //display();
    }
}
