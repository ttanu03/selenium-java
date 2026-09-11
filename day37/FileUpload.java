package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\getitrent\\Downloads\\xpecto-it-landing\\xpecto-landing\\node_modules\\unique-string");
		
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Unique.java")) {
			System.out.println("File is successfull uploaded");
		}
		else {
			System.out.println("upload failed");
		}
		
		//Multi[le file upload
		
		String file1="";
		String file2="";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if( noOfFilesUploaded==2) {
			System.out.println("All files are uploaded");
		}
		else {
			System.out.println("Files are not uploaded or Incorrect");
		}
		
		
	//

	}

}
