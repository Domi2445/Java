
package Authohaus;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class View extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<Model> comboBoxModel;
	private JComboBox<Farbe> comboBoxFarbe;
	private JComboBox<Ps> comboBoxPS;
	private JComboBox<Extras> comboBoxExtras;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JButton btnBestaetigen;
	private JLabel lblNewLabel_4;
	private JList<Model> listWarenkorb;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblPreis;
	private JLabel lblMWST;
	private JLabel lblBrutto;
	private JButton btnBestellen;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public View()
	{

		initialize();
	}

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getComboBoxModel());
		contentPane.add(getComboBoxFarbe());
		contentPane.add(getComboBoxPS());
		contentPane.add(getComboBoxExtras());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getBtnBestaetigen());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getListWarenkorb());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblPreis());
		contentPane.add(getLblMWST());
		contentPane.add(getLblBrutto());
		contentPane.add(getBtnBestellen());
	}

	public JComboBox<Model> getComboBoxModel()
	{
		if (comboBoxModel == null)
			{
				comboBoxModel = new JComboBox<>();
				comboBoxModel.setBounds(101, 51, 117, 22);
			}
		return comboBoxModel;
	}

	public JComboBox<Farbe> getComboBoxFarbe()
	{
		if (comboBoxFarbe == null)
			{
				comboBoxFarbe = new JComboBox<>();
				comboBoxFarbe.setBounds(101, 92, 117, 22);
			}
		return comboBoxFarbe;
	}

	public JComboBox<Ps> getComboBoxPS()
	{
		if (comboBoxPS == null)
			{
				comboBoxPS = new JComboBox<>();
				comboBoxPS.setBounds(101, 135, 117, 22);
			}
		return comboBoxPS;
	}

	public JComboBox<Extras> getComboBoxExtras()
	{
		if (comboBoxExtras == null)
			{
				comboBoxExtras = new JComboBox<>();
				comboBoxExtras.setBounds(101, 174, 117, 22);
			}
		return comboBoxExtras;
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
			{
				lblNewLabel = new JLabel("Model");
				lblNewLabel.setBounds(10, 55, 66, 14);
			}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null)
			{
				lblNewLabel_1 = new JLabel("Farbe:");
				lblNewLabel_1.setBounds(10, 96, 66, 14);
			}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2()
	{
		if (lblNewLabel_2 == null)
			{
				lblNewLabel_2 = new JLabel("PS:");
				lblNewLabel_2.setBounds(10, 139, 66, 14);
			}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3()
	{
		if (lblNewLabel_3 == null)
			{
				lblNewLabel_3 = new JLabel("Extras:");
				lblNewLabel_3.setBounds(10, 178, 66, 14);
			}
		return lblNewLabel_3;
	}

	private JButton getBtnBestaetigen()
	{
		if (btnBestaetigen == null)
			{
				btnBestaetigen = new JButton("Auswahl bestätigen");
				btnBestaetigen.setBounds(82, 231, 136, 23);
			}
		return btnBestaetigen;
	}

	private JLabel getLblNewLabel_4()
	{
		if (lblNewLabel_4 == null)
			{
				lblNewLabel_4 = new JLabel("Ihre Auswahl");
				lblNewLabel_4.setBounds(258, 21, 91, 14);
			}
		return lblNewLabel_4;
	}

	public JList<Model> getListWarenkorb()
	{
		if (listWarenkorb == null)
			{
				listWarenkorb = new JList<>();
				listWarenkorb.setBounds(258, 54, 195, 99);
			}
		return listWarenkorb;
	}

	private JLabel getLblNewLabel_5()
	{
		if (lblNewLabel_5 == null)
			{
				lblNewLabel_5 = new JLabel("Gesamtpreis");
				lblNewLabel_5.setBounds(258, 195, 73, 14);
			}
		return lblNewLabel_5;
	}

	private JLabel getLblNewLabel_6()
	{
		if (lblNewLabel_6 == null)
			{
				lblNewLabel_6 = new JLabel("19% MWST");
				lblNewLabel_6.setBounds(258, 235, 73, 14);
			}
		return lblNewLabel_6;
	}

	private JLabel getLblNewLabel_7()
	{
		if (lblNewLabel_7 == null)
			{
				lblNewLabel_7 = new JLabel("Bruttopreis");
				lblNewLabel_7.setBounds(258, 273, 58, 14);
			}
		return lblNewLabel_7;
	}

	private JLabel getLblPreis()
	{
		if (lblPreis == null)
			{
				lblPreis = new JLabel("Leer");
				lblPreis.setBounds(338, 195, 96, 14);
			}
		return lblPreis;
	}

	private JLabel getLblMWST()
	{
		if (lblMWST == null)
			{
				lblMWST = new JLabel("Leer");
				lblMWST.setBounds(338, 235, 93, 14);
			}
		return lblMWST;
	}

	private JLabel getLblBrutto()
	{
		if (lblBrutto == null)
			{
				lblBrutto = new JLabel("Leer");
				lblBrutto.setBounds(338, 273, 96, 14);
			}
		return lblBrutto;
	}

	private JButton getBtnBestellen()
	{
		if (btnBestellen == null)
			{
				btnBestellen = new JButton("Auto Bestellen");
				btnBestellen.setBounds(338, 318, 115, 23);
			}
		return btnBestellen;
	}

	public void setModelAuswahl(DefaultComboBoxModel<Model> modelauswahl)
	{
		comboBoxModel.setModel(modelauswahl);
		
	}

	public void setFarbeAuswahl(DefaultComboBoxModel<Farbe> farbeauswahl)
	{
		comboBoxFarbe.setModel(farbeauswahl);
		
	}

	public void setPsAuswahl(DefaultComboBoxModel<Ps> psauswahl)
	{
		comboBoxPS.setModel(psauswahl);
		
	}

	public void setExtraauswahl(DefaultComboBoxModel<Extras> extraauswahl)
	{
		comboBoxExtras.setModel(extraauswahl);
		
	}

	public void setzeActionlistener(ItemListener modeländern, ActionListener hinzufuegen, ActionListener bestellen)
	{
		
		comboBoxModel.addItemListener(modeländern);
		btnBestaetigen.addActionListener(hinzufuegen);
		btnBestellen.addActionListener(bestellen);
		
		
	}

	public void setWarenkorbmodel(DefaultListModel<Model> warenkorb) {
		
		listWarenkorb.setModel(warenkorb);
		
	}

	public void setzelabels(Double gesamtpreis, Double mwst, Double brutto) {
		// TODO Auto-generated method stub
		
		lblBrutto.setText(brutto.toString());
		lblMWST.setText(mwst.toString());
		lblPreis.setText(gesamtpreis.toString());
		
	}

	
	
	
}
