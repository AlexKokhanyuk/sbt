package com.sbt;

import java.io.*;

/**
 * Created by Alex Kokhanyuk
 * on 6/23/2016,
 * Time: 12:41 PM.
 */
public class Sbt {

    public static void main(String[] args) {
//        final String FILE_NAME = "C:\\Users\\Alex\\Documents\\Zona Downloads\\Adam.Ruins.Everything.S01.720p.HDTVRip.Rus.Eng.Ozz\\" +
        final String FILE_NAME = "C:\\home\\Фильмы\\Adam.Ruins.Everything.S01.720p.HDTVRip.Rus.Eng.Ozz\\" +
                "Adam.Ruins.Everything.S01E02.720p.HDTVRip.Rus.Eng.Ozz_track5_eng.srt";

        File file = new File(FILE_NAME);
        FileInputStream fstream = null;
        DoublyLinkedList dList = new DoublyLinkedList();
        String strLine = "";
        dList.insertFirst(strLine);
        int j = 0;
        try {
            fstream = new FileInputStream(FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                //System.out.println (strLine);
                if (strLine.length() != 0) {
                    if (j == 5) {
                        dList.appendInFirst(strLine + "\n");
                    }
                } else {
                    dList.insertFirst(strLine);
                    j = 0;
                }
                j++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  dList.displayBackward();
        MyIterator iter = dList.getIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

    public static void writeFile(String fileName, String text) {
        File f = new File(fileName);
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.printf(text + " \n");
        } catch (IOException e) {
            System.err.println("Error open stream " + e);
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }

}
