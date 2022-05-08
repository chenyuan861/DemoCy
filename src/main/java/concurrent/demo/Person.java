package concurrent.demo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

class  Person{
    private int i =0;
    private static Unsafe UNSAFE;
    private static  Long I_OFFSET;
    private String[] table ={"1","2","3","4"};
    static {
        try{
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            UNSAFE =(Unsafe) field.get(null);
            I_OFFSET = UNSAFE.objectFieldOffset(Person.class.getDeclaredField("i"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final  Person  person= new Person();
        boolean b =UNSAFE.compareAndSwapInt(person,I_OFFSET,1,2);
        System.out.println(UNSAFE.getInt(person,I_OFFSET));
    }
  }


