import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int [] [] matriz ={ {1,2,3,4},
                            {5,6,7,8},
                            {5,6,7,8}};

        //System.out.println(matriz.length);
        //System.out.println(matriz[0].length);
        //matriz.length - quantidade de linhas
        //matriz[0].length - quantiade de colunas

        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+",");
            }
            System.out.println(" ");
        }
    }
}
