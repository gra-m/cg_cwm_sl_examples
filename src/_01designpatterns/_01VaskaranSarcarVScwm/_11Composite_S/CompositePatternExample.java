package _01designpatterns._01VaskaranSarcarVScwm._11Composite_S;

/**
 * Created by Gra_m on 2022 03 17
 *
 * GOF: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat
 * individual objects and compositions of objects uniformly.
 *
 * CONCEPT: Any tree data structure can follow this concept. Nodes and branches can be treated the same way.
 * Grouped together like a gift pack of dried fruits or selected individually.
 *
 * Hierarchy: Principal _HeadOfMathsHOM + 2MTeach _HeadOfCompHOC + 3CTeach
 *
 */

public class CompositePatternExample {
    public static void main(String[] args) {
        System.out.println("Composite Pattern Demo");
        // Teachers
        SimpleEmployee mTeach1 = new SimpleEmployee("M-Teach-1", "Maths");
        SimpleEmployee mTeach2 = new SimpleEmployee("M-Teach-2", "Maths");

        SimpleEmployee cTeach1 = new SimpleEmployee("C-Teach-1", "C-Science");
        SimpleEmployee cTeach2 = new SimpleEmployee("C-Teach-2", "C-Science");
        SimpleEmployee cTeach3 = new SimpleEmployee("C-Teach-3", "C-Science");

        // DeptHeads
        CompositeEmployee hOD_Maths = new CompositeEmployee("Mrs. S. Das (HOD-Maths)", "Maths");
        CompositeEmployee hOD_C_Science = new CompositeEmployee("Mr. V. Sarcar (HOD-C-Science)", "C-Science");
        CompositeEmployee principal = new CompositeEmployee("Dr. S. Som (Principal)", "Planning/Supervising manager");

        // Build nested hierarchy
        hOD_Maths.addEmployee(mTeach1);
        hOD_Maths.addEmployee(mTeach2);

        hOD_C_Science.addEmployee(cTeach1);
        hOD_C_Science.addEmployee(cTeach2);
        hOD_C_Science.addEmployee(cTeach3);

        principal.addEmployee(hOD_Maths);
        principal.addEmployee(hOD_C_Science);

        System.out.println("Testing structure of Principal Obj:");
        System.out.println("\t" + principal.getEmployeeCount());
        principal.printStructures();


        System.out.println("Testing structure of Head of Dept Objs:");
        System.out.println("\t" + hOD_C_Science.getEmployeeCount());
        hOD_C_Science.printStructures();

        System.out.println("\t" + hOD_Maths.getEmployeeCount());
        hOD_Maths.printStructures();

        System.out.println("A quick count of the teachers employees, should be 0");
        System.out.println(mTeach1.getEmployeeCount() + " " + mTeach2.getEmployeeCount() + " " + cTeach1.getEmployeeCount() + " " +cTeach2.getEmployeeCount() + " "  + cTeach3.getEmployeeCount() + " ");

        System.out.println("\nA teacher from each dept 'left' after attempting to defend their subjects against accusations of being...");
        hOD_C_Science.removeEmployee(cTeach1);
        hOD_Maths.removeEmployee(mTeach1);

        System.out.println("\nNew structure of Head of Dept Objs:");
        System.out.println("\t" + hOD_C_Science.getEmployeeCount());
        hOD_C_Science.printStructures();

        System.out.println("\t" + hOD_Maths.getEmployeeCount());
        hOD_Maths.printStructures();

        System.out.println("Then the head of C-science resigned in disgust.");
        principal.removeEmployee(hOD_C_Science);

        System.out.println("\nFinal hierarchy:");
        principal.printStructures();


    }
}
