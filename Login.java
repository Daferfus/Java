package login;

import java.awt.Color;
import javax.swing.JFrame;

public class Login {
	private static PanelUsuario panelUsuario;
	private static PanelRegistrar panelRegistrar;	
	
	private static JFrame ventana;
	private static Menu menuSup;
	
	
	public static void main(String[] args) {		
		cargarInterfaz();		
	}
	
	public static void cargarInterfaz () {
		ventana = new JFrame();
		cambiarFondo(Color.WHITE);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cargarMenu();
		ventana.setLayout(null);
		ventana.setBounds(500,250,500,500);		
		ventana.setVisible(true);	
		ventana.setResizable(false);
	}
	
	
	public static void cargarPanelLogin () {	
		ocultarPaneles();
		panelUsuario = new PanelUsuario();		
		ventana.add(panelUsuario);
		ventana.setVisible(true);
	}
	
	public static void cargarPanelRegistrar () {
		ocultarPaneles();
		panelRegistrar = new PanelRegistrar();		
		ventana.add(panelRegistrar);
		ventana.setVisible(true);		
	}
	
	public static void ocultarPaneles() {
		if (panelRegistrar != null) panelRegistrar.setVisible(false);
		if (panelUsuario != null) panelUsuario.setVisible(false);
	}
	
	
	
	
	public static void cargarMenu () {
		menuSup = new Menu();
		ventana.setJMenuBar(menuSup);
	}
	
	public static void cambiarFondo (Color color) {
		ventana.getContentPane().setBackground(color);		
	}

}
