package member;

import static java.lang.Math.negateExact;
import static java.lang.Math.random;

import java.util.Scanner;

public class MemberConsoleUtil {

    // 동일한 스캐너 사용
    public Member addMember(Scanner sc) {
        // 회원 한명에 대한 정보 입력 받기
        // 입력받은 정보로 Member 인스턴스를 생성 후 리턴

        // System.out.print("회원 ID 입력 >> ");
        // String id = sc.nextLine();
        // System.out.print("이름 입력 >> ");
        // String name = sc.nextLine();
        // System.out.print("주소 입력 >> ");
        // String addr = sc.nextLine();
        // System.out.print("이메일 입력 >> ");
        // String email = sc.nextLine();

        // return new Member(id, name, addr, email);

        Member member = new Member();
        System.out.print("회원 ID 입력 >> ");
        member.setId(sc.nextLine());
        System.out.print("이름 입력 >> ");
        member.setName(sc.nextLine());
        System.out.print("주소 입력 >> ");
        member.setAddr(sc.nextLine());
        System.out.print("이메일 입력 >> ");
        member.setEmail(sc.nextLine());

        return member;
    }

    public void printMembers(Member[] members) {
        // members 정보 출력
        // 전달 인자 사용하는 이유
        System.out.println();
        System.out.println("아이디    이름   주소   이메일");
        for (Member member : members) {
            if (member != null) {
                System.out.printf("%5s\t$5s\t%6s%10s\n", member.getId(), member.getName(), member.getAddr(),
                        member.getEmail());
            }
        }

    }

    public Member updateMember(Scanner sc, Member[] members) {
        // 주소 수정
        // 아이디 / 수정할 주소 입력받기
        System.out.println();
        System.out.println("아이디 입력 >> ");
        String id = sc.nextLine();
        System.out.print("수정할 주소 입력 >> ");
        String addr = sc.nextLine();

        // members에서 일치하는 아이디 찾은 후 주소 변경
        // 수정된 member 리턴
        for (Member member : members) {
            if (member != null) {
                if (member.getId().equals(id)) {
                    member.setAddr(addr);
                    return member;
                }
            }
        }
        return null;
    }

    public void removeMember(Scanner sc, Member[] members) {
        // 삭제할 회원 아이디 입력
        System.out.println();
        System.out.println("삭제할 아이디 입력 >> ");
        String id = sc.nextLine();

        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (members[i].getId().equals(id)) {
                    members[i] = null;
                    return;
                }
            }
        }
        sc.close();

    }
}
