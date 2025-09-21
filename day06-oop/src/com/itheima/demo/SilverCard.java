package com.itheima.demo;

public class SilverCard extends Card{
    public SilverCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }


    @Override
    public void consume(double money) {
        System.out.println("您当前银卡消费金额"+money);
        System.out.println("打折后的金额"+money*0.9);
        if (money*0.9>getMoney()){
            System.out.println("您当余额是:"+getMoney()+"。余额不足，请充值！");
            return;
        }
        setMoney(getMoney()-money*0.9);
    }




}
