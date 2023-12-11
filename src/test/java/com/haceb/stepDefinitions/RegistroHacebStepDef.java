package com.haceb.stepDefinitions;

import com.haceb.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroHacebStepDef {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    PaginaPerfilSteps paginaPerfilSteps;

    @Steps
    PaginaRegistroSteps paginaRegistroSteps;

    @Steps
    PagSecRegistroSteps pagSecRegistroSteps;

    @Steps
    ValidacionPerfilStep validacionPerfilStep;

    @Dado("que el usuario abre el navegador y de click en registrarse")
    public void queElUsuarioAbreElNavegadorYDeClickEnRegistrarse() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.posicionarMiPerfil();
        paginaInicialSteps.seleccionRegistro();
        paginaInicialSteps.cerrarPopUp();
        paginaInicialSteps.ingresarHaceb();
        paginaInicialSteps.ventanaNueva();
    }

    @Cuando("el usuario ingrese sus datos")
    public void elUsuarioIngreseSusDatos() {
        paginaRegistroSteps.correoElectronico();
        paginaRegistroSteps.nombre();
        paginaRegistroSteps.apellido();
        paginaRegistroSteps.ingresaContrasena();
        paginaRegistroSteps.confirmaContrasena();
    }

    @Cuando("acepte terminos y condiciones")
    public void acepteTerminosYCondiciones() {
        paginaRegistroSteps.clicCheckboxTc();
        paginaRegistroSteps.clicAcepto();
        paginaRegistroSteps.clicRegistrarme();
    }

    @Cuando("acepte datos personales")
    public void acepteDatosPersonales() {
        pagSecRegistroSteps.numCedula();
        pagSecRegistroSteps.selGenero();
        pagSecRegistroSteps.selFechaNac();
        pagSecRegistroSteps.selCodPais();
        pagSecRegistroSteps.digNumTelefono();
        pagSecRegistroSteps.selDepartamento();
        pagSecRegistroSteps.selCiudad();
        pagSecRegistroSteps.clicEnviar();
        paginaPerfilSteps.ventanaPerfil();
    }

    @Entonces("el usuario podra ver su perfil")
    public void elUsuarioPodraVerSuPerfil() {
        validacionPerfilStep.validacionPerfil();
    }
}
