//https://www.tutorialspoint.com/design_pattern/front_controller_pattern.htm

package com.azish.designpattern.j2ee.frontcontrollerpattern;

public class FrontControllerPatternMain {
    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}

/**
 * از الگوی طراحی کنترلر جلو برای تهیه یک مکانیسم رسیدگی به درخواست متمرکز استفاده می شود تا همه درخواست ها توسط یک کنترل کننده واحد انجام شود.
 * این کنترل کننده می تواند تأیید اعتبار / مجوز / ورود به سیستم یا پیگیری درخواست را انجام دهد و سپس درخواست ها را به دستگیرندگان مربوطه ارسال کند.
 * در زیر اشخاصی از این نوع الگوی طراحی را مشاهده می کنید.
 *
 Front Controller : کنترل کننده واحد برای انواع درخواست هایی که به برنامه کاربردی می آید (یا مبتنی بر وب / رومیزی).

 Dispatcher : Front Controller ممکن است از یک شیء ارسال کننده استفاده کند که می تواند درخواست را به کنترل کننده مخصوص مربوطه ارسال کند.

 view : ویو ها شیئی است که درخواست ها برای آنها انجام می شود.
 */
