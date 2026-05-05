import java.io.*;
import java.util.*;
public class Macro_pass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java practice\\test.txt"));
        String line;

        ArrayList<MDT> MDT = new ArrayList<>();
        ArrayList<MNT> MNT = new ArrayList<>();
        ArrayList<ArgList> ARGLIST = new ArrayList<>();

        boolean inMacro = false;
        boolean expectHeader = false;
        int mdtIndex = 0;
        MNT currentMNT = null;

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) continue;

            if (line.equalsIgnoreCase("MACRO")) {
                inMacro = true;
                expectHeader = true;
                continue;
            }

            if (inMacro) {
                if (line.equalsIgnoreCase("MEND")) {
                    MDT.add(new MDT("MEND"));
                    mdtIndex++;
                    inMacro = false;
                    currentMNT = null;
                    continue;
                }

                if (expectHeader) {
                    // Macro header
                    String[] parts = line.split("\\s+", 2);
                    String macroName = parts[0];
                    String argsPart = (parts.length > 1) ? parts[1] : "";

                    // Split arguments
                    ArrayList<String> argsOrig = new ArrayList<>();
                    ArrayList<String> argsClean = new ArrayList<>();

                    if (!argsPart.isEmpty()) {
                        for (String arg : argsPart.split(",")) {
                            arg = arg.trim();
                            if (!arg.isEmpty()) {
                                argsOrig.add(arg);
                                String clean = (arg.contains("=")) ? arg.substring(0, arg.indexOf("=")) : arg;
                                argsClean.add(clean);
                                ARGLIST.add(new ArgList(clean));
                            }
                        }
                    }

                    currentMNT = new MNT(macroName, mdtIndex, argsOrig, argsClean);
                    MNT.add(currentMNT);

                    MDT.add(new MDT(macroName + " " + String.join(",", argsOrig)));
                    mdtIndex++;

                    expectHeader = false;
                } else {
                    // Macro body line
                    String body = line;
                    // Replace formal params with #pos
                    for (String arg : currentMNT.argsClean) {
                        int pos = currentMNT.argMap.get(arg);
                        body = body.replace(arg, "#" + pos);
                    }
                    MDT.add(new MDT(body));
                    mdtIndex++;
                }
            }
        }
        br.close();

        // Write MNT
        BufferedWriter bw = new BufferedWriter(new FileWriter("MNT.txt"));
        System.out.println("\n******** MACRO NAME TABLE ********");
        System.out.println("INDEX\tNAME\tADDRESS\tARG_CNT");
        for (int i = 0; i < MNT.size(); i++) {
            MNT entry = MNT.get(i);
            System.out.println(i + "\t" + entry.name + "\t" + entry.addr + "\t" + entry.argCnt);
            bw.write(entry.name + "\t" + entry.addr + "\t" + entry.argCnt + "\n");
        }
        bw.close();

        // Write ARGLIST
        bw = new BufferedWriter(new FileWriter("ARGLIST.txt"));
        System.out.println("\n******** ARGUMENT LIST ********");
        System.out.println("INDEX\tNAME");
        for (int i = 0; i < ARGLIST.size(); i++) {
            System.out.println(i + "\t" + ARGLIST.get(i).argName);
            bw.write(ARGLIST.get(i).argName + "\n");
        }
        bw.close();

        // Write MDT
        bw = new BufferedWriter(new FileWriter("MDT.txt"));
        System.out.println("\n******** MACRO DEFINITION TABLE ********");
        System.out.println("INDEX\tSTATEMENT");
        for (int i = 0; i < MDT.size(); i++) {
            System.out.println(i + "\t" + MDT.get(i).stmt);
            bw.write(MDT.get(i).stmt + "\n");
        }
        bw.close();
    }
}

class ArgList {
    String argName;
    ArgList(String argument) {
        this.argName = argument;
    }
}

class MDT {
    String stmt;
    MDT(String s) {
        this.stmt = s;
    }
}

class MNT {
    String name;
    int argCnt;
    int addr;
    ArrayList<String> argsOrig;
    ArrayList<String> argsClean;
    HashMap<String, Integer> argMap;

    MNT(String nm, int address, ArrayList<String> orig, ArrayList<String> clean) {
        this.name = nm;
        this.addr = address;
        this.argCnt = clean.size();
        this.argsOrig = orig;
        this.argsClean = clean;
        this.argMap = new HashMap<>();
        for (int i = 0; i < clean.size(); i++) {
            this.argMap.put(clean.get(i), i);
        }
    }
}