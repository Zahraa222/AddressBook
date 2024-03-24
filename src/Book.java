import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book {
    private JPanel main;
    private JTabbedPane tabs;
    private JButton createNewContactButton;

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
    private JButton call;
    private JSlider slider1;
    private JButton editButton;
    private JPanel Favorite;
    private JPanel Recent;
    private JPanel Contacts;
    private JPanel Settings;


    public Book(){
        checkphoneLength();
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a0Button.getText());
                checkphoneLength();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a1Button.getText());
                checkphoneLength();
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a2Button.getText());
                checkphoneLength();
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a3Button.getText());
                checkphoneLength();
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a4Button.getText());
                checkphoneLength();
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a5Button.getText());
                checkphoneLength();
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a6Button.getText());
                checkphoneLength();
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a7Button.getText());
                checkphoneLength();
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a8Button.getText());
                checkphoneLength();
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Screen.setText(Screen.getText() + a9Button.getText());
                checkphoneLength();
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
        frame.setSize(370,500);
        frame.setVisible(true);
        call.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String phoneNumber = Screen.getText();
                JCheckBox checkBox = new JCheckBox(phoneNumber);
                Recent.add(checkBox);
                tabs.revalidate();
                tabs.repaint();
            }
        });
    }

    private void checkphoneLength() {
        if(Screen.getText().length() > 13){
            JOptionPane.showMessageDialog(null, "Phone Number Must be 10 characters long", "Invalid Format", JOptionPane.ERROR_MESSAGE);
            Screen.setText("");
        }
        if(Screen.getText().length() == 4){
            Screen.setText(Screen.getText() + ')');
        }
        if(Screen.getText().length() == 8){
            Screen.setText(Screen.getText() + '-');
        }
        if(Screen.getText().isEmpty()){
            Screen.setText("(");
        }
    }

    public static void main(String[] args) {
        new Book();
    }
}
