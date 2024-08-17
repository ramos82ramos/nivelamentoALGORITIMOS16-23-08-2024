import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class index {
    public static  void main(String[] args) {
        int var1 =1;
        int var2 =2;
        int var3 = var1 +var2;
        final int laranja = 11;
        var3= var3 + laranja;
        System.out.println("O resultado da soma e " +var1 +"+" + var2 +"+" +laranja +"="+ var3);
        System.out.println(2+(2*2)+2-(2/2)*2+2);

        System.out.println("horas,min , sec");

        int horas=5, minutos=30,segundos=35, resultado;
        System.out.println ((horas *60 * 60) + (minutos * 60 )+minutos);


        Scanner prompt = new Scanner(System.in);
        System.out.println ("segundos");
        int segundos = prompt.nextInt();
        int horas = segundos /60/60;
        segundos = segundos - (horas * 60 * 60);
        int ninutos=segundos/60;
        segundos=segundos-(minutos*60);
        System.out.println("o resultado e "+horas+":"+minutos+":"+segundos);
    }
}
