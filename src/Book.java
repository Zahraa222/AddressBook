import javax.swing.*;

public class Book {
    private JPanel main;
    private JTabbedPane tabs;
    private JPanel Favorite;
    private JPanel Recent;
    private JPanel Contacts;
    private JPanel Settings;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new Book().main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
