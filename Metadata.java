import java.io.*;
import java.net.*;
public class Metadata {
    public void getMetadata(){
        try{
            URL url = new URL("https://www.google.com/search?q=chiguiro&rlz=1C1ONGR_esCO1005CO1005&sxsrf=ALiCzsZy-berULwH07wtckL-twoGTBjhqA%3A1653875199170&ei=_yGUYqaBCuTNytMPp5qVoAc&ved=0ahUKEwjm_P6djYb4AhXkpnIEHSdNBXQQ4dUDCA4&uact=5&oq=chiguiro&gs_lcp=Cgdnd3Mtd2l6EAMyCAguEIAEELEDMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCC4QgAQyBQgAEIAEOgcIIxCwAxAnOgQIIxAnOggIABCxAxCDAToRCC4QgAQQsQMQgwEQxwEQ0QM6CwgAEIAEELEDEIMBOggILhCxAxCDAToHCAAQsQMQQzoKCC4QxwEQ0QMQQzoECAAQQzoECC4QQzoFCC4QsQM6BwguELEDEEM6CggAEIAEEIcCEBQ6CAgAEIAEELEDOgsILhCABBCxAxDUAjoOCC4QgAQQsQMQxwEQowI6CwguELEDEIMBENQCOgsILhCABBCxAxCDAToOCC4QgAQQsQMQgwEQ1AI6BwguEIAEEAo6CAguEIAEENQCSgQIQRgBSgQIRhgAUNkIWLwcYMweaANwAHgAgAGaAYgBlwmSAQMwLjmYAQCgAQHIAQHAAQE&sclient=gws-wiz");
            BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
            File datos = new File("Esto no es legal.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(datos));
            String cadena;
            while ((cadena=bf.readLine()) != null){
                bw.write(cadena);
            }
            bf.close();
            bw.close();
            System.out.println("Metadata guardada exitosamente");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
