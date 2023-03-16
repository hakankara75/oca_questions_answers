package inheritance.iterface;

public class ReportTool extends Tool implements Exportable {

    public void e(){            // line 2
        System.out.println("lgslhsş");

    }

    public static void main(String[] args) {
Tool at=new  ReportTool();
Tool atege=new Tool();

    }

    public void cll(Exportable aaaaaaaaa){
        aaaaaaaaa.e();

    }
/*
What is the result?
A. Compilation fails only at line n2.
B. RTool::exportTool::export
C. Tool::exportTool:export
D. Compilation fails only at line n1.
E. Compilation fails at both line n1 and line n2.

Cevap D
Inteface de class default public tir.
Bu soruda Tool clastaki metot interface den alinmis ama daraltilmis.
yani protected yapilmis. dolayisiyla line 1 de cte verir. child parent in access modifierini
kisitlayamaz. o da public olmak zorunda.
 */



}
