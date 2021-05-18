package ro.unibuc.pao.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame {
    private JPanel rootPanel;

    private JTextArea helloTextArea;
    private JButton helloButton;
    private JLabel helloLabel;
    private JCheckBox helloCheckBox;

    public HelloWorld() {

        add(rootPanel);
//        setLayout(new FlowLayout());

//        JToggleButton button1 = new JToggleButton("Button 1", true);
//        getContentPane().add(button1);

        setSize(400, 400);
        setTitle("hello world");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        helloLabel.setText("Test");
        helloCheckBox.setSelected(true);

        helloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = helloTextArea.getText();
                if (!"".equals(text)) {
                    JOptionPane.showMessageDialog(rootPanel, text);
                } else {
                    JOptionPane.showMessageDialog(rootPanel, "No text :(");
                }

            }
        });
        helloCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = helloCheckBox.isSelected() ? "Checked" : "Unchecked";
                JOptionPane.showMessageDialog(rootPanel, text);
            }
        });
    }
}
