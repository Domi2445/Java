package Authohaus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Kundeninfo extends JFrame {

	/**
	 * Variablen anlegen, private für Getter Setter
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblVorname;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabelStrasse;
	private JLabel lblNewLabel_3;
	private JTextField textFieldPLZ;
	private JTextField textFieldStrasse;
	private JTextField textFieldNachname;
	private JTextField textFieldVorname;
	private JButton btnAbschluss;
	private JLabel lblOrt;
	private JTextField textFieldOrt;

	

	/**
	 * Create the frame.
	 */
	public Kundeninfo() {
		setTitle("Kundeninformationen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblVorname());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabelStrasse());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getTextFieldPLZ());
		contentPane.add(getTextFieldStrasse());
		contentPane.add(getTextFieldNachname());
		contentPane.add(getTextFieldVorname());
		contentPane.add(getBtnAbschluss());
		contentPane.add(getLblOrt());
		contentPane.add(getTextFieldOrt());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kundeninformatineen");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setBounds(10, 11, 140, 14);
		}
		return lblNewLabel;
	}
	public JLabel getLblVorname() {
		if (lblVorname == null) {
			lblVorname = new JLabel("Vorname");
			lblVorname.setBounds(10, 49, 58, 14);
		}
		return lblVorname;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Nachname");
			lblNewLabel_1.setBounds(10, 85, 58, 14);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblNewLabelStrasse() {
		if (lblNewLabelStrasse == null) {
			lblNewLabelStrasse = new JLabel("Straße");
			lblNewLabelStrasse.setBounds(10, 125, 58, 14);
		}
		return lblNewLabelStrasse;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("PLZ");
			lblNewLabel_3.setBounds(10, 173, 58, 14);
		}
		return lblNewLabel_3;
	}
	public JTextField getTextFieldPLZ() {
		if (textFieldPLZ == null) {
			textFieldPLZ = new JTextField();
			textFieldPLZ.setBounds(78, 170, 86, 20);
			textFieldPLZ.setColumns(10);
		}
		return textFieldPLZ;
	}
	public JTextField getTextFieldStrasse() {
		if (textFieldStrasse == null) {
			textFieldStrasse = new JTextField();
			textFieldStrasse.setBounds(78, 122, 86, 20);
			textFieldStrasse.setColumns(10);
		}
		return textFieldStrasse;
	}
	public JTextField getTextFieldNachname() {
		if (textFieldNachname == null) {
			textFieldNachname = new JTextField();
			textFieldNachname.setBounds(78, 82, 86, 20);
			textFieldNachname.setColumns(10);
		}
		return textFieldNachname;
	}
	public JTextField getTextFieldVorname() {
		if (textFieldVorname == null) {
			textFieldVorname = new JTextField();
			textFieldVorname.setBounds(78, 49, 86, 20);
			textFieldVorname.setColumns(10);
		}
		return textFieldVorname;
	}
	public JButton getBtnAbschluss() {
		if (btnAbschluss == null) {
			btnAbschluss = new JButton("Bestellung Abschließen");
			btnAbschluss.setBounds(141, 227, 160, 23);
		}
		return btnAbschluss;
	}
	public JLabel getLblOrt() {
		if (lblOrt == null) {
			lblOrt = new JLabel("Ort");
			lblOrt.setBounds(198, 173, 46, 14);
		}
		return lblOrt;
	}
	public JTextField getTextFieldOrt() {
		if (textFieldOrt == null) {
			textFieldOrt = new JTextField();
			textFieldOrt.setBounds(232, 170, 86, 20);
			textFieldOrt.setColumns(10);
		}
		return textFieldOrt;
	}

	public void setzeActionlistne(ActionListener abschluss) {
		
		btnAbschluss.addActionListener(abschluss);	
		
	}
}
