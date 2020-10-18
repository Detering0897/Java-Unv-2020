package Ex11.point1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame extends JFrame {

    private JTextField textField;

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


        textField = new JTextField();
        textField.setColumns(18);
        panel.add(textField);

        JButton button3 = new JButton("Проверка");

        //button3.setActionCommand("Button 3 was pressed!");
        panel.add(button3);

        class ActionListener1 implements ActionListener {
            private TestFrame frame;
            private int chanses ;
            ActionListener1 (TestFrame frame1){
                frame=frame1;
                chanses = 3;
            }
            public void actionPerformed(ActionEvent e) {
                chanses --;
                //System.out.println(textField.getText());
                if ( Integer.parseInt(textField.getText())==num) {
                    textField.setText("Верно");
                }
                if ( Integer.parseInt(textField.getText())<num) {
                    textField.setText("Неверно! Оно Больше");
                }
                if ( Integer.parseInt(textField.getText())>num) {
                    textField.setText("Неверно! Оно Меньше");
                }


                if (chanses<=0){
                    /*
                    try {
                        TimeUnit.SECONDS.sleep(4);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }*/
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            }
        }

        ActionListener actionListener = new ActionListener1(this);



        button3.addActionListener(actionListener) ;

        getContentPane().add(panel);
        setPreferredSize(new Dimension(280, 100));
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
