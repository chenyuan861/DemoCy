package java.demo.cy;

public enum Color {
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String name;
    private int index;

    Color(String name, int index) {
        this.name = name;
        this.index =index;
    }
    // get set 方法
    public String getName() {
        return name;
    }

    // get set 方法
    public int getIndex() {
        return index;
    }


}

