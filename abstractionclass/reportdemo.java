package abstractionclass;
abstract class report {
    private final String title; // Shared data: every report has a title.

    // constructor
    report(String title) {
        this.title = title;
    }

    public final void print() {
        header();
        body();
        footer();
    }

    protected void header() {
        System.out.println("=== " + title + " ===");
    }

    protected abstract void body();
    // protected void body() {

    // }

    protected void footer(){
        System.out.println("==== end ====");
    }

}
// Subclass that extends Report

class salesreport extends report{

    salesreport(){
        super("sales report this ");
    }

    protected void body(){
        System.out.println("top 3 products listed...");
    }
}



class flipkartsalesreport extends report{
    flipkartsalesreport(){
        super(" flipkart sale top list 2025 ");
    }

    protected void body(){
        System.out.println(" top item = iphone 16");
    }

    protected void footer(){
        System.out.println("hey no winter slaes");
    }
}



public class reportdemo {
    public static void main(String[] args) {
        
        report r=new salesreport();
        r.print();

        report k=new flipkartsalesreport();
        k.print();
    }

}
