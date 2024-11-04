package test;

public class UiComponentModel {
    private Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean adjustToScreenSize(Integer screenSize) {
        return Objects.equals(this.size, screenSize);
    }
}