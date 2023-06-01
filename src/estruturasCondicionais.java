public class estruturasCondicionais {
    
    public static void main(String[] args) throws Exception{

        int nota = 40;
        String aprovacao;

        // Nota do aluno for + || = 70 aluno é aprovado 
        
        // Segundo situaçao: notas A +80 B 79 - 70 C 69 - 50 D 49 - 30 E 29 - 0

        if(nota >= 80) {
            aprovacao = "A";
        } else if (nota <= 79 && nota >= 70){
            aprovacao = "B";
        } else if (nota <= 69 && nota >= 50) {
            aprovacao = "C";
        } else if (nota <= 49 && nota >= 30) {
            aprovacao = "D";
        } else if (nota <= 29 && nota >= 0){
            aprovacao = "E";
        } else {
            aprovacao = " ";
        }

        switch (aprovacao){
            case "A":
            case "B":
            System.out.println("Parabéns você foi aprovado!!");
            break;

            case "C":
            case "D":
            case "E":
            System.out.println("Que pena, você foi reprovado!");
            break;

            default:
            System.out.println("Informação inválida");
            
        }
    }
}
