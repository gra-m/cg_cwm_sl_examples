package _01designpatterns._01VaskaranSarcarVScwm._13z_visitor_in_composite.b_aftervisitor;


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
        SimpleEmployee mTeach1 = new SimpleEmployee("M-Teach-1", "Maths",  4);
        SimpleEmployee mTeach2 = new SimpleEmployee("M-Teach-2", "Maths",  10);

        SimpleEmployee cTeach1 = new SimpleEmployee("C-Teach-1", "C-Science", 13);
        SimpleEmployee cTeach2 = new SimpleEmployee("C-Teach-2", "C-Science",  12);
        SimpleEmployee cTeach3 = new SimpleEmployee("C-Teach-3", "C-Science", 1);

        // DeptHeads
        CompositeEmployee hOD_Maths = new CompositeEmployee("Mrs. S. Das (HOD-Maths)", "Maths", 16);
        CompositeEmployee hOD_C_Science = new CompositeEmployee("Mr. V. Sarcar (HOD-C-Science)", "C-Science", 14);
        CompositeEmployee principal = new CompositeEmployee("Dr. S. Som (Principal)", "Planning/Supervising manager", 4);

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
        System.out.println("\t" + principal.getTotalYearsExperienceToLevel());
        principal.printStructures();


        System.out.println("Testing structure of Head of Dept Objs:");
        System.out.println("\t" + hOD_C_Science.getEmployeeCount());
        System.out.println("\t" + hOD_C_Science.getTotalYearsExperienceToLevel());
        hOD_C_Science.printStructures();

        System.out.println("\t" + hOD_Maths.getEmployeeCount());
        System.out.println("\t" + hOD_Maths.getTotalYearsExperienceToLevel());
        hOD_Maths.printStructures();

        System.out.println("Starting to use the Visitor from here on:");
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        principal.acceptVisitor(concreteVisitor);
        hOD_Maths.acceptVisitor(concreteVisitor);
        hOD_C_Science.acceptVisitor(concreteVisitor);

        cTeach1.acceptVisitor(concreteVisitor);
        cTeach2.acceptVisitor(concreteVisitor);
        cTeach3.acceptVisitor(concreteVisitor);

        mTeach1.acceptVisitor(concreteVisitor);
        mTeach2.acceptVisitor(concreteVisitor);

        /*
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
*/

    }
}
