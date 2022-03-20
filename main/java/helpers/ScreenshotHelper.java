package helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.io.File;
import java.io.IOException;

public class ScreenshotHelper extends BasePage {

    public ScreenshotHelper(WebDriver driver) {
        super(driver);
    }

    public void takeScreenshot() {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(scrFile, new File("src/main/resources/screenshot_" + System.nanoTime() + ".png"));
        } catch (IOException e) {
            System.err.println("It is not possible to take a screenshot");
        }
    }
}
