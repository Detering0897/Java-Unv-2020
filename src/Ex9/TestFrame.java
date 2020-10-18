package Ex9;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

class WidgetClass1 extends JFrame{
    WidgetClass1(){

        super("Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        //JButton butt =  new JButton("new");
        JButton button = new JButton("Test button");
        ActionListener actionListener = new TestFrame.TestActionListener();
        button.addActionListener(actionListener);
        //int a = (int)Math.random() * 10;
        Random r = new Random();
        for (int i =0;i<20;++i) {
            Shape figure = new Rectangle(40, 40, "red", false);
            int x1 = r.nextInt() % 350;
            x1 += 100;
            int x2 = r.nextInt() % 350;
            x2 += 100;

            int a = r.nextInt() % 50;
            a += 40;
            int b = r.nextInt() % 50;
            b += 40;
            figure.setBounds(x1, x2, a, b);
            figure.repaint();
            lp.add(figure, JLayeredPane.PALETTE_LAYER);


        }

        setSize(500, 500);
        setVisible(true);
    }
}
public class TestFrame extends JFrame {

    private JTextField textField;

    public TestFrame() {
        super("Test frame");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("New Figures");
        button1.setActionCommand("Button 1 was pressed! ");
        panel.add(button1);



        ActionListener actionListener = new TestActionListener();

        button1.addActionListener(actionListener);


        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 100));
    }

    public static class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new WidgetClass1();
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
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
