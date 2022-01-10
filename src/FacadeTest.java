
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;



public class FacadeTest {

    @Test
    void retornaSucessoEmprestimo()
    {
        Cliente daniel = new Cliente("daniel", "9999", "999"
                , new Endereco("rua um", "bairro dois", "cidade", 1), 123, "ok");
        Conta contaDaniel = new Conta(daniel, 123, "corrente", 1200);
        ContaFacade facadeTest = new ContaFacade();
        facadeTest.realizaEmprestimo(contaDaniel, daniel, 500);
        assertEquals(1700, contaDaniel.getValorEmConta());

    }


    @Test
    void retornaSucessoSaldoDevedor()
    {
        Cliente daniel = new Cliente("daniel", "9999", "999"
                , new Endereco("rua um", "bairro dois", "cidade", 1), 123, "ok");
        Conta contaDaniel = new Conta(daniel, 123, "corrente", 1200);
        ContaFacade facadeTest = new ContaFacade();
        facadeTest.realizaEmprestimo(contaDaniel, daniel, 500);
        assertEquals(500, contaDaniel.getSaldoDevedor());

    }

    @Test

    void retornaErroContaErrada()
    {
        try {
            Cliente daniel = new Cliente("daniel", "9999", "999"
                    , new Endereco("rua um", "bairro dois", "cidade", 1), 123, "ok");
            Conta contaDaniel = new Conta(daniel, 200, "corrente", 1200);
            ContaFacade facadeTest = new ContaFacade();
            facadeTest.realizaEmprestimo(contaDaniel, daniel, 500);
            fail();
        }
                catch(IllegalArgumentException ex)
        {
            assertEquals("Numero da conta do cliente errado", ex.getMessage());
        }
    }


    }
