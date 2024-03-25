import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.util.Calendar;



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
    private Book book;
    private JFrame frame;

    public Contacts(Book book){
        this.book = book;
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        SpinnerListModel monthlist =new SpinnerListModel(months);
        Month.setModel(monthlist);

        SpinnerNumberModel dayModel = new SpinnerNumberModel(1,1,31,1);
        Day.setModel(dayModel);

        int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);
        SpinnerNumberModel yearModel = new SpinnerNumberModel(CurrentYear, CurrentYear - 100, CurrentYear + 100, 1);
        Year.setModel(yearModel);

        frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,300);
        frame.setVisible(true);



        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String phoneNumber = phoneTextField.getText();
                String address = addressTextField.getText();
                String email = emailTextField.getText();
                String birthdate =  Month.getValue().toString() + " " + Day.getValue().toString() + ", " + Year.getValue().toString();

                String[] contactInfo = {name, phoneNumber, address, email, birthdate};
                book.addContact(contactInfo);

            }
        });




    }
}
