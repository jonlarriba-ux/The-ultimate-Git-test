package UI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowSwingGit extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public WindowSwingGit() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Git Good");
		setSize(640, 480);
		setLocationRelativeTo(null);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuFichero = new  JMenu("Fichero");
		barraMenu.add(menuFichero);
		
		JMenuItem itemMostrar = new JMenuItem("Mostrar");
		menuFichero.add(itemMostrar);
		
		JMenuItem itemLimpiar = new JMenuItem("Limpiar");
		menuFichero.add(itemLimpiar);
		
		JMenuItem itemSalir = new JMenuItem("Salir");
		menuFichero.add(itemSalir);

		
		setVisible(true);
	}

}
