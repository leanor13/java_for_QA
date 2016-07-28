package Training.QA.addressbook.tests;

import Training.QA.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by leanor on 26.07.2016.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();

  }


  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
