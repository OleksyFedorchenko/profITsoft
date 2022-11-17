package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args ) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\profITsoft\\Lesson2.1\\in.xml"))){
            String strCurrentLine;
            Pattern patternForName = Pattern.compile("\\b(name)\\s*=\\s*\"([^\"]*)\"");
            Pattern patternForSurname = Pattern.compile("\\b(surname)\\s*=\\s*\"([^\"]*)\"");

            while ((strCurrentLine=br.readLine())!=null){
                String saveName="";
                String saveSurname="";
                Matcher matcher=patternForName.matcher(strCurrentLine);
                if (matcher.find()){
                    saveName=matcher.group(2);
                }
                matcher = patternForSurname.matcher(strCurrentLine);
                if (matcher.find()){
                    saveSurname=matcher.group(2);
                }
                String result=(strCurrentLine.replace(saveName,saveName+" "+saveSurname));
                result=result.replaceAll("\\b(surname)\\s*=\\s*\"([^\"]*)\"","");
                System.out.println(result);

            }
        }
    }
}
