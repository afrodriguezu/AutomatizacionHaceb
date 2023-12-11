package com.haceb.steps;

import com.haceb.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static com.haceb.utils.Esperas.espera1;
import static com.haceb.utils.Esperas.espera2;

public class PaginaInicialSteps {
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abrir Navegador")
    public void abrirNavegador(){paginaInicialPage.openUrl("https://www.haceb.com/");}

    @Step("Pararse en Mi perfil")
    public void posicionarMiPerfil(){paginaInicialPage.spanIconoMiPerfil.click();}

    @Step("Seleccionar Registro")
    public void seleccionRegistro(){paginaInicialPage.divRegistro.click();}

    @Step("Cerrar PopUp en caso de ser visible")
    public void cerrarPopUp() {

        espera1(paginaInicialPage.getDriver(),paginaInicialPage.divCerrarPopUp);

        try {
            boolean visible = paginaInicialPage.divCerrarPopUp.isVisible();
            if (visible) {
                paginaInicialPage.divCerrarPopUp.click();
            }
        } catch (NoSuchElementException ignored) {
        }
    }

    @Step("Ingresar nueva ventana")
    public void ventanaNueva(){

        WebDriver driver = paginaInicialPage.getDriver();
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        paginaInicialPage.getDriver().manage().window().maximize();
    }

    @Step("Boton Ingresar a Haceb")
    public void ingresarHaceb(){paginaInicialPage.buttonIngresar.click();}

}
