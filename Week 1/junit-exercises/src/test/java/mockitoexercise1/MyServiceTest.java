package mockitoexercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use mock object
        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);

        System.out.println("Mockito Test Passed Successfully");
    }
}