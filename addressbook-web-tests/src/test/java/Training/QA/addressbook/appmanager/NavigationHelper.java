package Training.QA.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by leanor on 28.07.2016.
 */
public class NavigationHelper extends HelperBase{
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);

  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
