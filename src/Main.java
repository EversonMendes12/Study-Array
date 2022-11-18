public class Main {

        public static void main(String[] args) {

            /* ------------------------------------------------------------------------------------------- */

        /* int[] tabela = new int[5]; // Cria uma Array de 5 posições, ex: [00], [00], [00], [00], [00];

        tabela[2] = 2;

        JOptionPane.showMessageDialog(null, "Posição: 0" + tabela[2]);

        Imprime:: 02

        */

            /* ------------------------------------------------------------------------------------------- */

            int[] tabela = {10, 5, 11, 8, 1, 24}; // Array predefinida ex: [10], [05], [11], [8], [01], [24];

            for (int x = 0 ; x <= 5 ; x++){

                System.out.println("Posição: [" + x + "] Número contido no Array: [" + tabela[x] + "]");

            }

        }
}
