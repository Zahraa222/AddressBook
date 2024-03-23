import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book {
    private JPanel main;
    private JTabbedPane tabs;
    private JButton editButton;
    private JButton createNewContactButton;
    private JList ContactList;
    private JButton button12;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a6Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a0Button;
    private JTextField Screen;
    private JButton Clear;
    private JPanel Favorite;
    private JPanel Recent;
    private JPanel Contacts;
    private JPanel Settings;


    public Book(){
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a0Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a9Button.getText());
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText("");
            }
        });


        JFrame frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(360,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Book();
    }
}
