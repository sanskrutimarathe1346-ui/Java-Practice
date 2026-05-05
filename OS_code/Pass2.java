import java.io.*;
import java.util.Scanner;
public class Pass2
{
    static Obj[] symb_table=new Obj[10];
    static Obj[] literal_table=new Obj[10];
    static int symb_found=0;
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total no.of symbols=");
        int total_symb=sc.nextInt();
        int pos,num;
        for(int i=0;i<total_symb;i++)
        {
            symb_table[i]=new Obj("",0);
            System.out.println("Enter symbol name=");
            symb_table[i].name=sc.next();
            System.out.println("Enter symbol Address=");
            symb_table[i].addr=sc.nextInt();
        }
         System.out.println("Enter total no.of Literals=");
        int total_ltr=sc.nextInt();
        for(int i=0;i<total_ltr;i++)
        {
            literal_table[i]=new Obj("",0);
            System.out.println("Enter literal name=");
            literal_table[i].name=sc.next();
            System.out.println("Enter literal Address=");
            literal_table[i].addr=sc.nextInt();
        }

        System.out.println("\n--------------------Symbol Table--------------------------------");
        System.out.println("Symbol\tAddress");
        for(int i=0;i<total_symb;i++)
        {
            System.out.println(symb_table[i].name+"\t"+symb_table[i].addr);
        }

        System.out.println("\n--------------------Literal Table--------------------------------");
        System.out.println("\n Index \t Literal \t Address");
         for(int i=0;i<total_ltr;i++)
        {
            System.out.println((i+1)+"\t"+literal_table[i].name+"\t"+literal_table[i].addr);
        }
        BufferedReader br2=new BufferedReader(new FileReader("d:\\Java practice\\Output.txt"));
        String line;
        boolean symbol_error=false,undef_mnemonic=false;
        System.out.println("\n****************Output File***************************\n\n");
        lab: while((line=br2.readLine())!=null)
        {
            String[] token_list=line.split("\\s+",5);
            symbol_error=undef_mnemonic=false;
            lab1: for(String token:token_list)
            {
                if(token.length()>0)
                {
                    pos=-1;
                    if(token.matches("--"))
                    {
                        System.out.print("\t---");
                        undef_mnemonic=true;
                    }
                    else if(token.matches("^\\[0-9\\]+$"))
                    {
                        System.out.print("\n\n"+token);
                    }
                    else
                    {
                        String letters=token.replaceAll("[^A-Za-z]+","");
                        String numbers = token.replaceAll("[^0-9]+", "");
                        num = numbers.isEmpty() ? -1 : Integer.parseInt(numbers);

                        if(token.matches("\\([0-9\\]+$)"))
                        {
                            System.out.print("\t"+num);
                        }
                        else
                        {
                            switch(letters.toUpperCase())
                            {
                                case "S": if(symb_table[num-1].addr==0 && num > 0 && num <= total_symb)
                                          {
                                            System.out.print("\t---");
                                            symbol_error=true;

                                          }
                                          else if (num > 0 && num <= total_symb) {
                                              System.out.print("\t"+symb_table[num-1].addr); 
                                          }
                                          else { 
                                        System.out.print("\t---");
                                        symbol_error = true;
                                    }
                                        break;
                                case "L":
                                          
                                          if (num > 0 && num <= total_ltr)
                                          {
                                          System.out.print("\t"+literal_table[num-1].addr);
                                          }
                                          else {
                                        System.out.print("\t---");
                                        symbol_error = true;
                                         }
                                          break;
                                case "AD":System.out.print("\n");
                                            continue lab;
                                case "DL": switch(num)
                                          {
                                            case 1:System.out.print("\n");
                                                    continue lab;
                                            case 2:System.out.print("\t 00 \t 00");
                                                    continue lab1;
                                         
                                          }
                                          break;
                                case "C":
                                         if (num != -1)
                                         {
                                         System.out.print("\t"+num);
                                         }
                                         else
                                         {
                                            System.out.print("\tC");
                                         }
                                          break;
                                default:System.out.print("\t"+"00"+num);
                                     

                                            
                                        
                            }
                        }

                    }
                }
            }
            if(symbol_error)
                  System.out.print("\n\n*****************Symbol is not defined**********************");
            if(undef_mnemonic)
                  System.out.print("\n\n*****************Invalid mnemonic****************************");

                 
        
        }
        int[] flag=new int[total_symb];
        for(int i=0;i<total_symb;i++)
        {
            symb_found=0;
            for(int j=0;j<total_symb;j++)
            {
                if(symb_table[i].name.equalsIgnoreCase(symb_table[j].name) && flag[j]==0)
                {
                    symb_found++;
                    flag[j]=1;
                }
            }
            if(symb_found>1)
            
                System.out.print("\n\n**********************'"+symb_table[i].name+"'Is duplicate symbol*********************************");

            
        }
        br2.close();
        sc.close();



    }




}
    

