public class LacosNumericos {

    public static void main(String[] args) throws Exception{

        // (dentro do for) Enquanto minha variavel int (i) for menor que 10, pode add +1
        // Para variar de dois em dois (ou talvez mais que isso) na hora de incrementar seria i+=2 (ou o numéro que você quer incrementar)

        // Só vai finalizar o laço de repetiçao do i, quando terminar o laço de repetiçao do j
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j<= 10; j++){

                System.out.println(j + "x" + i + "=" + j * i);
            }

        }
    }
    
}
