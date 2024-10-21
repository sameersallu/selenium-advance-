package generiutilities;

public enum TabNames {

	
	ORGANIZATIONS("Organizations"),LESDS("Leads"),CONTACTS("Contacts");
	
	private String tabName;
	
	private TabNames(String tabName) {
		this.tabName=tabName;
	}
	public String getTabName() {
		return tabName;
	}
}
