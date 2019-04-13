import java.awt.Cursor;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BookingsHistoryView {

	private JFrame frame;
	private JTable table;
    /*
	 * Create the window
	 */
	public BookingsHistoryView() {
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
        myAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(myAccountButton);
        
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
        changePassButton.setBounds(27, 332, 215, 53);
        changePassButton.setToolTipText("Update security details");
        changePassButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(changePassButton);
        
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
        	public void actionPerformed(ActionEvent e) {
        		new LoginView();
        		frame.setVisible(false);
        	}
        });
        logOutButton.setBounds(45, 417, 168, 53);
        logOutButton.setForeground(SystemColor.inactiveCaption);
        logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logOutButton.setOpaque(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setBorderPainted(false);
        logOutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(logOutButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(460, 186, 706, 284);
        frame.getContentPane().add(scrollPane);
        
        table = new JTable();
        table.setBackground(SystemColor.inactiveCaption);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
        	}
        ));
        scrollPane.setViewportView(table);
        
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
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(SystemColor.inactiveCaption);
        separator_2.setOpaque(true);
        separator_2.setBounds(41, 370, 165, 3);
        frame.getContentPane().add(separator_2);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(SystemColor.inactiveCaption);
        separator_4.setOpaque(true);
        separator_4.setBounds(78, 456, 100, 3);
        frame.getContentPane().add(separator_4);
        
        JLabel bookingsLabel = new JLabel("Booking History");
        bookingsLabel.setBounds(460, 118, 190, 38);
        bookingsLabel.setForeground(SystemColor.inactiveCaption);
        bookingsLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
        frame.getContentPane().add(bookingsLabel);
        
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginView.class.getResource("Images/Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);
        
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, 1280, 690);
        backgroundLabel.setIcon(new ImageIcon(HomePageView.class.getResource("Images/Silhouette-Rock-Concert-Wallpaper1.jpg")));
        frame.getContentPane().add(backgroundLabel);
          
	}
}