import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroProdutoPO extends BasePO {

	
	//CASO NÚMERO 4
    @FindBy(id = "btnSair")
    private WebElement btnSair;

    

    public CadastroProdutoPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicarBotaoSair() {
        btnSair.click();
    }
    
    public boolean telaCadastroEstaAberta() {
       

        try {
            driver.findElement(By.id("tituloCadastro"));  
            return true;  
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;  // 
        }
}
