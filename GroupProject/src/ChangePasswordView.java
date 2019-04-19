import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;

public class ChangePasswordView {

	private JFrame frame;
	private JPasswordField oldPassField;
	private JPasswordField newPassField;
	private JPasswordField confPassField;

	/**
	 * Create the window
	 */
	public ChangePasswordView() {
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
		
		JLabel changePassLabel = new JLabel("Account Security");
		changePassLabel.setForeground(SystemColor.inactiveCaption);
		changePassLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		changePassLabel.setBounds(372, 180, 197, 38);
		frame.getContentPane().add(changePassLabel);
		
		JButton searchButton = new JButton("Search events");
		searchButton.setToolTipText("See upcoming or search for your favorite events");
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
        searchButton.setBorderPainted(false);
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(searchButton);

        JButton myAccountButton = new JButton("My Account");
        myAccountButton.setToolTipText("Edit your personal details");
        myAccountButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new MyAccountView();
        		frame.setVisible(false);
        	}
        });
        myAccountButton.setForeground(SystemColor.inactiveCaption);
        myAccountButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        myAccountButton.setOpaque(false);
        myAccountButton.setContentAreaFilled(false);
        myAccountButton.setBorderPainted(false);
        myAccountButton.setBounds(27, 253, 190, 53);
        myAccountButton.setToolTipText("Refresh your 'events memory'");
        myAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(myAccountButton);

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
        bookingsButton.setBounds(37, 341, 168, 53);
        bookingsButton.setToolTipText("View your booked events");
        bookingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(bookingsButton);
        
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
        
        JButton logOutButton = new JButton("Log Out");
        logOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new LoginView();
        		frame.setVisible(false);
        	}
        });
        logOutButton.setBounds(39, 421, 168, 53);
        logOutButton.setForeground(SystemColor.inactiveCaption);
        logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logOutButton.setOpaque(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setBorderPainted(false);
        logOutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(logOutButton);
        
        JLabel oldPassLabel = new JLabel("Old Password");
        oldPassLabel.setForeground(SystemColor.inactiveCaption);
        oldPassLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        oldPassLabel.setBounds(401, 275, 87, 16);
        frame.getContentPane().add(oldPassLabel);
        
        JLabel incorrectPassLabel = new JLabel("* incorrect password");
        incorrectPassLabel.setForeground(Color.RED);
        incorrectPassLabel.setBounds(514, 253, 124, 16);
        frame.getContentPane().add(incorrectPassLabel);
        incorrectPassLabel.setVisible(false);
        
        oldPassField = new JPasswordField();
        oldPassField.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {}
        	
        	@Override
        	public void focusLost(FocusEvent e) {
        		if (!(User.getPass(User.username).equals(String.valueOf(oldPassField.getPassword()))))
        			incorrectPassLabel.setVisible(true);
        		else
        			incorrectPassLabel.setVisible(false);
        	}
        });
        oldPassField.setBounds(500, 272, 152, 22);
        oldPassField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
        oldPassField.setBackground(SystemColor.activeCaption);
        frame.getContentPane().add(oldPassField);
        
        JLabel newPassLabel = new JLabel("New Password");
        newPassLabel.setBounds(394, 320, 94, 16);
        newPassLabel.setForeground(SystemColor.inactiveCaption);
        newPassLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        frame.getContentPane().add(newPassLabel);
        
        JLabel lblBetween5and16 = new JLabel("between 5 and 16 characters");
        lblBetween5and16.setForeground(SystemColor.inactiveCaption);
        lblBetween5and16.setBounds(492, 300, 179, 16);
        frame.getContentPane().add(lblBetween5and16);
        
        newPassField = new JPasswordField();
        newPassField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {}

            @Override
            public void focusLost(FocusEvent e) {
                if (newPassField.getPassword().length < 5 | newPassField.getPassword().length > 15)
                	lblBetween5and16.setForeground(Color.RED);
                else
                	lblBetween5and16.setForeground(SystemColor.inactiveCaption);
            }
        });
        newPassField.setBounds(500, 317, 152, 22);
        newPassField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
        newPassField.setBackground(SystemColor.activeCaption);
        frame.getContentPane().add(newPassField);
        
        JLabel confPassLabel = new JLabel("Confirm Password");
        confPassLabel.setBounds(372, 366, 116, 16);
        confPassLabel.setForeground(SystemColor.inactiveCaption);
        confPassLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        frame.getContentPane().add(confPassLabel);
        
        JLabel passDontMatchLabel = new JLabel("* passwords don't match");
        passDontMatchLabel.setForeground(Color.RED);
        passDontMatchLabel.setBounds(503, 385, 152, 16);
        frame.getContentPane().add(passDontMatchLabel);
        passDontMatchLabel.setVisible(false);
        
        confPassField = new JPasswordField();
        confPassField.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {}
        	
        	@Override
        	public void focusLost(FocusEvent e) {
        		if (!(String.valueOf(newPassField.getPassword()).equals(String.valueOf(confPassField.getPassword()))))
    				passDontMatchLabel.setVisible(true);
        		else 
        			passDontMatchLabel.setVisible(false);
        	}
        });
        confPassField.setBounds(500, 363, 152, 22);
        confPassField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
        confPassField.setBackground(SystemColor.activeCaption);
        frame.getContentPane().add(confPassField);
        
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if (String.valueOf(oldPassField.getPassword()).equals(User.getPass(User.username)) && String.valueOf(newPassField.getPassword()).equals(
        				String.copyValueOf(confPassField.getPassword()))) {
    				User.updatePass(newPassField.getPassword().toString().replace("'", "''"), User.username);
    				JOptionPane.showMessageDialog(null,"Password changed!");
        		}
        		
        	}
        });
        saveButton.setBounds(527, 428, 97, 25);
        saveButton.setForeground(SystemColor.inactiveCaption);
        saveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        saveButton.setOpaque(false);
        saveButton.setContentAreaFilled(false);
        saveButton.setBorderPainted(false);
        saveButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(saveButton);
        
        JSeparator saveSeparator = new JSeparator();
        saveSeparator.setForeground(SystemColor.text);
        saveSeparator.setBackground(SystemColor.inactiveCaption);
        saveSeparator.setOpaque(true);
        saveSeparator.setBounds(537, 452, 78, 3);
        frame.getContentPane().add(saveSeparator);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(SystemColor.inactiveCaption);
        separator.setOpaque(true);
        separator.setBounds(45, 212, 162, 3);
        frame.getContentPane().add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(SystemColor.inactiveCaption);
        separator_1.setOpaque(true);
        separator_1.setBounds(60, 291, 125, 3);
        frame.getContentPane().add(separator_1);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setOpaque(true);
        separator_3.setBackground(SystemColor.inactiveCaption);
        separator_3.setBounds(57, 379, 130, 3);
        frame.getContentPane().add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(SystemColor.inactiveCaption);
        separator_4.setOpaque(true);
        separator_4.setBounds(72, 460, 100, 3);
        frame.getContentPane().add(separator_4);
        
        
        
        JLabel label = new JLabel("* passwords don't match");
        label.setForeground(Color.RED);
        label.setBounds(503, 385, 152, 16);
        frame.getContentPane().add(label);
        label.setVisible(false);   
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginView.class.getResource("Images/Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);
        
        JLabel backgroundLabel = new JLabel("New label");
        backgroundLabel.setBounds(0, 0, 1280, 690);
        backgroundLabel.setIcon(new ImageIcon(HomePageView.class.getResource("Images/Silhouette-Rock-Concert-Wallpaper1.jpg")));
        frame.getContentPane().add(backgroundLabel);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(500, 253, 56, 16);
        frame.getContentPane().add(lblNewLabel);
        
        
	}
}
