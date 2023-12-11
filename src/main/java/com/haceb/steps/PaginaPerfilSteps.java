package com.haceb.steps;

import com.haceb.pageObject.PaginaPerfilPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static com.haceb.utils.Esperas.espera2;

public class PaginaPerfilSteps {

    @Page
    PaginaPerfilPage paginaPerfilPage;

    @Step("Ingresar Ventana Perfil")
    public void ventanaPerfil(){

        espera2(paginaPerfilPage.getDriver(),paginaPerfilPage.nombrePerfil);

        WebDriver driver = paginaPerfilPage.getDriver();
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String windowHandle : allWindows) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
