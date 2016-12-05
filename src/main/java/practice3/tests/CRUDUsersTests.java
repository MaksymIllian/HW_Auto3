package practice3.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import practice3.data.classes.Player;
import practice3.pages.EditPlayerPage;
import practice3.pages.PlayersPage;

/**
 * Created by User on 05.12.2016.
 */
public class CRUDUsersTests {

    WebDriver driver;
    PlayersPage playersPage;
    EditPlayerPage editPlayerPage;
    Player player;
    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
        playersPage = new PlayersPage(driver);
        editPlayerPage = new EditPlayerPage(driver);
    }

    @Test
    public void createPositiveTest() {
        playersPage.insertPlayer();
        player = new Player();
        editPlayerPage.setUserName(player.getUserName());
        editPlayerPage.setPassword(player.getPassword());
        editPlayerPage.setConfirmPassword(player.getPassword());
        editPlayerPage.setEMail(player.getEmail());
        editPlayerPage.setSName(player.getfName());
        editPlayerPage.setLName(player.getlName());
        editPlayerPage.setPhone(player.getPhone());
        editPlayerPage.setCity(player.getCity());
        editPlayerPage.setAddress(player.getAddress());
        editPlayerPage.save();
    }
}
