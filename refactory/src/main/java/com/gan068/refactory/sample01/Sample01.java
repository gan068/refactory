/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gan068.refactory.sample01;

/**
 *
 * @author gan068
 */
public class Sample01 {

    public void exec(int eventId) {
        this.start();
        this.step01();
        this.step02();
        switch (eventId) {
            case 1:
                this.specialEvent01();
                break;
            case 2:
                this.specialEvent02();
                break;
        }
        this.step03();
        this.saveData();
        switch (eventId) {
            case 2:
                this.specialEvent02AfterSave();
                break;
        }
        this.finish();
    }

    protected void start() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("----" + method + "----");
    }

    protected void finish() {
        String method = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println("----" + method + "----");
    }

    protected String specialEvent01() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected String specialEvent02AfterSave() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected String specialEvent02() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected String step01() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected String step02() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected String step03() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return step;
    }

    protected boolean saveData() {
        String step = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(step);
        return true;
    }
}
