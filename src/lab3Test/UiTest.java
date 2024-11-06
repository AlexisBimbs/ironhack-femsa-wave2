package lab3Test;

public class UiTest {
	
	private final ExamplesService examplesService = new ExamplesService();

    @Test
    public void testSetupUiComponent_failResizeWithNegative() {
        Integer originalSize = -100;
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            examplesService.setupUiComponent(originalSize);
        });
        String expectedMessage = "Size cannot be negative";
        assertEquals(expectedMessage, exception.getMessage());
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1024, 3215, 585, 100, Integer.MAX_VALUE})
    public void testSetupUiComponent_successAdjustAnyResize(Integer adjustedSize) throws Exception {
        UiComponentModel uiComponentModel = examplesService.setupUiComponent(adjustedSize);
        assertTrue(uiComponentModel.adjustToScreenSize(adjustedSize), "UI should adjust to width of " + adjustedSize + " pixels");
    }

}
