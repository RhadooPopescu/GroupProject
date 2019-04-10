import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class BookingsPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingsPage window = new BookingsPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingsPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
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
        
        JLabel lblFestivalImage = new JLabel("Festival Image");
        lblFestivalImage.setBounds(33, 74, 190, 237);
        frame.getContentPane().add(lblFestivalImage);
        
        JLabel lblFeaturingArtists = new JLabel("Featuring Artists");
        lblFeaturingArtists.setForeground(SystemColor.activeCaption);
        lblFeaturingArtists.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblFeaturingArtists.setBounds(389, 29, 209, 29);
        frame.getContentPane().add(lblFeaturingArtists);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(385, 74, 768, 237);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblImageBand_1 = new JLabel("New label");
        lblImageBand_1.setBounds(0, 0, 173, 140);
        panel.add(lblImageBand_1);
        
        JLabel lblImageBand_2 = new JLabel("New label");
        lblImageBand_2.setBounds(199, 0, 173, 140);
        panel.add(lblImageBand_2);
        
        JLabel lblImageBand_3 = new JLabel("New label");
        lblImageBand_3.setBounds(394, 0, 173, 140);
        panel.add(lblImageBand_3);
        
        JLabel lblImageBand_4 = new JLabel("New label");
        lblImageBand_4.setBounds(595, 0, 173, 140);
        panel.add(lblImageBand_4);
        
        JLabel lblBandName_1 = new JLabel("Name");
        lblBandName_1.setBounds(10, 151, 77, 14);
        panel.add(lblBandName_1);
        
        JLabel lblBandGenre_1 = new JLabel("Genre");
        lblBandGenre_1.setBounds(10, 182, 46, 14);
        panel.add(lblBandGenre_1);
        
        
        JButton btnWebsiteBand_1 = new JButton("Website");
        btnWebsiteBand_1.setBounds(-8, 201, 87, 23);
        btnWebsiteBand_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnWebsiteBand_1.setOpaque(false);
        btnWebsiteBand_1.setForeground(SystemColor.textHighlight);
        btnWebsiteBand_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnWebsiteBand_1.setContentAreaFilled(false);
        btnWebsiteBand_1.setBorderPainted(false);
        panel.add(btnWebsiteBand_1);
        
        
        JButton btnWebsiteBand_2 = new JButton("Website");
        btnWebsiteBand_2.setBounds(166, 201, 89, 23);
        btnWebsiteBand_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnWebsiteBand_2.setOpaque(false);
        btnWebsiteBand_2.setForeground(SystemColor.textHighlight);
        btnWebsiteBand_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnWebsiteBand_2.setContentAreaFilled(false);
        btnWebsiteBand_2.setBorderPainted(false);
        panel.add(btnWebsiteBand_2);
        
        
        JLabel lblBandGenre_2 = new JLabel("Genre");
        lblBandGenre_2.setBounds(187, 182, 46, 14);
        panel.add(lblBandGenre_2);
        
        
        JLabel lblBandName_2 = new JLabel("Name");
        lblBandName_2.setBounds(187, 151, 77, 14);
        panel.add(lblBandName_2);
        
        
        JButton btnWebsiteBand_3 = new JButton("Website");
        btnWebsiteBand_3.setBounds(362, 201, 89, 23);
        btnWebsiteBand_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnWebsiteBand_3.setOpaque(false);
        btnWebsiteBand_3.setForeground(SystemColor.textHighlight);
        btnWebsiteBand_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnWebsiteBand_3.setContentAreaFilled(false);
        btnWebsiteBand_3.setBorderPainted(false);
        panel.add(btnWebsiteBand_3);
        
        JLabel lblBandGenre_3 = new JLabel("Genre");
        lblBandGenre_3.setBounds(383, 182, 46, 14);
        panel.add(lblBandGenre_3);
        
        JLabel lblBandName_3 = new JLabel("Name");
        lblBandName_3.setBounds(383, 151, 77, 14);
        panel.add(lblBandName_3);
        
        JLabel lblBandGenre_4 = new JLabel("Genre");
        lblBandGenre_4.setBounds(587, 182, 46, 14);
        panel.add(lblBandGenre_4);
        
        JLabel lblBandName_4 = new JLabel("Name");
        lblBandName_4.setBounds(587, 151, 77, 14);
        panel.add(lblBandName_4);
        
        
        JButton btnWebsiteBand_4 = new JButton("Website");
        btnWebsiteBand_4.setBounds(567, 203, 89, 23);
        btnWebsiteBand_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnWebsiteBand_4.setOpaque(false);
        btnWebsiteBand_4.setForeground(SystemColor.textHighlight);
        btnWebsiteBand_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnWebsiteBand_4.setContentAreaFilled(false);
        btnWebsiteBand_4.setBorderPainted(false);
        panel.add(btnWebsiteBand_4);
        
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(46, 372, 46, 14);
        lblName.setForeground(SystemColor.inactiveCaption);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblName);
        
        
        JLabel lblDate = new JLabel("Date");
        lblDate.setBounds(46, 414, 46, 14);
        lblDate.setForeground(SystemColor.inactiveCaption);
        lblDate.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblDate);
        
        
        JLabel lblDuration = new JLabel("Duration");
        lblDuration.setBounds(46, 462, 75, 14);
        lblDuration.setForeground(SystemColor.inactiveCaption);
        lblDuration.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblDuration);
        
        
        JTextArea txtVenue = new JTextArea();
        txtVenue.setLineWrap(true);
        txtVenue.setText("Venue      Address      ");
        txtVenue.setBounds(46, 500, 92, 68);
        frame.getContentPane().add(txtVenue);
        
        
        JLabel lblAvailableTickets = new JLabel("Available Tickets");
        lblAvailableTickets.setBounds(46, 589, 130, 14);
        lblAvailableTickets.setForeground(SystemColor.inactiveCaption);
        lblAvailableTickets.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblAvailableTickets);
        
        
        JLabel lblFullPriceTickets = new JLabel("Full Price Tickets");
        lblFullPriceTickets.setBounds(385, 372, 125, 14);
        lblFullPriceTickets.setForeground(SystemColor.inactiveCaption);
        lblFullPriceTickets.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblFullPriceTickets);
        
        
        JLabel lblPrice = new JLabel("Price");
        lblPrice.setBounds(624, 372, 46, 14);
        lblPrice.setForeground(SystemColor.inactiveCaption);
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblPrice);
        
        
        JLabel lblStudentDiscountPrice = new JLabel("Student Discount Price");
        lblStudentDiscountPrice.setBounds(389, 430, 171, 14);
        lblStudentDiscountPrice.setForeground(SystemColor.inactiveCaption);
        lblStudentDiscountPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblStudentDiscountPrice);
        
        
        JLabel lblPriceStudent = new JLabel("Price");
        lblPriceStudent.setBounds(628, 430, 46, 14);
        lblPriceStudent.setForeground(SystemColor.inactiveCaption);
        lblPriceStudent.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblPriceStudent);
        
        
        JLabel lblStudentIdNeeded = new JLabel("Student ID Needed at location");
        lblStudentIdNeeded.setForeground(new Color(255, 69, 0));
        lblStudentIdNeeded.setBounds(389, 452, 171, 14);
        frame.getContentPane().add(lblStudentIdNeeded);
        
        
        JComboBox<String> comboBoxFullPrice = new JComboBox<String>();
        comboBoxFullPrice.setBackground(SystemColor.activeCaption);
        comboBoxFullPrice.setBounds(773, 371, 84, 20);
        frame.getContentPane().add(comboBoxFullPrice);
        
        
        JComboBox<String> comboBoxStudentPrice = new JComboBox<String>();
        comboBoxStudentPrice.setBackground(SystemColor.activeCaption);
        comboBoxStudentPrice.setBounds(773, 427, 84, 20);
        frame.getContentPane().add(comboBoxStudentPrice);
        
        
        JComboBox<String> comboBoxCorporatePrice = new JComboBox<String>();
        comboBoxCorporatePrice.setBackground(SystemColor.activeCaption);
        comboBoxCorporatePrice.setBounds(773, 495, 84, 20);
        frame.getContentPane().add(comboBoxCorporatePrice);
        
        
        
        JLabel lblCorporateTicketPrice = new JLabel("Corporate Ticket Price");
        lblCorporateTicketPrice.setBounds(389, 498, 171, 14);
        lblCorporateTicketPrice.setForeground(SystemColor.inactiveCaption);
        lblCorporateTicketPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblCorporateTicketPrice);
        
        
        JLabel lblPriceCorporate = new JLabel("Price");
        lblPriceCorporate.setBounds(628, 498, 46, 14);
        lblPriceCorporate.setForeground(SystemColor.inactiveCaption);
        lblPriceCorporate.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblPriceCorporate);
        
        
        
        JLabel lblTotals = new JLabel("Totals");
        lblTotals.setBounds(389, 554, 75, 14);
        lblTotals.setForeground(SystemColor.inactiveCaption);
        lblTotals.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblTotals);
        
        
        JLabel lblNoOfTickets = new JLabel("No Of Tickets");
        lblNoOfTickets.setBounds(628, 554, 97, 14);
        lblNoOfTickets.setForeground(SystemColor.inactiveCaption);
        lblNoOfTickets.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblNoOfTickets);
        
        
        JLabel lblAmount = new JLabel("Amount");
        lblAmount.setBounds(773, 554, 84, 14);
        lblAmount.setForeground(SystemColor.inactiveCaption);
        lblAmount.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblAmount);
        
        
        
        JButton btnProceedToBooking = new JButton("Proceed To Booking");
        btnProceedToBooking.setBounds(707, 615, 234, 23);
        btnProceedToBooking.setForeground(SystemColor.inactiveCaption);
        btnProceedToBooking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnProceedToBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnProceedToBooking.setOpaque(false);
        btnProceedToBooking.setBorderPainted(false);
        btnProceedToBooking.setContentAreaFilled(false);
        frame.getContentPane().add(btnProceedToBooking);
        
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setOpaque(false);
        btnCancel.setForeground(SystemColor.inactiveCaption);
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setBorderPainted(false);
        btnCancel.setBounds(415, 615, 234, 23);
        frame.getContentPane().add(btnCancel);
        
        
        JSeparator separatorCancel = new JSeparator();
        separatorCancel.setBounds(489, 638, 92, 3);
        separatorCancel.setBackground(SystemColor.inactiveCaption);
        separatorCancel.setForeground(SystemColor.inactiveCaption);
        separatorCancel.setOpaque(true);
        frame.getContentPane().add(separatorCancel);
        
        
        JSeparator separatorProceed = new JSeparator();
        separatorProceed.setBounds(717, 638, 207, 3);
        separatorProceed.setBackground(SystemColor.inactiveCaption);
        separatorProceed.setForeground(SystemColor.inactiveCaption);
        separatorProceed.setOpaque(true);
        frame.getContentPane().add(separatorProceed);
        
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginPage.class.getResource("Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);

        
        JLabel lblImageLabel = new JLabel("Image");
        lblImageLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        lblImageLabel.setForeground(Color.BLACK);
        lblImageLabel.setIcon(new ImageIcon(LoginPage.class.getResource("Silhouette-Rock-Concert-Wallpaper1.jpg")));
        lblImageLabel.setBounds(0, 0, 1297, 693);
        frame.getContentPane().add(lblImageLabel);
        
        
        
        
	}
}
