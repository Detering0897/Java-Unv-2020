package Ex12;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.*;

class Planet {
    public String name;
    private double radius;
    private double mass;
    private double G;
    Planet (String in_name,double in_rad, double in_mass){
        name = in_name;
        mass = in_mass;
        radius = in_rad;
        G = 6.67  * in_mass / (in_rad * in_rad);
    }

    public String getName() {
        return name;
    }

    public double getG() {
        return G;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}

public class TestFrame extends JFrame {

    private JTextField textField;
    Planet Merc;
    Planet Ven;
    Planet Mars;
    Planet Earth;
    Planet Jup;
    Planet Sat;
    Planet Uran;
    Planet Nep;
    public TestFrame() {
        super("Test frame");
        Merc = new Planet ("Mercury",2.44,3.33);
        Ven = new Planet ("Venus",6,48.67);
        Mars= new Planet ("Mars",3.39,6.41);
        Earth= new Planet ("Earth",6.38,59.7);
        Jup= new Planet ("Jupiter",71.4,18986);
        Sat= new Planet ("Saturn",60.2,5684);
        Uran= new Planet ("Uranus",25.5,868);
        Nep= new Planet ("Neptun",24.7,1024);
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());



        JButton info1 = new JButton(Merc.getName()+ "           ");
        JButton info2 = new JButton(Ven.getName()+ "           ");
        JButton info3 = new JButton(Earth.getName()+ "           ");
        JButton info4 = new JButton(Mars.getName()+ "           ");
        JButton info5 = new JButton(Jup.getName()+ "           ");
        JButton info6 = new JButton(Sat.getName()+ "           ");
        JButton info7 = new JButton(Uran.getName()+ "           ");
        JButton info8 = new JButton(Nep.getName()+ "           ");

        JButton grav1 = new JButton(Merc.getName()+ "'s Grav");
        JButton grav2 = new JButton(Ven.getName()+ "'s Grav");
        JButton grav3 = new JButton(Earth.getName()+ "'s Grav");
        JButton grav4 = new JButton(Mars.getName()+ "'s Grav");
        JButton grav5 = new JButton(Jup.getName()+ "'s Grav");
        JButton grav6 = new JButton(Sat.getName()+ "'s Grav");
        JButton grav7 = new JButton(Uran.getName()+ "'s Grav");
        JButton grav8 = new JButton(Nep.getName()+ "'s Grav");

        info1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Merc.getName() + ". Mass: "+ Merc.getMass() + "*10^23 Kg. Radius: " + Merc.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Ven.getName() + ". Mass: "+ Ven.getMass() + "*10^23 Kg. Radius: " + Ven.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Earth.getName() + ". Mass: "+ Earth.getMass() + "*10^23 Kg. Radius: " + Earth.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Mars.getName() + ". Mass: "+ Mars.getMass() + "*10^23 Kg. Radius: " + Mars.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Jup.getName() + ". Mass: "+ Jup.getMass() + "*10^23 Kg. Radius: " + Jup.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Sat.getName() + ". Mass: "+ Sat.getMass() + "*10^23 Kg. Radius: " + Sat.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Uran.getName() + ". Mass: "+ Uran.getMass() + "*10^23 Kg. Radius: " + Uran.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        info8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Nep.getName() + ". Mass: "+ Nep.getMass() + "*10^23 Kg. Radius: " + Nep.getRadius() + "*10^6 M.";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Merc.getName() + "'s gravity: "+ Merc.getG()+ " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Ven.getName() + "'s gravity: "+ Ven.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Earth.getName() + "'s gravity: "+ Earth.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Mars.getName() + "'s gravity: "+ Mars.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Jup.getName() + "'s gravity: "+ Jup.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Sat.getName() + "'s gravity: "+ Sat.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        grav7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Uran.getName() + "'s gravity: "+ Uran.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });
        grav8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mess = Nep.getName() + "'s gravity: "+ Nep.getG() + " M*C^2";
                JOptionPane.showMessageDialog(null, mess);
            }
        });

        panel.add(info1);
        panel.add(info2);
        panel.add(info3);
        panel.add(info4);
        panel.add(info5);
        panel.add(info6);
        panel.add(info7);
        panel.add(info8);

        panel.add(grav1);
        panel.add(grav2);
        panel.add(grav3);
        panel.add(grav4);
        panel.add(grav5);
        panel.add(grav6);
        panel.add(grav7);
        panel.add(grav8);


        getContentPane().add(panel);
        setPreferredSize(new Dimension( 1000, 120));
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