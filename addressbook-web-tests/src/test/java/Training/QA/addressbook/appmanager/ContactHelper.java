package Training.QA.addressbook.appmanager;

import Training.QA.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }


  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"),contactData.getFirstName());
    type(By.name("lastname"),contactData.getLastName());
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"),contactData.getTitle());
    type(By.name("company"),contactData.getCompanyName());
    type(By.name("address"),contactData.getAddress());
    type(By.name("home"),contactData.getHomePhoneNumber());
    type(By.name("mobile"),contactData.getMobilePhoneNumber());
    type(By.name("work"),contactData.getWorkPhoneNumber());
    type(By.name("email"),contactData.getEmail());

// Проверяем, контакт создается или изменяется.
// Если создается, но задачи выбрать группу нет (параметр contactData.getGroup() == null), проверяем просто наличие поля new_group

    if (creation) {
      if (contactData.getGroup() != null) {
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      }
      else {
        Assert.assertTrue(isElementPresent(By.name("new_group")));
      }
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void initAddContact() {
    click(By.linkText("add new"));
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }


  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void confirmContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }

  public void alertConfirmContactDeletion() {
    wd.switchTo().alert().accept();

  }

  public boolean isThereContact() {
    return isElementPresent(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void createContact(ContactData contact) {
    initAddContact();
    fillContactForm(contact, true);
    submitContactCreation();
  }
}