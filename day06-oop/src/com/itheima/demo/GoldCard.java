package com.itheima.demo;

public class GoldCard extends Card{
    public GoldCard(String carId, String name, String number, double  money) {
        super(carId, name, number, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("您当前金卡消费金额"+money);
        System.out.println("打折后的金额"+money*0.8);
        if (money*0.8>getMoney()){
            System.out.println("您当余额是:"+getMoney()+"。余额不足，请充值！");
            return;
        }
        setMoney(getMoney()-money*0.8);
        if (money*0.8>=200){
            printTicket();
        }else{
            System.out.println("您当前消费不满200，不能免费洗车！");
        }

    }


    public void printTicket(){
        System.out.println("您消费了，请打印洗车票");
    }
}
