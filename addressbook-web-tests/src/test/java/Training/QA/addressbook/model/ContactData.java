package Training.QA.addressbook.model;

public class ContactData {
  private String group;
  private final String firstName;
  private final String lastName;
  private final String nickname;
  private final String title;
  private final String companyName;
  private final String address;
  private final String homePhoneNumber;
  private final String mobilePhoneNumber;
  private final String workPhoneNumber;
  private final String email;

  public ContactData(String firstName, String lastName, String nickname,
                     String title, String companyName, String address,
                     String homePhoneNumber, String mobilePhoneNumber,
                     String workPhoneNumber, String email, String group) {
    this.group = group;
    this.firstName = firstName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.companyName = companyName;
    this.address = address;
    this.homePhoneNumber = homePhoneNumber;
    this.mobilePhoneNumber = mobilePhoneNumber;
    this.workPhoneNumber = workPhoneNumber;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhoneNumber() {
    return homePhoneNumber;
  }

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public String getWorkPhoneNumber() {
    return workPhoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public String getGroup() {
    return group;
  }
}
