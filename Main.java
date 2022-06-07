//are we supossed to sleep when we have to do stuff like this? welp :,D
//No, that's the programmer way c:
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.awt.Desktop;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main
{
    static String link;
    static String nombre;
    public static void main(String[] args){
    mostrarMenu();
}

private static Set<String> obtenerlinks(String query,int num) {

	Set<String> result = new HashSet<String>();	
	String request = "https://www.google.com/search?q=" + query + "&num="+num;
	System.out.println("Sacando tu info... " + request);
	try{
		Document doc = Jsoup.connect(request)
			.userAgent("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
			.timeout(5000).get();

		Elements links = doc.select("a[href]");
		//EL QUE ABRE LINKS, IDENTIFICA EL PREDETERMINADO
		Desktop buscador = Desktop.getDesktop();
		int numLink = 0;
		System.out.println("Los resultados encontrados fueron:\n");
		for (Element link : links) {
			String temp = link.attr("href");		
			if(temp.startsWith("/url?q=")){
				String linkReal = temp.substring(7,temp.indexOf("&"));
				System.out.println(numLink + ". "+ linkReal + "\n");
				numLink++;
				//ABRIMOS EL LINK EN INTERNET
				try {
				    buscador.browse(new URI(linkReal));
				} catch (IOException | URISyntaxException e) {
				}
			}
		}
		System.out.println((numLink-1) + "links.");

	} catch (IOException e) {
		e.printStackTrace();
	}
		
	return result;
}

public static void getMetadata(){
    try{
        URL url = new URL(link);
        BufferedReader bf = new BufferedReader(new InputStreamReader(url.openStream()));
        File datos = new File(nombre);
        BufferedWriter bw = new BufferedWriter(new FileWriter(datos));
        String cadena;
        while ((cadena=bf.readLine()) != null){
            bw.write(cadena);
        }
        bf.close();
        bw.close();
        System.out.println("Metadata guardada exitosamente");
        System.out.println("Terminado");
    }catch (Exception ex){
        ex.printStackTrace();
    }
}
public static void mostrarMenu(){
    int loop=1;
    while(loop==1){
        System.out.println("Hola ingrese un numero para acceder a alguna de las opciones.(Por favor escriba numeros nunca letras por que o sino yaper)");
        System.out.println("#0 para finalizar.");
        System.out.println("#1 para consultar por el año (2004).");
        System.out.println("#2 para consultar las por la palabra (chiguiro) .");
        System.out.println("#3 para consultar por el texto (Grand Theft Auto).");
        Scanner sca = new Scanner(System.in);
        int opcion = sca.nextInt();
        switch(opcion){
            case 0 :
                loop = 0;
                break;                  
            case 1:
                System.out.println("Ha escogido la opcion año 2004");
                link="https://www.bing.com/search?q=2004&qs=n&form=QBRE&sp=-1&pq=2&sc=6-1&sk=&cvid=39D8A7894BA74E8792F967B21D9038D0";
                nombre="2004.txt";
                System.out.println("Busqueda realizada");
                boolean ver=true;
                getMetadata();
                int num=3;
                Set<String> result = obtenerlinks("2004",num);
	for(String temp : result){
		System.out.println(temp);
    }

                while(ver==true){
                    System.out.println("Escriba 0 para volver al menú");
                    int regresar=sca.nextInt();
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
                link="https://www.bing.com/search?q=chiguiro&form=QBLH&sp=-1&pq=chigui&sc=6-6&qs=n&sk=&cvid=D189E7CC8FA74660BEAB2A5A81CE7BF4";
                nombre="Chiguiro.txt";
                System.out.println("Busqueda realizada");
                boolean ve=true;
                getMetadata();
                int num2=5;
                Set<String> result2 = obtenerlinks("Chiguiro",num2);
	for(String temp : result2){
		System.out.println(temp);
    }
                    while(ve==true){
                        System.out.println("Escriba 0 para volver al menú");
                        int regresar=sca.nextInt();
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
                link="https://www.bing.com/search?q=Grand+Theft+Auto&qs=n&form=QBRE&sp=-1&pq=grand+theft+auto&sc=6-16&sk=&cvid=A82F77F7F7DC467D8E14A79431FBFF67";
                nombre="GTA.txt";
                getMetadata();
                boolean ver3=true;
                getMetadata();
                int num3=5;
                Set<String> result3 = obtenerlinks("grand theft auto",num3);
	for(String temp : result3){
		System.out.println(temp);
    }
                while(ver3==true){
                    System.out.println("Escriba 0 para volver al menú");
                    int regresar=sca.nextInt();
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
            sca.close();
            break;
        }
    }
}

/*
      _                ___       _.--.
      \`.|\..----...-'`   `-._.-'_.-'`  
      /  ' `         ,       _.-'              
      )/' _/     \   `-_,   /                
      `-'" `"\_  ,_.-;_.-\_ ',          Literally the best cat ever.
          _.-'_./   {_.'   ; /            
         {_.-``-'         {_/         
*/
