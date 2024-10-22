package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class PrivacidadPage {

    public static final Target TITULO_PRIVACIDAD = Target.the("titulo de pantalla privacidad").located(By.id("com.miui.calculator:id/alertTitle"));
    public static final Target BTN_ACEPTAR_PRIVACIDAD = Target.the("boton aceptar privacidad").located(By.id("android:id/button1"));

}
