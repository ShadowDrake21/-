package transaction;

import java.awt.Component;

import javax.swing.JTextField;

public class Counter implements IfromTo{
	private int count;
	private JTextField textField;
	
	public Counter(JTextField textField) {
		this.textField = textField;
	}

	@Override
	public void onOut(Transaction tr) {
		
		
	}

	@Override
	public void onIn(Transaction tr) {
		
		
	}

	@Override
	public Component getComponent() {
		
		return null;
	}
	
	
}
