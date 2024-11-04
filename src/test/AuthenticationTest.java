package test;

public class AuthenticationTest {
	
	private final ExamplesService examplesService = new ExamplesService();

    @Test
    public void testUserAuthentication_correctCredentials() {
        String username = "validUser";
        String password = "validPass";
        String expectedMessage = "Should succeed with correct credentials";
        String returnMessage = examplesService.authenticate(username, password);
        assertEquals(expectedMessage, returnMessage);
    }

    @Test
    public void testUserAuthentication_wrongCredentials_user() {
        String username = "invalidUser";
        String password = "validPass";
        String expectedMessage = "Should fail with wrong credentials";
        String returnMessage = examplesService.authenticate(username, password);
        assertEquals(expectedMessage, returnMessage);
    }

    @Test
    public void testUserAuthentication_wrongCredentials_password() {
        String username = "validUser";
        String password = "invalidPass";
        String expectedMessage = "Should fail with wrong credentials";
        String returnMessage = examplesService.authenticate(username, password);
        assertEquals(expectedMessage, returnMessage);
    }

}
