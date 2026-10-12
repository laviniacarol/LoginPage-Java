package gui;

import javax.swing.*;

import constants.CommonConstants;

public class LoginGUI extends JFrame {
    public LoginGUI(){
        super(CommonConstants.APP_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(CommonConstants.FRAME_SIZE[0], CommonConstants.FRAME_SIZE[1]);
    
        addGUIComponents();
    
    }


    public void addGUIComponents(){
        SpringLayout springLayout = new SpringLayout();
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(springLayout);

        JLabel usernamLabel = new JLabel("Usuario: ");
        JTextField usernamField = new JTextField(CommonConstants.TEXTFIELD_SIZE);
        loginPanel.add(usernamLabel);
        loginPanel.add(usernamField);

        this.getContentPane().add(loginPanel);
        
    }
}
