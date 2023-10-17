package adapters;

import payments.Cash;
import payments.Crypto;

public class CryptoToCashAdapter extends Cash{
	Crypto crypto;
	
	public CryptoToCashAdapter(Crypto crypto) {
		super();
		// TODO Auto-generated constructor stub
		this.crypto = crypto;
	}
	
	@Override
	public void showPaymentType() {
		// TODO Auto-generated method stub
		super.showPaymentType();
	}
	
	public double converter() {
		return (crypto.getPrice() / 2);
	}

	@Override
	public void showPaymentInfo() {
		// TODO Auto-generated method stub
		crypto.setPrice(converter());
		crypto.showPaymentInfo();
	}
	
}
