//https://www.geeksforgeeks.org/intercepting-filter-pattern/
//https://www.tutorialspoint.com/design_pattern/intercepting_filter_pattern.htm

package com.azish.designpattern.j2ee.interceptingfilterpattern;

class InterceptingFilterMain
{
    public static void main(String[] args)
    {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Downloads");

    }
}

/**
 * پردازش اولیه و پردازش یک درخواست به اقدامات انجام شده قبل و بعد از پردازش اصلی آن درخواست اشاره دارد.
 * برخی از این اقدامات تعیین می کنند که آیا پردازش ادامه خواهد یافت ، در حالی که برخی دیگر جریان داده های ورودی یا خروجی را به شکلی مناسب برای پردازش بیشتر دستکاری می کنند.
 *
 * راه حل کلاسیک شامل یک سری چک های شرطی است و هر بررسی شکست خورده باعث سقوط درخواست می شود.
 * گفته های تو در تو if / else یک استراتژی استاندارد هستند ،
 * اما این راه حل منجر به شکنندگی کد و سبک برنامه نویسی کپی و چسباندن می شود ، زیرا جریان فیلتر و عملکرد فیلترها در برنامه وارد می شود.
 * نکته اصلی برای حل این مشکل به صورت انعطاف پذیر و محجوب ،
 * داشتن مکانیزم ساده ای برای اضافه کردن و از بین بردن اجزای پردازش است که در آن هر یک از مؤلفه ها یک فیلتر خاص را انجام می دهند.
 *  Filter Manager: FilterManager پردازش فیلتر را مدیریت می کند.
 *  این FilterChain را با فیلترهای مناسب ، به ترتیب صحیح ایجاد می کند و پردازش را آغاز می کند.
 *  FilterChain: FilterChain یک مجموعه سفارش از فیلترهای مستقل است.
 *  FilterOne ، FilterTwo: این فیلترهای فردی هستند که در یک هدف نقشه برداری می شوند. FilterChain پردازش آنها را هماهنگ می کند.
 *  Target: منبعی است که مشتری درخواست می کند.
 */