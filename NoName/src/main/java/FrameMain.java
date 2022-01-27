import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FrameMain {

    JMenuBar menuBar;
    JMenu menuOne, submenu;
    JMenuItem menuItemOne;

    JFrame Frame = new JFrame("ClinicData");
    FrameMain() {
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setSize(600, 600);
        Frame.setLocation(350, 100);
        Frame.setVisible(true);
        Frame.setResizable(false);

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menuOne = new JMenu("Меню");
        menuBar.add(menuOne);

        //a submenu
        menuOne.addSeparator();
        submenu = new JMenu("Пациент");

        menuItemOne = new JMenuItem("Добавить");
        menuItemOne.getAccessibleContext().setAccessibleDescription(
                "Добавить пациента");
        submenu.add(menuItemOne);
        menuItemOne.addActionListener(new ActionListener() {
<<<<<<< HEAD
            @Override
=======

>>>>>>> 87398a6 (Убрана аннотация)
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Добавление пациента");
                JTextField name, lastName, birgDate, addr;
                name = new JTextField(20);
                name.setToolTipText("Введите имя");
                lastName = new JTextField(20);
                lastName.setToolTipText("Введите фамилию");
                //byte c;
                birgDate = new JTextField(8);
                birgDate.getText();
                birgDate.setToolTipText("Дато рождения");
                addr = new JTextField(20);
                addr.setToolTipText("Адрес");


                JLabel labName = new JLabel("Имя");

                labName.setVisible(true);
                labName.setLocation(100,100);
                JLabel labLastName = new JLabel("Фамилия");

                JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
                contents.add(name);
                contents.add(lastName);
                contents.add(birgDate);
                contents.add(addr);
                frame.setContentPane(contents);
                contents.setSize(400, 130);
                contents.setVisible(true);


                frame.setSize(800, 300);
                frame.setLocation(450, 150);
                frame.setResizable(false);
                frame.setVisible(true);
                frame.pack();
            }

        });

        menuItemOne = new JMenuItem("Поиск");
        menuItemOne.getAccessibleContext().setAccessibleDescription(
                "Найти в базе");
        submenu.add(menuItemOne);
        menuOne.add(submenu);
        menuOne.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                patientFind pac = new patientFind();

            }
        });


        //Second menu in the menu bar.
        menuOne = new JMenu("Дополнительно");
        menuOne.setMnemonic(KeyEvent.VK_N);
        menuOne.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menuOne);

        Frame.setJMenuBar(menuBar);
    }
    static class patientFind {
        patientFind(){
            JFrame frame = new JFrame("Добавление пациента");
            JTextField name, lastName, birgDate, addr;
            name = new JTextField(20);
            name.setToolTipText("Введите имя");
            lastName = new JTextField(20);
            lastName.setToolTipText("Введите фамилию");
            //byte c;
            birgDate = new JTextField(8);
            birgDate.getText();
            birgDate.setToolTipText("Дато рождения");
            addr = new JTextField(20);
            addr.setToolTipText("Адрес");


            JLabel labName = new JLabel("Имя");

            labName.setVisible(true);
            labName.setLocation(100,100);
            JLabel labLastName = new JLabel("Фамилия");

            JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
            contents.add(name);
            contents.add(lastName);
            contents.add(birgDate);
            contents.add(addr);
            frame.setContentPane(contents);
            contents.setSize(400, 130);
            contents.setVisible(true);


            frame.setSize(800, 300);
            frame.setLocation(450, 150);
            frame.setResizable(false);
            frame.setVisible(true);
            frame.pack();
        }
    }
}
