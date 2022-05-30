/* Clase menu , bueno muchachos aqui esta el menu todo bello, valorenlo porque tomo tiempito, emm lo hice con switches
y pues hay tres casos y un caso 0 que le hace kill al programa*/
import java.util.Scanner;
public class Menu{
    public static String link;
    public static void mostrarMenu(){
        int loop=1;
        while(loop==1){
            
            System.out.println("Hola ingrese un numero para acceder a alguna de las opciones.(Por favor escriba numeros nunca letras por que o sino yaper)");
            System.out.println("#0 para finalizar.");
            System.out.println("#1 para consultar por el año (2004).");
            System.out.println("#2 para consultar las por la palabra (chiguiro) .");
            System.out.println("#3 para consultar por el texto (Grand Theft Auto).");
            Scanner sc = new Scanner(System.in);
            int opcion =sc.nextInt();
            switch(opcion){
                case 0 :
                    loop=0;                   
                    break;

                case 1:
                    System.out.println("Ha escogido la opcion año 2004");
                    boolean ver=true;
                    Metadata dw = new Metadata();
                    dw.getMetadata();
                    while(ver==true){
                        System.out.println("Escriba 0 para volver al menú");
                        int regresar=sc.nextInt();
                        if(regresar==0){
                            System.out.println("Ha regresado al menu");
                            ver=false;
                            mostrarMenu();
                        }else {
                            ver=false;
                            System.out.println("Ha regresado al menu");
                            mostrarMenu();
                        }
                    }
                case 2:
                System.out.println("Ha escogido la opcion palabra chiguiro");
                link="https://www.google.com/search?q=chiguiro&rlz=1C1ONGR_esCO1005CO1005&sxsrf=ALiCzsZy-berULwH07wtckL-twoGTBjhqA%3A1653875199170&ei=_yGUYqaBCuTNytMPp5qVoAc&ved=0ahUKEwjm_P6djYb4AhXkpnIEHSdNBXQQ4dUDCA4&uact=5&oq=chiguiro&gs_lcp=Cgdnd3Mtd2l6EAMyCAguEIAEELEDMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCC4QgAQyBQgAEIAEOgcIIxCwAxAnOgQIIxAnOggIABCxAxCDAToRCC4QgAQQsQMQgwEQxwEQ0QM6CwgAEIAEELEDEIMBOggILhCxAxCDAToHCAAQsQMQQzoKCC4QxwEQ0QMQQzoECAAQQzoECC4QQzoFCC4QsQM6BwguELEDEEM6CggAEIAEEIcCEBQ6CAgAEIAEELEDOgsILhCABBCxAxDUAjoOCC4QgAQQsQMQxwEQowI6CwguELEDEIMBENQCOgsILhCABBCxAxCDAToOCC4QgAQQsQMQgwEQ1AI6BwguEIAEEAo6CAguEIAEENQCSgQIQRgBSgQIRhgAUNkIWLwcYMweaANwAHgAgAGaAYgBlwmSAQMwLjmYAQCgAQHIAQHAAQE&sclient=gws-wiz";
                Metadata dx = new Metadata();
                    dx.getMetadata();
                    boolean ve=true;
                    while(ve==true){
                        System.out.println("Escriba 0 para volver al menú");
                        int regresar=sc.nextInt();
                        if(regresar==0){
                            System.out.println("Ha regresado al menu");
                            ver=false;
                            mostrarMenu();
                        }else {
                            ver=false;
                            System.out.println("Ha regresado al menu");
                            mostrarMenu();
                        }
                    }
                    case 3:
                    System.out.println("Ha escogido la opcion texto Grand Theft Auto");
                link="https://www.google.com/search?gs_ssp=eJzj4tTP1TcwKbfIKjdg9BJIL0rMS1EoyUhNK1FILC3JBwCDdwl-&q=grand+theft+auto&rlz=1C1ONGR_esCO1005CO1005&oq=Grand+Th&aqs=chrome.1.0i355i433i512j46i433i512j69i57j46i131i433i512j46i512j46i433i512j46i512l2j46i433i512j46i512.4083j0j7&sourceid=chrome&ie=UTF-8";
                Metadata dz = new Metadata();
                    dz.getMetadata();
                    boolean vr=true;
                    while(vr==true){
                        System.out.println("Escriba 0 para volver al menú");
                        int regresar=sc.nextInt();
                        if(regresar==0){
                            System.out.println("Ha regresado al menu");
                            ver=false;
                            mostrarMenu();
                        }else {
                            ver=false;
                            System.out.println("Ha regresado al menu");
                            mostrarMenu();
                        }
                    }
            }
        }
    }
}

