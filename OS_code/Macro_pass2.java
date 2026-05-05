import java.io.*;

public class Macro_pass2{

    public static void main(String[] args) throws IOException {

        mdt[] MDT = new mdt[100];
        mnt[] MNT = new mnt[50];
        arglist[] formal_parameter = new arglist[50];
        arglist[] actual_parameter = new arglist[50];

        int mdt_cnt = 0, mnt_cnt = 0, formal_arglist_cnt = 0, actual_arglist_cnt = 0;

        String basePath = "D:\\Java practice\\";  

       
        BufferedReader br1 = new BufferedReader(new FileReader(basePath + "MNTnew.txt"));
        String line;
        while ((line = br1.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            if (parts.length < 3) continue;
            MNT[mnt_cnt++] = new mnt(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        }
        br1.close();

        System.out.println("\n************** MACRO NAME TABLE (MNT) ****************");
        System.out.println("INDEX\tNAME\tADDR\tARG_CNT");
        for (int i = 0; i < mnt_cnt; i++) {
            System.out.println(i +"\t\t"+MNT[i].name+"\t\t"+MNT[i].addr+"\t\t"+MNT[i].arg_cnt);
        }

       
        br1 = new BufferedReader(new FileReader(basePath + "ARGLISTnew.txt"));
        while ((line = br1.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            String[] parts = line.split("\\s+");
            formal_parameter[formal_arglist_cnt] = new arglist(parts[0]);
            if (parts.length > 1) {
                formal_parameter[formal_arglist_cnt].value = parts[1];
            }
            formal_arglist_cnt++;
        }
        br1.close();

        System.out.println("\n************** FORMAL ARGUMENT LIST ****************");
        System.out.println("INDEX\tNAME\tDEFAULT");
        for (int i = 0; i < formal_arglist_cnt; i++) {
            System.out.println(i + "\t" + formal_parameter[i].argname + "\t" + formal_parameter[i].value);
        }

        
        br1 = new BufferedReader(new FileReader(basePath + "MDTnew.txt"));
        while ((line = br1.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            MDT[mdt_cnt] = new mdt();
            MDT[mdt_cnt++].stmnt = line;
        }
        br1.close();

        System.out.println("\n************** MACRO DEFINITION TABLE (MDT) ****************");
        System.out.println("INDEX\tSTATEMENT");
        for (int i = 0; i < mdt_cnt; i++) {
            System.out.println(i + "\t" + MDT[i].stmnt);
        }

        
        br1 = new BufferedReader(new FileReader(basePath + "input.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(basePath + "outputM2.txt"));

        while ((line = br1.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            line = line.replaceAll(",", " ");
            String[] tokens = line.split("\\s+");

            if (tokens.length == 0) continue;
            String firstToken = tokens[0];
            int macro_call = -1;

            
            for (int i = 0; i < mnt_cnt; i++) {
                if (firstToken.equalsIgnoreCase(MNT[i].name)) {
                    macro_call = i;
                    break;
                }
            }

           
            if (macro_call != -1) {
                int argCount = MNT[macro_call].arg_cnt;
                actual_arglist_cnt = 0;

                
                for (int j = 1; j < tokens.length; j++) {
                    actual_parameter[actual_arglist_cnt++] = new arglist(tokens[j]);
                }

               
                int formalStartIndex = macro_call * argCount;
                for (int j = actual_arglist_cnt; j < argCount; j++) {
                    String defaultVal = formal_parameter[formalStartIndex + j].value;
                    actual_parameter[actual_arglist_cnt++] = new arglist(
                            defaultVal.isEmpty() ? " " : defaultVal
                    );
                }

                int addr = MNT[macro_call].addr + 1;
                System.out.println("\n--- Expanded Macro: " + MNT[macro_call].name + " ---");
                while (addr < mdt_cnt) {
                    String stmt = MDT[addr].stmnt;
                    if (stmt.equalsIgnoreCase("MEND")) break;

                    String[] mdtTokens = stmt.split("\\s+");
                    StringBuilder expandedLine = new StringBuilder();
                    for (String t : mdtTokens) {
                        if (t.matches("#[0-9]+")) {
                            int index = Integer.parseInt(t.substring(1)) - 1;
                            expandedLine.append(actual_parameter[index].argname).append("\t");
                        } else {
                            expandedLine.append(t).append("\t");
                        }
                    }

                    String expanded = expandedLine.toString().trim();
                    System.out.println(expanded);
                    bw1.write(expanded + "\n");
                    addr++;
                }

            } else {
                // ---------- Normal line (no macro call) ----------
                bw1.write(line + "\n");
            }
        }

        br1.close();
        bw1.close();
       System.out.println("\n************ ACTUAL ARGUMENT LIST ************");
        System.out.println("INDEX\tARGNAME");
        for (int i = 0; i < actual_arglist_cnt; i++) 
        {
            System.out.println(i + "\t" + actual_parameter[i].argname);
        }

        
    }
}


class mdt {
    String stmnt;
}

class mnt {
    String name;
    int addr;
    int arg_cnt;

    public mnt(String name, int addr, int arg_cnt) {
        this.name = name;
        this.addr = addr;
        this.arg_cnt = arg_cnt;
    }
}

class arglist {
    String argname;
    String value = "";

    public arglist(String argname) {
        this.argname = argname;
    }
}
