package api;

public class StringBufferEx {
    public static void main(String[] args) {
        // 변경가능한(mutable)
        // StringBuffer : 스레드에 안전, 버퍼(공간)있음, 16글자 기본형, 갯수 지정 가능
        // - append, delete, insert, replace, reverse 메소드 있음. 원본 문자 파괴 가능
        // StringBuilder

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // equals() : Object가 상속해준 방식으로 사용
        System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2)); // false, 주소다름
        System.out.println("sb1==sb2 : " + sb1.equals(sb2)); // false
        // string에서는 true 뜸. object 에서 오버라이딩 해서 값비교를 했기 때문에
        // false 이므로 오버라이딩 안하고 object에서 가져온 그대로 사용중. 주소값 비교해서 false

        // 값 비교? ==>String으로 변환해서
        // toString() : StringBuffer => String
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        System.out.println(s1.equals(s2));

        System.out.println("append() : " + sb1.append("def"));
        System.out.println("insert() : " + sb1.insert(3, "hello"));
        System.out.println("delete() : " + sb1.delete(2, 5));
        System.out.println("replace() : " + sb1.replace(3, sb1.length(), "END"));

    }
}
