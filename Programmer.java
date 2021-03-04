package ctf01.java.collections;

public class Programmer extends Employee implements IWebsiteCreator {

	private String language;

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		this.language = "C#";
		this.position = "programmer";

	}

	public void createWebsite(String template, String titleName) {

	}

	public void installWindows(String version, String productKey) {

	}

	// ทดลอง Constructor Overloading
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput, String language) {
		super(firstnameInput, lastnameInput, salaryInput);
		this.language = language;
	}

	public String checkPosition() {
		return this.position;
	}
}
