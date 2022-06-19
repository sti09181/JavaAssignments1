////////////////////////////
///// Homework_11.java /////
////////////////////////////

import java.util.Arrays;

public class Homework_11
{
    // Class for Solution01
    abstract static class Shape
    {
        protected String color;

        public String getColor()
        {
            return this.color;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public abstract int getArea();

        Shape()
        {
            this.color = "white";
        }

        Shape(String color)
        {
            this.color = color;
        }
    }

    // Class for Solution01
    static class Circle extends Shape
    {
        private int radius;

        public int getRadius()
        {
            return this.radius;
        }

        public void setRadius(int radius)
        {
            this.radius = radius;
        }

        @Override
        public int getArea()
        {
            return radius * radius * 3;
        }

        Circle()
        {
            this.color = "white";
            this.radius = 1;
        }

        Circle(String color, int radius)
        {
            this.color = color;
            this.radius = radius;
        }
    }

    // Class for Solution01
    static class Rectangle extends Shape
    {
        private int height;
        private int width;

        public int getWidth()
        {
            return this.width;
        }

        public void setWidth(int width)
        {
            this.width = width;
        }

        public int getHeight()
        {
            return this.height;
        }

        public void setHeight(int height)
        {
            this.height = height;
        }

        @Override
        public int getArea()
        {
            return width * height;
        }

        Rectangle()
        {
            this.color = "white";
            this.width = 1;
            this.height = 1;
        }

        Rectangle(String color, int width, int height)
        {
            this.color = color;
            this.width = width;
            this.height = height;
        }
    }

    // Class for Solution02
    abstract static class Transportation
    {
        protected int timeCost;

        public int getTimeCost()
        {
            return this.timeCost;
        }

        public void setTimeCost(int timeCost)
        {
            this.timeCost = timeCost;
        }

        public abstract int computeCost();

        Transportation()
        {
            this.timeCost = 60;
        }

        Transportation(int timeCost)
        {
            this.timeCost = timeCost;
        }
    }

    // Class for Solution02
    static class Bus extends Transportation
    {
        private String busStop;
        private int busFee;

        public String getBusStop()
        {
            return this.busStop;
        }

        public void setBusStop(String busStop)
        {
            this.busStop = busStop;
        }

        public int getBusFee()
        {
            return this.busFee;
        }

        public void setBusFee(int busFee)
        {
            this.busFee = busFee;
        }

        @Override
        public int computeCost()
        {
            return this.busFee;
        }

        Bus()
        {
            this.timeCost = 60;
            this.busFee = 1300;
            this.busStop = "국민대학교";
        }

        Bus(int timeCost, int busFee, String busStop)
        {
            this.timeCost = timeCost;
            this.busFee = busFee;
            this.busStop = busStop;
        }
    }

    // Class for Solution02
    static class Subway extends Transportation
    {
        private String subwayStation;
        private int subwayFee;

        public String getSubwayStation()
        {
            return this.subwayStation;
        }

        public void setSubwayStation(String subwayStation)
        {
            this.subwayStation = subwayStation;
        }

        public int getSubwayFee()
        {
            return this.subwayFee;
        }

        public void setSubwayFee(int subwayFee)
        {
            this.subwayFee = subwayFee;
        }

        @Override
        public int computeCost()
        {
            return this.subwayFee;
        }

        Subway()
        {
            this.timeCost = 60;
            this.subwayFee = 1500;
            this.subwayStation = "길음역";
        }

        Subway(int timeCost, int subwayFee, String subwayStation)
        {
            this.timeCost = timeCost;
            this.subwayFee = subwayFee;
            this.subwayStation = subwayStation;
        }
    }

    // Class for Solution02
    static class Car extends Transportation
    {
        private int gas;

        public int getGas()
        {
            return this.gas;
        }

        public void setGas(int gas)
        {
            this.gas = gas;
        }

        Car()
        {
            this.gas = 0;
        }

        Car(int timeCost, int gas)
        {
            this.timeCost = timeCost;
            this.gas = gas;
        }

        @Override
        public int computeCost()
        {
            return 0;
        }
    }

    // Method for Solution02
    public int computeTotalCost(Transportation[] transports)
    {
        int totalCost = 0;

        for (Transportation cost : transports)
        {
            if (cost instanceof Bus)
                totalCost += cost.computeCost();
            else if (cost instanceof Subway)
                totalCost += cost.computeCost();
            else if (cost instanceof Car && ((Car)cost).getGas() <= 0)
                totalCost += 50000;
        }

        return totalCost;
    }

    // Class for Solution03
    abstract static class Computer
    {
        protected String memory;
        protected String disk;
        protected boolean powered;

