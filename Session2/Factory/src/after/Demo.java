package after;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DumplingFactory df1 = new ChickenDumplingFactory();
		
		Dumpling dumpling1 = df1.createDumpling();
		dumpling1.cook();
		
		DumplingFactory df2 = new BeefDumplingFactory();
		Dumpling dumpling2 = df2.createDumpling();
		dumpling2.cook();
	}

}
