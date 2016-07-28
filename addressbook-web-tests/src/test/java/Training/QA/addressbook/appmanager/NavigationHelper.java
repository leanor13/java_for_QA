package Training.QA.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by leanor on 28.07.2016.
 */
public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {

  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
