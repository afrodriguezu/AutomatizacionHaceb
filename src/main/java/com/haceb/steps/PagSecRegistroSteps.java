package com.haceb.steps;

import com.haceb.pageObject.PagSecRegistroPage;
import com.haceb.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.support.ui.Select;

public class PagSecRegistroSteps {

    @Page
    PagSecRegistroPage pagSecRegistroPage;

    @Step("Ingresar Cedula")
    public void numCedula(){
        pagSecRegistroPage.campoCedula.sendKeys(Data.extractTo().get(0).get("Cedula"));}

    @Step("Seleccionar Genero")
    public void selGenero(){
        Select select = new Select(pagSecRegistroPage.campoGenero);
        select.selectByVisibleText(Data.extractTo().get(0).get("Genero"));
    }

    @Step("Seleccionar Fecha de Nacimiento")
    public void selFechaNac(){
        pagSecRegistroPage.fechaNacimiento.sendKeys(Data.extractTo().get(0).get("Fecha"));}

    @Step("Seleccionar Codigo Telefonico del Pais")
    public void selCodPais(){
        pagSecRegistroPage.codPais.sendKeys(Data.extractTo().get(0).get("CodigoPais"));}

    @Step("Digitar Numero de Telefono")
    public void digNumTelefono(){
        pagSecRegistroPage.numTelefono.sendKeys(Data.extractTo().get(0).get("Telefono"));}

    @Step("Seleccionar Departamento")
    public void selDepartamento(){
        Select select = new Select(pagSecRegistroPage.departamento);
        select.selectByVisibleText(Data.extractTo().get(0).get("Departamento"));}

    @Step("Seleccionar Ciudad")
    public void selCiudad(){
        Select select = new Select(pagSecRegistroPage.ciudad);
        select.selectByVisibleText(Data.extractTo().get(0).get("Ciudad"));}

    @Step("Clic en boton enviar")
    public void clicEnviar(){
        pagSecRegistroPage.btnEnviar.click();
    }

}
