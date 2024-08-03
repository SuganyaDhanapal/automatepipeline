package week3.day1;

public class Chrome extends Browser{
	public void openInCognito() {
		System.out.println("openinconito chrome");
	}
	public void clearCache() {
		System.out.println("clear cahce chrome");
	}
	
	public static void main (String[] args) {
		
		Chrome chr = new Chrome();
		chr.openInCognito();
		chr.clearCache();
		chr.openurl();
		chr.closeBrowser();
		chr.navigateBack();
	}

	
}
