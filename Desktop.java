package week3.day2;

public class Desktop implements Hardware,SoftwareResoures{

	public void HardwareResources(String name, int parts) {
		
		System.out.println("HardwareResources:");
		
	}

	public void DesktopMethod(String name) {
		System.out.println("Desktopname");
		
	}

	public void SoftwareUpdate(double version, String osname) {
	System.out.println("softwareupdate");
		
	}
	
	public static void main(String[] args) {
		Desktop driver = new Desktop();
		driver.HardwareResources("harddisk", 10);
		driver.DesktopMethod("apple desktop");
		driver.SoftwareUpdate(10.5, "windows");
	
	}

}
