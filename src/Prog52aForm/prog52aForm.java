package Prog52aForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prog52aForm {
    private JPanel mainPanel;
    private JTextField txtLen;
    private JTextField txtWidth;
    private JButton calculateButton;
    private JButton clearButton;
    private JLabel lbllen;
    private JLabel lblArea;
    private JLabel lblPerim;

    public prog52aForm() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = Integer.parseInt(txtLen.getText());
                int width = Integer.parseInt(txtWidth.getText());

                int area = len * width;
                int perim = len*2 + width*2;

                lblArea.setText("Area: " + area);
                lblPerim.setText("Perimeter: " + perim);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblArea.setText("");
                lblPerim.setText("");
            }
        });

    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Prog52aForm");
        frame.setContentPane(new prog52aForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
