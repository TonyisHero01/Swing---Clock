package cz.cuni.mff.java.hw.swingclock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JClock extends JPanel{
    public String timeString;
    Integer hour;
    Integer minute;
    Integer second;

    Timer timer;
    public JClock() {
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(80, 40));

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Calendar calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        setTimeString(hour, minute, second);
        g.drawString(timeString, 10, 10);
    }

    private void setTimeString(Integer hour, Integer minute, Integer second) {
        timeString = hour + ":" + minute + ":" + second;
    }
}