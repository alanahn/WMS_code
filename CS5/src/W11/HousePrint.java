package W11;

public class HousePrint {
    private int width;
    private int height;
    private String color;

    public HousePrint(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int size(int w, int h) {
        return w * h;
    }

    void build() {
        System.out.println("집의 틀을 지었습니다.");
    }

    void paint() {
        System.out.println("집에 페인트를 칠했습니다.");
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
