package br.com.Datas.application;

import java.text.ParseException;
// Define formatos para conversão entre Date e String
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println(y1);
        System.out.println(y2);

        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));

        Date now = new Date();
        Date now2 = new Date(System.currentTimeMillis());
        System.out.println(now);
        System.out.println(now2);

        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf3.format(y3));
        // Padrão ISO 8601 e classe Instant
        // yyyy-MM-ddTHH:mm:ssZ
        // 2018-06-25T15:42:07Z
    }
}
