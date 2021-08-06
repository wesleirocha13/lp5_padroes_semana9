package mediator;

/**
 *
 * @author Weslei
 */
public interface Sector {
    String receiveComplaint(String message);
    String receiveAsk(String message);
    String receivePraise(String message);
}
