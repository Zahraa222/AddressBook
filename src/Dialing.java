import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialing {
    private JTabbedPane tabs;
    private JTextField Screen;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton Clear;
    private JButton button12;
    private JButton call;
    private JButton deleteButton;
    private JTable RecentCalls;
    private JPanel main;
    private JPanel Recent;
    private JPanel Keypad;
    public String phoneNumber;
    private DefaultTableModel tableModel;


    public Dialing() {
        checkphoneLength();

        String[] columnNames = {"Phone Number"};
        tableModel = new DefaultTableModel(columnNames, 0); // 0 rows initially
        RecentCalls.setRowHeight(50);
        RecentCalls.setBackground(new Color(203,148,153));
        RecentCalls.setModel(tableModel);


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


        call.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                phoneNumber = Screen.getText();
                tableModel.addRow(new Object[]{phoneNumber});
            }
        });
        JFrame frame = new JFrame();
        frame.setContentPane(main);
        frame.setBounds(200, 200, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(370, 500);
        frame.setVisible(true);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = RecentCalls.getSelectedRow();
                if (selectedRow != -1) {
                    // Remove the selected row from the model
                    tableModel.removeRow(selectedRow);
                    JOptionPane.showMessageDialog(null, "Selected Call History has been deleted");
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to delete.", "Invalid Request", JOptionPane.ERROR_MESSAGE);
                }
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
        new Dialing();
    }
}
