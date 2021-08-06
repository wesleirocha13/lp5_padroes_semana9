/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class CustomerTest {
    
    @Test
    public void mustComplaintFinancial() {
        Customer Customer = new Customer();
        assertEquals("A empresa x agradece seu contato.\nO Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Financeiro vai procurar melhorar o servico da reclamacao: Servico ruim",
                Customer.complainFinancial("Servico ruim"));
    }
    
    @Test
    public void mustAskFinancial() {
        Customer Customer = new Customer();
        assertEquals("A empresa x agradece seu contato.\nO Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Financeiro vai analisar a sua pergunta: Pergunta teste",
                Customer.askFinantial("Pergunta teste"));
    }
    
    @Test
    public void mustPraiseFinancial() {
        Customer Customer = new Customer();
        assertEquals("A empresa x agradece seu contato.\nO Financeiro respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Financeiro agradece a mensagem: Otimo atendimento",
                Customer.praiseFinancial("Otimo atendimento"));
    }
    
}
