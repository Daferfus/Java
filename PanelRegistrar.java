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

public class PanelRegistrar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel nombre, apellidos, usuario, email, password;
	private JTextField nombreIng, apellidosIng, usuarioIng, emailIng;
	private JPasswordField passwordIng;
	private JButton aceptar;

	PanelRegistrar () {
		setBackground(null);
		setLayout(new GridLayout(6,2,50,20));
		setBounds(75,50,350,350);
		insertarElementos();
	}
	
	public void insertarElementos () {
		nombre = new JLabel("NOMBRE",SwingConstants.CENTER);
		apellidos = new JLabel("APELLIDOS",SwingConstants.CENTER);
		usuario = new JLabel("USUARIO",SwingConstants.CENTER);		
		password = new JLabel("PASSWORD",SwingConstants.CENTER);
		email = new JLabel("EMAIL",SwingConstants.CENTER);		
		nombreIng = new JTextField();
		apellidosIng = new JTextField();
		usuarioIng = new JTextField();
		emailIng = new JTextField();		
		passwordIng = new JPasswordField();				
		aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenidoNombre = nombreIng.getText();
				String contenidoApellidos = apellidosIng.getText();
				String contenidoUsuario = usuarioIng.getText();
				String contenidoEmail = emailIng.getText();
				String contenidoPass = String.valueOf(passwordIng.getPassword());
				BaseDeDatos.registrarUsuario(contenidoNombre, contenidoApellidos, contenidoUsuario, contenidoEmail, contenidoPass);
			}			
		});		
		add(nombre);
		add(nombreIng);
		add(apellidos);
		add(apellidosIng);
		add(usuario);
		add(usuarioIng);
		add(password);
		add(passwordIng);
		add(email);
		add(emailIng);
		add(new JLabel());	
		add(aceptar);		
	}
	
	
}
