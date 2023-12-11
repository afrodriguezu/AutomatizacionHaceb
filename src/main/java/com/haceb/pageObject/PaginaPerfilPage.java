package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaPerfilPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Hola']")
    public WebElementFacade nombrePerfil;
}
