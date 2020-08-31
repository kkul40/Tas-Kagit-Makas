package tas.kagit.makas;
import java.util.Scanner;
import java.util.Random;

public class TasKagitMakas {

    public static void main(String[] args) {
        String tkm[]={"Taş","Kağıt","Makas"};
        
        Scanner oku=new Scanner(System.in);
        Random r=new Random();
        
        int Player=0;
        int Computer=0;
        int sec=0;
        int sec2=0;
        
        System.out.println("lanet olası bir şey ekledim buraya");
        
        System.out.println("Taş, Kağıt, Makas Oynuna Hoşgeldin");
        System.out.println("******* Kurallar ********\n- Yalnızca 0, 1 ve 2\ntuşlarını tuşlayınız.\n\n- 5 Skor Alan Kazanır");
        System.out.println("****** Hadi Başla *******");
        
        while(true){
            
            if (Player == 5 || Computer == 5) {
                
                
                if (Player>Computer) {
                    System.out.println("*************************************");
                    System.out.println("----- Oyunun Galibi Player Oldu -----");
                    System.out.println("*************************************");
                    break;
                }else{
                    System.out.println("***************************************");
                    System.out.println("----- Oyunun Galibi Computer Oldu -----");
                    System.out.println("***************************************");
                    break;
                }
                
            }
            
            System.out.println("0-Taş\n1-Kağıt\n2-Makas");
            System.out.print("=== SEÇİMİN ==> ");
            sec=oku.nextInt();
            while (true) {                
                if (0<=sec && sec<=2) {
                    break;
                }
                else{
                    System.out.println("Lütfen 0 - 1 - 2 tuşlarını tuşlayınız.");
                    System.out.print("=== SEÇİMİN ==> ");
                    sec=oku.nextInt();
                }
                    
            }
            
            System.out.println("Player : "+tkm[sec]);
            sec2=r.nextInt(3);
            System.out.println("Computer : "+tkm[sec2]);
            System.out.println("****************");
            
            if (sec==sec2) {
                System.out.println("Berabere, Kimse Puan Alamadı\n");
                System.out.println("Skorlar");
                System.out.println("****************\nPlayer : "+Player+"\nComputer : "+Computer);
                System.out.println("****************");
                
            }else if (sec == 2 && sec2 == 1 || sec ==1 && sec2 == 0 || sec == 0 && sec2 == 2) {
                System.out.println("Player Kazandı\n");
                Player+=1;
                System.out.println("Skorlar");
                System.out.println("****************\nPlayer : "+Player+"\nComputer : "+Computer);
                System.out.println("****************");
            }else{
                System.out.println("Computer Kazandı\n");
                Computer+=1;
                System.out.println("Skorlar");
                System.out.println("****************\nPlayer : "+Player+"\nComputer : "+Computer);
                System.out.println("****************");
            }
            
            
        }
        
    }
    
}