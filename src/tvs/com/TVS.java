package tvs.com;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.nativekey.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
	
public class TVS
{

public static WebDriver driver;
public String destDir;
public DateFormat dateFormat;
public ExtentReports extent;
public static ExtentTest test;

  

  @BeforeClass	

    public void beforeClass() {
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("Spark.html");
  	extent = new ExtentReports();
  	extent.attachReporter(htmlReporter);
  	

    System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Orange\\\\eclipse-workspace\\\\TVS(M&A)\\\\BrowserUtils\\\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://shop.tvsmotor.com/");   
    

    
  }
  
  
 
	
@Test(priority=1)
  
          public void TrackPage() {
		  test = extent.createTest("TrackPage");
	  
	  
/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  
	 // WebElement Accept = driver.findElement(By.xpath("//button[@id='shopify-pc__banner__btn-accept']"));
		Accept.click();*/
	 
	try { WebElement Track = driver.findElement(By.xpath("//span[@class='track-icon']//*[name()='svg']"));
		 Track.click();
	  
	  		
	   String URL = driver.getCurrentUrl();
    
	      if(URL.contains("https://shop.tvsmotor.com/apps/track123"))
    {
        System.out.println("Track-Landed in correct URL" +
                "" + URL);
        
        takeScreenshot("URL is correct");

    }else
    {
        System.out.println("Track-Landed in wrong URL");
        takeScreenshot("URL is not correct");
    }
	      
	      test.pass("Redirect to TrackPage successfully");}
	 
	 catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }

	      	      
 @Test(priority=2)
	      
	          public void MerchandisePage() {
			  test = extent.createTest("MerchandisePage");
	      	   
			  try {      WebElement Merchandise = driver.findElement(By.xpath("//span[@class='new-cat text_data_layer text'][normalize-space()='Merchandise']"));
	          Merchandise.click();
	
	String URL1 = driver.getCurrentUrl();
	
	if(URL1.contains("https://shop.tvsmotor.com/pages/merchandise"))
    {
        System.out.println("Merchandise-Landed in correct URL" +
                "" + URL1);

    }else
    {
        System.out.println("Merchandise-Landed in wrong URL");

    }
	test.pass("Redirect to MerchandisePage successfully");}
			  
			  catch(Exception e) 
				 {
					 test.fail("User not redirect to the correct URL");
					 }
				      }

	      
@Test(priority=3)
	      

	      public void AccessoriesPage() {
			  test = extent.createTest("AccessoriesPage");    
	
	 try {     WebElement Accessories = driver.findElement(By.xpath("//span[@class='new-cat text_data_layer text'][normalize-space()='Accessories']"));
	      Accessories.click();
	
	      String URL2 = driver.getCurrentUrl();
	
	      if(URL2.contains("https://shop.tvsmotor.com/pages/accessories"))
    {
        System.out.println("Accessories-Landed in correct URL" +
                "" + URL2);

    }     else
    {
        System.out.println("Accessories-Landed in wrong URL");
        
       

    }
	 test.pass("Redirect to AccessoriesPage successfully");}
	 
	 catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }


@Test(priority=4)


       public void OfferZonePage() {
	   test = extent.createTest("OfferZonePage"); 
	
	try {   WebElement OfferZone = driver.findElement(By.xpath("//span[@class='new-cat text_data_layer text'][normalize-space()='Offer Zone']"));
	   OfferZone.click();
	
	   String URL3 = driver.getCurrentUrl();
	
	if(URL3.contains("https://shop.tvsmotor.com/pages/offer-zone"))
    {
        System.out.println("OfferZone-Landed in correct URL" +
                "" + URL3);

    }else
    {
        System.out.println("OfferZone-Landed in wrong URL");

    }
	
	test.pass("Redirect to OfferZonePage successfully");}
	
	catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }

@Test(priority=5)


       public void ComingSoonPage() {
	   test = extent.createTest("ComingSoonPage"); 
	
	try {   
		Thread.sleep(2000);
		WebElement ComingSoon = driver.findElement(By.xpath("//a[@class='menu-lv-1__action header__menu-item header__menu-item list-menu__item link link--text focus-inset']//span[@class='text'][normalize-space()='Shop By Model']"));
	   ComingSoon.click();
	
	   String URL4 = driver.getCurrentUrl();
	
	if(URL4.contains("https://shop.tvsmotor.com/pages/coming-soon"))
    {
        System.out.println("ComingSoon-Landed in correct URL" +
                "" + URL4);

    }else
    {
        System.out.println("ComingSoon-Landed in wrong URL");

    }
	
	test.pass("Redirect to ComingSoonPage successfully");}
	
	catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }


@Test(priority=6)


      public void Homepage() {
	  test = extent.createTest("Homepage"); 


	
	try {  WebElement Logo = driver.findElement(By.xpath("//div[contains(@class,'header__heading')]//img[contains(@alt,'TVS Motor Company')]"));
	  Logo.click();
	
	  String URL5 = driver.getCurrentUrl();
	
	if(URL5.contains("https://shop.tvsmotor.com/"))
    {
        System.out.println("Logo-Landed in correct URL" +
                "" + URL5);

    }else
    {
        System.out.println("Logo-Landed in wrong URL");

    }
	
	test.pass("Redirect to Homepage successfully");}
	
	catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }

@Test(priority=7)


