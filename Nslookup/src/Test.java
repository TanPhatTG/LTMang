import java.awt.EventQueue;

import javax.swing.UIManager;

import View.Nslookup;

public class Test extends Nslookup{

	private static final long serialVersionUID = 1802199483736051124L;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Nslookup frame = new Nslookup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
