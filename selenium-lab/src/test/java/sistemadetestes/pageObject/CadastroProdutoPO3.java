import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroProdutoPO extends BasePO {

	
	// CASO NÚMERO 7
    @FindBy(id = "btnLimpar")
    private WebElement btnLimpar;

    @FindBy(id = "campo1")
    private WebElement campo1;

    @FindBy(id = "campo2")
    private WebElement campo2;

    

    public CadastroProdutoPO(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clicarBotaoLimpar() {
        btnLimpar.click();
    }

    public boolean verificarCamposResetados() {
      
        return campo1.getText().isEmpty() && campo2.getText().isEmpty();
    }
}
