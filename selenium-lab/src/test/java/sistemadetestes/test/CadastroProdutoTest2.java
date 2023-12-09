import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CadastroProdutoTest extends BaseTest {

	
	//CASO 3
    @Test
    public void TC002_deveAbrirTelaCadastroAoClicarCriar() {
        CadastroProdutoPO cadastroProdutoPO = new CadastroProdutoPO(driver);

        
        cadastroProdutoPO.clicarBotaoCriar();

       
        assertTrue("A tela de cadastro não foi aberta", cadastroProdutoPO.telaCadastroEstaAberta());
    }
}
