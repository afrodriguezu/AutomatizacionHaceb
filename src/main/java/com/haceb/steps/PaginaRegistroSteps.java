package com.haceb.steps;


import com.haceb.pageObject.PaginaRegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;

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


}
