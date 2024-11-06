package lab3Test;

public class DataModel {
    private String data;
    private boolean processedSuccessfully;

    public DataModel(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isProcessedSuccessfully() {
        return processedSuccessfully;
    }

    public void setProcessedSuccessfully(boolean processedSuccessfully) {
        this.processedSuccessfully = processedSuccessfully;
    }
}