        public void WishlistPage() {
	    test = extent.createTest("WishlistPage"); 


		
	try {    WebElement Wishlist = driver.findElement(By.xpath("//a[@class='header__icon header__icon--wishlist link link--text focus-inset']//*[name()='svg']"));
	    Wishlist.click();
	
	    String URL6 = driver.getCurrentUrl();
	
	if(URL6.contains("https://shop.tvsmotor.com/a/wishlist"))
    {
        System.out.println("Wishlist-Landed in correct URL" +
                "" + URL6);

    }else
    {
        System.out.println("Wishlist-Landed in wrong URL");

    }
	
	test.pass("Redirect to WishlistPage successfully");}
	catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }

 @Test(priority=8)

      public void shopbymodel() {
	  test = extent.createTest("shopbymodelpage"); 
	

	try {  WebElement shopbymodel = driver.findElement(By.xpath("//a[@class='menu-lv-1__action header__menu-item header__menu-item list-menu__item link link--text focus-inset']//span[@class='text'][normalize-space()='Shop By Model']"));
	  shopbymodel.click();
	
	
	  String URL7 = driver.getCurrentUrl();
	
	  if(URL7.contains("https://shop.tvsmotor.com/collections/shop-by-model"))
    {
        System.out.println(" ShopByModel-Landed in correct URL" +
                "" + URL7);

         }else
    {
        System.out.println(" ShopByModel-Landed in wrong URL");

    }
	
	test.pass("Redirect to ShopByModelPage successfully");}
	
	catch(Exception e) 
	 {
		 test.fail("User not redirect to the correct URL");
		 }
	      }
 
 @Test(priority=9)

 public void SortBy() throws InterruptedException {
 test = extent.createTest("SortBy"); 
 Thread.sleep(1000);

try { WebElement SortBy = driver.findElement(By.xpath("//div[@class='toolbar-item toolbar-sort clearfix']//button[@class='usf-c-select__input-value usf-btn'][normalize-space()='Price: High to Low']"));
 SortBy.click();
 
 
 JavascriptExecutor jse = (JavascriptExecutor)driver;
 jse.executeScript("window.scrollBy(0,200)");
 
 Thread.sleep(2000);

test.pass("Sort By is clickable and dropdown is visible");}

catch(Exception e) 
{
	 test.fail("Sort By not clickable");
	 }
 }
 
 @Test(priority=10)
 public void LowtoHigh() throws InterruptedException {
	 test = extent.createTest("Low To High on Shop By model page");
	 
 try {
 WebElement LowtoHigh = driver.findElement(By.xpath("(//button[@class='usf-c-select__btn usf-btn'][normalize-space()='Price: Low to High'])[1]"));
 LowtoHigh.click();
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse1 = (JavascriptExecutor)driver;
 jse1.executeScript("window.scrollBy(0,400)");
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
 jse2.executeScript("window.scrollBy(0,-300)");
 
 Thread.sleep(2000);
  
  
 WebElement SortBy1 = driver.findElement(By.xpath("//div[@class='toolbar-item toolbar-sort clearfix']//button[@class='usf-c-select__input-value usf-btn'][normalize-space()='Price: Low to High']"));
 SortBy1.click();
 
 Thread.sleep(2000);
 
 test.pass("Low to High functionalty working fine");}
 
 catch(Exception e) 
 {
 	 test.fail("Low To High functionality not working as per expected on Shop By Model Page");
 	 }
      }
 
 @Test(priority=11)
 public void Discount() throws InterruptedException {
	 test = extent.createTest("Discount on Shop By model page");
 
 try {
 WebElement Discount = driver.findElement(By.xpath("//div[@class='usf-c-select usf-opened']//button[@class='usf-c-select__btn usf-btn'][normalize-space()='Discount']"));
 Discount.click();
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse3 = (JavascriptExecutor)driver;
 jse3.executeScript("window.scrollBy(0,400)");
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse4 = (JavascriptExecutor)driver;
 jse4.executeScript("window.scrollBy(0,-400)");
 
 Thread.sleep(2000);
 
 WebElement SortBy2 = driver.findElement(By.xpath("//div[@class='toolbar-item toolbar-sort clearfix']//button[@class='usf-c-select__input-value usf-btn'][normalize-space()='Discount']"));
 SortBy2.click();
 
 Thread.sleep(2000);
 
test.pass("Discount functionalty working fine");}
 
 catch(Exception e) 
 {
 	 test.fail("Discount functionality not working as per expected on Shop By Model Page");
 	 }
      }
 
 @Test(priority=12)
 public void ExclusivelyProduct() throws InterruptedException {
	 test = extent.createTest("ExclusivelyProduct on Shop By model page");
 
 try {
 
 WebElement ExclusivelyProduct = driver.findElement(By.xpath("//div[@class='usf-c-select usf-opened']//button[@class='usf-c-select__btn usf-btn'][normalize-space()='Exclusively Launched']"));
 ExclusivelyProduct.click();
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse5 = (JavascriptExecutor)driver;
 jse5.executeScript("window.scrollBy(0,400)");
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse6 = (JavascriptExecutor)driver;
 jse6.executeScript("window.scrollBy(0,-400)");
 
 Thread.sleep(2000);
 
 WebElement SortBy3 = driver.findElement(By.xpath("//div[@class='toolbar-item toolbar-sort clearfix']//button[@class='usf-c-select__input-value usf-btn'][normalize-space()='Exclusively Launched']"));
 SortBy3.click();
 
test.pass("ExclusivelyProduct functionalty working fine");}
 
 catch(Exception e) 
 {
 	 test.fail("ExclusivelyProduct functionality not working as per expected on Shop By Model Page");
 	 }
      }
 
