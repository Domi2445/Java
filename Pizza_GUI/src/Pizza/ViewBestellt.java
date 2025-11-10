
package Pizza;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewBestellt extends JDialog
{

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	Controller controller;

	// Standard-Konstruktor (baut die GUI auf)
	public ViewBestellt()
	{
		setTitle("Bestellung abgeschlossen");
		setBounds(100, 100, 400, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getLblNewLabel());

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				if (controller != null)
					{
						controller.löscheList(); // Warenkorb leeren
						controller.schliessen(); // Anwendung beenden
					}
				dispose(); // Dialog schließen
			}
		});
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);

		JButton cancelButton = new JButton("Abbrechen");
		cancelButton.addActionListener(e -> dispose());
		buttonPane.add(cancelButton);
	}

	// Konstruktor mit Controller
	public ViewBestellt(Controller controller)
	{
		this(); // GUI aufbauen
		this.controller = controller; // Controller-Referenz speichern
	}

	private JLabel getLblNewLabel()
	{
		if (lblNewLabel == null)
			{
				lblNewLabel = new JLabel("Ihre Bestellung war erfolgreich!");
				lblNewLabel.setBounds(100, 50, 250, 20);
			}
		return lblNewLabel;
	}

	public void setzeListener(ActionListener okbutton)
	{

	}
}
