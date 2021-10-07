package Lesson_05;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class CsvWriter {



        public static void main(String[] args) {

            try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

                StringBuilder sb = new StringBuilder();
                sb.append("id,");
                sb.append(',');
                sb.append("Name");
                sb.append('\n');

                sb.append("1");
                sb.append(',');
                sb.append("Frank Sinatra");
                sb.append('\n');

                writer.write(sb.toString());

                System.out.println("done!");

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
    }

