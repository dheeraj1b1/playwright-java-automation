import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test
    public void testPlaywrightIsWorking() {
        // 1. Initialize Playwright
        try (Playwright playwright = Playwright.create()) {

            // 2. Launch a browser (Headed mode so you can see it)
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));

            // 3. Create a new page (like a new tab)
            Page page = browser.newPage();

            // 4. Navigate and print the title
            page.navigate("https://playwright.dev/java");
            System.out.println("Page Title is: " + page.title());

            // 5. Cleanup is handled by try-with-resources
        }
    }
}