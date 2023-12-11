package com.haceb.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PagSecRegistroPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//input[@data-display-name='Cedula']")
    public WebElementFacade campoCedula;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-dropdown-153944062160082270']")
    public WebElementFacade campoGenero;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-textbox-29430652596742216']")
    public WebElementFacade fechaNacimiento;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-profile-form']/div[1]/div[6]/fieldset/select")
    public WebElementFacade codPais;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-profile-form']/div[1]/div[6]/fieldset/input")
    public WebElementFacade numTelefono;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-dropdown-92626747568210580']")
    public WebElementFacade departamento;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-dropdown-68670919361457840']")
    public WebElementFacade ciudad;

    @FindBy(how = How.XPATH, using = "//*[@id='gigya-profile-form']/div[2]/div[8]/font/font/input")
    public WebElementFacade btnEnviar;
}
