package org.example.head03_oop;

        public class Test {
            public static void main(String[] args) {
//                Order order = new Order();

        Order order = new Order("1212", true);
                System.out.println(order.getOrderId());
                System.out.println(order.getIsPaid());

                order.setOrderId("김김김");
                order.setIsPaid(false);

                System.out.println(order.getOrderId());
                System.out.println(order.getIsPaid());

            }
        }
