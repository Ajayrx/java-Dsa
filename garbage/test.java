class test{
    int id;
    test(int id){
        this.id = id;
    }

    @Override
    protected void finalize() {
        System.out.println("object " + id + " destroyed");
    }

    public static void main(String[] args) {
        // tesst t1 = new tesst(1);
        // tesst t2 = new tesst(2);

        // t1 = null;
        // t2 = null;

        System.gc();

        // Give JVM time
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
    }
}
