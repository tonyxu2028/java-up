/**
 * Copyright (c) 2021, Xuelei Fan. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * 判断两个相同半径的圆是否相等，以及打印圆的信息。
 * 因为没有重载equals方法，所以默认使用Object的equals方法,所以两者必然是不等的。
 */
package co.ivi.jus.record;

import co.ivi.jus.record.immute.Circle;

public class ImmuteUseCases {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(10.0);

        System.out.println("Equals? " + c1.equals(c2));
        System.out.println("It is a c1 " + c1);
        System.out.println("It is a c2 " + c2);
    }

}
