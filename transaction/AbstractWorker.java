package transaction;

import java.awt.Component;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;

import view.GUI;
import view.VisualPart;

public abstract class AbstractWorker implements IfromTo, Runnable{
	protected GUI gui;
	protected JLabel label;
	protected JSlider minWorkTimeSlider;
	protected QueueWithSlider queue;
	protected Student std;
	
	public AbstractWorker(GUI gui, JLabel label, 
			JSlider minWorkTimeSlider, QueueWithSlider 
			queue) {
		this.gui = gui;
		this.label = label;
		this.minWorkTimeSlider = minWorkTimeSlider;
		this.queue = queue;
	}

	@Override
	public void onOut(Student tr) {}

	@Override
	public void onIn(Student tr) {}

	@Override
	public Component getComponent() {
		return label;
	}
	
	protected void showWorking(String[] strings) {
		
	}
	
	protected void display(String pct) {
		URL u = getClass().getResource(pct);
		ImageIcon image = new ImageIcon(u);
		label.setIcon(image);
	}
}
