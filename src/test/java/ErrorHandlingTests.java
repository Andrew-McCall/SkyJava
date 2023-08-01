import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.sky.ErrorMaker;

public class ErrorHandlingTests {

    private static ErrorMaker em;

    @BeforeAll
    public static void Setup(){
        em = new ErrorMaker();
    }

    @Test
    public void ErrorMessage(){

        try {
            em.ErrorExample();
        }catch (Exception e){
            Assertions.assertEquals("A wild Error appears!", e.getMessage());
        }

    }

    @Test
    public void Error(){

        boolean thereWasAnError = false;
        try {
            em.ErrorExample();
        } catch (Exception e){
            thereWasAnError = true;
        }

        Assertions.assertTrue(thereWasAnError);

    }

    @Test
    public void ErrorViaBuiltIn(){
        Assertions.assertThrows(Exception.class, ()-> {
            em.ErrorExample();
        });

        Assertions.assertThrows(Exception.class, ()-> {
            em.ErrorOnInput(0);
        });
    }

}
