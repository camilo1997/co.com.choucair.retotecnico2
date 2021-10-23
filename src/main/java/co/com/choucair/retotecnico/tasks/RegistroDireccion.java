package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.model.Usuario;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.retotecnico.userinterface.RegistroInfoUI.*;


public class RegistroDireccion implements Task {

    private List<Usuario> usuario;
    public RegistroDireccion(List<Usuario> usuario){
        this.usuario = usuario;
    }
    public static RegistroDireccion direccionPersonal(List<Usuario> usuario){
        return Tasks.instrumented(RegistroDireccion.class,usuario);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                WaitUntil.the(LBL_AUTO, WebElementStateMatchers.isPresent()).forNoMoreThan(15).seconds(),
                Click.on(BTN_DISPOSITIVOS));
    }
}
