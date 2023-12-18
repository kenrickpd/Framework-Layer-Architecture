package observer;

import object.Promo;

public interface Observer {
	//int type = 1 -> all
	//int type = 2 -> vip
	public void update(Promo newPromo, int type);
	
}