 @Test(priority=13)
 public void BestSelling() throws InterruptedException {
	 test = extent.createTest("BestSelling on Shop By model page");
 
 try {
 
 Thread.sleep(2000);
 
 
 
 WebElement BestSelling = driver.findElement(By.xpath("//div[@class='usf-c-select usf-opened']//button[@class='usf-c-select__btn usf-btn'][normalize-space()='Best selling']"));
 BestSelling.click();
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse7 = (JavascriptExecutor)driver;
 jse7.executeScript("window.scrollBy(0,400)");
 
 Thread.sleep(2000);
 
 JavascriptExecutor jse8 = (JavascriptExecutor)driver;
 jse8.executeScript("window.scrollBy(0,-400)");
 
 test.pass("SortBy working as per expected");
 
 
 
test.pass("BestSelling functionalty working fine");}
 
 catch(Exception e) 
 {
 	 test.fail("BestSelling functionality not working as per expected on Shop By Model Page");
 	 }
}
 
 


 
@Test(priority=14)


 public void Filter() throws InterruptedException {
 test = extent.createTest("Filter"); 
 
 Thread.sleep(1000);
 
 try {
 WebElement Filter = driver.findElement(By.xpath("//span[@id='desk_filter']//span[@class='filter-text text'][normalize-space()='Filters']"));
 Filter.click();
 
 Thread.sleep(2000);
 
test.pass("Filter is clickable on shop by model page ");}
 
 catch(Exception e) 
 {
 	 test.fail("Filter not clickable on Shop By Model Page");
 	 }
}

@Test(priority=15)


public void Brand() throws InterruptedException {
test = extent.createTest("Brand under Filter on shop by model page"); 


 try {
	 
	
 WebElement Brand = driver.findElement(By.xpath("//body/div[@class='body-content-wrapper']/main[@id='MainContent']/div[@id='shopify-section-template--22496575389978__product-grid']/div[@id='CollectionSection-template--22496575389978__product-grid']/div[@class='container']/div[@class='halo-collection-content halo-grid-content sidebar--layout_vertical']/div[@id='halo-sidebar']/div[@class='halo-sidebar-wrapper custom-scrollbar']/div[@id='main-collection-filters']/div[@class='usf-facets usf-no-select usf-zone usf-sr-filters']/div[@class='usf-facets__body']/div[1]/div[1]/div[1]"));
 Brand.click();
 
 Thread.sleep(1000);
 
 test.pass("Brand is clickable on shop by model page under filter ");}

catch(Exception e) 
{
	 test.fail("Brand not clickable on Shop By Model Page under filter");
	 }
}

@Test(priority=16)


public void SelectBrand() throws InterruptedException {
test = extent.createTest("Select Brand under Filter");
 
try {
 WebElement SelectBrand = driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/div[1]/span[1]"));
 SelectBrand.click();
 
 Thread.sleep(2000);
 
 test.pass("Brand selected successfully");}

 catch(Exception e) 
 {
 	 test.fail("Brand not selected successfully");
 	 }
 }
 
 
@Test(priority=17)


public void SelectsecondBrand() throws InterruptedException {
test = extent.createTest("Two brand selected");
 
try {
 

 WebElement SelectBrand2 = driver.findElement(By.xpath("//span[normalize-space()='TVS RONIN']"));
 SelectBrand2.click();
 
 Thread.sleep(2000);
 
 test.pass("Two Brand selected successfully");}

catch(Exception e) 
{
	 test.fail("Two Brand not selected successfully");
	 }
}

@Test(priority=18)


public void RemoveBrand() throws InterruptedException {
test = extent.createTest("Remove Brand");
 
try {


 
 WebElement Remove = driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]"));
 Remove.click();
 
 Thread.sleep(2000);
 
 test.pass("Brand Remove successfully");}

catch(Exception e) 
{
	 test.fail("Brand not remove successfully");
	 }
}
 

@Test(priority=19)


public void ClearAllBrand() throws InterruptedException {
test = extent.createTest("Clear All Brand");
 
try {
  
 
 WebElement ClearAll = driver.findElement(By.xpath("//button[normalize-space()='Clear all']"));
 ClearAll.click();
 
 Thread.sleep(2000);
 
 test.pass(" Clear All Brand successfully");}

catch(Exception e) 
{
	 test.fail("Brand not clear all successfully");
	 }
}
 
@Test(priority=20)


public void Categories() throws InterruptedException {
test = extent.createTest("Categories on Shop by model page under filter");
 
try {

 
 
 WebElement Categories = driver.findElement(By.xpath("//button[normalize-space()='Categories']"));
 Categories.click();
 
 Thread.sleep(2000);
 
 test.pass(" Categories open successfully");}

 catch(Exception e) 
 {
 	 test.fail("Categories not open successfully");
 	 }
 }

@Test(priority=21)


public void SelectCategory() throws InterruptedException {
test = extent.createTest("Select category under filter");
 
try {
 
 
 
 WebElement SelectCategory = driver.findElement(By.xpath("//div[@class='usf-facet']//button[1]//div[1]//span[1]"));
 SelectCategory.click();
 
 Thread.sleep(2000);
 
 test.pass("Category select successfully");}

 catch(Exception e) 
 {
 	 test.fail("Category not select successfully");
 	 }
 }
 
