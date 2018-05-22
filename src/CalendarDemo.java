import java.util.*;
import java.text.*;
public class CalendarDemo
{
    public static void main(String[] args)
    {
        //得到日期格式对象
        //Date date = fmt.parse(strDateMake);

        System.out.println("完整显示日期时间：");
        //字符串转换日期格式
        DateFormat fdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str =fdate.format(new Date());
        System.out.println(str);

        //创建 Calendar 对象
        Calendar calendar = Calendar.getInstance();
        //初始化 Calendar 对象，但并不必要，除非需要重置时间
        calendar.setTime(new Date());

        //显示年份
        System.out.println("年：" + calendar.get(Calendar.YEAR));

        //显示月份
        System.out.println("月：" + calendar.get(Calendar.MONTH));

        //显示当前分钟数
        System.out.println("分钟：" + calendar.get(Calendar.MINUTE));

        //今年的第N天
        System.out.println("今年的第" + calendar.get(Calendar.DAY_OF_YEAR) + "天");

        //本月第N天
        System.out.println("本月的第" + calendar.get(Calendar.DAY_OF_MONTH) + "天");

        //3小时以后
        calendar.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println("三小时以后的时间：" + calendar.getTime());
        //格式化显示
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        calendar.setTime(new Date());
        str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());
        System.out.println(str);

        Calendar calendarNew = Calendar.getInstance();
        calendarNew.add(Calendar.HOUR,-5);
        System.out.println("时间比较：" + calendarNew.compareTo(calendar));
        calendarNew.add(Calendar.HOUR, -2);

        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendarNew.getTime()));
        System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime()));
        System.out.println("时间比较：" + calendarNew.compareTo((calendar)));
    }
}
