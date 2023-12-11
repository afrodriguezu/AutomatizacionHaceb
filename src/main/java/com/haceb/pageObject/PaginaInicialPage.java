package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaInicialPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//span[@class='icon-user']")
    public WebElementFacade spanIconoMiPerfil;

    @FindBy(how = How.XPATH, using = "//a[@class='cdc-fire cdc-register']")
    public WebElementFacade divRegistro;

    @FindBy(how = How.XPATH, using = "//div[@class='gigya-screen-dialog-top']")
    public WebElementFacade divCerrarPopUp;

    @FindBy(how = How.XPATH, using = "//button[@id='vtexIdUI-custom-oauth']")
    public WebElementFacade buttonIngresar;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-profile-form']/div[4]/div[3]/input")
    public WebElementFacade nombrePerfil;



}
