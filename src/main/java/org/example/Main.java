package org.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;


public class Main {
    public static void main(String[] args) {
//ВОПРОС 1:
        int i1 = 10;
        Integer j1 = i1; // autoboxing;
        // Автобоксинг - это процесс автоматического преобразования
        // примитивного типа данных в соответствующий ему объектный тип.
        // Например, когда целочисленному объекту присваивается
        // значение int, автобоксинг автоматически преобразует
        // значение int в целочисленный объект.

        Integer i2 = 10;
        int j2 = i2; // unboxing
        //Распаковка, с другой стороны, - это процесс автоматического преобразования
        // объекта класса-оболочки в соответствующий ему примитивный тип данных.
        // Например, когда целочисленный объект присваивается переменной int,
        // распаковка автоматически преобразует целочисленный объект в значение int.


//ВОПРОС 2:
        long a = 12321321321312L;
        Long A = 12321321321312L;
        boolean b = false;
        Boolean B = false;

        System.out.println(ClassLayout.parseClass(Long.class).toPrintable(a));
        System.out.println(ClassLayout.parseClass(Long.class).toPrintable(A));
        System.out.println(ClassLayout.parseClass(Boolean.class).toPrintable(b));
        System.out.println(ClassLayout.parseClass(Boolean.class).toPrintable(B));

        System.out.println("The shallow size is: " + VM.current().sizeOf(b));
        System.out.println("The shallow size is: " + VM.current().sizeOf(B));
        System.out.println("The shallow size is: " + VM.current().sizeOf(a));
        System.out.println("The shallow size is: " + VM.current().sizeOf(A));



//ВОПРОС 3:
        // В Java вы можете использовать оператор instanceof
        // для проверки того, принадлежит ли объект определенному классу
        // или его подклассу, или реализует интерфейс.
        // Однако невозможно использовать instanceof с классом,
        // который не связан с деревом иерархии объектов.
        //
        // Каждый класс в Java в конечном счете наследуется от класса Object,
        // поэтому вы не можете использовать instanceof с несвязанным классом.
        // Если вы попытаетесь это сделать, вы получите сообщение об ошибке
        // во время компиляции.

        // Например, предположим, у нас есть два класса,
        // MyClass и несвязанный класс,
        // которые не связаны наследованием или реализацией интерфейса.
        // Вы не можете использовать instanceof, чтобы проверить,
        // является ли объект MyClass экземпляром несвязанного класса или наоборот.
        // Попытка сделать это приведет к ошибке во время компиляции.
    }
}