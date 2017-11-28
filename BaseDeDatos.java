package login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDeDatos {
	private static Statement sentencia;
	public static void iniciarSesion (String nom, String pass) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://server:3306/midb", "root", "");			
			sentencia = conexion.createStatement();		
			String passUsuario = comprobarUsuario(nom);
			System.out.println(passUsuario);
			if (!passUsuario.equals("")) {
				if (passUsuario.equals(pass)){
					System.out.println("La contraseña coincide");
					Login.cambiarFondo(Color.GREEN);
				}
				else {
					System.out.println("La contraseña no coincide");
					Login.cambiarFondo(Color.RED);
				}
			}
			else {
				System.out.println("El usuario no exite");
				Login.cambiarFondo(Color.RED);
			}
		}
		catch (Exception e) {
			Login.cambiarFondo(Color.RED);
			System.out.println(e.toString());
		}	
	}
	public static String comprobarUsuario (String nom) {
		String pass = "";
		try {
			ResultSet resultado = sentencia.executeQuery("Select contraseña from usuarios where usuario = '"+nom+"'");			
			while  (resultado.next()) {
				pass = resultado.getString("contraseña");
			}
		}
		catch (Exception e) {
			e.toString();
		}
		return pass;
	}
	public static void registrarUsuario (String contenidoNombre, String contenidoApellidos, String contenidoUsuario, String contenidoEmail, String contenidoPass) {
		try {	
			Connection conexion = DriverManager.getConnection("jdbc:mysql://server:3306/midb", "root", "");			
			sentencia = conexion.createStatement();		
			sentencia.executeUpdate("INSERT INTO usuarios VALUES ('"+contenidoUsuario+"','"+contenidoPass+"','"+contenidoNombre+"','"+contenidoApellidos+"','"+contenidoEmail+"')");
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
