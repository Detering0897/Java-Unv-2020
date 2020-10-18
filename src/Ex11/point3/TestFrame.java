package Ex11.point3;


import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class TestFrame extends JFrame {

    private JTextArea textArea;
    private TestFrame This = this;

    private int num;
    public TestFrame() {
        super("Test frame");
        Random ran = new Random();
        num = ran.nextInt(20);
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());


        textArea = new JTextArea();
        textArea.setColumns(40);
        textArea.setRows(16);
        panel.add(textArea);

        JButton button1 = new JButton("Times New Roman");
        panel.add(button1);
        JButton button2 = new JButton("MS Sans Serif");
        panel.add(button2);
        JButton button3 = new JButton("Courier New");
        panel.add(button3);
        JButton button4 = new JButton("Blue");
        panel.add(button4);
        JButton button5 = new JButton("Red");
        panel.add(button5);
        JButton button6 = new JButton("Black");
        panel.add(button6);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Font font = new Font("Times New Roman", Font.BOLD, 14);
                textArea.setFont(font);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Font font = new Font("MS Sans Serif", Font.BOLD, 14);
                textArea.setFont(font);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Font font = new Font("Courier New", Font.BOLD, 14);
                textArea.setFont(font);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setSelectedTextColor(Color.blue);
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setSelectedTextColor(Color.red);
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setSelectedTextColor(Color.black);
            }
        });
        getContentPane().add(panel);
        setPreferredSize(new Dimension(500, 400));
    }



    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TestFrame frame = new TestFrame();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

