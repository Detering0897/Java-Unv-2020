package Ex21.point3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Functional extends JFrame {
    public Functional(){
        super("Создание");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menu = new JMenuBar();
        menu.add(createFileMenu());
        setJMenuBar(menu);
        setSize(400,200);
        setVisible(true);
    }
    public JMenu createFileMenu(){
        JMenu file = new JMenu("Файл");
        JMenu file_new = new JMenu("Новый");
        JMenuItem file_open = new JMenuItem("Открыть");
        JMenuItem file_save = new JMenuItem("Сохранить");
        JMenuItem file_exit = new JMenuItem("Выйти");
        JMenuItem text_doc = new JMenuItem("TextDocument");
        JMenuItem image_doc = new JMenuItem("ImageDocument");
        JMenuItem music_doc = new JMenuItem("MusicDocument");
        file.add(file_new);
        file.add(file_open);
        file.add(file_save);
        file.add(file_exit);
        file_new.add(text_doc);
        file_new.add(image_doc);
        file_new.add(music_doc);
        text_doc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("text_doc");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateNew();
                System.out.println("Файл создан");
            }
        });
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Открыт файл");
            }
        });
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Сохранить файл");
            }
        });
        file_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Закрыть файл");
            }
        });
        return file;
    }
}
