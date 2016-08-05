package Training.QA.addressbook.tests;

import Training.QA.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    if (! app.getContactHelper().isThereContact()) {
      app.getContactHelper().createContact(new ContactData("NameTest1",
              "LastNameTest", "testtest", "test", "CompTets", "Address test test",
              "5849395", "+93927298403", "95040843", "ttt@kmkmk.tt", null));
    }
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertConfirmContactDeletion();
    app.getNavigationHelper().gotoHome();
  }



}
