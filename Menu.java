package login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private JMenu menuUsuario;
	private JMenuItem iniciar, registrar;
	Menu () {
		menuUsuario = new JMenu("Sesion");
		iniciar = new JMenuItem("Iniciar sesion");
		iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.cambiarFondo(Color.WHITE);
				Login.cargarPanelLogin();				
			}			
		});
		registrar = new JMenuItem("Registrar");
		registrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.cambiarFondo(Color.WHITE);
				Login.cargarPanelRegistrar();				
			}			
		});
		menuUsuario.add(iniciar);
		menuUsuario.add(registrar);
		add(menuUsuario);
	}
}