        public String getMemory()
        {
            return this.memory;
        }

        public void setMemory(String memory)
        {
            this.memory = memory;
        }

        public String getDisk()
        {
            return this.disk;
        }

        public void setDisk(String disk)
        {
            this.disk = disk;
        }

        public boolean getPowered()
        {
            return this.powered;
        }

        public void setPowered(boolean powered)
        {
            this.powered = powered;
        }

        public abstract void powerOn();

        Computer()
        {
            this.memory = "4GB";
            this.disk = "300GB";
            this.powered = false;
        }

        Computer(String memory, String disk, boolean powered)
        {
            this.memory = memory;
            this.disk = disk;
            this.powered = powered;
        }
    }

    // Class for Solution03
    static class Notebook extends Computer
    {
        private int battery;

        public int getBattery()
        {
            return this.battery;
        }

        public void setBattery(int battery)
        {
            this.battery = battery;
        }

        @Override
        public void powerOn()
        {
            if (this.battery > 0)
                this.powered = true;
        }

        Notebook()
        {
            this.memory = "4GB";
            this.disk = "300GB";
            this.powered = false;
            this.battery = 100;
        }

        Notebook(String memory, String disk, boolean powered, int battery)
        {
            this.memory = memory;
            this.disk = disk;
            this.powered = powered;
            this.battery = battery;
        }
    }

    // Class for Solution03
    static class Desktop extends Computer
    {
        private boolean plugged;

        public boolean getPlugged()
        {
            return this.plugged;
        }

        public void setPlugged(boolean plugged)
        {
            this.plugged = plugged;
        }

        @Override
        public void powerOn()
        {
            if (this.plugged)
                this.powered = true;
        }

        Desktop()
        {
            this.memory = "4GB";
            this.disk = "300GB";
            this.powered = false;
            this.plugged = false;
        }

        Desktop(String memory, String disk, boolean powered, boolean plugged)
        {
            this.memory = memory;
            this.disk = disk;
            this.powered = powered;
            this.plugged = plugged;
        }
    }

    // Class for Solution04
    static class Weapon
    {
        private int weaponPower;

        Weapon()
        {
            this.weaponPower = 0;
        }

        Weapon(int weaponPower)
        {
            this.weaponPower = weaponPower;
        }

        public int getWeaponPower()
        {
            return this.weaponPower;
        }

        public void setWeaponPower(int weaponPower)
        {
            this.weaponPower = weaponPower;
        }
    }

    // Class for Solution04
    abstract static class Monster
    {
        protected int hp;
        protected int monsterPower;

        Monster()
        {
            this.hp = 0;
            this.monsterPower = 0;
        }

        Monster(int hp, int monsterPower)
        {
            this.hp = hp;
            this.monsterPower = monsterPower;
        }

        public int getHp()
        {
            return this.hp;
        }

        public void setHp(int hp)
        {
            this.hp = hp;
        }

        public int getMonsterPower()
        {
            return this.monsterPower;
        }

        public void setMonsterPower(int monsterPower)
        {
            this.monsterPower = monsterPower;
        }

        public void getAttacked(int damage)
        {
            this.hp -= damage;
        }

        public abstract int attackDamage();
    }

    // Class for Solution04
    static class Slime extends Monster
    {
        Slime()
        {
            this.hp = 0;
            this.monsterPower = 0;
        }

        Slime(int hp, int monsterPower)
        {
            this.hp = hp;
            this.monsterPower = monsterPower;
        }

        @Override
        public int attackDamage()
        {
            return this.monsterPower;
        }
    }

    // Class for Solution04
    static class Goblin extends Monster
    {
        private Weapon weapon;

        Goblin()
        {
            this.hp = 0;
            this.monsterPower = 0;
            this.weapon = new Weapon();
        }

        Goblin(int hp, int monsterPower, Weapon weapon)
        {
            this.hp = hp;
            this.monsterPower = monsterPower;
            this.weapon = weapon;
        }

        public Weapon getWeapon()
        {
            return this.weapon;
        }

        public void setWeapon(Weapon weapon)
        {
            this.weapon = weapon;
        }

        @Override
        public int attackDamage()
        {
            return this.monsterPower + this.weapon.getWeaponPower();
        }
    }

    // Interface for Solution04
    interface Flyable
    {
        void fly();
        void setIsFlying(boolean isFlying);
        boolean getIsFlying();
    }

    // Class for Solution04
    static class Dragon extends Monster implements Flyable
    {
        private boolean isFlying;

        Dragon()
        {
            this.hp = 0;
            this.monsterPower = 0;
            this.isFlying = false;
        }

