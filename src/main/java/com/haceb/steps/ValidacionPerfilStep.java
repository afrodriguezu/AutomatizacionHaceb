package com.haceb.steps;

import com.haceb.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static com.haceb.utils.Esperas.espera3;


public class ValidacionPerfilStep {

    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Validacion del enlace del perfil")
    public void validacionPerfil(){

        espera3(paginaInicialPage.getDriver(),paginaInicialPage.nombrePerfil);

        Assert.assertEquals(
                paginaInicialPage.nombrePerfil.getText(),
                Matchers.equalTo("Hola")
        );
    }

}
