import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Vista extends JFrame{
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblIcono_1;
	private JLabel lblIcono3;
	private JTextField txtUser;
	private JButton btnNewButton;
	private JLabel lblIcono4;
	private JLabel lblIcono4_1;
	private JPasswordField Pwd;
	private Controlador micontrolador;
	private Modelo mimodelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Vista() {
		frame = new JFrame();
		setBackground(new Color(30, 39, 89));
		getContentPane().setBackground(new Color(23, 22, 123));
		getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(63, 108, 191));
		panel.setBounds(12, 12, 454, 410);
		getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-10, 59, 464, 351);
		lblNewLabel.setIcon(new ImageIcon(Vista.class.getResource("/Images/GolfLaFinca01.jpg")));
		panel.add(lblNewLabel);

		lblNewLabel_1 = new JLabel(" GREEN Gestion de Campo");
		lblNewLabel_1.setBounds(97, 11, 323, 36);
		lblNewLabel_1.setForeground(new Color(138, 177, 236));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 24));
		panel.add(lblNewLabel_1);

		// Icono java
		// original
		// JLabel lblNewLabel_2 = new JLabel("");
		// lblNewLabel_2.setIcon(new
		// ImageIcon(Login.class.getResource("/fondo/java.png")));
		// lblNewLabel_2.setBounds(364, 14, 60, 36);
		// panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Vista.class.getResource("/Images/java.png")));
		Image img = new ImageIcon(Vista.class.getResource("/Images/java.png")).getImage();
		ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));

		JLabel lblNewLabel_3 = new JLabel("TOP");
		lblNewLabel_3.setIcon(new ImageIcon(Vista.class.getResource("/Images/LafincaTOP.png")));
		Image img2 = new ImageIcon(Vista.class.getResource("/Images/LafincaTOP.png")).getImage();
		ImageIcon icon2 = new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
//		lblIcono_1 = new JLabel(new ImageIcon(Vista.class.getResource("/Images/LafincaTOP.png")));
		lblIcono_1.setBounds(-10, 0, 97, 64);
		panel.add(lblIcono_1);

		// JLabel lblNewLabel_3 = new JLabel("");
		// lblNewLabel_3.setIcon(new
		// ImageIcon(Login.class.getResource("/fondo/golfclup.png")));
		// lblNewLabel_3.setBounds(290, 0, 70, 64);
		// panel.add(lblNewLabel_3);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(63, 108, 191));
		panel_1.setBounds(478, 12, 379, 410);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Vista.class.getResource("/Images/logogolflogin.png")));
		Image img3 = new ImageIcon(Vista.class.getResource("/Images/logogolflogin.png")).getImage();
		ImageIcon icon3 = new ImageIcon(img3.getScaledInstance(120, 100, Image.SCALE_SMOOTH));
		
				lblIcono4_1 = new JLabel(new ImageIcon(Vista.class.getResource("/Images/pass.png")));
				lblIcono4_1.setBounds(50, 257, 45, 46);
				panel_1.add(lblIcono4_1);
		lblIcono3 = new JLabel(new ImageIcon(Vista.class.getResource("/Images/LOGO-LAFINCA-GOLF-LAGOS1.jpg")));
		lblIcono3.setBounds(110, 44, 171, 124);
		panel_1.add(lblIcono3);

		txtUser = new JTextField();
		txtUser.setText("                   Username");
		txtUser.setBackground(new Color(153, 193, 241));
		txtUser.setBounds(104, 217, 177, 29);
		panel_1.add(txtUser);
		txtUser.setColumns(10);

		btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(26, 95, 180));
		btnNewButton.setForeground(new Color(153, 193, 241));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(145, 332, 105, 27);
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Vista.class.getResource("/Images/userlogin.png")));
		Image img4 = new ImageIcon(Vista.class.getResource("/Images/userlogin.png")).getImage();
		ImageIcon icon4 = new ImageIcon(img4.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		lblIcono4 = new JLabel(icon4);
		lblIcono4.setBounds(50, 210, 45, 46);
		panel_1.add(lblIcono4);
		
		Pwd = new JPasswordField();
		Pwd.setBackground(new Color(153, 193, 241));
		Pwd.setBounds(104, 271, 177, 27);
		panel_1.add(Pwd);
		setBounds(100, 100, 869, 461);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	


	public void setcontrolador(Controlador micontrolador) {
		this.micontrolador = micontrolador;		
	}

	public void setmodelo(Modelo mimodelo) {
		this.mimodelo=mimodelo;
	}
	public String getUser() {
		return txtUser.getText();
		
	}
	public String getPwd() {
		return String.valueOf(Pwd.getPassword());
	}
}
