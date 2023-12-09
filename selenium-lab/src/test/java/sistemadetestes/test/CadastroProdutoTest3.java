import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CadastroProdutoTest extends BaseTest {

	
	//CASO 7
    @Test
    public void TC003_deveResetarCamposAoClicarLimpar() {
        CadastroProdutoPO cadastroProdutoPO = new CadastroProdutoPO(driver);

       
        cadastroProdutoPO.clicarBotaoLimpar();

      
        assertTrue("Os campos não foram resetados corretamente", cadastroProdutoPO.verificarCamposResetados());
    }
}
