package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class CalculadoraPage {

    public static final Target BOTON_SIETE = Target.the("boton numero siete").located(By.id("com.miui.calculator:id/digit_7"));
    public static final Target BOTON_CINCO = Target.the("boton numero cinco").located(By.id("com.miui.calculator:id/digit_5"));
    public static final Target BOTON_SUMAR = Target.the("boton signo sumar").located(By.id("com.miui.calculator:id/op_add"));
    public static final Target BOTON_IGUAL = Target.the("boton signo sumar").located(By.id("com.miui.calculator:id/btn_equal_s"));
    public static final Target RESULTADO = Target.the("resultado").located(By.id("com.miui.calculator:id/result"));


}
