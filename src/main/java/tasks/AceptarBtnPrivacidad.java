package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static userinterface.PrivacidadPage.BTN_ACEPTAR_PRIVACIDAD;
import static userinterface.PrivacidadPage.TITULO_PRIVACIDAD;

public class AceptarBtnPrivacidad implements Task {

    public static AceptarBtnPrivacidad parasUsarcalculadora(){
        return instrumented(AceptarBtnPrivacidad.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TITULO_PRIVACIDAD, isPresent()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(BTN_ACEPTAR_PRIVACIDAD));
    }
}
