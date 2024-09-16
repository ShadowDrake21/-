package transaction;

import java.awt.Component;

public interface IfromTo {
	public void onOut(Transaction tr); // начало движения транзакции
	public void onIn(Transaction tr); // конец движения транзакции
	public Component getComponent();
}
