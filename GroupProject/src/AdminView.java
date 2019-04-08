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
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;

public class AdminView {

	private JFrame frame;
    private JTable table;
    private JTextField textField;


    /**
     * Launch the application.
     */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView window = new AdminView();
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
    public AdminView() {
        initialize();
        frame.setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setForeground(new Color(128, 128, 128));
        frame.setResizable(false);
        frame.setTitle("Global Music");
        frame.setBounds(100, 100, 1280, 690);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
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


        JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setBounds(22, 410, 121, 53);
        btnLogOut.setForeground(SystemColor.inactiveCaption);
        btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogOut.setOpaque(false);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new LoginPage();
                frame.setVisible(false);
            }
        });
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(btnLogOut);

        JLabel lblChooseUsername = new JLabel("Choose Username");
        lblChooseUsername.setBounds(27, 62, 153, 14);
        lblChooseUsername.setForeground(SystemColor.inactiveCaption);
        lblChooseUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        frame.getContentPane().add(lblChooseUsername);


        JPanel panel_4 = new JPanel();
        panel_4.setBackground(SystemColor.inactiveCaption);
        panel_4.setBounds(548, 173, 550, 222);
        frame.getContentPane().add(panel_4);

        JScrollPane scrollPane_1 = new JScrollPane();
        GroupLayout gl_panel_1 = new GroupLayout(panel_4);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                                .addContainerGap())
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addContainerGap())
        );

        table = new JTable();
        table.setBackground(SystemColor.inactiveCaption);
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                },
                new String[] {
                        "New column", "New column", "New column", "New column", "New column", "New column"
                }
        ));
        scrollPane_1.setViewportView(table);
        panel_4.setLayout(gl_panel_1);
        panel_4.setVisible(false);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(548, 173, 550, 222);
        frame.getContentPane().add(scrollPane);
        scrollPane.setVisible(false);

        JPanel panel = new JPanel();
        scrollPane.setViewportView(panel);

        JPanel panel_2 = new JPanel();

        JPanel panel_1 = new JPanel();

        JPanel panel_3 = new JPanel();
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                        .addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
                                .addGap(17))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel_2.setLayout(null);

        JButton btnViewEventList = new JButton("View Event List");
        btnViewEventList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scrollPane.setVisible(true);
                panel_4.setVisible(false);
            }
        });
        btnViewEventList.setBounds(27, 173, 190, 53);
        btnViewEventList.setForeground(SystemColor.inactiveCaption);
        btnViewEventList.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnViewEventList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnViewEventList.setOpaque(false);
        btnViewEventList.setBorderPainted(false);
        btnViewEventList.setContentAreaFilled(false);
        frame.getContentPane().add(btnViewEventList);


        JButton btnConfirmBooking = new JButton("Confirm Booking");
        btnConfirmBooking.setBounds(27, 253, 190, 53);
        btnConfirmBooking.setForeground(SystemColor.inactiveCaption);
        btnConfirmBooking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnConfirmBooking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnConfirmBooking.setOpaque(false);
        btnConfirmBooking.setBorderPainted(false);
        btnConfirmBooking.setContentAreaFilled(false);
        btnConfirmBooking.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                scrollPane.setVisible(false);
                panel_4.setVisible(true);
            }
        });
        frame.getContentPane().add(btnConfirmBooking);
        btnConfirmBooking.setVisible(true);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_1.setBounds(0, 0, 521, 54);
        panel_2.add(lblNewLabel_1);
        panel_3.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setBackground(SystemColor.inactiveCaption);
        lblNewLabel_2.setBounds(0, 0, 521, 50);
        panel_3.add(lblNewLabel_2);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setBackground(SystemColor.textHighlight);
        lblNewLabel.setBounds(0, 0, 521, 50);
        panel_1.add(lblNewLabel);
        panel.setLayout(gl_panel);


        JButton btnGenerateInvoice = new JButton("Generate Invoice");
        btnGenerateInvoice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scrollPane.setVisible(false);
                panel_4.setVisible(false);
            }
        });
        btnGenerateInvoice.setBounds(27, 332, 190, 53);
        btnGenerateInvoice.setForeground(SystemColor.inactiveCaption);
        btnGenerateInvoice.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnGenerateInvoice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGenerateInvoice.setOpaque(false);
        btnGenerateInvoice.setBorderPainted(false);
        btnGenerateInvoice.setContentAreaFilled(false);
        frame.getContentPane().add(btnGenerateInvoice);


        textField = new JTextField();
        textField.setBackground(SystemColor.activeCaption);
        textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.activeCaption));
        textField.setBounds(190, 49, 198, 31);
        frame.getContentPane().add(textField);
        textField.setColumns(10);


        JButton btnSearchButton = new JButton("");
        btnSearchButton.setBorderPainted(false);
        btnSearchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSearchButton.setIcon(new ImageIcon(LoginPage.class.getResource("SearchIcon.png"))); 
        btnSearchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnSearchButton.setBounds(409, 49, 30, 30);
        frame.getContentPane().add(btnSearchButton);



        JSeparator separator = new JSeparator();
        separator.setBounds(41, 212, 159, 3);
        separator.setBackground(SystemColor.inactiveCaption);
        separator.setForeground(SystemColor.inactiveCaption);
        separator.setOpaque(true);
        frame.getContentPane().add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(41, 291, 159, 3);
        separator_1.setBackground(SystemColor.inactiveCaption);
        separator_1.setForeground(SystemColor.inactiveCaption);
        separator_1.setOpaque(true);
        frame.getContentPane().add(separator_1);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(41, 370, 165, 3);
        separator_2.setBackground(SystemColor.inactiveCaption);
        separator_2.setForeground(SystemColor.inactiveCaption);
        separator_2.setOpaque(true);
        frame.getContentPane().add(separator_2);

        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(42, 448, 87, 3);
        separator_3.setBackground(SystemColor.inactiveCaption);
        separator_3.setForeground(SystemColor.inactiveCaption);
        separator_3.setOpaque(true);
        frame.getContentPane().add(separator_3);
        
        
        JLabel lblLogo = new JLabel("");
        lblLogo.setIcon(new ImageIcon(LoginPage.class.getResource("Logo.jpg")));
        lblLogo.setBounds(186, 583, 200, 96);
        frame.getContentPane().add(lblLogo);


        JLabel lblImageLabel = new JLabel("Image");
        lblImageLabel.setForeground(Color.BLACK);
        lblImageLabel.setIcon(new ImageIcon(LoginPage.class.getResource("Silhouette-Rock-Concert-Wallpaper1.jpg")));       
        lblImageLabel.setBounds(0, 0, 1297, 693);
        frame.getContentPane().add(lblImageLabel);


    }

}
