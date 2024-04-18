import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int nStudenti;
        int nMaterie;
        System.out.print("Inserisci il numero di studenti");
        nStudenti= input.nextInt();
        System.out.print("Inserisci il numero di materie");
        nMaterie= input.nextInt();
        int[]medie=new int[nStudenti];
        int[][]voti=new int[nStudenti][nMaterie];
        for(int i=0;i< voti.length;i++){
            for (int j=0;j< voti[0].length;j++){
                System.out.print("Inserisci voto");
                voti[i][j]= input.nextInt();
            }
        }
        Media(voti,nMaterie,medie);
        System.out.println("Le medie sono:");
        for (int i=0;i<medie.length;i++){
            System.out.println(medie[i]);
        }
    }
    public static int[] Media (int[][]voti,int nMaterie,int[] medie){
        int media;
        int somma=0;
        for (int i=0;i<voti.length;i++){
            for (int j=0;j<voti[0].length;j++){
                somma+=voti[i][j];
                media=somma/nMaterie;
                for (int a=0;a<medie.length;a++){
                    medie[a]=media;
                }
            }
        }
        return medie;
    }
}