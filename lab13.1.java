 public class Drug {
private String category;
private String DateOfmanufacture;
private string compay;

 

public Drug(String category, String DateOfmanufacture, string compay) {

    this.category = category;
    DateOfmanufacture = DateOfmanufacture;
    this.compay = compay;
}

 

//public Building() {}

 

public String getcategory() {
    return category;
}

 

public void setcategory(String category) {
    this.category = category;
}

 

public String getDateOfmanufacture() {
    return DateOfmanufacture;
}

 

public void setDateOfmanufacture(String DateOfmanufacture) {
    DateOfmanufacture = DateOfmanufacture;
}

 

public string getcompay() {
    return compay;
}

 

public void setcompay(string compay) {
    this.compay = compay;
}
  public void print()
{
    System.out.println("Catogry is " + catogry);
    System.out.println("data is " + DateOfmanufacture);
    System.out.println("company is : " + compay);
}
