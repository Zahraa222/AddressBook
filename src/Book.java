import javax.swing.*;

public class Book {
    private JPanel main;
    private JTabbedPane tabs;
    private JButton createNewContactButton;
    private JButton deleteContactButton;

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
    private JPanel Favorite;
    private JPanel Recent;
    private JPanel Contacts;
    private JPanel Settings;
    public String phoneNumber;


    public Book(){

        JFrame frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370,500);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Book();
    }
}
