package annotation;

public @interface Test {
    public String key() default  "cy";
    public String value() default  "30";
}
