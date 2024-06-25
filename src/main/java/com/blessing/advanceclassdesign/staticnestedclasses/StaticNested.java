package com.blessing.advanceclassdesign.staticnestedclasses;


interface A {
    interface B {
        void p();
    }

    class C implements B {

        @Override
        public void p() {
            // TODO Auto-generated method stub
            System.out.println("inner c");
        }

    }
}

class C implements A.B {

    @Override
    public void p() {
        // TODO Auto-generated method stub

    }

}

public class StaticNested {

    enum P {

        E {
            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        }, R {
            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        };

        public abstract void run();
    }

    public static void main(String[] args) {
        A.C c = new A.C();
        c.p();
    }
}