        Dragon(int hp, int monsterPower, boolean isFlying)
        {
            this.hp = hp;
            this.monsterPower = monsterPower;
            this.isFlying = isFlying;
        }

        @Override
        public boolean getIsFlying()
        {
            return this.isFlying;
        }

        @Override
        public void setIsFlying(boolean isFlying)
        {
            this.isFlying = isFlying;
        }

        @Override
        public void fly()
        {
            this.isFlying = true;
        }

        @Override
        public int attackDamage()
        {
            if (this.isFlying)
                return (int)Math.pow(this.monsterPower, 2);

            return this.monsterPower;
        }
    }

    // Class for Solution05
    abstract static class CelestialBody
    {
        protected double distanceFromEarth;
        protected double mass;

        CelestialBody()
        {
            this.distanceFromEarth = 0;
            this.mass = 0;
        }

        CelestialBody(double d, double m)
        {
            this.distanceFromEarth = d;
            this.mass = m;
        }

        public double getDistanceFromEarth()
        {
            return this.distanceFromEarth;
        }

        public void setDistanceFromEarth(double distanceFromEarth)
        {
            this.distanceFromEarth = distanceFromEarth;
        }

        public double getMass()
        {
            return this.mass;
        }

        public void setMass(double mass)
        {
            this.mass = mass;
        }
    }

    // Class for Solution05
    static class Star extends CelestialBody
    {
        private double brightness;

        Star()
        {
            this.distanceFromEarth = 0;
            this.mass = 0;
            this.brightness = 0;
        }

        Star(double d, double m, double b)
        {
            this.distanceFromEarth = d;
            this.mass = m;
            this.brightness = b;
        }

        public double getBrightness()
        {
            return this.brightness;
        }

        public void setBrightness(double brightness)
        {
            this.brightness = brightness;
        }
    }

    // Class for Solution05
    static class Planet extends CelestialBody
    {
        private double distanceFromStar;

        Planet()
        {
            this.distanceFromEarth = 0;
            this.mass = 0;
            this.distanceFromStar = 0;
        }

        Planet(double d1, double m, double d2)
        {
            this.distanceFromEarth = d1;
            this.mass = m;
            this.distanceFromStar = d2;
        }

        public double getDistanceFromStar()
        {
            return this.distanceFromStar;
        }

        public void setDistanceFromStar(double distanceFromStar)
        {
            this.distanceFromStar = distanceFromStar;
        }
    }

    // Class for Solution06
    abstract static class PhoneConnection
    {
        protected String sender;
        protected String receiver;

        PhoneConnection()
        {
            this.sender = "unknown";
            this.receiver = "unknown";
        }

        PhoneConnection(String sender, String receiver)
        {
            this.sender = sender;
            this.receiver = receiver;
        }

        public String getSender()
        {
            return this.sender;
        }

        public void setSender(String sender)
        {
            this.sender = sender;
        }

        public String getReceiver()
        {
            return this.receiver;
        }

        public void setReceiver(String receiver)
        {
            this.receiver = receiver;
        }

        public abstract int computeTotalFee();
    }

    // Class for Solution06
    static class Message extends PhoneConnection
    {
        private int lenOfText;
        private static int totalMessages = 0;

        Message()
        {
            this.sender = "unknown";
            this.receiver = "unknown";
            this.lenOfText = 0;
            Message.totalMessages++;
        }

        Message(String sender, String receiver, int lenOfText)
        {
            this.sender = sender;
            this.receiver = receiver;
            this.lenOfText = lenOfText;
            Message.totalMessages++;
        }

        public int getLenOfText()
        {
            return this.lenOfText;
        }

        public void setLenOfText(int lenOfText)
        {
            this.lenOfText = lenOfText;
        }

        public static int getTotalMessages()
        {
            return Message.totalMessages;
        }

        public static void setTotalMessages(int totalMessages)
        {
            Message.totalMessages = totalMessages;
        }

        @Override
        public int computeTotalFee()
        {
            return Message.totalMessages * 3;
        }
    }

    // Class for Solution06
    static class Call extends PhoneConnection
    {
        private int callTime;
        private static int totalCallTime = 0;

        Call()
        {
            this.sender = "unknown";
            this.receiver = "unknown";
            this.callTime = 0;
        }

        Call(String sender, String receiver, int callTime)
        {
            this.sender = sender;
            this.receiver = receiver;
            this.callTime = callTime;
            Call.totalCallTime += callTime;
        }

        public int getCallTime()
        {
            return this.callTime;
        }

        public void setCallTime(int callTime)
        {
            this.callTime = callTime;
        }

