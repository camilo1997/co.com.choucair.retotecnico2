package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroInfoUI {
        public static final Target BTN_UNETE = Target.the("Campo boton Unete hoy").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));
        public static final Target LBL_MENSAJE = Target.the("mensaje").located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));

        public static final Target TXT_NOMBRE = Target.the("Campo de texto usuario").located(By.id("firstName"));
        public static final Target TXT_APELLIDO = Target.the("Campo de texto apellido").located(By.id("lastName"));
        public static final Target TXT_CORREO = Target.the("Campo de texto correo").located(By.id("email"));
        public static  final Target SELECTOR_MES = Target.the("campo boton selector mes").located(By.xpath("//select[@id='birthMonth']"));
        public static  final Target SELECTOR_DIA = Target.the("campo boton selector dia").located(By.xpath("//select[@id='birthDay']"));
        public static  final Target SELECTOR_ANOS = Target.the("campo boton selector ano").located(By.xpath("//select[@id='birthYear']"));
        public static final Target LENGUAJE = Target.the("Habilita campo del lenguaje").located(By.xpath("//div[@id='languages']"));
        public static final Target INPUT_LENGUAJE = Target.the("Campo boton selector lenguaje").located(By.xpath("//div[@id='languages']//input"));
        public static final Target BTN_DIRECCION = Target.the("Campo boton selector años").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));

        public static final Target COMPUTADOR = Target.the("Habilita campo de computador").located(By.xpath("//div[@name='osId']"));
        public static final Target INPUT_COMPUTADOR = Target.the("Campo boton selector computador").located(By.xpath("//div[@name='osId']//input"));
        public static final Target VERSION = Target.the("Habilita campo de la version").located(By.xpath("//div[@name='osVersionId']"));
        public static final Target INPUT_VERSION = Target.the("Campo boton selector version").located(By.xpath("//div[@name='osVersionId']//input"));
        public static final Target LENGUAJESO = Target.the("Habilita campo del lenguaje").located(By.xpath("//div[@name='osLanguageId']"));
        public static final Target INPUT_LENGUAJESO = Target.the("Campo boton selector lenguaje").located(By.xpath("//div[@name='osLanguageId']//input"));
        public static final Target MOVIL = Target.the("Habilita campo del movil").located(By.xpath("//div[@name='handsetMakerId']"));
        public static final Target INPUT_MOVIL = Target.the("Campo boton selector movil").located(By.xpath("//div[@name='handsetMakerId']//input"));
        public static final Target MODELO = Target.the("Habilita campo del modelo").located(By.xpath("//div[@name='handsetModelId']"));
        public static final Target INPUT_MODELO = Target.the("Campo boton selector modelo").located(By.xpath("//div[@name='handsetModelId']//input"));
        public static final Target SISTEMA = Target.the("Habilita campo del sistema").located(By.xpath("//div[@name='handsetOSId']"));
        public static final Target INPUT_SISTEMA = Target.the("Campo boton selector sistema").located(By.xpath("//div[@name='handsetOSId']//input"));
        public static final Target BTN_CONTRASENA = Target.the("boton ultimo paso").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

        public static final Target BTN_DISPOSITIVOS = Target.the("Campo boton dispositivos").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));
        public static final Target LBL_AUTO = Target.the("Campo boton dispositivos").located(By.cssSelector("main.registration section.col-md-8.col-lg-8.col-sm-12.col-xs-12:nth-child(3) div.container-fluid div.sign-up-form-container div.ui-view form.user-form.ng-pristine.ng-valid-minlength.ng-valid-maxlength.ng-valid-validation-match.ng-valid.ng-valid-required div.form-group-box:nth-child(1) div.row div.col-xs-12.col-sm-12.col-md-6.col-lg-6.location div.form-group.address.col-xs-12.col-sm-12.col-md-12.col-lg-12:nth-child(1) > span.check-mark:nth-child(5)"));

        public static final Target TXT_CONTRASENA = Target.the("Campo de texto contraseña").located(By.id("password"));
        public static final Target TXT_CONFIRCONTRASENA = Target.the("Campo de texto confirmar contraseña").located(By.id("confirmPassword"));
        public static final Target BTN_TERMINO = Target.the("Campo boton terminos").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));
        public static final Target BTN_POLITICA = Target.the("Campo boton politicas").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));
        public static final Target BTN_REGISTRAR = Target.the("Campo boton finalizar registro").located(By.id("laddaBtn"));

}
