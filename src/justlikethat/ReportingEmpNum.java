package justlikethat;

import java.util.*;

/**
 * Find number of Employees Under every Employee
 Given a dictionary that contains mapping of employee and his manager as a number of (employee, manager) pairs like below.

 { "A", "C" },
 { "B", "C" },
 { "C", "F" },
 { "D", "E" },
 { "E", "F" }

 In this example C is manager of A,
 C is also manager of B, F is manager
 of C and so on.
 */
public class ReportingEmpNum {
    public static void main(String[] args) {
        Map<Character, Character> empMgrMap = new HashMap<>();
        empMgrMap.put('a','c');
    }
}
