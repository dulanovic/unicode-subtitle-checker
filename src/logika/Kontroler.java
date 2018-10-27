package logika;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Kontroler {

    private static Kontroler instance;

    private Kontroler() {
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public boolean obradiFajl(String putanja, String folder, String videoFajl) {
        List<String> listaUpis = new ArrayList<>();
        boolean arhiva = false;
        String arhivaAdresa = "";
        if (putanja.endsWith(".zip") || putanja.endsWith(".rar") || putanja.endsWith(".7z")) {
            arhivaAdresa = putanja;
            arhiva = true;
            putanja = raspakujArhivu(putanja, folder);
        }
        try {
            String[] nizSadrzaj = (String[]) Files.readAllLines(Paths.get(putanja), Charset.forName("windows-1252")).toArray(new String[]{});

            for (int i = 0; i < nizSadrzaj.length; i++) {
                if (nizSadrzaj[i].contains("ð")) {
                    nizSadrzaj[i] = nizSadrzaj[i].replaceAll("ð", "đ");
                }
                if (nizSadrzaj[i].contains("Æ")) {
                    nizSadrzaj[i] = nizSadrzaj[i].replaceAll("Æ", "Ć");
                }
                if (nizSadrzaj[i].contains("æ")) {
                    nizSadrzaj[i] = nizSadrzaj[i].replaceAll("æ", "ć");
                }
                if (nizSadrzaj[i].contains("È")) {
                    nizSadrzaj[i] = nizSadrzaj[i].replaceAll("È", "Č");
                }
                if (nizSadrzaj[i].contains("è")) {
                    nizSadrzaj[i] = nizSadrzaj[i].replaceAll("è", "č");
                }
                listaUpis.add(nizSadrzaj[i]);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
            return false;
        }
        try (PrintWriter pw = new PrintWriter(putanja, "UTF-8")) {
            for (String s : listaUpis) {
                pw.println(s);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return false;
        }
        new File(putanja).renameTo(new File(folder + "\\" + videoFajl.substring(0, videoFajl.lastIndexOf(".")) + putanja.substring(putanja.length() - 4, putanja.length())));
        if (arhiva) {
            try {
                Files.delete(Paths.get(arhivaAdresa));
            } catch (IOException ioex) {
                ioex.printStackTrace();
            }
        }
        return true;
    }

    private String raspakujArhivu(String putanja, String folder) {
        String fajl = "";
        try {
            ZipFile zipArhiva = new ZipFile(putanja);
            Enumeration<ZipEntry> e = (Enumeration<ZipEntry>) zipArhiva.entries();
            while (e.hasMoreElements()) {
                ZipEntry ze = e.nextElement();
                if (ze.getName().endsWith(".srt") || ze.getName().endsWith(".sub") || ze.getName().endsWith(".txt")) {
                    fajl = folder + "\\" + ze.getName();
                    InputStream is = zipArhiva.getInputStream(ze);
                    Files.copy(is, Paths.get(fajl), StandardCopyOption.REPLACE_EXISTING);
                    is.close();
                }
            }
            zipArhiva.close();
            return fajl;
        } catch (IOException ioex) {
            ioex.printStackTrace();
            return "";
        }
    }

    public static List<String> skenirajFolder(String putanja) {
        File folder = new File(putanja);
        List<String> listaVideoFajlova = new ArrayList<>();
        File[] videoFajloviFoldera = folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File fajl, String naziv) {
                return (naziv.toLowerCase().endsWith(".mp4") || naziv.toLowerCase().endsWith(".mkv"));
            }
        });
        if (videoFajloviFoldera != null) {
            for (File f : videoFajloviFoldera) {
                listaVideoFajlova.add(f.getName());
            }
        }
        return listaVideoFajlova;
    }

}
