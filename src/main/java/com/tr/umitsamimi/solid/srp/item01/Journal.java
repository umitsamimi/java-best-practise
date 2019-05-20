package com.tr.umitsamimi.solid.srp.item01;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<String>();

    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }


    // here we break SRP
    public void save(String filename) throws Exception
    {
        try
        {
            PrintStream out = new PrintStream(filename);
            out.println(toString());
        }catch (Exception e){
            //LOG HERE
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}
