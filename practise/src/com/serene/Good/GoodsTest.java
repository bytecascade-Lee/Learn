package com.serene.Good;

public class GoodsTest {
    public static void main(String[] args) {
        // 1.创建一个数组
        Goods[] arr = new Goods[3];


        // 2.创建对象
        Goods g1 = new Goods("001", "手机", 5999.0, 100);
        Goods g2 = new Goods("002", "保温杯", 227.0, 50);
        Goods g3 = new Goods("002", "枸杞", 12.7, 70);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods good = arr[i];
            System.out.print(good.getId() + ",");
            System.out.print(good.getName() + ",");
            System.out.print(good.getPrice() + ",");
            System.out.print(good.getCount() + "。");
            System.out.println();
        }



    }
}
