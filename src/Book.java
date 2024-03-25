import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book {
    private JPanel main;
    private JTabbedPane tabs;
    private JButton addNewContactButton;
    private JButton deleteContactButton;
    private JButton editContactButton;
    private JTable contactList;
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
    public DefaultTableModel tableModel;

    public Book(){

        String[] columnNames =  {"Name", "Phone Number", "Address", "Email", "Birthday"};
        tableModel = new DefaultTableModel(columnNames,0);
        contactList.setModel(tableModel);

        JFrame frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200,200,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,500);
        frame.setVisible(true);
        addNewContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contacts(Book.this);
            }
        });
        editContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = contactList.getSelectedRow();
                if (selectedRow >= 0) {
                    // Extract contact details from the selected row
                    String name = tableModel.getValueAt(selectedRow, 0).toString();
                    String phoneNumber = tableModel.getValueAt(selectedRow, 1).toString();
                    String address = tableModel.getValueAt(selectedRow, 2).toString();
                    String email = tableModel.getValueAt(selectedRow, 3).toString();
                    String birthday = tableModel.getValueAt(selectedRow, 4).toString();


                    new Contacts(Book.this);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a contact to edit.", "No Contact Selected", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        deleteContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteContact();
            }
        });
    }

    public void addContact(String[] contactInfo){
        tableModel.addRow(contactInfo);
    }

    public void deleteContact(){
        int selectedRow = contactList.getSelectedRow();
        if(selectedRow >= 0){
            tableModel.removeRow(selectedRow);
            JOptionPane.showMessageDialog(null, "Contact Deleted");
        }else{
            JOptionPane.showMessageDialog(null, "Please Select A Contact to Delete", "Invalid format", JOptionPane.ERROR_MESSAGE);
        }
    }


    public static void main(String[] args) {
        new Book();
    }
}
