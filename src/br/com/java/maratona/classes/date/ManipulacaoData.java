package br.com.java.maratona.classes.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ManipulacaoData {


    public static void main(String[] args) throws ParseException {

        // para pegar a instancia de calendar
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

       // DateFormat df = DateFormat.getDateInstance();
        DateFormat dfShort = DateFormat.getInstance();

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));

        System.out.println("pt: " + df2.format(new Date()));


        System.out.println("---------------------------------");

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss", new Locale("pt", "BR"));
        Date hoje = new Date(System.currentTimeMillis());
        System.out.println();
        ZoneId zoneId = ZoneId.of( "America/Montreal" );

        //dateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0300"));

        System.out.println("teste " + dateFormat.format(new Date(System.currentTimeMillis())));

        Calendar saoPauloDate = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
        System.out.println(saoPauloDate);

        //calendar.add(Calendar.HOUR,-3);

        System.out.println("%%%" + dateFormat.format(calendar.getTime()));
        System.out.println(calendar.getTime());



        DateFormat[] dfa = new DateFormat[6];

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);


        Calendar c = Calendar.getInstance(new Locale("pt", "BR"));

        System.out.println("Esse " + dateFormat.format(calendar.getTime()));

       for(DateFormat df: dfa){

           //c.add(Calendar.HOUR, -3);
           System.out.println(" - " + df.format(c.getTime()));
       }




        Date data = new Date();
        Calendar calendar1 = Calendar.getInstance();
        System.out.println(calendar1);
        System.out.println("data pura " + data);
        System.out.println(dateFormat.format(data));

        calendar1.setTime(data);
        calendar1.add(Calendar.HOUR, -3);
        System.out.println("Calendar 1 - 3 horas" + calendar1);

        Date newDate = new Date(dateFormat.format(calendar1.getTime()));


        System.out.println("new date " + newDate);










    }
}
