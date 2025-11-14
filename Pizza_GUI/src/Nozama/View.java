
package Nozama;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class View extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList listArtikel;
	private JList listBestellung;
	private JButton btnNewHinzufügen;
	private JButton btnNewButtonEntfernen;
	private JLabel lblNewLabel;
	private JTextField textFieldName;
	private JButton ButtonAbschliessen;

	public View()
	{

		initialize();
	}

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getList_1());
		contentPane.add(getList_1_1());
		contentPane.add(getBtnNewHinzufügen());
		contentPane.add(getBtnNewButtonEntfernen());
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextFieldName());
		contentPane.add(getButtonAbschliessen());
	}

	private JList getList_1()
	{
		if (listArtikel == null)
			{
				listArtikel = new JList();
				listArtikel.setBounds(20, 114, 272, 170);
			}
		return listArtikel;
	}

	private JList getList_1_1()
	{
		if (listBestellung == null)
			{
				listBestellung = new JList();
				listBestellung.setBounds(405, 114, 272, 170);
			}
		return listBestellung;
	}

	private JButton getBtnNewHinzufügen()
	{
		if (btnNewHinzufügen == null)
			{
				btnNewHinzufügen = new JButton(">");
				btnNewHinzufügen.setBounds(302, 156, 89, 23);
			}
		return btnNewHinzufügen;
	}

	private JButton getBtnNewButtonEntfernen()
	{
		if (btnNewButtonEntfernen == null)
			{
				btnNewButtonEntfernen = new JButton("<");
				btnNewButtonEntfernen.setBounds(302, 218, 89, 23);
			}
		return btnNewButtonEntfernen;
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
			{
				lblNewLabel = new JLabel("Kundenname");
				lblNewLabel.setBounds(20, 327, 89, 14);
			}
		return lblNewLabel;
	}

	private JTextField getTextFieldName()
	{
		if (textFieldName == null)
			{
				textFieldName = new JTextField();
				textFieldName.setBounds(98, 324, 154, 20);
				textFieldName.setColumns(10);
			}
		return textFieldName;
	}

	private JButton getButtonAbschliessen()
	{
		if (ButtonAbschliessen == null)
			{
				ButtonAbschliessen = new JButton("Bestellung abschließen");
				ButtonAbschliessen.setBounds(438, 323, 212, 23);
			}
		return ButtonAbschliessen;
	}

	public JList getListArtikel()
	{
		return listArtikel;
	}

	public void setListArtikel(JList listArtikel)
	{
		this.listArtikel = listArtikel;
	}

	public JList getListBestellung()
	{
		return listBestellung;
	}

	public void setListBestellung(JList listBestellung)
	{
		this.listBestellung = listBestellung;
	}

	public void setBtnNewHinzufügen(JButton btnNewHinzufügen)
	{
		this.btnNewHinzufügen = btnNewHinzufügen;
	}

	public void setBtnNewButtonEntfernen(JButton btnNewButtonEntfernen)
	{
		this.btnNewButtonEntfernen = btnNewButtonEntfernen;
	}

	public void setButtonAbschliessen(JButton buttonAbschliessen)
	{
		ButtonAbschliessen = buttonAbschliessen;
	}

	public void setzeartikel(DefaultListModel<Produkt> artikel)
	{
		listArtikel.setModel(artikel);

	}

	public void setzeWarenkorb(DefaultListModel<Produkt> warenkorb)
	{
		listBestellung.setModel(warenkorb);

	}
}
