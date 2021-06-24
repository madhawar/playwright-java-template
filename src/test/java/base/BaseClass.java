package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BlogHome;
import pages.BlogPost;

public class BaseClass {
    private Browser browser;

    protected BlogHome blogHome;
    protected BlogPost blogPost;

    @BeforeMethod
    public void setUp(){
        browser = Playwright
                .create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.setViewportSize( 1920, 1080);
        page.navigate("https://emojipedia.org");

        blogHome = new BlogHome(page);
        blogPost = new BlogPost(page);
    }

    @AfterMethod
    public void tearDown(){
        browser.close();
    }

}
