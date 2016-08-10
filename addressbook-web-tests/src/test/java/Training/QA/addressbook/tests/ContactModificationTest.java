package Training.QA.addressbook.tests;

import Training.QA.addressbook.model.ContactData;
import Training.QA.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHome();
    if (! app.getContactHelper().isThereContact()) {
      app.getContactHelper().createContact(new ContactData("NameTest1",
              "LastNameTest", "testtest", "test", "CompTets", "Address test test",
              "5849395", "+93927298403", "95040843", "ttt@kmkmk.tt", null));
    }
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Modification", "LastNameTest",
            "testtest", "test", "CompTets", "Address test test", "5849395", "+93927298403",
            "95040843", "ttt@kmkmk.tt", null), false);
    app.getContactHelper().confirmContactModification();
    app.getNavigationHelper().gotoHome();


  }

}
