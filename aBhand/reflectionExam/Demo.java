package aBhand.reflectionExam;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException{
        Class alunbarClass = TargetObject.class;

        Class alunbarClass1 = Class.forName("aBhand.reflectionExam.TargetObject");

        TargetObject o = new TargetObject();
        Class alunbarClass2 = o.getClass();

        ClassLoader classLoader = Demo.class.getClassLoader();
        Class<?> clazz = classLoader.loadClass("aBhand.reflectionExam.TargetObject");

        System.out.println("----------");

    }
}
