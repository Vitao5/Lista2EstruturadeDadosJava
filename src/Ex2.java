public class Ex2 {
    public static void main(String[] args) {
        int[] notas = {1, 2, 3, 4, 9,9};

        for (int i : notas) {
            int qtdeRepetidos =0;
            for (int j : notas) {
                if(i == j) qtdeRepetidos++;
            }

            if(qtdeRepetidos > 1){
                System.out.println("Valores duplicados");
                return;
            }
        };

        System.out.println("Valores únicos");
    }
}
