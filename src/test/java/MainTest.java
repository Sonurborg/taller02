import Code.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    static float[ ][ ] datosTesting = {
        {2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f, 4.6f, 2.3f, 3.2f, 3.1f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f, 4.5f, 2.3f, 3.2f, 3.1f, 2.5f, 2.2f},
        {4.5f, 2.3f, 3.2f, 3.1f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f},
        {2.3f, 3.2f, 3.1f, 2.5f, 2.2f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f, 3.8f, 4.0f, 3.1f, 4.5f, 2.3f, 3.2f, 2.9f},
        {2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f, 4.5f, 2.3f, 3.2f, 3.1f, 2.5f, 2.2f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 2.7f, 3.8f, 4.5f, 2.3f, 3.2f, 3.1f},
        {3.8f, 4.0f, 3.1f, 4.5f, 2.3f, 3.2f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 4.5f, 2.3f, 3.2f, 3.1f, 2.5f, 2.2f, 2.5f, 3.0f, 2.7f, 3.8f, 4.0f, 3.1f}
        };
    
    @BeforeAll
    public static void setUpClass() {
        Main.matrix=datosTesting;
        Main.dias=5;
    }

    @Test
    public void Test(){
        Main.menu();
    }
    
}
