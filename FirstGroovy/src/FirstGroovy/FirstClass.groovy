package FirstGroovy

import groovy.grape.Grape
import org.openqa.selenium.firefox.*
import geb.Browser
import org.openqa.selenium.chrome.*
/*
@Grapes ([
        @GrabConfig(systemClassLoader=true),
        @Grab("org.gebish:geb-core:0.9.2"),
        @Grab("org.seleniumhq.selenium:selenium-firefox-driver:2.26.0"),
         @Grab("org.seleniumhq.selenium:selenium-support:2.26.0")
         ])

@Grapes([
	@Grab("org.gebish:geb-core:0.9.2"),
	@Grab("org.seleniumhq.selenium:selenium-firefox-driver:2.42.2"),
	@Grab("org.seleniumhq.selenium:selenium-support:2.26.0")
])

 def browser = new Browser (driver: new FirefoxDriver())
//def url = www.google.com
browser.baseUrl("www.google.com")	
browser.go(baseUrl)
    println "Hi, kumar"
	
	//new File("c:\\foo.txt").eachLine { line -> println(line) }
*/

System.setProperty("webdriver.chrome.driver", "C:\\Kumar\\Kumar\\Kumar\\Seleniumm\\chromedriver_test\\chromedriver_test\\chrome-win32\\chromedriver.exe");
def driver = new Browser(driver: new ChromeDriver())
ChromeOptions options = new ChromeOptions();
options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));

Browser.drive {
	go "www.google.com" 
}

