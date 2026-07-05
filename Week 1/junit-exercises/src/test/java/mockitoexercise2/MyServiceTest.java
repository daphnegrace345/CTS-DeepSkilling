package mockitoexercise2;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service object
        MyService service = new MyService(mockApi);

        // Call method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();

        System.out.println("Interaction Verified Successfully");
    }
}