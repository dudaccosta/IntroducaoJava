public class App {
    public static void main(String[] args) throws Exception {

        boolean fimSemana = true;
        boolean fazendoSol = true;
        boolean praia = fimSemana && fazendoSol;

        // Operadores:
        // And === && 
        // sendo true && false, quando true && true é true diferente disso false
        // quando false && false é false diferente disso false

        // OR === || 
        // sendo true || false, quando true || true 
        // true || false 
        // false || true  é true
        // quando false || false é false

        System.out.println(praia);

        String mensagem = fimSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
