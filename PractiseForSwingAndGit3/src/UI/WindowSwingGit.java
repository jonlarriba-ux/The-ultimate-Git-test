package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

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

		JTabbedPane principalPane = new JTabbedPane();
		add(principalPane, BorderLayout.CENTER);
		
		JPanel datosPersonalesPanel = new JPanel();
		datosPersonalesPanel.setLayout(new BorderLayout());
		datosPersonalesPanel.setBackground(Color.BLUE);
		JPanel preferenciaPanel = new JPanel();
		JPanel comentarioPanel = new JPanel();
		
		principalPane.addTab("Datos Personales", datosPersonalesPanel);
		principalPane.addTab("Preferencias", preferenciaPanel);
		principalPane.addTab("Comentarios", comentarioPanel);
		
		
		JLabel nombre = new JLabel("Nombre:");
		JLabel email = new JLabel("Email:");
		JTextField nombreText = new JTextField();
		JTextField emailText = new JTextField();
		
		JPanel emailAndName = new JPanel(new GridLayout(1, 2));
		JPanel emailAndNameLabel = new JPanel();
		emailAndNameLabel.setLayout(new BoxLayout(emailAndNameLabel, BoxLayout.Y_AXIS));
		JPanel emailAndNameText = new JPanel();
		emailAndNameText.setLayout(new BoxLayout(emailAndNameText, BoxLayout.Y_AXIS));
		
		datosPersonalesPanel.add(emailAndName, BorderLayout.NORTH);
			emailAndName.add(emailAndNameLabel);
				emailAndNameLabel.add(nombre);
				emailAndNameLabel.add(email);
			emailAndName.add(emailAndNameText);
				emailAndNameText.add(nombreText);
				emailAndNameText.add(emailText);
		emailAndName.setBorder(BorderFactory.createTitledBorder("Información personal"));
		
		
		JLabel telefono = new JLabel("Teléfono:");
		JLabel dirección = new JLabel("Dirección:");
		JLabel ciudad = new JLabel("Ciudad:");
		JLabel pais = new JLabel("País");
		JTextField telefonoText = new JTextField();
		JTextField direccionText = new JTextField();
		JTextField ciudadText = new JTextField();
		JComboBox<String> paisBox = new JComboBox<String>();
		paisBox.addItem("Spain");
		paisBox.addItem("England");
		
		
		JPanel telefonoYDemas = new JPanel(new GridLayout(1, 2));
		JPanel telefonoYDemasLabel = new JPanel();
		telefonoYDemasLabel.setLayout(new BoxLayout(telefonoYDemasLabel, BoxLayout.Y_AXIS));
		telefonoYDemasLabel.setAlignmentY(MAXIMIZED_VERT);
		JPanel telefonoYDemasText = new JPanel();
		telefonoYDemasText.setLayout(new BoxLayout(telefonoYDemasText, BoxLayout.Y_AXIS));
		
		datosPersonalesPanel.add(telefonoYDemas, BorderLayout.CENTER);
			telefonoYDemas.add(telefonoYDemasLabel);
				telefonoYDemasLabel.add(telefono);
				telefonoYDemasLabel.add(Box.createVerticalStrut(0));
				telefonoYDemasLabel.add(dirección);
				telefonoYDemasLabel.add(Box.createVerticalStrut(0));
				telefonoYDemasLabel.add(ciudad);
				telefonoYDemasLabel.add(Box.createVerticalStrut(0));
				telefonoYDemasLabel.add(pais);
			telefonoYDemas.add(telefonoYDemasText);
				telefonoYDemasText.add(telefonoText);
				telefonoYDemasText.add(Box.createVerticalStrut(0));
				telefonoYDemasText.add(direccionText);
				telefonoYDemasText.add(Box.createVerticalStrut(0));
				telefonoYDemasText.add(ciudadText);
				telefonoYDemasText.add(Box.createVerticalStrut(0));
				telefonoYDemasText.add(paisBox);
		telefonoYDemas.setBorder(BorderFactory.createTitledBorder("Información adicional"));
		
		ButtonGroup grupoGenero = new ButtonGroup();
		JRadioButton masc = new JRadioButton("Masculino");
		JRadioButton femen = new JRadioButton("Femenino");
		JRadioButton otr = new JRadioButton("Otros");
		grupoGenero.add(masc);
		grupoGenero.add(femen);
		grupoGenero.add(otr);
		JPanel generoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		
		datosPersonalesPanel.add(generoPanel, BorderLayout.SOUTH);
		generoPanel.add(masc);
		generoPanel.add(femen);
		generoPanel.add(otr);
		generoPanel.setBorder(BorderFactory.createTitledBorder("Género"));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton salir = new JButton("Salir");
		JButton mostrarDatos = new JButton("Mostrar Datos");
		JButton limpiar = new JButton("Limpiar");
		JPanel botonesPermanentes = new JPanel();
		add(botonesPermanentes, BorderLayout.SOUTH);
		botonesPermanentes.add(mostrarDatos);
		botonesPermanentes.add(limpiar);
		botonesPermanentes.add(salir);
		
		
		setVisible(true);
	}

}
