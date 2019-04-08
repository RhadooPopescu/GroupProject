import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JSeparator;

public class Register {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;

    /**
     * Launch the application.
     */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Register window = new Register();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

    /**
     * Create the application.
     */
    public Register() {
        initialize();
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
        frame.getContentPane().setForeground(new Color(128, 128, 128));
        frame.setResizable(false);
        frame.setTitle("Global Music");
        frame.setBounds(100, 100, 1280, 690);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);



        JButton btnExitButton = new JButton("X");
        btnExitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnExitButton.setForeground(SystemColor.inactiveCaption);
        btnExitButton.setBounds(1205, 13, 63, 53);
        btnExitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnExitButton.setOpaque(false);
        btnExitButton.setBorderPainted(false);
        btnExitButton.setContentAreaFilled(false);
        frame.getContentPane().add(btnExitButton);
        
        
        JButton minimizeButton = new JButton("___");
        minimizeButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        minimizeButton.setForeground(SystemColor.inactiveCaption);
        minimizeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                frame.setExtendedState(JFrame.ICONIFIED);
            }
        });
        minimizeButton.setOpaque(false);
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setBorderPainted(false);
        minimizeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        minimizeButton.setBounds(1154, 20, 63, 38);
        frame.getContentPane().add(minimizeButton);



        JLabel lblTitle = new JLabel("Title");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblTitle.setForeground(SystemColor.inactiveCaption);
        lblTitle.setBounds(38, 66, 56, 16);
        frame.getContentPane().add(lblTitle);
        lblTitle.setVisible(true);


        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setBackground(SystemColor.activeCaption);
        comboBox.setToolTipText("");
        comboBox.setMaximumRowCount(2);
        comboBox.setBounds(119, 67, 56, 17);
        comboBox.addItem("Mr");
        comboBox.addItem("Ms");
        frame.getContentPane().add(comboBox);
        comboBox.setVisible(true);


        JLabel lblFirstName = new JLabel("First Name *");
        lblFirstName.setForeground(SystemColor.inactiveCaption);
        lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblFirstName.setBounds(38, 130, 82, 16);
        frame.getContentPane().add(lblFirstName);
        lblFirstName.setVisible(true);


        textField = new JTextField();
        textField.setBackground(SystemColor.activeCaption);
        textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField.setBounds(119, 129, 150, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        textField.setVisible(true);


        JLabel lblLastName = new JLabel("Last Name *");
        lblLastName.setForeground(SystemColor.inactiveCaption);
        lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblLastName.setBounds(301, 130, 82, 16);
        frame.getContentPane().add(lblLastName);
        lblLastName.setVisible(true);


        textField_1 = new JTextField();
        textField_1.setBackground(SystemColor.activeCaption);
        textField_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_1.setBounds(393, 129, 150, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);
        textField_1.setVisible(true);


        JLabel lblAddressOne = new JLabel("Address 1 *");
        lblAddressOne.setForeground(SystemColor.inactiveCaption);
        lblAddressOne.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAddressOne.setBounds(38, 200, 100, 16);
        frame.getContentPane().add(lblAddressOne);
        lblAddressOne.setVisible(true);


        textField_2 = new JTextField();
        textField_2.setBackground(SystemColor.activeCaption);
        textField_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_2.setBounds(119, 199, 150, 20);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        textField_2.setVisible(true);


        JLabel lblAddressTwo = new JLabel("Address 2");
        lblAddressTwo.setForeground(SystemColor.inactiveCaption);
        lblAddressTwo.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAddressTwo.setBounds(301, 200, 82, 16);
        frame.getContentPane().add(lblAddressTwo);
        lblAddressTwo.setVisible(true);


        textField_3 = new JTextField();
        textField_3.setBackground(SystemColor.activeCaption);
        textField_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_3.setBounds(393, 199, 150, 20);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);
        textField_3.setVisible(true);


        JLabel lblTown = new JLabel("Town *");
        lblTown.setForeground(SystemColor.inactiveCaption);
        lblTown.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblTown.setBounds(38, 269, 71, 16);
        frame.getContentPane().add(lblTown);
        lblTown.setVisible(true);


        textField_4 = new JTextField();
        textField_4.setBackground(SystemColor.activeCaption);
        textField_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_4.setBounds(119, 268, 150, 20);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        textField_4.setVisible(true);


        JLabel lblPostCode = new JLabel("Post Code *");
        lblPostCode.setForeground(SystemColor.inactiveCaption);
        lblPostCode.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPostCode.setBounds(301, 269, 82, 16);
        frame.getContentPane().add(lblPostCode);
        lblPostCode.setVisible(true);


        textField_5 = new JTextField();
        textField_5.setBackground(SystemColor.activeCaption);
        textField_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_5.setBounds(393, 268, 150, 20);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);
        textField_5.setVisible(true);


        JLabel lblEmail = new JLabel("E-mail *");
        lblEmail.setForeground(SystemColor.inactiveCaption);
        lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblEmail.setBounds(38, 344, 56, 14);
        frame.getContentPane().add(lblEmail);
        lblEmail.setVisible(true);


        textField_6 = new JTextField();
        textField_6.setBackground(SystemColor.activeCaption);
        textField_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_6.setBounds(119, 342, 150, 20);
        frame.getContentPane().add(textField_6);
        textField_6.setColumns(10);
        textField_6.setVisible(true);


        JLabel lblPhoneNo = new JLabel("Phone No");
        lblPhoneNo.setForeground(SystemColor.inactiveCaption);
        lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPhoneNo.setBounds(301, 344, 71, 14);
        frame.getContentPane().add(lblPhoneNo);
        lblPhoneNo.setVisible(true);


        textField_7 = new JTextField();
        textField_7.setBackground(SystemColor.activeCaption);
        textField_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_7.setBounds(393, 342, 150, 20);
        frame.getContentPane().add(textField_7);
        textField_7.setColumns(10);
        textField_7.setVisible(true);


        JLabel lblUsername = new JLabel("Username *");
        lblUsername.setForeground(SystemColor.inactiveCaption);
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblUsername.setBounds(38, 418, 100, 14);
        frame.getContentPane().add(lblUsername);
        lblUsername.setVisible(true);


        textField_8 = new JTextField();
        textField_8.setBackground(SystemColor.activeCaption);
        textField_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_8.setBounds(119, 416, 150, 20);
        frame.getContentPane().add(textField_8);
        textField_8.setColumns(10);
        textField_8.setVisible(true);


        JLabel lblPassword = new JLabel("Password *");
        lblPassword.setForeground(SystemColor.inactiveCaption);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPassword.setBounds(38, 496, 100, 14);
        frame.getContentPane().add(lblPassword);
        lblPassword.setVisible(true);


        textField_9 = new JTextField();
        textField_9.setBackground(SystemColor.activeCaption);
        textField_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_9.setBounds(119, 494, 150, 20);
        frame.getContentPane().add(textField_9);
        textField_9.setColumns(10);
        textField_9.setVisible(true);


        JLabel lblConfirmPassword = new JLabel("Conf Password *");
        lblConfirmPassword.setForeground(SystemColor.inactiveCaption);
        lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblConfirmPassword.setBounds(283, 496, 124, 14);
        frame.getContentPane().add(lblConfirmPassword);
        lblConfirmPassword.setVisible(true);


        textField_10 = new JTextField();
        textField_10.setBackground(SystemColor.activeCaption);
        textField_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_10.setBounds(393, 494, 150, 20);
        frame.getContentPane().add(textField_10);
        textField_10.setColumns(10);
        textField_10.setVisible(true);


        JLabel lblEmailAllreadyExists = new JLabel("Email Allready Exists");
        lblEmailAllreadyExists.setForeground(Color.RED);
        lblEmailAllreadyExists.setBounds(119, 361, 124, 14);
        frame.getContentPane().add(lblEmailAllreadyExists);
        lblEmailAllreadyExists.setVisible(false);


        JLabel lblBetweenAnd = new JLabel("(between 5 and 16 characters)");
        lblBetweenAnd.setForeground(SystemColor.inactiveCaption);
        lblBetweenAnd.setBounds(108, 475, 188, 14);
        frame.getContentPane().add(lblBetweenAnd);
        lblBetweenAnd.setVisible(true);


        JLabel lblUsernameAllreadyExists = new JLabel("Username Allready Exists");
        lblUsernameAllreadyExists.setForeground(Color.RED);
        lblUsernameAllreadyExists.setBounds(119, 437, 150, 14);
        frame.getContentPane().add(lblUsernameAllreadyExists);
        lblUsernameAllreadyExists.setVisible(false);


        JLabel lblIncorrectPassword = new JLabel("Incorrect Password");
        lblIncorrectPassword.setForeground(Color.RED);
        lblIncorrectPassword.setBounds(119, 513, 124, 14);
        frame.getContentPane().add(lblIncorrectPassword);
        lblIncorrectPassword.setVisible(false);


        JLabel lblIncorrectPassword_1 = new JLabel("Incorrect Password");
        lblIncorrectPassword_1.setForeground(Color.RED);
        lblIncorrectPassword_1.setBounds(393, 513, 137, 14);
        frame.getContentPane().add(lblIncorrectPassword_1);
        lblIncorrectPassword_1.setVisible(false);


        JLabel lblOrganizationName = new JLabel("Organization Name *");
        lblOrganizationName.setForeground(SystemColor.inactiveCaption);
        lblOrganizationName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblOrganizationName.setBounds(628, 194, 188, 20);
        frame.getContentPane().add(lblOrganizationName);
        lblOrganizationName.setVisible(false);


        JLabel lblOrganizationEmail = new JLabel("Organization Email");
        lblOrganizationEmail.setForeground(SystemColor.inactiveCaption);
        lblOrganizationEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblOrganizationEmail.setBounds(958, 196, 129, 17);
        frame.getContentPane().add(lblOrganizationEmail);
        lblOrganizationEmail.setVisible(false);


        JLabel lblPaymentMethod = new JLabel("Payment Method");
        lblPaymentMethod.setForeground(SystemColor.inactiveCaption);
        lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblPaymentMethod.setBounds(965, 267, 137, 14);
        frame.getContentPane().add(lblPaymentMethod);
        lblPaymentMethod.setVisible(false);


        JLabel lblWebAddress = new JLabel("Web Address");
        lblWebAddress.setForeground(SystemColor.inactiveCaption);
        lblWebAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblWebAddress.setBounds(628, 267, 124, 14);
        frame.getContentPane().add(lblWebAddress);
        lblWebAddress.setVisible(false);


        JLabel lblCardNumber = new JLabel("Card Number *");
        lblCardNumber.setForeground(SystemColor.inactiveCaption);
        lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblCardNumber.setBounds(10, 565, 110, 14);
        frame.getContentPane().add(lblCardNumber);
        lblCardNumber.setVisible(true);


        JLabel lblCvv = new JLabel("CVV *");
        lblCvv.setForeground(SystemColor.inactiveCaption);
        lblCvv.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblCvv.setBounds(330, 565, 56, 14);
        frame.getContentPane().add(lblCvv);
        lblCvv.setVisible(true);


        textField_11 = new JTextField();
        textField_11.setBackground(SystemColor.activeCaption);
        textField_11.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_11.setBounds(771, 195, 150, 20);
        frame.getContentPane().add(textField_11);
        textField_11.setColumns(10);
        textField_11.setVisible(false);


        textField_12 = new JTextField();
        textField_12.setBackground(SystemColor.activeCaption);
        textField_12.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_12.setBounds(1097, 195, 150, 20);
        frame.getContentPane().add(textField_12);
        textField_12.setColumns(10);
        textField_12.setVisible(false);


        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setBackground(SystemColor.activeCaption);
        comboBox_1.setBounds(1096, 265, 151, 20);
        comboBox_1.setMaximumRowCount(2);
        comboBox_1.addItem("On Booking");
        comboBox_1.addItem("Monthly Invoice");
        frame.getContentPane().add(comboBox_1);
        comboBox_1.setVisible(false);


        textField_13 = new JTextField();
        textField_13.setBackground(SystemColor.activeCaption);
        textField_13.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_13.setBounds(119, 563, 150, 20);
        frame.getContentPane().add(textField_13);
        textField_13.setColumns(10);
        textField_13.setVisible(true);


        textField_14 = new JTextField();
        textField_14.setBackground(SystemColor.activeCaption);
        textField_14.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_14.setBounds(393, 563, 150, 20);
        frame.getContentPane().add(textField_14);
        textField_14.setColumns(10);
        textField_14.setVisible(true);

        textField_15 = new JTextField();
        textField_15.setBackground(SystemColor.activeCaption);
        textField_15.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField_15.setBounds(771, 265, 150, 20);
        frame.getContentPane().add(textField_15);
        textField_15.setColumns(10);
        textField_15.setVisible(false);


        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Corporate Organization");
        chckbxNewCheckBox_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
        chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
        chckbxNewCheckBox_1.setForeground(SystemColor.inactiveCaptionBorder);
        chckbxNewCheckBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        chckbxNewCheckBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(chckbxNewCheckBox_1.isSelected()) {
                    lblOrganizationName.setVisible(true);
                    textField_11.setVisible(true);
                    lblOrganizationEmail.setVisible(true);
                    textField_12.setVisible(true);
                    lblPaymentMethod.setVisible(true);
                    comboBox_1.setVisible(true);
                    lblWebAddress.setVisible(true);
                    textField_15.setVisible(true);
                }
                else {
                    lblOrganizationName.setVisible(false);
                    textField_11.setVisible(false);
                    lblOrganizationEmail.setVisible(false);
                    textField_12.setVisible(false);
                    lblPaymentMethod.setVisible(false);
                    comboBox_1.setVisible(false);
                    lblWebAddress.setVisible(false);
                    textField_15.setVisible(false);
                }
            }
        });
        chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        chckbxNewCheckBox_1.setBounds(771, 129, 188, 23);
        frame.getContentPane().add(chckbxNewCheckBox_1);
        chckbxNewCheckBox_1.setVisible(true);



        JButton btnRegisterButton = new JButton("Register");
        btnRegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new AdminView();
                //frame.setVisible(false);
            }
        });
        btnRegisterButton.setForeground(SystemColor.inactiveCaption);
        btnRegisterButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnRegisterButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegisterButton.setOpaque(false);
        btnRegisterButton.setBorderPainted(false);
        btnRegisterButton.setContentAreaFilled(false);
        btnRegisterButton.setBounds(981, 516, 120, 40);
        frame.getContentPane().add(btnRegisterButton);
        btnRegisterButton.setVisible(true);


        JButton btnCancelButton = new JButton("Cancel");
        btnCancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new LoginPage();
                frame.setVisible(false);
            }
        });
        btnCancelButton.setBounds(766, 516, 120, 40);
        btnCancelButton.setForeground(SystemColor.inactiveCaption);
        btnCancelButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCancelButton.setOpaque(false);
        btnCancelButton.setBorderPainted(false);
        btnCancelButton.setContentAreaFilled(false);
        frame.getContentPane().add(btnCancelButton);
        btnCancelButton.setVisible(true);


        JLabel lblTitleLabel = new JLabel("Please fill in all the fields marked with *");
        lblTitleLabel.setForeground(SystemColor.activeCaption);
        lblTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTitleLabel.setBounds(38, 23, 638, 32);
        frame.getContentPane().add(lblTitleLabel);
        lblTitleLabel.setVisible(true);


        JLabel lblInvalidNumber = new JLabel("Invalid Number");
        lblInvalidNumber.setForeground(Color.RED);
        lblInvalidNumber.setBounds(119, 582, 100, 14);
        frame.getContentPane().add(lblInvalidNumber);
        lblInvalidNumber.setVisible(false);


        JLabel lblInvalidNumber_1 = new JLabel("Invalid Number");
        lblInvalidNumber_1.setForeground(Color.RED);
        lblInvalidNumber_1.setBounds(393, 582, 110, 14);
        frame.getContentPane().add(lblInvalidNumber_1);
        lblInvalidNumber_1.setVisible(false);


        JLabel lblAllFields = new JLabel("All * fields are required !");
        lblAllFields.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAllFields.setForeground(Color.RED);
        lblAllFields.setBounds(976, 561, 214, 14);
        frame.getContentPane().add(lblAllFields);
        lblAllFields.setVisible(false);


        JSeparator separator = new JSeparator();
        separator.setBounds(786, 549, 90, 3);
        separator.setBackground(SystemColor.inactiveCaption);
        separator.setForeground(SystemColor.inactiveCaption);
        separator.setOpaque(true);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(993, 549, 100, 3);
        separator_1.setBackground(SystemColor.inactiveCaption);
        separator_1.setForeground(SystemColor.inactiveCaption);
        separator_1.setOpaque(true);
        frame.getContentPane().add(separator_1);
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginPage.class.getResource("Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);


        JLabel lblImageLabel = new JLabel("Image");
        lblImageLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblImageLabel.setForeground(Color.BLACK);
        lblImageLabel.setIcon(new ImageIcon("C:\\Users\\Rhadoo\\IdeaProjects\\GlobalMusic\\src\\Silhouette-Rock-Concert-Wallpaper1.jpg"));
        lblImageLabel.setBounds(0, 0, 1297, 693);
        frame.getContentPane().add(lblImageLabel);


    }
}
