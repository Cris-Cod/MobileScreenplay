package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.AceptarBtnPrivacidad;
import tasks.Realizar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static userinterface.CalculadoraPage.RESULTADO;

public class SumarStepDefinition {


    @Before
    public void set_stage_stage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) quiere dusar la calculadora$")
    public void que_el_usaurio_quiere_dusar_la_calculadora(String actor) {
        OnStage.theActorCalled(actor);
    }
    @Cuando("^(.*)realizo la opreacion suma de siete mas cinco$")
    public void realizo_la_opreacion_suma_de_siete_mas_cinco(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(AceptarBtnPrivacidad.parasUsarcalculadora());
        theActorInTheSpotlight().attemptsTo(Realizar.suma());

    }
    @Entonces("^deber ver el resultado (\\d+)$")
    public void deber_ver_el_resultado(String resultado) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(RESULTADO).text().isEqualTo(resultado));
    }
}
