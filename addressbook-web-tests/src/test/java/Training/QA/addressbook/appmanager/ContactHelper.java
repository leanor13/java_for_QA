package Training.QA.addressbook.appmanager;

import Training.QA.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by leanor on 29.07.2016.
 */
public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }


  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
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

  }

  public void initAddContact() {
    click(By.linkText("add new"));
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }


}