package test;

public class ExamplesService {

	public String authenticate(String username, String password) {
		if (username.equals("validUser") && password.equals("validPass")) {
			return "Should succeed with correct credentials";
		} else {
			return "Should fail with wrong credentials";
		}
	}

	public void processData(DataModel dataModel) throws Exception {
		if (dataModel.getData().equalsIgnoreCase("some error")) {
			throw new Exception("Data processing error");
		}
		dataModel.setProcessedSuccessfully(true);
	}

	public UiComponentModel setupUiComponent(Integer size) throws Exception {
		if (size < 0) {
			throw new Exception("Size cannot be negative");
		}
		UiComponentModel uiComponentModel = new UiComponentModel();
		uiComponentModel.setSize(size);
		return uiComponentModel;
	}
}
