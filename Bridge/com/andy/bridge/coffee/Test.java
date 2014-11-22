package com.andy.bridge.coffee;

public class Test {

	public static void main(String[] args) {
		//牛奶
        CoffeeImpl coffeeImp = new MilkCoffeeImp();
        //未加牛奶
        CoffeeImpl coffeeImp2 = new FragrantCoffeeImp();
        
        System.out.println("中杯");
        //中杯加奶(二次)
        Coffee coffee = new MediumCoffee();
        coffee.setCoffeeImpl(coffeeImp);
        coffee.pourCoffee();
        System.out.println("***************中杯未加奶");
        coffee.setCoffeeImpl(coffeeImp2);
        coffee.pourCoffee();
        
        System.out.println("***************大杯");
        //大杯加奶(三次)
        coffee = new SuperSizeCoffee();
        coffee.setCoffeeImpl(coffeeImp);
        coffee.pourCoffee();
        System.out.println("**************大杯未加奶");
        //设置为未加奶
        coffee.setCoffeeImpl(coffeeImp2);
        coffee.pourCoffee();

	}

}
