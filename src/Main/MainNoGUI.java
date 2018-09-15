package Main;

import java.io.File;

public class MainNoGUI {

	public static void main(String[] args) {
		
		File file = new File("");
    	String absolutePath = file.getAbsolutePath(); 
    	System.out.println(absolutePath);
	}

}
