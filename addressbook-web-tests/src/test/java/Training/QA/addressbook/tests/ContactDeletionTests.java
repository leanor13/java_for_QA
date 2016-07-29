package Training.QA.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().gotoHome();
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertConfirmContactDeletion();
    app.getNavigationHelper().gotoHome();
  }



}
