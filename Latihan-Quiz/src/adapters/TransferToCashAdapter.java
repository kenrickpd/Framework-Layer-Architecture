package adapters;

import payments.Cash;
import payments.Transfer;

public class TransferToCashAdapter extends Cash{
	private Transfer transfer;

	public TransferToCashAdapter(Transfer transfer) {
		super();
		this.transfer = transfer;
	}
	
	public void showPaymentType() {
		// TODO Auto-generated method stub
		super.showPaymentType();
	}
	
	public double converter() {
		return (transfer.getPrice() * 1.1);
	}

	@Override
	public void showPaymentInfo() {
		// TODO Auto-generated method stub
		transfer.setPrice(converter());
		transfer.showPaymentInfo();
	}
	
}
