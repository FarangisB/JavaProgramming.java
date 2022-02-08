package day45_Interface.BrowsersTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        EdgeDriver edge = new EdgeDriver();
        FireFoxDriver fireFox = new FireFoxDriver();
        OperaDriver opera = new OperaDriver();
        SafariDriver safari = new SafariDriver();

        chrome.close();
        chrome.executeScript("moving");
        edge.findElement("name");
        edge.getBrowserName();
        fireFox.findElements("Id");
        fireFox.getTitle();
        opera.takeScreenShot();
        opera.quit();
        safari.close();
        safari.executeScript("Dance");



    }
}
