package com.haceb.stepDefinitions;

import com.haceb.steps.PaginaInicialSteps;
import com.haceb.steps.PaginaRegistroSteps;
import com.haceb.steps.ValidacionPerfilStep;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class RegistroHacebStepDef {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    PaginaRegistroSteps paginaRegistroSteps;

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

    }
    @Cuando("acepte datos personales")
    public void acepteDatosPersonales() {
        paginaRegistroSteps.clicAcepto();
        paginaRegistroSteps.clicRegistrarme();
        paginaRegistroSteps.numCedula();
        paginaRegistroSteps.selGenero();
        paginaRegistroSteps.selFechaNac();
        paginaRegistroSteps.selCodPais();
        paginaRegistroSteps.digNumTelefono();
        paginaRegistroSteps.selDepartamento();
        paginaRegistroSteps.selCiudad();
        paginaRegistroSteps.clicEnviar();
        paginaRegistroSteps.ventanaPerfil();

    }
    @Entonces("el usuario podra ver su perfil")
    public void elUsuarioPodraVerSuPerfil() {
        validacionPerfilStep.validacionPerfil();

    }
}
