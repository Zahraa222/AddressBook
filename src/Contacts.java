import javax.swing.*;

public class Contacts {
    private JTabbedPane tabs;
    private JPanel main;
    private JTextField nameTextField;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JTextField emailTextField;
    private JSpinner Month;
    private JSpinner Year;
    private JSpinner Day;
    private JButton cancelButton;
    private JButton saveButton;

    public Contacts(){

        JFrame frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Contacts();
    }
}
