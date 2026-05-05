import java.io.*;
import java.util.Scanner;

class Obj {
    String name;
    int addr;

    Obj(String name, int addr) {
        this.name = name;
        this.addr = addr;
    }
}

public class passed2 {
    static Obj[] symb_table = new Obj[10];
    static Obj[] literal_table = new Obj[10];
    static int symb_found = 0;

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        // ---------------- Input Symbol Table ----------------
        System.out.println("Enter total no.of symbols=");
        int total_symb = sc.nextInt();
        for (int i = 0; i < total_symb; i++) {
            symb_table[i] = new Obj("", 0);
            System.out.println("Enter symbol name=");
            symb_table[i].name = sc.next();
            System.out.println("Enter symbol Address=");
            symb_table[i].addr = sc.nextInt();
        }

        // ---------------- Input Literal Table ----------------
        System.out.println("Enter total no.of Literals=");
        int total_ltr = sc.nextInt();
        for (int i = 0; i < total_ltr; i++) {
            literal_table[i] = new Obj("", 0);
            System.out.println("Enter literal name=");
            literal_table[i].name = sc.next();
            System.out.println("Enter literal Address=");
            literal_table[i].addr = sc.nextInt();
        }

        // ---------------- Print Symbol Table ----------------
        System.out.println("\n--------------------Symbol Table--------------------------------");
        System.out.println("Symbol\tAddress");
        for (int i = 0; i < total_symb; i++) {
            System.out.println(symb_table[i].name + "\t" + symb_table[i].addr);
        }

        // ---------------- Print Literal Table ----------------
        System.out.println("\n--------------------Literal Table--------------------------------");
        System.out.println("Index\tLiteral\tAddress");
        for (int i = 0; i < total_ltr; i++) {
            System.out.println((i + 1) + "\t" + literal_table[i].name + "\t" + literal_table[i].addr);
        }

        // ---------------- Pass 2 Processing ----------------
        BufferedReader br2 = new BufferedReader(new FileReader("d:\\\\Java_practice\\\\Output.txt"));
        String line;
        boolean symbol_error, undef_mnemonic;

        System.out.println("\n**************** Final Machine Code ****************\n");
        System.out.printf("%-8s %-8s %-8s %-8s\n", "LC", "OPCODE", "REG", "OPERAND");

        while ((line = br2.readLine()) != null) {
            String[] token_list = line.split("\\s+");
            symbol_error = undef_mnemonic = false;

            String lc = "", opcode = "", reg = "", operand = "";

            for (String token : token_list) {
                if (token.length() > 0) {
                    if (token.matches("[0-9]+")) {
                        lc = token; // Location Counter
                    } else {
                        String letters = token.replaceAll("[^A-Za-z]+", "");
                        String numStr = token.replaceAll("[^0-9]+", "");
                        int num = numStr.isEmpty() ? -1 : Integer.parseInt(numStr);

                        switch (letters.toUpperCase()) {
                            case "S":
                                if (num > 0 && symb_table[num - 1].addr != 0)
                                    operand = String.valueOf(symb_table[num - 1].addr);
                                else {
                                    operand = "---";
                                    symbol_error = true;
                                }
                                break;
                            case "L":
                                operand = String.valueOf(literal_table[num - 1].addr);
                                break;
                            case "C":
                                operand = String.valueOf(num);
                                break;
                            case "DL":
                                if (num == 1) operand = "";
                                if (num == 2) operand = "00";
                                break;
                            case "AD":
                                // Ignore assembler directives in final code
                                break;
                            default:
                                if (letters.length() > 0) opcode = letters + num;
                                else reg = numStr;
                                break;
                        }
                    }
                }
            }

            // Print formatted machine code line
            if (!lc.isEmpty())
                System.out.printf("%-8s %-8s %-8s %-8s\n", lc, opcode, reg, operand);

            if (symbol_error)
                System.out.println("\n***** Error: Symbol not defined *****");
            if (undef_mnemonic)
                System.out.println("\n***** Error: Invalid mnemonic *****");
        }

        // ---------------- Duplicate Symbol Check ----------------
        int[] flag = new int[total_symb];
        for (int i = 0; i < total_symb; i++) {
            symb_found = 0;
            for (int j = 0; j < total_symb; j++) {
                if (symb_table[i].name.equalsIgnoreCase(symb_table[j].name) && flag[j] == 0) {
                    symb_found++;
                    flag[i] = flag[j] = 1;
                }
            }
            if (symb_found > 1)
                System.out.print("\n***** Duplicate Symbol Found: " + symb_table[i].name + " *****\n");
        }

        br2.close();
        sc.close();
    }
}
