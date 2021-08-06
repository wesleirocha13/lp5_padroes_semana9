package mediator;

/**
 *
 * @author Weslei
 */
public class Issuer {
    
    public String complainFinancial(String message) {
        return callCenter.getInstance().receiveComplaintFinancial(message);
    }

    public String askFinantial(String message) {
        return callCenter.getInstance().receiveAskFinancial(message);
    }
    
    public String praiseFinancial(String message) {
        return callCenter.getInstance().receivePraiseFinancial(message);
    }
}
