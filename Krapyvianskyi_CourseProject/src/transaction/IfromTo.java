package transaction;

import java.awt.Component;

public interface IfromTo {
	public void onOut(Student tr); // ������ �������� ����������
	public void onIn(Student tr); // ����� �������� ����������
	public Component getComponent();
}
