import javax.swing.*;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.border.MatteBorder;

public class HomePageView {

    private JFrame frame;
    private JTextField searchTxtField;
    //private String username;

    /**
     * Launch the application.
     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                	HomePageView window = new HomePageView();
//                    window.frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        }
//    

    /**
     * Create the application.
     */
    public HomePageView() {
        initialize();
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Global Music");
        frame.setBounds(100, 100, 1280, 690);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(null);

        JButton myAccountButton = new JButton("My Account");
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
        myAccountButton.setBounds(27, 189, 190, 53);
        myAccountButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        myAccountButton.setToolTipText("Edit your personal details");
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
        changePassButton.setBounds(27, 268, 206, 53);
        changePassButton.setToolTipText("Update security details");
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
        bookingsButton.setBounds(37, 346, 168, 53);
        bookingsButton.setToolTipText("View your booked events");
        bookingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(bookingsButton);
        
        JButton logOutButton = new JButton("Log Out");
        logOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new LoginView();
        		frame.setVisible(false);
        	}
        });
        logOutButton.setBounds(39, 426, 168, 53);
        logOutButton.setForeground(SystemColor.inactiveCaption);
        logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logOutButton.setOpaque(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setBorderPainted(false);
        logOutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(logOutButton);
        
        searchTxtField = new JTextField();
        searchTxtField.setBorder(new MatteBorder(3, 3, 3, 3, (Color) SystemColor.activeCaption));
        searchTxtField.setBackground(SystemColor.activeCaption);
        searchTxtField.setBounds(740, 72, 300, 30);
        frame.getContentPane().add(searchTxtField);
        
        JLabel upcomingLabel = new JLabel("Upcoming");
        upcomingLabel.setForeground(SystemColor.inactiveCaption);
        upcomingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        upcomingLabel.setBounds(373, 146, 125, 30);
        frame.getContentPane().add(upcomingLabel);

        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("dd/MM/yyyy");
        dateSettings.setAllowKeyboardEditing(false);
        dateSettings.setAllowEmptyDates(false);

        DatePicker datePicker = new DatePicker(dateSettings);
        datePicker.getComponentDateTextField().setBackground(SystemColor.activeCaption);
        datePicker.getComponentToggleCalendarButton().setText("Date");
        datePicker.setBounds(872, 115, 168, 30);
        frame.getContentPane().add(datePicker);
//        LocalDate date = datePicker.getDate();
//        try {
//        	System.out.println(date.toString());
//        }catch (NullPointerException e) {
//        	System.out.println("No date yet");
//        }
        
        JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(373, 189, 844, 374);
        scrollPane.setBackground(Color.BLACK);
        frame.getContentPane().add(scrollPane);
        scrollPane.setViewportView(new ResultPanel());
        
        JButton btnSearchButton1 = new JButton("");
        btnSearchButton1.setBorderPainted(false);
        btnSearchButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchButton1.setIcon(new ImageIcon(LoginView.class.getResource("Images/SearchIcon.png")));
        btnSearchButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	scrollPane.setViewportView(new ResultPanel(searchTxtField.getText()));
            }
        });
        btnSearchButton1.setBounds(1052, 72, 30, 30);
        frame.getContentPane().add(btnSearchButton1);
        
        JButton btnSearchButton2 = new JButton("");
        btnSearchButton2.setBorderPainted(false);
        btnSearchButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchButton2.setIcon(new ImageIcon(LoginView.class.getResource("Images/SearchIcon.png")));
        btnSearchButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	try {
					scrollPane.setViewportView(new ResultPanel(datePicker));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            }
        });
        btnSearchButton2.setBounds(1052, 115, 30, 30);
        frame.getContentPane().add(btnSearchButton2);
        
        
       
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
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(SystemColor.inactiveCaption);
        separator_1.setOpaque(true);
        separator_1.setBounds(60, 227, 125, 3);
        frame.getContentPane().add(separator_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(SystemColor.inactiveCaption);
        separator_2.setOpaque(true);
        separator_2.setBounds(41, 306, 165, 3);
        frame.getContentPane().add(separator_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setOpaque(true);
        separator_3.setBackground(SystemColor.inactiveCaption);
        separator_3.setBounds(55, 384, 130, 3);
        frame.getContentPane().add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(SystemColor.inactiveCaption);
        separator_4.setOpaque(true);
        separator_4.setBounds(72, 465, 100, 3);
        frame.getContentPane().add(separator_4);
        
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginView.class.getResource("Images/Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);
        
        JLabel searchLabel = new JLabel("Search");
        searchLabel.setBounds(665, 79, 63, 16);
        searchLabel.setForeground(SystemColor.inactiveCaption);
        searchLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        frame.getContentPane().add(searchLabel);
        
        JLabel searchDateLabel = new JLabel("Search by date");
        searchDateLabel.setBounds(760, 121, 110, 16);
        searchDateLabel.setForeground(SystemColor.inactiveCaption);
        searchDateLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        frame.getContentPane().add(searchDateLabel);
        
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setIcon(new ImageIcon(HomePageView.class.getResource("Images/Silhouette-Rock-Concert-Wallpaper1.jpg")));
        backgroundLabel.setBounds(0, 0, 1280, 690);
        frame.getContentPane().add(backgroundLabel);
    }
}