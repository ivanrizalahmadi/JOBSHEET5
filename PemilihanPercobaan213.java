import java.util.Scanner;

public class PemilihanPercobaan213 {
    public static void main (String[] args){
        Scanner input13 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float uas = input13.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input13.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input13.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        
        
        String message1String = total < 60 ? "remidi" : "tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message1String);      

        if (total >= 80) 
            System.out.println("A/sangat baik");
           else if (total >= 73) 
                System.out.println("B+/lebih dari baik");
             else   if (total >= 65) 
                    System.out.println("B/baik");
                else    if (total >= 60) 
                        System.out.println("C+lebih dari cukup");
                  else    if (total >= 50) 
                        System.out.println("C/cukup");
                    else  if (total >= 39 ) 
                            System.out.println("D/kurang");
                            else if (total <= 39 ) 
                                System.out.println("E/gagal");
        }

    }


      
        
        


    

