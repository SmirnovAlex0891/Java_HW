package hw_20_04_2023;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 9) Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
 * Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.
 */
public class Hw2 {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, new GregorianCalendar(2022,10,10), 2500));
        orderList.add(new Order(2, new GregorianCalendar(2022,05,15), 3700));
        orderList.add(new Order(3, new GregorianCalendar(2022,03,21), 2100));
        orderList.add(new Order(4, new GregorianCalendar(2022,10,2), 1800));
        orderList.add(new Order(5, new GregorianCalendar(2022,05,13), 4200));
        orderList.add(new Order(6, new GregorianCalendar(2022,03,28), 5500));
        orderList.add(new Order(7, new GregorianCalendar(2022,10,30), 3700));
        orderList.add(new Order(8, new GregorianCalendar(2022,05,5), 2800));

        Map<Object, Integer> map = orderList.stream()
                .collect(Collectors.groupingBy(e -> e.getDate().get(Calendar.MONTH), Collectors.summingInt(Order::getSumOrder)));

        for (Map.Entry<Object, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
class Order {
    private int id;
    private Calendar date;
    private int sumOrder;
    private boolean state;

    public Order(int id, Calendar date, int sumOrder) {
        this.id = id;
        this.date = date;
        this.sumOrder = sumOrder;
        this.state = true;
    }

    public Calendar getDate() {
        return date;
    }

    public int getSumOrder() {
        return sumOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + this.getDate().get(Calendar.YEAR) + "-" + this.getDate().get(Calendar.MONTH) + "-" + this.getDate().get(Calendar.DATE) +
                ", sumOrder=" + sumOrder +
                ", state=" + state +
                '}';
    }
}
