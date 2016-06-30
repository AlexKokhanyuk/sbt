package com.sbt;

/**
 * Created by Alex Kokhanyuk
 * on 6/23/2016,
 * time: 2:41 PM.
 */
public class MyIterator {
    public MyIterator(int counter) {
        strArr = new String[counter];
    }

    int counter;
    int counterIter;
    String[] strArr;

    public void appendData(String s) {
        if (counter <= strArr.length) {
            strArr[counter] = s;
        }
        counter++;
    }

    public boolean hasNext() {
        return counter< 0;
    }

    public String next() {

        counter--;
        return strArr[counter];

    }
}
