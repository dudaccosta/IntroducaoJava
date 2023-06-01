import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class ManipulacaoStringsDatas {
    public static void main(String[] args) throws Exception{

        String nome = "Maria";

        // System.out.println(nome.toUpperCase()); // caps lock
        // System.out.println(nome.toLowerCase()); // minusculo
        // System.out.println(nome.length()); // quantidade de caracteres

        // String outroNome = "Fernada";

        // System.out.println(outroNome.equalsIgnoreCase(outroNome)); // vai ignorar qualquer coisa
        // System.out.println(outroNome.equals(nome));

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        // pode usar o .getDayOf... pra ver o dia da semana, mês e ano
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if(agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if(agora.getHour() >= 19 && agora.getHour() < 24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá";
        }
        
        // %s = reperesenta as Strings 
        // %n = representa a quebra de linha
        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toLowerCase());
    }
    
}
