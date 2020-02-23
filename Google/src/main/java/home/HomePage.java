
package home;

import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

import webelement.WebElementHome;
import webelement.WebElementHome;

import java.io.IOException;

    public class HomePage extends WebElementHome {

        @FindBy(xpath = searchBox)public static WebElement googleSearchBox;
        public static WebElement getGoogleSearchBox(){return googleSearchBox;}
        public static void searchDataBase() throws Exception {
            for (int i=0;i<ConnectToSqlDB.readDataBase("shuvro","search").size();i++) {
                getGoogleSearchBox().sendKeys(ConnectToSqlDB.readDataBase("shuvro","search").get(i), Keys.ENTER);
                sleepFor(2);
                navigateBack();
                sleepFor(2);
            }
        }

        public static void searchFromExcel() throws IOException, InterruptedException {
            String[][] mat = DataReader.fileReader1("/Users/mdghiasuddin/Downloads/Bootcamp_WeekDays_Selenium_December2019_Kollol/Google/src/main/Files/Book2.xlsx", 0);
            for (int i = 1; i < mat.length; i++) {
                System.out.print(mat[i][0] + " ");
                driver.findElement(By.xpath(searchBox)).sendKeys(mat[i][0],Keys.ENTER);
                sleepFor(2);
                navigateBack();
                sleepFor(2);
            }
        }



    }



//    public static void main(String[] args) {
//        ConnectToSqlDB cdb=new ConnectToSqlDB();
//        cdb.insertDataFromArrayListToSqlTable(searchElements,"Kollol","Search");
//    }
//    public static List<String> getDataFromSql() {
//        ConnectToSqlDB connect=new ConnectToSqlDB();
//        connect.readDataBase();
//        return list;
//    }
//
//    public static void doSearch(List<String> list) {
//
//    }
//    public static void typeByWordEnter(String value) {
//        searchButton.sendKeys(value, Keys.ENTER);
//    }

