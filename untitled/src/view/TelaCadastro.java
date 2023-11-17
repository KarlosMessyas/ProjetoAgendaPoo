package view;

import javax.swing.*;

public class TelaCadastro extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JLabel label1;

    public TelaCadastro() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    private void createUIComponents() {
        label1 = new JLabel();
        ImageIcon imageIcon = new ImageIcon("17004.png");
        label1.setIcon(imageIcon);
    }
}
