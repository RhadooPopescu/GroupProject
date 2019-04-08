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

public class HomePage {

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
//                	HomePage window = new HomePage();
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
    public HomePage() {
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
        		new MyAccountWindow();
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
        frame.getContentPane().add(myAccountButton);
        
        JButton changePassButton = new JButton("Change Password");
        changePassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new ChangePassword();
            	frame.setVisible(false);
            }
        });
        changePassButton.setForeground(SystemColor.inactiveCaption);
        changePassButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        changePassButton.setOpaque(false);
        changePassButton.setContentAreaFilled(false);
        changePassButton.setBorderPainted(false);
        changePassButton.setBounds(27, 268, 206, 53);
        changePassButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(changePassButton);

        JButton bookingsButton = new JButton("My bookings");
        bookingsButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new BookingsWindow();
        		frame.setVisible(false);
        	}
        });
        bookingsButton.setForeground(SystemColor.inactiveCaption);
        bookingsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookingsButton.setOpaque(false);
        bookingsButton.setContentAreaFilled(false);
        bookingsButton.setBorderPainted(false);
        bookingsButton.setBounds(37, 346, 168, 53);
        bookingsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.getContentPane().add(bookingsButton);
        
        JButton logOutButton = new JButton("Log Out");
        logOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new LoginPage();
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
        searchTxtField.setText("    Search");
        searchTxtField.setBounds(397, 71, 300, 30);
        searchTxtField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                searchTxtField.setText("    ");
            }
        });
        frame.getContentPane().add(searchTxtField);

        JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(373, 189, 844, 374);
        scrollPane.setBackground(Color.BLACK);
        frame.add(scrollPane);

        scrollPane.setViewportView(new ResultPanel());

        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("dd/MM/yyyy");

        DatePicker datePicker = new DatePicker(dateSettings);
        datePicker.getComponentDateTextField().setBackground(SystemColor.activeCaption);
        datePicker.getComponentToggleCalendarButton().setText("Date");
        datePicker.setBounds(529, 114, 168, 22);
        frame.getContentPane().add(datePicker);
        
        JButton exitButton = new JButton("X");
        exitButton.setForeground(SystemColor.inactiveCaption);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
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

        JLabel upcomingLabel = new JLabel("Upcoming");
        upcomingLabel.setForeground(SystemColor.inactiveCaption);
        upcomingLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        upcomingLabel.setBounds(373, 146, 125, 30);
        frame.getContentPane().add(upcomingLabel);
        
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
        lblLogo.setIcon(new ImageIcon(LoginPage.class.getResource("Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);
        
        
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setIcon(new ImageIcon(HomePage.class.getResource("Silhouette-Rock-Concert-Wallpaper1.jpg")));
        backgroundLabel.setBounds(0, 0, 1280, 690);
        frame.getContentPane().add(backgroundLabel);
        
    }
}