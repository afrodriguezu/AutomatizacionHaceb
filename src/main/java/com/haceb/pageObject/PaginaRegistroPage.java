package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaginaRegistroPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Correo electrónico *']")
    public WebElementFacade correoElectronico;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-72173553995486780']")
    public WebElementFacade inpNombre;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-textbox-146410824335495100']")
    public WebElementFacade inpApellido;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-password-54061940132406190']")
    public WebElementFacade inpContraseña;

    @FindBy(how = How.XPATH, using = "//input[@id='gigya-password-142670944012194750']")
    public WebElementFacade inpConfirmaCon;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-register-form']/div[2]/div[9]/label/span")
    public WebElementFacade checkBoxTyC;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-register-form']/div[2]/div[10]/div[2]/label")
    public WebElementFacade siAcepto;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-register-form']/div[2]/div[11]/input")
    public WebElementFacade btnRegistrame;


}
