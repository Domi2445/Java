
package Pizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class View extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JComboBox comboBoxPizza;
	private JLabel lblNewLabel_1;
	private JComboBox comboBoxExtras;
	private JComboBox comboBoxGroesse;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JList<Pizza> list;
	private JButton hinzufuegeButton;
	private JButton entfernenButton;
	private JButton bestellenButton;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabelGesamt;
	private JLabel lblNewLabelBetrag;
	private Controller controller;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public View(Controller controller)
	{

		initialize();
		this.controller = controller;
	}

	private void initialize()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getComboBoxPizza());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getComboBoxExtras());
		contentPane.add(getComboBoxGroesse());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getList());
		contentPane.add(getHinzufuegeButton());
		contentPane.add(getEntfernenButton());
		contentPane.add(getBestellenButton());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabelGesamt());
		contentPane.add(getLblNewLabelBetrag());
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
			{
				lblNewLabel = new JLabel("Pizza");
				lblNewLabel.setBounds(23, 11, 46, 14);
			}

		return lblNewLabel;
	}

	public JComboBox getComboBoxPizza()
	{
		if (comboBoxPizza == null)
			{
				comboBoxPizza = new JComboBox();
				comboBoxPizza.addItemListener(new ItemListener()
				{

					public void itemStateChanged(ItemEvent e)
					{
						if (e.getStateChange() == ItemEvent.SELECTED)
							{
								controller.befülleExtras();
								controller.befülleGrößen();
								controller.setPreisLabel();
							}

					}
				});
				comboBoxPizza.setBounds(79, 7, 106, 22);
			}
		return comboBoxPizza;
	}

	private JLabel getLblNewLabel_1()
	{
		if (lblNewLabel_1 == null)
			{
				lblNewLabel_1 = new JLabel("Extras");
				lblNewLabel_1.setBounds(23, 49, 46, 14);
			}
		return lblNewLabel_1;
	}

	public JComboBox getComboBoxExtras()
	{
		if (comboBoxExtras == null)
			{
				comboBoxExtras = new JComboBox();
				comboBoxExtras.addItemListener(new ItemListener()
				{

					public void itemStateChanged(ItemEvent e)
					{

						if (e.getStateChange() == ItemEvent.SELECTED)
							{
								controller.berechnePreis();
								controller.setPreisLabel();
							}
					}
				});
				comboBoxExtras.setBounds(79, 45, 106, 22);
			}
		return comboBoxExtras;
	}

	public JComboBox getComboBoxGroesse()
	{
		if (comboBoxGroesse == null)
			{
				comboBoxGroesse = new JComboBox();
				comboBoxGroesse.addItemListener(new ItemListener()
				{

					public void itemStateChanged(ItemEvent e)
					{
						if (e.getStateChange() == ItemEvent.SELECTED)
							{
								controller.berechnePreis();
								controller.setPreisLabel();

							}

					}
				});
				comboBoxGroesse.setBounds(263, 7, 88, 22);
			}
		return comboBoxGroesse;
	}

	private JLabel getLblNewLabel_2()
	{
		if (lblNewLabel_2 == null)
			{
				lblNewLabel_2 = new JLabel("Größe");
				lblNewLabel_2.setBounds(221, 11, 46, 14);
			}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3()
	{
		if (lblNewLabel_3 == null)
			{
				lblNewLabel_3 = new JLabel("Betrag");
				lblNewLabel_3.setBounds(221, 49, 46, 14);
			}
		return lblNewLabel_3;
	}

	public JList<Pizza> getList()
	{
		if (list == null)
			{
				list = new JList();
				list.setBounds(23, 87, 328, 130);
			}
		return list;
	}

	public void setModel(DefaultComboBoxModel<Pizza> pizzaAuwahl)
	{
		getComboBoxPizza().setModel(pizzaAuwahl);

	}

	public void setgroessenModel(DefaultComboBoxModel<Groessen> groessenauswahl)
	{
		getComboBoxGroesse().setModel(groessenauswahl);

	}

	public void setExtraModel(DefaultComboBoxModel<Extras> extrasAuswahl)
	{
		getComboBoxExtras().setModel(extrasAuswahl);

	}

	public void setComboBoxPizza(JComboBox comboBoxPizza)
	{
		this.comboBoxPizza = comboBoxPizza;
	}

	public void setComboBoxExtras(JComboBox comboBoxExtras)
	{
		this.comboBoxExtras = comboBoxExtras;
	}

	public void setComboBoxGroesse(JComboBox comboBoxGroesse)
	{
		this.comboBoxGroesse = comboBoxGroesse;
	}

	public JButton getHinzufuegeButton()
	{
		if (hinzufuegeButton == null)
			{
				hinzufuegeButton = new JButton("Hinzufügen");
				hinzufuegeButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e)
					{
						controller.hinzufuegen();
					}
				});

				hinzufuegeButton.setBounds(361, 84, 89, 23);
			}
		return hinzufuegeButton;
	}

	private JButton getEntfernenButton()
	{
		if (entfernenButton == null)
			{
				entfernenButton = new JButton("Entfernen");
				entfernenButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e)
					{
						controller.entfernen();
					}
				});
				entfernenButton.setBounds(361, 130, 89, 23);
			}
		return entfernenButton;
	}

	private JButton getBestellenButton()
	{
		if (bestellenButton == null)
			{
				bestellenButton = new JButton("Bestellen");
				bestellenButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e)
					{
						controller.bestellen();

					}
				});
				bestellenButton.setBounds(361, 172, 89, 45);
			}
		return bestellenButton;
	}

	private JLabel getLblNewLabel_4()
	{
		if (lblNewLabel_4 == null)
			{
				lblNewLabel_4 = new JLabel("Gesamtpreis");
				lblNewLabel_4.setBounds(23, 242, 70, 14);
			}
		return lblNewLabel_4;
	}

	public JLabel getLblNewLabelGesamt()
	{
		if (lblNewLabelGesamt == null)
			{
				lblNewLabelGesamt = new JLabel("- €");
				lblNewLabelGesamt.setBounds(221, 242, 46, 14);
			}
		return lblNewLabelGesamt;
	}

	public void setLblNewLabelGesamt(JLabel lblNewLabelGesamt)
	{
		this.lblNewLabelGesamt = lblNewLabelGesamt;
	}

	public void setLblNewLabelBetrag(JLabel lblNewLabelBetrag)
	{
		this.lblNewLabelBetrag = lblNewLabelBetrag;
	}

	public JLabel getLblNewLabelBetrag()
	{
		if (lblNewLabelBetrag == null)
			{
				lblNewLabelBetrag = new JLabel("-€");
				lblNewLabelBetrag.setBounds(277, 49, 46, 14);
			}
		return lblNewLabelBetrag;
	}

	public void setWarenkorbModel(DefaultListModel<Pizza> warenkorb)
	{
		getList().setModel(warenkorb);
	}
}