@Test(priority=22)


public void ClearCategory() throws InterruptedException {
test = extent.createTest("Clear Category under filter");
 
try {
 
 
 WebElement Clear = driver.findElement(By.xpath("//button[normalize-space()='Clear']"));
 Clear.click();
 
 
 
 Thread.sleep(2000);
 
 test.pass("Category clear successfully");}

catch(Exception e) 
{
	 test.fail("Category not clear successfully");
	 }
}
 
@Test(priority=23)


public void Subcategories() throws InterruptedException {
test = extent.createTest("Sub Categories on Shop by model page under filter");
 
try {

 
 WebElement Subcategories = driver.findElement(By.xpath("//button[normalize-space()='Sub Categories']"));
 Subcategories.click();
 
 Thread.sleep(2000);
 
 test.pass("Sub Category open successfully");}
 
 catch(Exception e) 
 {
 	 test.fail("Sub Category open successfully");
 	 }
 }

@Test(priority=24)


public void SelectSubcategory() throws InterruptedException {
test = extent.createTest("Select Sub Categories on Shop by model page under filter");
 
try {
 
 
 
 WebElement SelectSubcategory = driver.findElement(By.xpath("//div[@class='usf-facet']//button[1]//div[1]//span[1]"));
 SelectSubcategory.click();
 
 	
 Thread.sleep(2000);
 
 
 test.pass("Sub Category selected successfully");}

catch(Exception e) 
{
	 test.fail("Sub Category selected not successfully");
	 }
}

@Test(priority=25)


public void ClearSubCategory() throws InterruptedException {
test = extent.createTest("Clear sub category on Shop by model page under filter");
 
try {


 WebElement ClearCategory = driver.findElement(By.xpath("//button[normalize-space()='Clear']"));
 ClearCategory.click();
   
 
 Thread.sleep(2000);
 
 test.pass("Sub Category clear successfully");}

catch(Exception e) 
{
	 test.fail("Sub Category not clear successfully");
	 }
}

@Test(priority=26)


public void Product() throws InterruptedException {
test = extent.createTest("Product List on Shop by model page under filter");
 
try {
 
 
 WebElement Product = driver.findElement(By.xpath("//button[normalize-space()='Product']"));
 Product.click();
 
 Thread.sleep(2000);
 
 test.pass("Product list open successfully");}

 catch(Exception e) 
 {
 	 test.fail("Product list not open successfully");
 	 }
 }
 

@Test(priority=27)


public void SelectProduct() throws InterruptedException {
test = extent.createTest("Select Product on Shop by model page under filter");
 
try {

  
 WebElement SelectProduct = driver.findElement(By.xpath("//div[4]//div[2]//div[1]//button[1]//div[1]//span[1]"));
 SelectProduct.click();
 
 Thread.sleep(2000);
 
 test.pass("Product selected successfully");}

catch(Exception e) 
{
	 test.fail("Product not selected successfully");
	 }
}

@Test(priority=28)


public void ClearProduct() throws InterruptedException {
test = extent.createTest("Clear Product on Shop by model page under filter");
 
try {

 
 WebElement ClearProduct = driver.findElement(By.xpath("//button[normalize-space()='Clear']"));
 ClearProduct.click();
 
 Thread.sleep(2000);
 
 test.pass("Product clear successfully");}

 catch(Exception e) 
 {
 	 test.fail("Product not clear successfully");
 	 }
 }
 
@Test(priority=29)


