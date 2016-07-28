package Training.QA.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by leanor on 28.07.2016.
 */
public class SessionHelper extends HelperBase{


  public SessionHelper(FirefoxDriver wd) {

    super(wd);
  }

  public void login(String username, String password) {
   /* wd.get("http://localhost/addressbook/");

    type(By.id("LoginForm"),username);
    type(By.id("pass"),password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
*/
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.id("content")).click();
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();

  }
}
