interface Compare {
    public int comparing(Object o);
}
public class Ars {
    public static <T extends Compare> void descending(T[] c) {
        //내림차순 정렬
        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                //p[j] 가 p[i] 보가 클때
                if (c[i].comparing(c[j]) == -1) {
                    //교환
                    T temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }
}
