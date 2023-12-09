import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CadastroProdutoTest extends BaseTest {

	
	//CASO NÚMERO 4
    @Test
    public void TC001_deveFecharTelaCadastroAoClicarSair() {
        CadastroProdutoPO cadastroProdutoPO = new CadastroProdutoPO(driver);

        cadastroProdutoPO.clicarBotaoSair();

        
        assertFalse("A tela de cadastro ainda está aberta", cadastroProdutoPO.telaCadastroEstaAberta());
    }
}
