class Info {
    String a;
    int b = 0;

    Info() {
        a = "Default";
        b = 0;
    }

    Info(String x) {
        a = x;
        System.out.println(a);
    }
    
    Info(String x, int b) {
        this.a = x;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Info t1 = new Info();
        Info t2 = new Info("Rajesh");
        Info t3 = new Info("Manoj", 77);
    }
}
