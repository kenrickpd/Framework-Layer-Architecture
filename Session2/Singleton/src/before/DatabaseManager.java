package before;

public class DatabaseManager {
	private Boolean conf;

	public DatabaseManager() {
		super();
		this.conf = false;
	}
	
	public void setConf(Boolean status) {
		this.conf = status;
	}
	
	public void getConf() {
		System.out.println(conf);
	}
}
