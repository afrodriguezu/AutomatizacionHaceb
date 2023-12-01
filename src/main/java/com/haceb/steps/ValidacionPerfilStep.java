package com.haceb.steps;

import com.haceb.pageObject.PaginaRegistroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.haceb.utils.Esperas.espera2;
import static com.haceb.utils.Esperas.espera3;


public class ValidacionPerfilStep {

    @Page
    PaginaRegistroPage paginaRegistroPage;
    @Step("Validacion del enlace del perfil")
    public void validacionPerfil(){

        espera3(paginaRegistroPage.getDriver(),paginaRegistroPage.nombrePerfil);

        Assert.assertTrue(
                paginaRegistroPage.nombrePerfil.isDisplayed()
        );
    }

}
