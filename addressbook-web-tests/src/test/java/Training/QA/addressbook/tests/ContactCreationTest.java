package Training.QA.addressbook.tests;

import Training.QA.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{


  @Test
  public void testContactCreation() {
    app.getContactHelper().createContact(new ContactData("NameTest1",
            "LastNameTest", "testtest", "test", "CompTets", "Address test test",
            "5849395", "+93927298403", "95040843", "ttt@kmkmk.tt", "Test1"));
    app.getNavigationHelper().gotoHome();
  }


}
