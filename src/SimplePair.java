public class SimplePair<T> {
    private T data1;
    private T date2;

    public SimplePair(T data1, T date2) {
        this.data1 = data1;
        this.date2 = date2;
    }

    public T getFirst() {
        return data1;
    }
    public  T getSecond() {
        return date2;
    }

    public void setFirst(T date1) {
        this.data1 = date1;
    }
    public void setSecond(T date2) {
        this.date2 = date2;
    }
}
