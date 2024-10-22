package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.CalculadoraPage.*;


public class Realizar implements Task {


    public static Realizar suma(){
        return instrumented(Realizar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_SIETE));
        actor.attemptsTo(Click.on(BOTON_SUMAR));
        actor.attemptsTo(Click.on(BOTON_CINCO));
        actor.attemptsTo(Click.on(BOTON_IGUAL));
    }
}
