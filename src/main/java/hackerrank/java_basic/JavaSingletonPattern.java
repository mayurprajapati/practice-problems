package hackerrank.java_basic;

class JavaSingletonPattern {
    public String str = "";
    private static JavaSingletonPattern obj = null;

    public static JavaSingletonPattern getSingleInstance() {
        if (obj == null) obj = new JavaSingletonPattern();
        return obj;
    }

    private JavaSingletonPattern() {
    }
}