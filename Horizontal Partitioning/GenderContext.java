public class GenderContext {
    private static final ThreadLocal<String> CONTEXT = new ThreadLocal<>();

    public static void set(String gender) { CONTEXT.set(gender); }
    public static String get() { return CONTEXT.get(); }
    public static void clear() { CONTEXT.remove(); }
}