package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        EmpConsoleUtil util = new EmpConsoleUtil();
        EmpService service = new EmpService(new EmpDAO());

        while (run) {

            System.out.println("============================");
            System.out.println("1. 사원 정보 입력");
            System.out.println("2. 특정 사원 조회");
            System.out.println("3. 전체 사원 조회");
            System.out.println("4. 사원 정보 수정");
            System.out.println("5. 사원 정보 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("============================");
            System.out.println();
            System.out.println("메뉴 번호 입력 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    EmpDTO dto = util.insertEmp(sc);
                    boolean result = service.addEmp(dto);
                    System.out.println(result ? "입력성공" : "입력실패");
                    break;
                case 2:
                    // getEmpno()
                    int empno = util.getEmpno(sc);
                    // service의 getRow() 호출
                    dto = service.getRow(empno);
                    // util 의 printEmp() 호출
                    util.printEmp(dto);
                    break;
                case 3:
                    // service의 getRows() 호출
                    List<EmpDTO> list = service.getRows();

                    // util의 printListEmp() 호출
                    util.printListEmp(list);
                    break;
                case 4:
                    // updateInfo() 호출
                    dto = util.updateInfo(sc);
                    // updateEmpInfo() 호출 후 결과 받아서 결과 출력
                    // System.out.println(service.updateEmpInfo(dto) ? "수정성공" : "수정실패");

                    if (service.updateEmpInfo(dto)) {
                        // 수정 성공시 사원 정보 출력
                        dto = service.getRow(dto.getEmpno());
                        util.printEmp(dto);
                    } else {
                        System.out.println("수정실패");
                    }
                    break;
                case 5:
                    // deleteEmpNo 호출후 empno 받기
                    // service deleteEmpInfo() 호출 후 결과 출력
                    empno = util.deleteEmpNo(sc);
                    System.out.println(service.deleteEmpInfo(empno) ? "삭제성공" : "삭제실패");
                    break;
                case 6:
                    run = false;
                    break;

                default:
                    System.out.println("메뉴번호 확인");
                    break;
            }
        }
    }
}
