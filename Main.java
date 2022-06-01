//are we supossed to sleep when we have stuff like this? welp :,D
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main
{
    static String link;
    static String nombre;
    public static void main(String[] args){
    int repeat=0;
        while(repeat==0){
            mostrarMenu();
            repeat=1;
        }
    
}
public static void Contadorcito(){
    String ficheritos = nombre;
    try (Stream<String> stream = Files.lines(Paths.get(ficheritos))){

    }
    
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
        Scanner sc = new Scanner(System.in);
        int opcion =sc.nextInt();
        switch(opcion){
            case 0 :
                loop=0;
                break;                   
                
            case 1:
                System.out.println("Ha escogido la opcion año 2004");
                link="https://www.bing.com/search?q=2004&qs=n&form=QBRE&sp=-1&pq=2&sc=6-1&sk=&cvid=39D8A7894BA74E8792F967B21D9038D0";
                nombre="2004.txt";
                boolean ver=true;
                getMetadata();
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
            link="https://www.bing.com/search?q=chiguiro&form=QBLH&sp=-1&pq=chigui&sc=6-6&qs=n&sk=&cvid=D189E7CC8FA74660BEAB2A5A81CE7BF4";
            nombre="Chiguiro.txt";
                getMetadata();
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
            link="https://www.bing.com/search?q=Grand+Theft+Auto&qs=n&form=QBRE&sp=-1&pq=grand+theft+auto&sc=6-16&sk=&cvid=A82F77F7F7DC467D8E14A79431FBFF67";
            nombre="GTA.txt";
            getMetadata();
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
        break;
    }
}
}
