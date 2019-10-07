package classesAuxiliares;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.Scenario;

public class AfterTeste {
	private Screen s = new Screen();
	private static AfterTeste instancia = new AfterTeste();
	private Screenshot screenshot = Screenshot.getInstance();
	private AbrirFecharRotinas cadastro = AbrirFecharRotinas.getInstance();
	private Pattern m_popup = new Pattern(getImage("imgGeral/popup.png")).similar(0.90f);

	private String imageString;

	private String getImage(String path) {

		URL url = getClass().getClassLoader().getResource(path);
		imageString = url.toString();
		return imageString;
	}

	public static AfterTeste getInstance(){
		if (instancia ==null){
			instancia = new AfterTeste();
		}
		return instancia;
	}


	public void validaExecucao(Scenario scenario, String classeTeste) throws ClassNotFoundException, InterruptedException, SQLException, IOException, FindFailed{

		if(!scenario.isFailed()){
			if (App.focus("") != null) {
				if (s.exists(m_popup) != null) {
					s.click(m_popup);
					s.wait(5.0);
					s.type(Key.ESC);
					System.out.println("OK - Fechando popup");
					s.wait(3.0);
				}
			}
		}

		if(scenario.isFailed()){
			screenshot.tiraScreenshot(scenario, classeTeste);
		}

		
		cadastro.fecharBaixaParcela();
		cadastro.sairPedido();
		cadastro.sairOrcamento();
	}
}