package lab3Test;

public class DataProcessTest {

	
	private final ExamplesService examplesService = new ExamplesService();

    public DataModel fetchData() {
        return new DataModel("some");
    }

    @Test
    public void testProcessData_successfullyProcessing() throws Exception {
        DataModel dataModel = fetchData();
        examplesService.processData(dataModel);
        assertTrue(dataModel.isProcessedSuccessfully(), "Data should be processed successfully");
    }

    @Test
    public void testProcessData_errorProcessing() {
        DataModel dataModel = new DataModel("some error");

        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            examplesService.processData(dataModel);
        });
        String expectedMessage = "Data processing error";
        assertEquals(expectedMessage, exception.getMessage(), "Should handle processing errors");
    }
}
