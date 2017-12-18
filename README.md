"# Seleniumtest" 


Select new select value för listor mm

popup fönster 

ArrayList<String> windows = new arrayList<String>(driver.getWindowHandles());
driver.switchTo.window(windows,get(0))

Skapa en construktor till classen som tex.

#######################################################################
public class AppTest   
{
WebDriver driver;	
	
@test	
public void setlogin(){
	// något som sa göras.
}


public AppTest(WebDriver driver){
	this.driver = driver;
	
}
}
#######################################################################