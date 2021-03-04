package demoPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Demo {
    public static void main(String args[]) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "C:/Users/nroy/IdeaProjects/DemoProject/chromedriver.exe");
                WebDriver driver = new ChromeDriver();

                //System.out.println("HELLOOOOOOOOOOO");

                /*driver.navigate().to("https://www.google.com");
                driver.manage().window().maximize();*/
                driver.navigate().to("https://demoqa.com/automation-practice-form");
                driver.manage().window().maximize();



                //FNAME
                driver.findElement(By.id("firstName")).sendKeys("Nilargha");


                //LNAME
                driver.findElement(By.id("lastName")).sendKeys("Roy");


                //EMAIL
                driver.findElement(By.id("userEmail")).sendKeys("nilarghar@gmail.com");

                //GENDER

                driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();

                //PHONE NUMBER

                driver.findElement(By.id("userNumber")).sendKeys("8240593718");





                //DOB

int booksTitleSize = driver.findElements(By.xpath(".//span[starts-with(@id,'see-book')]")).size();
for(int i=1; i<=booksTitleSize; i++){
    String str = driver.findElement(By.xpath("(.//span[starts-with(@id,'see-book')])[" + i + "]")).getText();
    if(str.equals("Speaking JavaScript")){
        System.out.println("It got matched");
        break;
    }
}

                driver.findElement(By.xpath(".//input[@id='dateOfBirthInput']")).click();
                driver.findElement(By.xpath(".//select[@class='react-datepicker__month-select']")).click();
                driver.findElement(By.xpath(".//option[@value='0']")).click();
                driver.findElement(By.xpath(".//select[@class='react-datepicker__year-select']")).click();
                driver.findElement(By.xpath(".//option[@value='1990']")).click();
                driver.findElement(By.xpath(".//div[text()='24']")).click();


                /*driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")).click();
                driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]"));*/

                /*WebElement element = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
                Select sel = new Select(element);
                sel.selectByVisibleText("April");*/

                /*WebElement element = driver.findElement(By.xpath("//*[@id='dateOfBirth']"));
                element.click();
                WebElement element1 = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]"));
                element1.click();
                WebElement element2 = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[99]"));
                element2.click();
                driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]")).click();*/


                /*driver.findElement(By.xpath("//*[@id='dateOfBirth']")).click();

                WebElement element = driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]"));
                Select sel = new Select(element);
                sel.selectByVisibleText("April");*/





                //Subjects
                //driver.findElement(By.id("subjectsContainer")).sendKeys("Selenium with Java");

                 //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[2]")).sendKeys("Selenium with Java");

                  //driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("Selenium with Java");
                  WebElement sub = driver.findElement(By.id("subjectsInput"));
                  sub.sendKeys("Selenium with Java");
                  sub.sendKeys(Keys.UP);



                //Hobbies


                driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
                //Picture Upload


                WebElement upload = driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]"));//type = file

                upload.sendKeys("C:/Users/nroy/Desktop/Selenium.png");

                //Address

                driver.findElement(By.id("currentAddress")).sendKeys("193 DC Neogy Road, Kolkata");

                // State & City





               /*
                Select state = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")));
                state.selectByVisibleText("NCR");

                Select city = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")));
                city.selectByVisibleText("Delhi");*/

                /*WebElement element = driver.findElement(By.xpath("//*[@id=\"state\"]"));
                Select sel = new Select(element);
                sel.selectByVisibleText("NCR");

                WebElement first = sel.getFirstSelectedOption();
                System.out.println("first element = "+ first.getText());

                List<WebElement> listOptions = sel.getOptions();

                for(WebElement webElement : listOptions)
                {
                    System.out.println("options -" + webElement.getText());
                }*/



                driver.findElement(By.id("submit")).submit();




    }
}
