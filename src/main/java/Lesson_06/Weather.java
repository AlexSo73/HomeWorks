package Lesson_06;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Weather {

    public static void main ( String[] args) {

        Weather app = new Weather();
        app.demo();
    }

    private void demo( ) {

        JSONParser jsonParser = new JSONParser();
        try
        {

            String yourKey = "915933d7f9bd2dd50c6c14cc3e4a4b83";
            URL url = new URL( "https://api.openweathermap.org/data/2.5/weather?q=Sochi,Ru&appid=915933d7f9bd2dd50c6c14cc3e4a4b83" + yourKey );
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );


            JSONObject jsonObject = ( JSONObject ) jsonParser.parse( reader );
            System.out.println( "jsonObject = " + jsonObject );

            JSONArray list = ( JSONArray ) jsonObject.get( "list" );
            System.out.println( "list = " + list );

            for ( Object o : list ) {
                JSONObject forecast = ( JSONObject ) o;

                Long dt = ( Long ) forecast.get( "dt" );
                Instant instant = Instant.ofEpochSecond( dt );
                ZoneId z = ZoneId.of( "Russia/Sochi" );
                ZonedDateTime zdt = instant.atZone( z );


                LocalTime lt = zdt.toLocalTime() ;

                System.out.println( "dt : " + dt );
                System.out.println( "instant : " + instant );
                System.out.println( "zdt : " + zdt );

                JSONObject main = ( JSONObject ) forecast.get( "main" );
                System.out.println( "main = " + main );


                Double temp = ( Double ) main.get( "temp" );
                System.out.println( "temp = " + temp );

                JSONObject wind = ( JSONObject ) forecast.get( "wind" );
                System.out.println( "wind = " + wind );

                System.out.println( "BASIL - wind.getCLass: " + wind.getClass() );
                Double speed = ( Double ) wind.get( "speed" );
                System.out.println( "speed = " + speed );

                System.out.println( "\n" );
            }
        } catch ( IOException | ParseException e ) {
            e.printStackTrace();
        }
    }

