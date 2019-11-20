public class Hw1 {
    public static void main(String[] args) {
        Integer[] iarr = {10, 20, 30, 40, 50};
        //Integer 타입의 제네릭 클래스 사용선언
        Array<Integer> iArray = new Array<Integer>(iarr);

        //출력
        System.out.println(iArray.getFirst());
        System.out.println(iArray.getLast());
        System.out.println(iArray.getElement(3));
        System.out.println(iArray);

        System.out.println();

        String[] sarr = {"Hello", "world", "!"};
        //String 타입의 제네릭 클래스 사용선언
        Array<String> sArray = new Array<String>(sarr);

        System.out.println(sArray.getFirst());
        System.out.println(sArray.getLast());
        System.out.println(sArray.getElement(1));
        System.out.println(sArray);
    }
}
