package control;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import control.*;
import model.Administrador;
import model.Usuario;

public class controlAdmin {
	private String opcion;
	private Administrador user;

	void menuAdmin() throws IOException {
		Scanner teclado=new Scanner(System.in);
		System.out.println("********************************************************************");
		System.out.println("TE HAS ADENTRADO EN EL SISTEMA DE TRIBUTESTATS\n");
		System.out.println("Elija una de las opciones 1-5: \n");
		System.out.println("1.Crear usuario\n");
		System.out.println("2.Editar usuario\n");
		System.out.println("3.Eliminar usuario\n");
		System.out.println("4.Revisar y modificar estadísticas\n");
		System.out.println("5.Suspender usuario\n");
		System.out.println("6.Reactivar usuario\n");
		System.out.println("7.Enlazar jugadores\n");
		System.out.println("8.Cerrar sesión\n");
		opcion=teclado.next();
		
		switch(opcion) {
		case "1":
			controlAnadirUsuario controlAnadirUsuario1 = new controlAnadirUsuario();
			controlAnadirUsuario1.setUser(user);
			controlAnadirUsuario1.anadirUsuario();
			break;
		case "2":
			controlModificarUsuario controlModificarUsuario1 = new controlModificarUsuario();
			controlModificarUsuario1.setUser(user);
			controlModificarUsuario1.modificarUser();
			break;
		case "3":
			controlBorrarUsuario controlBorrarUsuario1 = new controlBorrarUsuario();
			controlBorrarUsuario1.setUser(user);
			controlBorrarUsuario1.borrarUser();

			break;
		case "4":
			controlModificarEstadisticas controlModificarEstadisticas1 = new controlModificarEstadisticas();
			controlModificarEstadisticas1.setUser(user);
			controlModificarEstadisticas1.modificarEstadisticas();

			break;
		case "5":
			controlSuspenderUsuario controlSuspenderUsuario1=new controlSuspenderUsuario();
			controlSuspenderUsuario1.setUser(user);
			controlSuspenderUsuario1.suspenderJugador();
			break;
			
		case "6":
			controlActivarUsuario controlActivarUsuario1=new controlActivarUsuario();
			controlActivarUsuario1.setUser(user);
			controlActivarUsuario1.activarJugador();
			
			break;
			
		case "7":
			controlEnlazarJugador controlEnlazarJugador1=new controlEnlazarJugador();
			controlEnlazarJugador1.setUser(user);
			controlEnlazarJugador1.enlazarJugador();
			
			break;
			
			
		case "8":
			System.out.println("Hasta pronto "+user.getName());
			controlLogin controlLogin1 = new controlLogin();
			controlLogin1.comprobarLogin();
			break;
		}
	}
	
    public void setUsuario(Administrador u) {
    	user = u;
    	

    }

}
