class tesst{
    int id;
    tesst(int id){
        this.id=id;
    }
    @Override
    protected void finalize(){
        System.out.print("object "+id+" destroyed");
    }
    

    public static void main(String[] args) {
        test t1=new test(1);
        test t2=new test(2);
        t1=null;
        t2=null;
       
        System.gc();
    }
}