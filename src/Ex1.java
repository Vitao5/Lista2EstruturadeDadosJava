import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        System.out.println("Digite o valor em segundos");
        Scanner sc = new Scanner(System.in);

        int segudos = sc.nextInt();

        int horas = segudos / 3600;
        double horasResto = segudos % 3600;

        int minutos = (int) (horasResto / 60);
        int minutosResto = (int) (horasResto % 60);

        System.out.println(horas + ":" + minutos + ":" + minutosResto);

    }
}