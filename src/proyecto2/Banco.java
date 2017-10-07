package proyecto2;

import java.awt.*;
import javax.swing.*;

public class Banco extends JFrame{
	PanelArriba1 panelArriba1;
	public Banco(){
		super("Banci UDEC");
		iniciar();
		componentes();
		setVisible(true);
		setLocationRelativeTo(null);
	}

	private Banco iniciar() {
		Dimension dims = new Dimension(600,600);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}

	private void componentes() {

		panelArriba1 = new PanelArriba1();
		add(panelArriba1,  BorderLayout.NORTH);
	}
}
