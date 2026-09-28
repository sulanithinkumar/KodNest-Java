
public class Book {

    private int pageNum;

    public void setData(int x) {
        if (x > 0) {

            pageNum = x;
        }
    }

    public int getData() {
        return pageNum;
    }
}
