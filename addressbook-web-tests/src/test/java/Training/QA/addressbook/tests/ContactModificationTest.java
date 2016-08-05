package Training.QA.addressbook.tests;

import Training.QA.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Test1", "LastNameTest",
            "testtest", "test", "CompTets", "Address test test", "5849395", "+93927298403",
            "95040843", "ttt@kmkmk.tt", null), false);
    app.getContactHelper().confirmContactModification();
    app.getNavigationHelper().gotoHome();

  }

}
