import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroProdutoPO2 extends BasePO {

	
		//CASO 3
    @FindBy(id = "btnCriar")
    private WebElement btnCriar;

   

    public CadastroProdutoPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicarBotaoCriar() {
        btnCriar.click();
    }
    
    public boolean telaCadastroEstaAberta() {
        try {
         
            driver.findElement(By.id("elementoNaTelaCadastro"));  
            return true;  
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;  
        }
}
