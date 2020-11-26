import javax.swing.JFrame;

public class Test2 {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		ventana.setSize(500, 500);
		Login login = new Login();
		ventana.add(login.getPanel());
		ventana.setVisible(true);
	}

}
