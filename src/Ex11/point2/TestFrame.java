package Ex11.point2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.*;

public class TestFrame<JOptionPaneTest> extends JFrame {

    private JOptionPaneTest DialogM;

    public TestFrame() {
        super("Test frame");

        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button0 = new JButton("_____С_____");
        panel.add(button0);
        JButton button1 = new JButton("З");
        panel.add(button1);
        JButton button2 = new JButton("Ц");
        panel.add(button2);
        JButton button3 = new JButton("В");
        panel.add(button3);
        JButton button4 = new JButton("_____Ю_____");
        panel.add(button4);

        button0.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в САО");
            }
            public void mouseExited(MouseEvent e) {}
        });

        button1.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в ЗАО");
            }
            public void mouseExited(MouseEvent e) {}
        });

        button2.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в ЦАО");
            }
            public void mouseExited(MouseEvent e) {}
        });

        button3.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в СВАО");
            }
            public void mouseExited(MouseEvent e) {}
        });
        button4.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в ЮЗАО");
            }
            public void mouseExited(MouseEvent e) {}
        });
        getContentPane().add(panel);
        setPreferredSize(new Dimension(160, 130));
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
