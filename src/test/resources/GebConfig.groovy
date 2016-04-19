import io.github.bonigarcia.wdm.Architecture
import io.github.bonigarcia.wdm.ChromeDriverManager
import io.github.bonigarcia.wdm.EdgeDriverManager
import io.github.bonigarcia.wdm.InternetExplorerDriverManager
import io.github.bonigarcia.wdm.PhantomJsDriverManager
import org.apache.commons.collections.map.HashedMap
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DesiredCapabilities

baseUrl = 'http://localhost:4503'

waiting{
    timeout = 2
}

environments{
    'firefox'{
        driver = {
            new FirefoxDriver()
        }
    }
    'chrome'{
        ChromeDriverManager.getInstance().setup()
        driver = {
            new ChromeDriver()
        }
    }
    'htmlunit'{
        new HtmlUnitDriver()
    }
    'phantomjs'{
        PhantomJsDriverManager.getInstance().setup()
        driver = {
            new PhantomJSDriver()
        }
    }
    'chrome-android'{
        ChromeDriverManager.getInstance().setup()
        driver = {
            Map<String, String> mobileEmulation = new HashMap<>()
            mobileEmulation.put("deviceName", "Google Nexus 5")
            Map<String, String> chromeOptions = new HashMap<>()
            chromeOptions.put("mobileEmulation", mobileEmulation)
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome()
            desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions)
            new ChromeDriver(desiredCapabilities)
        }
    }
//    'ie'{
//        InternetExplorerDriverManager.getInstance().setup()
//        driver = {
//            new InternetExplorerDriver()
//        }
//    }
//    'edge' {
//        EdgeDriverManager.getInstance().setup()
//        driver = {
//            new EdgeDriver()
//        }
//    }
}