import java.awt.Color;
import java.awt.Cursor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class MyAccountView {

	private JFrame frame;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField address1TextField;
	private JTextField address2TextField;
	private JTextField townTextField;
	private JTextField postcodeTextField;
	private JTextField emailTextField;
	private JTextField phoneNoTextField;
	private JTextField cardNoTextField;
	private JTextField cvvTextField;
	private JTextField orgNameTextField;
	private JTextField orgEmailTextField;
	private JTextField webAddressTextField;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the window
	 */
	public MyAccountView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
	    frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton exitButton = new JButton("X");
        exitButton.setForeground(SystemColor.inactiveCaption);
        exitButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	int reply = JOptionPane.showConfirmDialog(null, "Are you sure?", "Exit?", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                  System.exit(0);
                }
            }
        });
        exitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
        exitButton.setBorderPainted(false);
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBounds(1205, 13, 63, 53);
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(exitButton);
        
        JButton minimizeButton = new JButton("___");
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
		
        JButton searchButton = new JButton("Search events");
        searchButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new HomePageView();
        		frame.setVisible(false);
        	}
        });
        searchButton.setForeground(SystemColor.inactiveCaption);
        searchButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        searchButton.setBounds(27, 173, 190, 53);
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setToolTipText("See upcoming or search for your favorite events");
        searchButton.setBorderPainted(false);
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(searchButton);
        
        
        JButton changePassButton = new JButton("Change Password");
        changePassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new ChangePasswordView();
            	frame.setVisible(false);
            }
        });
        changePassButton.setForeground(SystemColor.inactiveCaption);
        changePassButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        changePassButton.setOpaque(false);
        changePassButton.setContentAreaFilled(false);
        changePassButton.setBorderPainted(false);
        changePassButton.setToolTipText("Update security details");
        changePassButton.setBounds(27, 250, 204, 53);
        changePassButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(changePassButton);

        JButton bookingsButton = new JButton("My bookings");
        bookingsButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new BookingsHistoryView();
        		frame.setVisible(false);
        	}
        });
        bookingsButton.setForeground(SystemColor.inactiveCaption);
        bookingsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookingsButton.setOpaque(false);
        bookingsButton.setContentAreaFilled(false);
        bookingsButton.setBorderPainted(false);
        bookingsButton.setToolTipText("View your booked events");
        bookingsButton.setBounds(37, 328, 168, 53);
        bookingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(bookingsButton);
        
        JButton logOutButton = new JButton("Log Out");
        logOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new LoginView();
        		frame.setVisible(false);
        	}
        });
        logOutButton.setBounds(39, 408, 168, 53);
        logOutButton.setForeground(SystemColor.inactiveCaption);
        logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logOutButton.setOpaque(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setBorderPainted(false);
        logOutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(logOutButton);
		
		JLabel existDetailsLabel = new JLabel("Existing Details");
		existDetailsLabel.setForeground(SystemColor.inactiveCaption);
		existDetailsLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		existDetailsLabel.setBounds(285, 142, 142, 25);
		frame.getContentPane().add(existDetailsLabel);
		
		JComboBox<String> titleComboBox = new JComboBox<String>();
		titleComboBox.setBackground(SystemColor.activeCaption);
		titleComboBox.setToolTipText("");
		titleComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Mr.", "Ms."}));
		titleComboBox.setBounds(368, 209, 47, 22);
		frame.getContentPane().add(titleComboBox);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		firstNameTextField.setBackground(SystemColor.activeCaption);
		firstNameTextField.setBounds(366, 250, 162, 30);
		firstNameTextField.setColumns(10);
		frame.getContentPane().add(firstNameTextField);
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setForeground(SystemColor.inactiveCaption);
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		firstNameLabel.setBounds(285, 257, 69, 16);
		frame.getContentPane().add(firstNameLabel);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		lastNameTextField.setBackground(SystemColor.activeCaption);
		lastNameTextField.setBounds(682, 250, 162, 30);
		lastNameTextField.setColumns(10);
		frame.getContentPane().add(lastNameTextField);

		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setForeground(SystemColor.inactiveCaption);
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lastNameLabel.setBounds(601, 257, 69, 16);
		frame.getContentPane().add(lastNameLabel);
		
		address1TextField = new JTextField();
		address1TextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		address1TextField.setBackground(SystemColor.activeCaption);
		address1TextField.setBounds(366, 291, 162, 30);
		address1TextField.setColumns(10);
		frame.getContentPane().add(address1TextField);

		
		JLabel address1Label = new JLabel("Address 1");
		address1Label.setBounds(285, 294, 69, 16);
		address1Label.setForeground(SystemColor.inactiveCaption);
		address1Label.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(address1Label);
		
		address2TextField = new JTextField();
		address2TextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		address2TextField.setBounds(682, 291, 162, 30);
		address2TextField.setBackground(SystemColor.activeCaption);
		address2TextField.setColumns(10);
		frame.getContentPane().add(address2TextField);

		
		JLabel address2Label = new JLabel("Address 2");
		address2Label.setForeground(SystemColor.inactiveCaption);
		address2Label.setFont(new Font("Tahoma", Font.BOLD, 13));
		address2Label.setBounds(601, 294, 69, 16);
		frame.getContentPane().add(address2Label);
		
		townTextField = new JTextField();
		townTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		townTextField.setBackground(SystemColor.activeCaption);
		townTextField.setBounds(366, 334, 162, 30);
		townTextField.setColumns(10);
		frame.getContentPane().add(townTextField);
		
		JLabel townLabel = new JLabel("Town");
		townLabel.setBounds(320, 341, 34, 16);
		townLabel.setForeground(SystemColor.inactiveCaption);
		townLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(townLabel);
		
		postcodeTextField = new JTextField();
		postcodeTextField.setBounds(682, 334, 162, 30);
		postcodeTextField.setBorder(new MatteBorder(3,3,3,3, (Color)SystemColor.activeCaption));
		postcodeTextField.setBackground(SystemColor.activeCaption);
		postcodeTextField.setColumns(10);
		frame.getContentPane().add(postcodeTextField);
		
		JLabel postcodeLabel = new JLabel("Postcode");
		postcodeLabel.setBounds(610, 341, 60, 16);
		postcodeLabel.setForeground(SystemColor.inactiveCaption);
		postcodeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(postcodeLabel);
		
		emailTextField = new JTextField();
		emailTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		emailTextField.setBounds(366, 377, 162, 30);
		emailTextField.setBackground(SystemColor.activeCaption);
		emailTextField.setColumns(10);
		frame.getContentPane().add(emailTextField);
		
		JLabel emailLabel = new JLabel("E-mail");
		emailLabel.setBounds(316, 382, 38, 20);
		emailLabel.setForeground(SystemColor.inactiveCaption);
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(emailLabel);
		
		phoneNoTextField = new JTextField();
		phoneNoTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		phoneNoTextField.setBounds(682, 377, 162, 30);
		phoneNoTextField.setBackground(SystemColor.activeCaption);
		phoneNoTextField.setColumns(10);
		frame.getContentPane().add(phoneNoTextField);

		
		JLabel phoneLabel = new JLabel("Phone No");
		phoneLabel.setBounds(610, 382, 60, 20);
		phoneLabel.setForeground(SystemColor.inactiveCaption);
		phoneLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(phoneLabel);
		
		cardNoTextField = new JTextField();
		cardNoTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		cardNoTextField.setBounds(366, 420, 162, 30);
		cardNoTextField.setBackground(SystemColor.activeCaption);
		cardNoTextField.setColumns(10);
		frame.getContentPane().add(cardNoTextField);

		
		JLabel cardNoLabel = new JLabel("Card No");
		cardNoLabel.setBounds(304, 427, 50, 16);
		cardNoLabel.setForeground(SystemColor.inactiveCaption);
		cardNoLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(cardNoLabel);
		
		cvvTextField = new JTextField();
		cvvTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		cvvTextField.setBounds(682, 420, 162, 30);
		cvvTextField.setBackground(SystemColor.activeCaption);
		cvvTextField.setColumns(10);
		frame.getContentPane().add(cvvTextField);

		
		JLabel cvvLabel = new JLabel("CVV");
		cvvLabel.setForeground(SystemColor.inactiveCaption);
		cvvLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		cvvLabel.setBounds(644, 427, 26, 16);
		frame.getContentPane().add(cvvLabel);
		
		
		
		orgNameTextField = new JTextField();
		orgNameTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		orgNameTextField.setBounds(1048, 250, 162, 30);
		orgNameTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		orgNameTextField.setBackground(SystemColor.activeCaption);
		orgNameTextField.setColumns(10);
		frame.getContentPane().add(orgNameTextField);
		
		JLabel orgNameLabel = new JLabel("Organization Name");
		orgNameLabel.setBounds(915, 256, 121, 16);
		orgNameLabel.setForeground(SystemColor.inactiveCaption);
		orgNameLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(orgNameLabel);
		
		orgEmailTextField = new JTextField();
		orgEmailTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		orgEmailTextField.setBounds(1048, 291, 162, 30);
		orgEmailTextField.setBackground(SystemColor.activeCaption);
		orgEmailTextField.setColumns(10);
		frame.getContentPane().add(orgEmailTextField);
		
		JLabel orgEmailLabel = new JLabel("Organization E-mail");
		orgEmailLabel.setBounds(912, 298, 124, 16);
		orgEmailLabel.setForeground(SystemColor.inactiveCaption);
		orgEmailLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(orgEmailLabel);
		
		JComboBox<String> paymentComboBox = new JComboBox<String>();
		paymentComboBox.setBackground(SystemColor.activeCaption);
		paymentComboBox.setToolTipText("");
		paymentComboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"On Booking", "Monthly Invoice"}));
		paymentComboBox.setBounds(1048, 334, 162, 30);
		frame.getContentPane().add(paymentComboBox);
		
		JLabel paymentLabel = new JLabel("Payment Method");
		paymentLabel.setBounds(926, 341, 110, 16);
		paymentLabel.setForeground(SystemColor.inactiveCaption);
		paymentLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(paymentLabel);
		
		webAddressTextField = new JTextField();
		webAddressTextField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
		webAddressTextField.setBackground(SystemColor.activeCaption);
		webAddressTextField.setBounds(1048, 377, 162, 30);
		webAddressTextField.setColumns(10);
		frame.getContentPane().add(webAddressTextField);
		
		JLabel webAddressLabel = new JLabel("Web Address");
		webAddressLabel.setBounds(948, 384, 88, 16);
		webAddressLabel.setForeground(SystemColor.inactiveCaption);
		webAddressLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(webAddressLabel);
		
		if (User.getType(User.username).equalsIgnoreCase("Customer")) {
			orgNameTextField.setVisible(false);
			orgNameLabel.setVisible(false);
			orgEmailTextField.setVisible(false);
			orgEmailLabel.setVisible(false);
			paymentComboBox.setVisible(false);
			paymentLabel.setVisible(false);
			webAddressTextField.setVisible(false);
			webAddressLabel.setVisible(false);
		}
		
		ArrayList<String> details = User.detailsList(User.username);
		titleComboBox.setSelectedItem(details.get(0));
		firstNameTextField.setText(details.get(1));
		lastNameTextField.setText(details.get(2));
		address1TextField.setText(details.get(3));
		address2TextField.setText(details.get(4));
		townTextField.setText(details.get(5));
		postcodeTextField.setText(details.get(6));
		emailTextField.setText(details.get(7));
		phoneNoTextField.setText(details.get(8));
		cardNoTextField.setText(details.get(9));
		cvvTextField.setText(details.get(10));
		orgNameTextField.setText(details.get(11));
		orgEmailTextField.setText(details.get(12));
		paymentComboBox.setSelectedItem(details.get(13));
		webAddressTextField.setText(details.get(14));
		


		
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User.updateDetails(User.username, titleComboBox.getSelectedItem().toString(), firstNameTextField.getText(), lastNameTextField.getText(), address1TextField.getText()
						, address2TextField.getText(), townTextField.getText(), postcodeTextField.getText(), emailTextField.getText(), phoneNoTextField.getText()
						, Long.parseLong(cardNoTextField.getText()), Integer.parseInt(cvvTextField.getText()), orgNameTextField.getText(), orgEmailTextField.getText(), webAddressTextField.getText(),
						paymentComboBox.getSelectedItem().toString());
				JOptionPane.showMessageDialog(null,"Update succesfull!");
			}
		});
		saveButton.setBounds(747, 507, 97, 25);
		saveButton.setOpaque(false);
		saveButton.setContentAreaFilled(false);
        saveButton.setBorderPainted(false);
        saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        saveButton.setForeground(SystemColor.inactiveCaption);
        saveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        frame.getContentPane().add(saveButton);
		
		JSeparator saveSeparator = new JSeparator();
		saveSeparator.setBackground(SystemColor.inactiveCaption);
		saveSeparator.setOpaque(true);
		saveSeparator.setBounds(757, 532, 80, 3);
		frame.getContentPane().add(saveSeparator);
		
		JLabel titleLabel = new JLabel("Title");
		titleLabel.setBounds(322, 212, 34, 16);
		titleLabel.setForeground(SystemColor.inactiveCaption);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(titleLabel);
		
		JSeparator separator = new JSeparator();
        separator.setBackground(SystemColor.inactiveCaption);
        separator.setOpaque(true);
        separator.setBounds(45, 212, 162, 3);
        frame.getContentPane().add(separator);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(SystemColor.inactiveCaption);
        separator_2.setOpaque(true);
        separator_2.setBounds(41, 288, 165, 3);
        frame.getContentPane().add(separator_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setOpaque(true);
        separator_3.setBackground(SystemColor.inactiveCaption);
        separator_3.setBounds(60, 365, 130, 3);
        frame.getContentPane().add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(SystemColor.inactiveCaption);
        separator_4.setOpaque(true);
        separator_4.setBounds(72, 447, 100, 3);
        frame.getContentPane().add(separator_4);
        
        JLabel emailInUseLabel = new JLabel("Email already exists");
        emailInUseLabel.setForeground(Color.RED);
        emailInUseLabel.setBounds(366, 405, 162, 16);
        frame.getContentPane().add(emailInUseLabel);
        emailInUseLabel.setVisible(false);
        
        JLabel invalidCardNoLabel = new JLabel("Invalid Number");
        invalidCardNoLabel.setForeground(Color.RED);
        invalidCardNoLabel.setBounds(368, 450, 100, 16);
        frame.getContentPane().add(invalidCardNoLabel);
        invalidCardNoLabel.setVisible(false);
        
        JLabel invalidCVVLabel = new JLabel("Invalid Number");
        invalidCVVLabel.setForeground(Color.RED);
        invalidCVVLabel.setBounds(682, 450, 100, 16);
        frame.getContentPane().add(invalidCVVLabel);
        invalidCVVLabel.setVisible(false);
        
        JLabel lblLogo = new JLabel();
        lblLogo.setIcon(new ImageIcon(LoginView.class.getResource("Images/Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);
		
		JLabel backgroundLabel = new JLabel("New label");
		backgroundLabel.setBounds(0, 0, 1280, 690);
        backgroundLabel.setIcon(new ImageIcon(HomePageView.class.getResource("Images/Silhouette-Rock-Concert-Wallpaper1.jpg")));
        frame.getContentPane().add(backgroundLabel);
	}
}