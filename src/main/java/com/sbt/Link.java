package com.sbt;

/**
 * Created by Alex Kokhanyuk
 * on 6/23/2016,
 * time: 1:25 PM.
 */
public class Link {
    private StringBuilder sData;                 // data item
    public Link next;                  // next link in list
    public Link previous;              // previous link in list

    // -------------------------------------------------------------
    public Link() {
        sData = new StringBuilder();
    }

    public Link(String s)                // constructor
    {
        sData = new StringBuilder(s);
    }

    public void add(String s) {
    sData.append(s);
    }

    public String getData(){
        return sData.toString();
    }

    public void displayLink()          // display this link
    {
        System.out.print(sData.toString() + " ");
    }
}
