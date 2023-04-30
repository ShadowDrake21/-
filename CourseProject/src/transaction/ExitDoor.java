package transaction;

import javax.swing.JLabel;
import javax.swing.JSlider;

import view.VisualPart;

public class ExitDoor extends AbstractWorker{

	public ExitDoor(VisualPart gui, JLabel label, JSlider minWorkTimeSlider, QueueWithSlider queue) {
		super(gui, label, minWorkTimeSlider, queue);
		// TODO Auto-generated constructor stub
	}
// ��� WAREHOUSE !!!

	@Override
	public void run() {
		while (!this.gui.getEndState() || this.queue.getQueue().size() > 0) {
			synchronized (this.queue) { // ����� � ����������������������� ������
				// ���� ����� �������
				while (this.queue.getQueue().size() <= 0) {
					try {
						this.queue.wait(); // �������
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// ���� �� �������, �������� ��������
				this.student.add(this.queue.deleteFromQueue());
				this.amountIn.setCount(this.amountIn.getCount() + 1);
				this.queue.notify(); // �������� �����
			}
			// ��� ������� ��������� � ����
			for (int k = 0; k < this.televisor.size(); k++) {
				synchronized (this.televisor.get(k)) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// ����������� ��������
					this.televisor.get(k).notify();
					synchronized (this.amountIn) {
						this.amountIn.setCount(this.amountIn.getCount() - 1);
					}
					this.served.setCount(this.served.getCount() + 1);
				}
			}
			this.televisor.clear();
		}
		
	}
}
