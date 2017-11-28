package login;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class PanelUsuario extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel nombre, password;
	private JTextField nombreIng;
	private JPasswordField passwordIng;
	private JButton aceptar;
	
	PanelUsuario () {
		setBackground(null);
		setLayout(new GridLayout(6,1,50,0));
		setBounds(125,50,250,375);
		insertarElementos();
	}
	
	public void insertarElementos () {
		nombre = new JLabel("NOMBRE",SwingConstants.CENTER);
		password = new JLabel("PASSWORD",SwingConstants.CENTER);
		nombreIng = new JTextField();
		passwordIng = new JPasswordField();
		aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoNombre = nombreIng.getText();
				String contenidoPass = String.valueOf(passwordIng.getPassword());
				BaseDeDatos.iniciarSesion(contenidoNombre, contenidoPass);
			}			
		});
		add(nombre);
		add(nombreIng);
		add(password);
		add(passwordIng);
		add(new JLabel());
		add(aceptar);
	}
	
	
	
	
		
		
	
	

}
