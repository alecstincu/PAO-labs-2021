package ro.unibuc.pao.exercise;

class TestYourself4 {
    int m_x, m_y;

    public TestYourself4(int x, int y) {
        m_x = x;
        m_y = y;
    }

    public TestYourself4() {
        this(10, 10);
    }

    public int getX() {
        return m_x;
    }

    public int getY() {
        return m_y;
    }

    public static void main(String[] args) {
        TestYourself4 p = new TestYourself4();
        System.out.println(p.getX());
    }
}
