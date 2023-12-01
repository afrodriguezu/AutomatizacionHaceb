package com.haceb.steps;


import com.haceb.pageObject.PaginaRegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

import static com.haceb.utils.Esperas.espera1;
import static com.haceb.utils.Esperas.espera2;

public class PaginaRegistroSteps {

    @Page
    PaginaRegistroPage paginaRegistroPage;

    @Step("Insertar Correo")
    public void correoElectronico(){
        paginaRegistroPage.correoElectronico.sendKeys(Data.extractTo().get(0).get("Correo"));
    }
    @Step("Insertar Nombre")
    public void nombre(){
        paginaRegistroPage.inpNombre.sendKeys(Data.extractTo().get(0).get("Nombre"));
    }
    @Step("Insertar Apellido")
    public void apellido(){
        paginaRegistroPage.inpApellido.sendKeys(Data.extractTo().get(0).get("Apellido"));
    }
    @Step("Ingresar Contraseña")
    public void ingresaContrasena(){
        paginaRegistroPage.inpContraseña.sendKeys(Data.extractTo().get(0).get("Contrasena"));
    }
    @Step("Confirma Contraseña")
    public void confirmaContrasena(){
        paginaRegistroPage.inpConfirmaCon.sendKeys(Data.extractTo().get(0).get("ConfirmaContrasena"));
    }
    @Step("Clic Checkbox")
    public void clicCheckboxTc(){
        JavascriptExecutor js = (JavascriptExecutor) paginaRegistroPage.getDriver();
        js.executeScript("arguments[0].click();", paginaRegistroPage.checkBoxTyC);
    }
    @Step("Clic en Si Acepto")
    public void clicAcepto(){
        paginaRegistroPage.siAcepto.click();
    }

    @Step("Clic en Registrarme")
    public void clicRegistrarme(){
        paginaRegistroPage.btnRegistrame.click();
    }

    @Step("Ingresar Cedula")
    public void numCedula(){
        paginaRegistroPage.campoCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));}

    @Step("Seleccionar Genero")
    public void selGenero(){
        Select select = new Select(paginaRegistroPage.campoGenero);
        select.selectByVisibleText(Data.extractTo().get(0).get("Genero"));
    }

    @Step("Seleccionar Fecha de Nacimiento")
    public void selFechaNac(){
        paginaRegistroPage.fechaNacimiento.sendKeys(Data.extractTo().get(0).get("Fecha"));}

    @Step("Seleccionar Codigo Telefonico del Pais")
    public void selCodPais(){
        paginaRegistroPage.codPais.sendKeys(Data.extractTo().get(0).get("CodigoPais"));}

    @Step("Digitar Numero de Telefono")
    public void digNumTelefono(){
        paginaRegistroPage.numTelefono.sendKeys(Data.extractTo().get(0).get("Telefono"));}

    @Step("Seleccionar Departamento")
    public void selDepartamento(){
        Select select = new Select(paginaRegistroPage.departamento);
        select.selectByVisibleText(Data.extractTo().get(0).get("Departamento"));}

    @Step("Seleccionar Ciudad")
    public void selCiudad(){
        Select select = new Select(paginaRegistroPage.ciudad);
        select.selectByVisibleText(Data.extractTo().get(0).get("Ciudad"));}

    @Step("Clic en boton enviar")
    public void clicEnviar(){
        paginaRegistroPage.btnEnviar.click();
    }

    @Step("Ingresar Ventana Perfil")
    public void ventanaPerfil(){

        espera2(paginaRegistroPage.getDriver(),paginaRegistroPage.nombrePerfil);
        /*try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        WebDriver driver = paginaRegistroPage.getDriver();
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
