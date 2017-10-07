package proyecto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import proyecto2.Banco;
public class Ingresa_Usu extends JFrame{
	public JTextField JTcedula,JTnombre,JTapellido,JTsaldo,JTclave;
	public JButton Bagregar,Blimpiar,Bcajero;
	Banco banco = new Banco();
	public Ingresa_Usu() {
		this("demo");
	}
	
	public Ingresa_Usu(String titulo) {
		super(titulo);
		this.iniciar();
		this.configuracion();
		this.pack();
		this.setVisible(true);
	}
	
		private Ingresa_Usu iniciar() {
		Dimension dims = new Dimension(600,600);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		return this;
	}
	
		private void configuracion() {
			
			Container conten = this.getContentPane();
			JLabel t= new JLabel("Datos del Nuevo Usuario");
			t.setBounds(210,70,500,30);
			conten.add(t);
			
			Container contentPane = this.getContentPane();
			JLabel cedula= new JLabel("Cedula");
			cedula.setBounds(250,100,50,30);
			contentPane.add(cedula);
			
			JTcedula = new JTextField();
			JTcedula.setText("cedula");
			JTcedula.setBounds(190, 130, 180, 22);
			add(JTcedula);
			
			Container contentPan = this.getContentPane();
			JLabel nombre= new JLabel("Nombre");
			nombre.setBounds(250,160,50,30);
			contentPan.add(nombre);
			
			JTnombre = new JTextField();
			JTnombre.setText("nombre");
			JTnombre.setBounds(190, 190, 180, 22);
			add(JTnombre);
			
			Container contentPa = this.getContentPane();
			JLabel apellido= new JLabel("Apellido");
			apellido.setBounds(250,210,50,30);
			contentPa.add(apellido);
			
			JTapellido = new JTextField();
			JTapellido.setText("apellido");
			JTapellido.setBounds(190, 240, 180, 22);
			add(JTapellido);
			
			Container contentP = this.getContentPane();
			JLabel saldo= new JLabel("Saldo");
			saldo.setBounds(250,270,50,30);
			contentP.add(saldo);
			
			JTsaldo = new JTextField();
			JTsaldo.setText("saldo");
			JTsaldo.setBounds(190, 300, 180, 22);
			add(JTsaldo);
			
			Container content = this.getContentPane();
			JLabel clave= new JLabel("Clave");
			clave.setBounds(250,330,50,30);
			content.add(clave);
			
			JTclave = new JTextField();
			JTclave.setText("clave");
			JTclave.setBounds(190, 360, 180, 22);
			add(JTclave);
			
			Bagregar = new JButton("Agregar");
			Bagregar.setBounds(170, 390, 100, 22);
			add(Bagregar);
			
			Blimpiar = new JButton("Limpiar");
			Blimpiar.setBounds(300, 390, 100, 22);
			add(Blimpiar);
			
			Bcajero = new JButton("Ingresar al cajero");
			Bcajero.setBounds(190,420,180,22);
			add(Bcajero);
			
			Bagregar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				
				}
			}
			);
			
			Blimpiar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					JTcedula.setText("");
					JTnombre.setText("");
					JTapellido.setText("");
					JTsaldo.setText("");
					JTclave.setText("");
				}
				
			}
			);
			Bcajero.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
				
					JOptionPane.showMessageDialog(null, "Bienvenido al Banco UDEC");	
					banco.setVisible(true);
					//dispose();
					///  habilitar la otra ventana
					
				}
				
			});
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
