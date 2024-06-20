package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.model.Event;
import org.example.model.Review;
import org.example.model.SpanishPointCoreBDOEntitiesWorkWork;
import org.example.model.SpanishPointCoreBDOEntitiesWorkWorkNote;
import org.hibernate.boot.Metadata;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.EnumSet;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Type REVIEW_TYPE = new TypeToken<List<Review>>() {
    }.getType();
    public static void main( String[] args ) throws FileNotFoundException {

        System.out.println( "Hello World!" );

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader("spanishpointWork.json"));
        SpanishPointCoreBDOEntitiesWorkWork event = gson.fromJson(reader, SpanishPointCoreBDOEntitiesWorkWork.class);//To access the price
        System.out.println(event.toString());

        //Borra este comentario
        System.out.println("jandedrgi ccc    ");
        System.out.println("Esto con github  de IntelliJ");
        System.out.println("Commienzo dddd");

        //de nuevo en el main


/*
        JsonReader reader = new JsonReader(new FileReader("file.json"));
        Event event = gson.fromJson(reader, Event.class);//To access the price
        System.out.println(event.toString());
        Double price = event.getStats().getPrice();
        System.out.println(price);
*/



    }

}
