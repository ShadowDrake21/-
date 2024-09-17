package transaction;

import javax.swing.JLabel;

import view.VisualPart;

public class Student implements Runnable{
	private VisualPart gui;
	private Door door;
	private int maxQueueSize;
	private JLabel label;
	private String picture;
	private int step = 1;
	
	public Student(VisualPart gui, Door door, int maxQueueSize) {
		this.gui = gui;
		this.door = door;
		this.maxQueueSize = maxQueueSize;
		this.label = new JLabel();
		label.setBounds(this.door.getComponent().getX(), this.door.getComponent().getY(), 40, 40);
//		this.gui.frmCursprojectDerkachHolovchenko.add(label);
		this.picture = "";
	}

	@Override
	public void run() {
		
		
	}

}
