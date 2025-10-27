package com.serene.extenddemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/27
 */
public class ExtendDemoTest {
    public static void main(String[] args) {
        BuOuMao buOuMao = new BuOuMao();
        ZhongGuoLiHuaMao zhongGuoLiHuaMao = new ZhongGuoLiHuaMao();
        HaShiQi haShiQi = new HaShiQi();
        TaiDi taiDi = new TaiDi();

        System.out.println("----------BuOuMao----------");
        buOuMao.eat();
        buOuMao.drink();
        buOuMao.sleep();
        buOuMao.catchMouse();

        System.out.println("----------ZhongGuoLiHuaMao----------");
        zhongGuoLiHuaMao.eat();
        zhongGuoLiHuaMao.drink();
        zhongGuoLiHuaMao.sleep();
        zhongGuoLiHuaMao.catchMouse();

        System.out.println("----------HaShiQi----------");
        haShiQi.eat();
        haShiQi.drink();
        haShiQi.sleep();
        haShiQi.protectHouse();
        haShiQi.demolishHouse();

        System.out.println("----------TaiDi----------");
        taiDi.eat();
        taiDi.drink();
        taiDi.sleep();
        taiDi.protectHouse();
        taiDi.happy();

    }


}
