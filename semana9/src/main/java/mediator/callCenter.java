package mediator;

/**
 *
 * @author Weslei
 */
public class callCenter {
    
    private static callCenter instance = new callCenter(); //Singleton

    private callCenter() {}

    public static callCenter getInstance() {
        return instance;
    }

    public String receiveComplaintFinancial(String message) {
        return "A empresa x agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Financial.getInstance().receiveComplaint(message);
    }

    public String receiveAskFinancial(String message) {
        return "A empresa x agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Financial.getInstance().receiveAsk(message);
    }
    
    public String receivePraiseFinancial(String message) {
        return "A empresa x agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Financial.getInstance().receivePraise(message);
    }
}
