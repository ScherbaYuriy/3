class Main {
    public static void main(String[] args) {
        DemoTy demoTy=new DemoTy();

        Astronavt astronavt = new Astronavt("Yra", 18, 70);

        Roket roket = new Roket("Apolon", 70, 1000, 3);

        SpaiseStation spaiseStation = new SpaiseStation("Hala", 10, 8, "Гідропоні дослідження ");
        SpaiseStation spaiseStation1 = new SpaiseStation("Stanciya", 45, 3);
        SpaiseStation spaiseStation2 = new SpaiseStation("Lora", 0);
        SpaiseStation spaiseStation3 = new SpaiseStation();
        SpaiseStation spaiseStation4;

        demoTy.one();
        demoTy.two();
        Demo.demoOne();

        Demo.demoTwo();


        astronavt.hello();
        System.out.println(astronavt.suma(1, 2));
        System.out.println(astronavt.suma(1.2, 2.4));
        System.out.println(astronavt.faktor(3));
        astronavt.demo(roket,spaiseStation);


        roket.helloH();
        System.out.println(roket.aBoolean(100.2));
        System.out.println(roket.bBoolean(100));

        spaiseStation.hello();
        System.out.println(spaiseStation.metod());
        System.out.println(spaiseStation.metod(spaiseStation1));
        spaiseStation4 = spaiseStation.contact(spaiseStation2, "Newlora");

        spaiseStation4.hello();


    }
}

