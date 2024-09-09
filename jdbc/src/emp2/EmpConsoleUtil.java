package emp2;

import java.util.Scanner;

public class EmpConsoleUtil {
    public EmpDTO insertEmp(Scanner sc) {

        System.out.println("============================");
        System.out.println("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.println("이름 : ");
        String ename = sc.nextLine();
        System.out.println("직업 : ");
        String job = sc.nextLine();
        System.out.println("매니저 번호 : ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.println("입사일 : ");
        String hiredate = sc.nextLine();
        System.out.println("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.println("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.println("부서번호 : ");
        int deptno = Integer.parseInt(sc.nextLine());
        System.out.println("============================");

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);

    }
}