public void CloseFilter() throws InterruptedException {
test = extent.createTest("Close the Filter");
 
try {
 
 WebElement CrossFilter = driver.findElement(By.xpath("//span[@class='usf-sidebar-close']//*[name()='svg']"));
 CrossFilter.click();
  
 Thread.sleep(2000);
 
 JavascriptExecutor jse7 = (JavascriptExecutor)driver;
 jse7.executeScript("window.scrollBy(0,-400)");
 
 test.pass("Filter close successfully");}

catch(Exception e) 
{
	 test.fail("Filter not close successfully");
	 }
}
  
 
 
 
 @Test(priority=30)
 public void SelectVehicle() throws InterruptedException {
		  test = extent.createTest("Select Vehicle");
		  
		  Thread.sleep(2000);
		 try { 
		  WebElement shopbymode2 = driver.findElement(By.xpath("(//span[@class='text header__active-menu-item'][normalize-space()='Shop By Model'])[1]"));
		  shopbymode2.click();
		  
		  		  
		  WebElement SelectVehicle = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle.click();
		  
		  Thread.sleep(1500);
		  
		  test.pass("Select Vehicle dropdown open successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("Select Vehicle dropdown not open successfully");
		 	 }
		 }
		  
 
 @Test(priority=31)
 public void TVSIQUBE() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVSIQUBE");
		  
		  Thread.sleep(2000);
		 try { 
		  
		  
			  		  
		  WebElement dropdownElement = driver.findElement(By.className("coll-filter"));
		  
		  Select dropdown = new Select(dropdownElement);
		  
		  dropdown.selectByVisibleText("TVS IQUBE");
		  
		  Thread.sleep(1000);
 
          JavascriptExecutor jse1 = (JavascriptExecutor)driver;
          jse1.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse1.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse1.executeScript("window.scrollBy(0,-900)");  
          
          Thread.sleep(1500);
          
          test.pass("TVS IQUBE selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS IQUBE not selected successfully");
		 	 }
		 }
          
 @Test(priority=32)
 public void TVSRONIN() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS RONIN");
		  
		  Thread.sleep(2000);
		 try { 
           
          
          WebElement SelectVehicle1 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle1.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement1 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown1 = new Select(dropdownElement1);
          
          dropdown1.selectByVisibleText("TVS RONIN");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse2 = (JavascriptExecutor)driver;
          jse2.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse2.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS RONIN selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS RONIN not selected successfully");
		 	 }
		 }
          
 @Test(priority=33)
 public void TVSAPACHE() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS APACHE");
		  
		  Thread.sleep(2000);
		 try { 
           
          
          WebElement SelectVehicle2 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle2.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement2 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown2 = new Select(dropdownElement2);
          
          dropdown2.selectByVisibleText("TVS APACHE");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse3 = (JavascriptExecutor)driver;
          jse3.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse3.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse3.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS APACHE selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS APACHE not selected successfully");
		 	 }
		 }
 
 @Test(priority=34)
 public void TVSAPACHERTR310() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS APACHE RTR 310");
		  
		  Thread.sleep(2000);
		 try { 
 
 
          
          WebElement SelectVehicle3 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle3.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement3 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown3 = new Select(dropdownElement3);
          
          dropdown3.selectByVisibleText("TVS APACHE RTR 310");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse4 = (JavascriptExecutor)driver;
          jse4.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse4.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse4.executeScript("window.scrollBy(0,-900)");
          
          
          Thread.sleep(1500);
          
          test.pass("TVS APACHE RTR 310 selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS APACHE RTR 310 not selected successfully");
		 	 }
		 }
 
 @Test(priority=35)
 public void TVSAPACHERR310() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS APACHE RR310");
		  
		  Thread.sleep(2000);
		 try { 
          
          WebElement SelectVehicle4 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle4.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement4 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown4 = new Select(dropdownElement4);
          
          dropdown4.selectByVisibleText("TVS APACHE RR310");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse5 = (JavascriptExecutor)driver;
          jse5.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse5.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse5.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS APACHE RR310 selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS APACHE RR310 not selected successfully");
		 	 }
		 }
          
 @Test(priority=36)
 public void TVSJUPITER() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS JUPITER");
		  
		  Thread.sleep(2000);
		 try {
 
          
          WebElement SelectVehicle5 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle5.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement5 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown5 = new Select(dropdownElement5);
          
          dropdown5.selectByVisibleText("TVS JUPITER");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse6 = (JavascriptExecutor)driver;
          jse6.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse6.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse6.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS JUPITER selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS JUPITER not selected successfully");
		 	 }
		 }
 
 @Test(priority=37)
 public void TVSJUPITER125() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS JUPITER 125");
		  
		  Thread.sleep(2000);
		 try {
          
          
          WebElement SelectVehicle6 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle6.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement6 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown6 = new Select(dropdownElement6);
          
          dropdown6.selectByVisibleText("TVS JUPITER 125");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse8 = (JavascriptExecutor)driver;
          jse8.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse8.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse8.executeScript("window.scrollBy(0,-900)");
          
                    
          Thread.sleep(1500);
          test.pass("TVS JUPITER 125 selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS JUPITER 125 not selected successfully");
		 	 }
		 }
          
 @Test(priority=38)
 public void TVSNTORQ() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS NTORQ");
		  
		  Thread.sleep(2000);
		 try {
 
                    
          WebElement SelectVehicle7 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle7.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement7 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown7 = new Select(dropdownElement7);
          
          dropdown7.selectByVisibleText("TVS NTORQ");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse9 = (JavascriptExecutor)driver;
          jse9.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse9.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse9.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS NTORQ selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS NTORQ not selected successfully");
		 	 }
		 }
          
 @Test(priority=39)
 public void TVSRAIDER() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS RAIDER");
		  
		  Thread.sleep(2000);
		 try {
          
          WebElement SelectVehicle8 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle8.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement8 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown8 = new Select(dropdownElement8);
          
          dropdown8.selectByVisibleText("TVS RAIDER");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse10 = (JavascriptExecutor)driver;
          jse10.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse10.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse10.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS RAIDER selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS RAIDER not selected successfully");
		 	 }
		 }
 
 @Test(priority=40)
 public void TVSRADEON() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS RADEON");
		  
		  Thread.sleep(2000);
		 try {
          
          WebElement SelectVehicle9 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle9.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement9 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown9 = new Select(dropdownElement9);
          
          dropdown9.selectByVisibleText("TVS RADEON");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse11 = (JavascriptExecutor)driver;
          jse11.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse11.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse11.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS RADEON selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS RADEON not selected successfully");
		 	 }
		 }
 
 @Test(priority=41)
 public void TVSSCOOTYPEPPLUS() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS SCOOTY PEP PLUS");
		  
		  Thread.sleep(2000);
		 try {
                 
                  
          
          WebElement SelectVehicle11 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle11.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement11 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown11 = new Select(dropdownElement11);
          
          dropdown11.selectByVisibleText("TVS SCOOTY PEP PLUS");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse13 = (JavascriptExecutor)driver;
          jse13.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse13.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse13.executeScript("window.scrollBy(0,-900)");
 
          
          Thread.sleep(1500);
          
          test.pass("TVS SCOOTY PEP PLUS selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS SCOOTY PEP PLUS not selected successfully");
		 	 }
		 }
          
 @Test(priority=42)
 public void TVSSPORT() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS SPORT");
		  
		  Thread.sleep(2000);
		 try {
          
          
          WebElement SelectVehicle12 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle12.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement12 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown12 = new Select(dropdownElement12);
          
          dropdown12.selectByVisibleText("TVS SPORT");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse14 = (JavascriptExecutor)driver;
          jse14.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse14.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse14.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS SPORT selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS SPORT not selected successfully");
		 	 }
		 }
 @Test(priority=43)
 public void TVSSTARCITYPLUS() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS STARCITY PLUS");
		  
		  Thread.sleep(2000);
		 try {
 
          
          WebElement SelectVehicle13 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle13.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement13 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown13 = new Select(dropdownElement13);
          
          dropdown13.selectByVisibleText("TVS STARCITY PLUS");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse15 = (JavascriptExecutor)driver;
          jse15.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse15.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse15.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS STARCITY PLUS selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS STARCITY PLUS not selected successfully");
		 	 }
		 }
 
 @Test(priority=44)
 public void TVSVICTOR() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS VICTOR");
		  
		  Thread.sleep(2000);
		 try {
          
          
          WebElement SelectVehicle14 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle14.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement14 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown14 = new Select(dropdownElement14);
          
          dropdown14.selectByVisibleText("TVS VICTOR");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse16 = (JavascriptExecutor)driver;
          jse16.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse16.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse16.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS VICTOR selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS VICTOR not selected successfully");
		 	 }
		 }
 
 @Test(priority=45)
 public void TVSWEGO() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS WEGO");
		  
		  Thread.sleep(2000);
		 try {
          
          WebElement SelectVehicle15 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle15.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement15 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown15 = new Select(dropdownElement15);
          
          dropdown15.selectByVisibleText("TVS WEGO");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse17 = (JavascriptExecutor)driver;
          jse17.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse17.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse17.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS WEGO selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS WEGO not selected successfully");
		 	 }
		 }
 
 @Test(priority=46)
 public void TVSXL100() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS XL100");
		  
		  Thread.sleep(2000);
		 try {
          
          WebElement SelectVehicle16 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle16.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement16 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown16 = new Select(dropdownElement16);
          
          dropdown16.selectByVisibleText("TVS XL100");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse18 = (JavascriptExecutor)driver;
          jse18.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse18.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse18.executeScript("window.scrollBy(0,-900)");
          
          Thread.sleep(1500);
          
          test.pass("TVS XL100 selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS XL100 not selected successfully");
		 	 }
		 }
 
 @Test(priority=47)
 public void TVSZEST() throws InterruptedException {
		  test = extent.createTest("Select Vehicle TVS ZEST");
		  
		  Thread.sleep(2000);
		 try {
 
 
          
          WebElement SelectVehicle17 = driver.findElement(By.xpath("//select[@class='coll-filter']"));
		  SelectVehicle17.click();
		  
		  Thread.sleep(1500);
          
          WebElement dropdownElement17 = driver.findElement(By.className("coll-filter"));
          
          Select dropdown17 = new Select(dropdownElement17);
          
          dropdown17.selectByVisibleText("TVS ZEST");
          
          Thread.sleep(1000);
          
          JavascriptExecutor jse19 = (JavascriptExecutor)driver;
          jse19.executeScript("window.scrollBy(0,400)");
          
          Thread.sleep(1500);
          
          jse19.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1500);
          jse19.executeScript("window.scrollBy(0,-900)");
          
          test.pass("All dropdowns working as expected");
          
          test.pass("TVS ZEST selected successfully");}

		 catch(Exception e) 
		 {
		 	 test.fail("TVS ZEST not selected successfully");
		 	 }
		 }
               
          
                                    
 
 
 
 @Test(priority=48)

 public void AddtocartPLPPage() throws InterruptedException {
		  test = extent.createTest("Addtocart from PLP Page");
		 try { 
			 
		  Thread.sleep(1500);  
		  WebElement Logo = driver.findElement(By.xpath("//a[@class='header__heading-link focus-inset']//img[@alt='TVS Motor Company']"));
		  Logo.click();
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
          jse1.executeScript("window.scrollBy(0,1100)");
 
          WebElement Addtocart = driver.findElement(By.xpath("//form[@id='form-8489269723418-']//a[@class='button button-ATC quick'][normalize-space()='Add To Cart']"));
          Addtocart.click();
          
          Thread.sleep(2000);
          
          WebElement Size = driver.findElement(By.xpath("//span[@class='text'][normalize-space()='L']"));
          Size.click();
 
          Thread.sleep(2000);
          
          WebElement Color = driver.findElement(By.xpath("//label[@for='option-quick-view-8489269723418-Color-8']//span[@class='pattern']"));
          Color.click();
          
          Thread.sleep(2000);
          
          WebElement Increase = driver.findElement(By.xpath("//a[@class='plus btn-quantity']"));
          Increase.click();
          
          Thread.sleep(2000);
          
          WebElement Decrease = driver.findElement(By.xpath("//a[@class='minus btn-quantity']"));
          Decrease.click();
 
          Thread.sleep(2000);
          
          WebElement Addtocart1 = driver.findElement(By.xpath("//button[@id='product-quick-shop-add-to-cart']"));
          Addtocart1.click();
 
          Thread.sleep(2000);
          
          WebElement Delete = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
          Delete.click();
          
          Thread.sleep(2000);
          
          WebElement Closeminicart = driver.findElement(By.xpath("//div[@id='halo-cart-sidebar']//button[@aria-label='Close'][normalize-space()='Close']//*[name()='svg']//*[name()='path' and contains(@d,'M 38.98242')]"));
          Closeminicart.click();
          
          test.pass("Add to cart from PLP page working as expected");}
		 
		 catch(Exception e) 
		 {
		 	 test.fail("Add to cart from PLP page not working as expected");
		 	 }
		 }
 
    @Test(priority=49)
         public void PDPPage() throws InterruptedException {
		  test = extent.createTest("PDP Page");
          
		  Thread.sleep(2000);
		try {  
		  WebElement Logo = driver.findElement(By.xpath("//a[@class='header__heading-link focus-inset']//img[@alt='TVS Motor Company']"));
		  Logo.click();
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
          jse1.executeScript("window.scrollBy(0,1100)");
          
          WebElement Product = driver.findElement(By.xpath("//a[@title='TVS Racing Aegis 3-Layer Riding Jacket for Men- All Weather Adaptability, CE Level 2 Armour Protection-Premium Bike Jackets for Bikers (Red)']"));
          Product.click();
    
          JavascriptExecutor jse2 = (JavascriptExecutor)driver;
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,400)");
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,-3600)");
          
          Thread.sleep(1000);
          WebElement Color = driver.findElement(By.xpath("//label[@value='black']//span[@class='pattern']"));
          Color.click();
          
          Thread.sleep(1000);
          WebElement Color1 = driver.findElement(By.xpath("//label[@value='neon']//span[@class='pattern']"));
          Color1.click();
          
          Thread.sleep(1000);
          WebElement Color2 = driver.findElement(By.xpath("//label[@value='white']//span[@class='pattern']"));
          Color2.click();
         
          Thread.sleep(1000);
          WebElement Size = driver.findElement(By.xpath("//label[@for='option-8489269723418-Size-1']//span[@class='text'][normalize-space()='L']"));
          Size.click();
          
          Thread.sleep(1000);
          WebElement Size1 = driver.findElement(By.xpath("//label[@for='option-8489269723418-Size-2']//span[@class='text'][normalize-space()='XL']"));
          Size1.click();
          
          Thread.sleep(1000);
          WebElement Size2 = driver.findElement(By.xpath("//label[@for='option-8489269723418-Size-3']//span[@class='text'][normalize-space()='XXL']"));
          Size2.click();
          
          Thread.sleep(1000);
          WebElement SizeChart = driver.findElement(By.xpath("//button[@id='myBtn_size_chart']"));
          SizeChart.click(); 
         
          Thread.sleep(1000);
          WebElement CloseChart = driver.findElement(By.xpath("//div[@id='myModal_size_chart']//span[@class='close'][normalize-space()='×']"));
          CloseChart.click(); 
          
          Thread.sleep(1000);
          WebElement IncreaseQuantity = driver.findElement(By.xpath("//quantity-input[@class='productView-quantity quantity__group quantity__group--2 quantity__style--1 clearfix']//button[@name='plus']"));
          IncreaseQuantity.click(); 
          
          Thread.sleep(1000);
          WebElement DecreaseQuantity = driver.findElement(By.xpath("//quantity-input[@class='productView-quantity quantity__group quantity__group--2 quantity__style--1 clearfix']//button[@name='minus']"));
          DecreaseQuantity.click();
          
          jse2.executeScript("window.scrollBy(0,400)");
                    
          Thread.sleep(1000);
          WebElement Pincode = driver.findElement(By.xpath("//input[@placeholder='Enter Your Pincode...']"));
          Pincode.sendKeys("248001");
          Thread.sleep(1000);
          
          Thread.sleep(1000);
          WebElement Check = driver.findElement(By.xpath("//button[normalize-space()='Check']"));
          Check.click(); 
          
          Thread.sleep(1000);
          jse2.executeScript("window.scrollBy(0,300)");
          
          Thread.sleep(1000);
          WebElement Addtocart = driver.findElement(By.xpath("//button[@id='product-add-to-cart']"));
          Addtocart.click();
          
          Thread.sleep(4000);
          WebElement CloseCart = driver.findElement(By.xpath("//div[@id='halo-cart-sidebar']//button[@aria-label='Close'][normalize-space()='Close']//*[name()='svg']"));
          CloseCart.click();
          
          Thread.sleep(2000);
          WebElement ReturnPolicy = driver.findElement(By.xpath("//p[normalize-space()='Return Policy']"));
          ReturnPolicy.click();
          
          Thread.sleep(2000);
          WebElement ClosePolicy = driver.findElement(By.xpath("//div[@id='custom_modal_ploicy']//span[@class='close'][normalize-space()='×']"));
          ClosePolicy.click();
          
          Thread.sleep(2000);
          WebElement COD = driver.findElement(By.xpath("//button[@id='cod__popup_modal_btn']"));
          COD.click();
          
          Thread.sleep(2000);
          WebElement CloseCOD = driver.findElement(By.xpath("//div[@id='cod_modal_popup']//span[@class='close'][normalize-space()='×']"));
          CloseCOD.click();
          
          Thread.sleep(2000);
          WebElement BuyNow = driver.findElement(By.xpath("//span[normalize-space()='Buy Now']"));
          BuyNow.click();
          
          Thread.sleep(5000);
          
          driver. navigate(). back();
          
          Thread.sleep(5000);
          
          JavascriptExecutor jse25 = (JavascriptExecutor)driver;
          jse25.executeScript("window.scrollBy(0,-400)");
          
          
          
          
          
          test.pass("PDP functionality working as expected");}
		catch(Exception e) 
		 {
		 	 test.fail("PDP functionality working as expected");
		 	 }
		 }
          
          
          
    
	 
  @Test(priority=50)
  public void Login() throws InterruptedException {
		  test = extent.createTest("Login");
	  
	  try {
	 WebElement Login = driver.findElement(By.xpath("//span[@class='account_icon']//*[name()='svg']"));
	  Login.click();
	  
	  Thread.sleep(2000);  
	  WebElement Mobile = driver.findElement(By.xpath("//div[@class='input-box-content mobile-no-inner active']//input[@placeholder='Phone Number']"));
	  Mobile.sendKeys("9876543456");
	  
	  Thread.sleep(2000); 
	  
	  WebElement RequestOTP = driver.findElement(By.xpath("//span[normalize-space()='Request OTP']"));
	  RequestOTP.click();
	  
	  Thread.sleep(5000);
	  test.pass("Login successfully");}
	   
	  
	  catch(Exception e) 
		 {
		 	 test.fail("Login not successfull");
		 	 }
		 }
	  
	  

	  @Test(priority=51)

  public void Addtocart() throws InterruptedException {
		 test = extent.createTest("AddToCart");
	  try {
	 		  		
	  WebElement Search = driver.findElement(By.xpath("(//*[name()='svg'][@class='modal__toggle-open icon icon-search '])[1]"));
	  Search.click();
	  
	  Thread.sleep(1000);
	  
	  WebElement SearchItem = driver.findElement(By.xpath("//summary[@aria-label='Search']//div[@class='container']//input[@id='Search-In-Modal']"));
	  SearchItem.sendKeys("Delivery");
	  
	   
	  
	  driver.findElement(By.xpath("//summary[@aria-label='Search']//div[@class='container']//input[@id='Search-In-Modal']")).sendKeys(Keys.ENTER);
	  
	  Thread.sleep(5000);	  
	  WebElement Product = driver.findElement(By.xpath("//button[@id='product-add-to-cart']"));
	  Product.click();
	  
	  Thread.sleep(10000);
	  test.pass("Add to cart successfully");}
	  
	  
	  
	  catch(Exception e) 
		 {
		 	 test.fail("Not able to add to cart");
		 	 }
		 }
	  
	  @Test(priority=52)
	  
	 
  public void IncreaseQuantity() throws InterruptedException {
		 test = extent.createTest("IncreaseQuantity");
		 try {
	  WebElement IncreaseQuantity = driver.findElement(By.xpath("//a[@class='plus btn-quantity']"));
	  IncreaseQuantity.click();
	  
	  test.pass("Increase quantity functionality working fine");
	  
	  Thread.sleep(5000);}
		 
		 catch(Exception e) 
		 {
		 	 test.fail("Not able to increase the quantity");
		 	 }
		 }
	  
	  
	  @Test(priority=53)

	  public void DecreaseQnantity() throws InterruptedException {
			 test = extent.createTest("DecreaseQnantity");
	  
	  try {
	  WebElement DecreaseQnantity = driver.findElement(By.xpath("//a[@class='minus btn-quantity']"));
	  DecreaseQnantity.click();
	  
	  test.pass("Decrease quantity functionality working fine");
	  Thread.sleep(5000);      }
	  
	  catch(Exception e) 
		 {
		 	 test.fail("Not able to decrease the quantity");
		 	 }
		 }
	  
	  
	  @Test(priority=54)

	  public void ViewCartPage() throws InterruptedException {
			 test = extent.createTest("ViewCartPage");
	 try {
	  WebElement ViewCart = driver.findElement(By.xpath("//a[normalize-space()='View Cart']"));
	  ViewCart.click();
	  
	  test.pass("View cart page in open successfully");}
	 catch(Exception e) 
	 {
	 	 test.fail("Not able to increase the quantity");
	 	 }
	 }
	  
	  
	  
	  @Test(priority=55)
	  
	 	  public void CheckoutPage() throws InterruptedException {
			 test = extent.createTest("CheckoutPage");
	 try {
	  WebElement PlaceOrder = driver.findElement(By.xpath("//button[@class='button']"));
	  PlaceOrder.click();
	  Thread.sleep(2000);
	  test.pass("Redirect to checkout page successfully");
	  Thread.sleep(1000);}
	  	  
	 catch(Exception e) 
	 {
	 	 test.fail("Not able redirect to checkout page");
	 	 }
	 }
	 
	  
	  public void takeScreenshot(String fileName) {
         try {
             destDir = "./Screenshots";
             File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
             dateFormat = new SimpleDateFormat("dd-MMM-YYYY__hh_mm_ssaa");
             new File(destDir).mkdirs(); // Creating directories recursively if they don't exist
             String timestamp = dateFormat.format(new Date());
             String screenshotPath = destDir + "/" + fileName + "_" + timestamp + ".png";
             FileUtils.copyFile(srcFile, new File(screenshotPath));
             System.out.println("Screenshot captured: " + screenshotPath);
         } catch (Exception e) {
             System.out.println("Failed to capture screenshot: " + e.getMessage());
         }
     }
	  
	  
	  
	 @AfterClass
     public void endSession() {
         // Quit driver
         driver.quit();
         extent.flush();}
     
	 
}


  

  
  
		
  


	
