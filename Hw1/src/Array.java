//제네릭 클래스
public class Array<T> {
    //배열 선언
    private T[] arr;

    //배열의 받음
    public Array(T[] arr) {
        this.arr = arr;
    }

    //배열의 첫번쨰 원소를 반환
    public T getFirst() {
        return arr[0];
    }
    //배열의 마지막 원소를 반환
    public T getLast() {
        return arr[arr.length - 1];
    }
    //입력받은 i의 원소를 반환
    public T getElement(int i) {
       return arr[i];
    }

    //문자열로 변환
    public String toString() {
        //문자열을 담을 변수
        String temp = "";
        for(int i = 0; i < arr.length; i++) {
            //배열을 값을 더함
            temp += (arr[i] + " ");
        }
        return temp;
    }
}
