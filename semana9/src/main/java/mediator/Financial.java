package mediator;

/**
 *
 * @author Weslei
 */
public class Financial {
    private static Financial instance = new Financial();

    private Financial() {}

    public static Financial getInstance() {
        return instance;
    }

    public String receiveComplaint(String message) {
        return "O Financeiro vai procurar melhorar o servico da reclamacao: " + message;
    }

    public String receiveAsk(String message) {
        return "O Financeiro vai analisar a sua pergunta: " + message;
    }
    
    public String receivePraise(String message) {
        return "O Financeiro agradece a mensagem: " + message;
    }
}
