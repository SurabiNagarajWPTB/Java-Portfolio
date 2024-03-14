package Week06;

import Week06.Student;
import Week06.RequestBook;
import Week06.IssueBook;
public  class demoSRp {
    public static void main(String[] args) {
        Student sony = new Student();
        sony.setname("Sony Mathew");
        sony.setregisterNO("119cs22048");
        RequestBook rb = new RequestBook();
        rb.setbookName("java programming");
        rb.setduration(2);
        rb.setStudent(sony);
        rb.searchBook();
        IssueBook ibOrder = new IssueBook(rb);
        ibOrder.issuebook();
    }
}