        public static int getTotalCallTime()
        {
            return Call.totalCallTime;
        }

        public static void setTotalCallTime(int totalCallTime)
        {
            Call.totalCallTime = totalCallTime;
        }

        @Override
        public int computeTotalFee()
        {
            return Call.totalCallTime * 10;
        }
    }

    // Class for Solution07
    abstract static class AudioDevice
    {
        protected int volume;
        protected int soundQuality;

        AudioDevice()
        {
            this.volume = 0;
            this.soundQuality = 0;
        }

        AudioDevice(int volume, int soundQuality)
        {
            this.volume = volume;
            this.soundQuality = soundQuality;
        }

        public int getVolume()
        {
            return this.volume;
        }

        public void setVolume(int volume)
        {
            this.volume = volume;
        }

        public int getSoundQuality()
        {
            return this.soundQuality;
        }

        public void setSoundQuality(int soundQuality)
        {
            this.soundQuality = soundQuality;
        }
    }

    // Interface for Solution07
    interface BluetoothInterface
    {
        boolean getBluetoothMode();
        void setBluetoothMode(boolean bluetoothMode);
    }

    // Interface for Solution07
    interface MicrophoneInterface
    {
        int getMicQuality();
        void setMicQuality(int micQuality);
    }

    // Class for Solution07
    static class Speaker extends AudioDevice
    {
        protected int way;

        Speaker()
        {
            this.volume = 0;
            this.soundQuality = 0;
            this.way = 1;
        }

        Speaker(int volume, int soundQuality, int way)
        {
            this.volume = volume;
            this.soundQuality = soundQuality;
            this.way = way;
        }

        public int getWay()
        {
            return this.way;
        }

        public void setWay(int way)
        {
            this.way = way;
        }
    }

    // Class for Solution07
    static class BluetoothSpeaker extends Speaker implements BluetoothInterface
    {
        private boolean bluetoothMode;

        BluetoothSpeaker()
        {
            this.volume = 0;
            this.soundQuality = 0;
            this.way = 1;
            this.bluetoothMode = false;
        }

        BluetoothSpeaker(int volume, int soundQuality, int way, boolean bluetoothMode)
        {
            this.volume = volume;
            this.soundQuality = soundQuality;
            this.way = way;
            this.bluetoothMode = bluetoothMode;
        }

        @Override
        public boolean getBluetoothMode()
        {
            return this.bluetoothMode;
        }

        @Override
        public void setBluetoothMode(boolean bluetoothMode)
        {
            this.bluetoothMode = bluetoothMode;
        }
    }

    // Class for Solution07
    static class Headset extends AudioDevice implements MicrophoneInterface
    {
        private int micQuality;

        Headset()
        {
            this.volume = 0;
            this.soundQuality = 0;
            this.micQuality = 0;
        }

        Headset(int volume, int soundQuality, int micQuality)
        {
            this.volume = volume;
            this.soundQuality = soundQuality;
            this.micQuality = micQuality;
        }

        @Override
        public int getMicQuality()
        {
            return this.micQuality;
        }

        @Override
        public void setMicQuality(int micQuality)
        {
            this.micQuality = micQuality;
        }
    }

    // Class for Solution08
    abstract class Product implements Comparable<Product>
    {
        protected int price;
        protected int productNumber;

        Product()
        {
            this.price = 0;
            this.productNumber = 0;
        }

        Product(int price, int productNumber)
        {
            this.price = price;
            this.productNumber = productNumber;
        }

        public int getPrice()
        {
            return this.price;
        }

        public void setPrice(int price)
        {
            this.price = price;
        }

        public int getProductNumber()
        {
            return this.productNumber;
        }

        public void setProductNumber(int productNumber)
        {
            this.productNumber = productNumber;
        }

        public abstract void sort(Product[] products);

        @Override
        public int compareTo(Product product)
        {
            if (product instanceof Food)
                return ((Food)this).getShelfLife() - ((Food)product).getShelfLife();
            else if (product instanceof Cloth)
                return ((Cloth)product).getSize() - ((Cloth)this).getSize();
            return 0;
        }
    }

    // Class for Solution08
    class Food extends Product
    {
        private int shelfLife;

        Food()
        {
            this.price = 0;
            this.productNumber = 0;
            this.shelfLife = 0;
        }

        Food(int price, int productNumber, int shelfLife)
        {
            this.price = price;
            this.productNumber = productNumber;
            this.shelfLife = shelfLife;
        }

        public int getShelfLife()
        {
            return this.shelfLife;
        }

        public void setShelfLife(int shelfLife)
        {
            this.shelfLife = shelfLife;
        }

