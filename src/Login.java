import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JPanel {
	private JPanel panel;
	private JButton boton, boton2;
	private JCheckBox check1, check2, check3, check4;
	private JLabel voto1, voto2, voto3, voto4, h1;

	public Login() {
		panel = new JPanel();
		panel.setLayout(null);

		h1 = new JLabel("Selecciona tu candidato");
		h1.setBounds(10, 20, 200, 20);
		panel.add(h1);

		check1 = new JCheckBox("Candidato 1");
		check1.setBounds(35, 40, 200, 40);

		voto1 = new JLabel("0");

		check2 = new JCheckBox("Candidato 2");
		check2.setBounds(35, 65, 100, 40);

		voto2 = new JLabel("0");

		check3 = new JCheckBox("Candidato 3");
		check3.setBounds(35, 100, 100, 40);

		voto3 = new JLabel("0");

		check4 = new JCheckBox("Candidato 4");
		check4.setBounds(35, 130, 100, 40);

		voto4 = new JLabel("0");

		boton = new JButton("Votar");
		boton.setBounds(35, 200, 400, 30);

		boton2 = new JButton("Mostrar votos");
		boton2.setBounds(35, 250, 400, 30);
		panel.add(boton2);

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int voto;
				if (check1.isSelected()) {
					voto = Integer.parseInt(voto1.getText()) + 1;
					voto1.setText(String.valueOf(voto));
				}
				if (check2.isSelected()) {
					voto = Integer.parseInt(voto2.getText()) + 1;
					voto2.setText(String.valueOf(voto));
				}
				if (check3.isSelected()) {
					voto = Integer.parseInt(voto3.getText()) + 1;
					voto3.setText(String.valueOf(voto));
				}
				if (check4.isSelected()) {
					voto = Integer.parseInt(voto4.getText()) + 1;
					voto4.setText(String.valueOf(voto));
				}

			}
		});

		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				voto1.setBounds(300, 40, 20, 40);
				voto2.setBounds(300, 64, 20, 40);
				voto3.setBounds(300, 100, 20, 40);
				voto4.setBounds(300, 130, 20, 40);
			}
		});

		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check4);
		panel.add(voto1);
		panel.add(voto2);
		panel.add(voto3);
		panel.add(voto4);
		panel.add(boton);

	}

	public JPanel getPanel() {
		return panel;
	}

}