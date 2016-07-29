package Training.QA.addressbook.tests;

import Training.QA.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by leanor on 29.07.2016.
 */
public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("Test55555", "Test2Test5555", "Test5555"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();

  }


}