        @Override
        public void sort(Product[] products)
        {
            Arrays.sort(products);
        }
    }

    // Class for Solution08
    class Cloth extends Product
    {
        private char size;

        Cloth()
        {
            this.price = 0;
            this.productNumber = 0;
            this.size = 's';
        }

        Cloth(int price, int productNumber, char size)
        {
            this.price = price;
            this.productNumber = productNumber;
            this.size = size;
        }

        public char getSize()
        {
            return this.size;
        }

        public void setSize(char size)
        {
            this.size = size;
        }

        @Override
        public void sort(Product[] products)
        {
            Arrays.sort(products);
        }
    }

    // Class for Solution09
    abstract static class Employee
    {
        private String name;

        Employee()
        {
            this.name = "";
        }

        Employee(String name)
        {
            this.name = name.toLowerCase();
        }

        public String getName()
        {
            return this.name;
        }

        public void setName(String name)
        {
            this.name = name.toLowerCase();
        }

        public abstract int calculate();
    }

    // Class for Solution09
    static class Parttimer extends Employee
    {
        private int wage;
        private int worktime;

        Parttimer()
        {
            this.setName("");
            this.wage = 8350;
            this.worktime = 0;
        }

        Parttimer(String name, int wage, int worktime)
        {
            this.setName(name);
            this.wage = Math.max(wage, 8350);
            this.worktime = worktime;
        }

        public int getWage()
        {
            return this.wage;
        }

        public void setWage(int wage)
        {
            this.wage = Math.max(wage, 8350);
        }

        public int getWorktime()
        {
            return this.worktime;
        }

        public void setWorktime(int worktime)
        {
            this.worktime = worktime;
        }

        @Override
        public int calculate()
        {
            if (this.worktime >= 15)
                return this.wage * (this.worktime + 3);

            return this.wage * this.worktime;
        }
    }

    // Class for Solution10
    abstract static class BaseBrowser
    {
        protected String nowUrl;

        BaseBrowser()
        {
            this.nowUrl = "";
        }

        BaseBrowser(String nowUrl)
        {
            this.nowUrl = nowUrl;
        }

        public String getNowUrl()
        {
            return this.nowUrl;
        }

        public abstract void setNowUrl(String nowUrl);
        public abstract String toHome();
    }

    // Class for Solution10
    static class OldBrowser extends BaseBrowser
    {
        protected String prevUrl;

        OldBrowser()
        {
            this.nowUrl = "";
            this.prevUrl = "";
        }

        OldBrowser(String nowUrl)
        {
            this.nowUrl = nowUrl;
            this.prevUrl = "";
        }

        public String getPrevUrl()
        {
            return this.prevUrl;
        }

        public boolean toPrev()
        {
            if (this.prevUrl.equals(""))
                return false;

            this.nowUrl = this.prevUrl;
            this.prevUrl = "";

            return true;
        }

        @Override
        public void setNowUrl(String nowUrl)
        {
            this.prevUrl = this.nowUrl;
            this.nowUrl = nowUrl;
        }

        @Override
        public String toHome()
        {
            this.prevUrl = this.nowUrl;
            this.nowUrl = "";
            return this.nowUrl;
        }
    }

    // Class for Solution10
    static class NewBrowser extends BaseBrowser
    {
        protected String prevUrl;
        protected String nextUrl;

        NewBrowser()
        {
            this.nowUrl = "/home";
            this.prevUrl = "";
            this.nextUrl = "";
        }

        NewBrowser(String nowUrl)
        {
            this.nowUrl = nowUrl;
            this.prevUrl = "";
            this.nextUrl = "";
        }

        public String getPrevUrl()
        {
            return this.prevUrl;
        }

        public String getNextUrl()
        {
            return this.nextUrl;
        }

        public boolean toPrev()
        {
            if (this.prevUrl.equals(""))
                return false;

            this.nextUrl = this.nowUrl;
            this.nowUrl = this.prevUrl;
            this.prevUrl = "";

            return true;
        }

        public boolean toNext()
        {
            if (this.nextUrl.equals(""))
                return false;

            this.prevUrl = this.nowUrl;
            this.nowUrl = this.nextUrl;
            this.nextUrl = "";

            return true;
        }

        @Override
        public void setNowUrl(String nowUrl)
        {
            this.prevUrl = this.nowUrl;
            this.nowUrl = nowUrl;
            this.nextUrl = "";
        }

        @Override
        public String toHome()
        {
            this.prevUrl = this.nowUrl;
            this.nowUrl = "/home";
            this.nextUrl = "";

            return this.nowUrl;
        }
    }
}
