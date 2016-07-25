package com;

import com.Iterator.example.IProject;
import com.Iterator.example.IProjectIterator;
import com.Iterator.example.Project;
import com.abstractfactory.example.FemaleFactory;
import com.abstractfactory.example.MaleFactory;
import com.adapter.example.IUserInfo;
import com.adapter.example.OuterUserInfo;
import com.adapter.example.UserInfo;
import com.builder.example.Director;
import com.command.example.AddRequirementCommand;
import com.command.example.Command;
import com.command.example.DeleteRequirementCommand;
import com.command.example.Invoker;
import com.composite.Branch;
import com.composite.Crop;
import com.composite.Leaf;
import com.decorator.example.ForthGradeSchoolReport;
import com.decorator.example.HighScoreDecorator;
import com.decorator.example.SchoolReport;
import com.decorator.example.SortDecorator;
import com.facade.example.ModenPostOffice;
import com.factorymethod.example.*;
import com.interpreter.Calculator;
import com.mediator.*;
import com.memento.example.Boy;
import com.memento.example.Caretaker;
import com.observer.example.*;
import com.prototype.example.AdvTemplate;
import com.prototype.example.Mail;
import com.proxy.example.GamePlayer;
import com.proxy.example.GamePlayerProxy;
import com.proxy.example.IGamePlayer;
import com.responsibility.example.*;
import com.singleton.example.Emperor;
import com.state.example.ClosingState;
import com.strategy.example.BackDoor;
import com.strategy.example.BlockEnemy;
import com.strategy.example.Context;
import com.strategy.example.GivenGreenLight;
import com.templatemethod.example.HummerH1Model;
import com.templatemethod.example.HummerH2Model;
import com.templatemethod.example.HummerModel;
import com.visitor.example.CommonEmployee;
import com.visitor.example.Employee;
import com.visitor.example.Manager;
import com.visitor.example.Visitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by toryang on 7/11/16.
 */
public class Main {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
//        singleton();
//        nvWa();
//        updatenvWa();
//        car();
//        builder();
//        proxy();
//        prototype();
//        mediator();
//        command();
//        responsibility();
//        decorator();
//        strategy();
//        adapter();
//        iterator();
//        composite();
//        observerPattern();
//        facade();
//        memento();
//        visitor();
//        state();

        interpreter();
    }

    /**
     * singleton pattern
     */
    private static void singleton(){
        int ministerNum = 5;
        for (int i=0;i<ministerNum;i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是:");
            emperor.say();
        }
    }

    /**
     * Factory Method Pattern
     */
    private static void nvWa(){
        AbstractHumanFactory yingyanglu = new HumanFactory();

        System.out.println("----造出白色人种----");
        Human whiteman = yingyanglu.createHuman(WhiteHuman.class);
        whiteman.getColor();
        whiteman.talk();

        System.out.println("-----造出黑色人种-----");
        Human blackman = yingyanglu.createHuman(BlackHuman.class);
        blackman.getColor();
        blackman.talk();

        System.out.println("-----造出黄色人种------");
        Human yellowHuman = yingyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }

    /**
     * Abstract Method Pattern
     */
    private static void updatenvWa(){
        com.abstractfactory.example.HumanFactory maleHumanFactory = new MaleFactory();
        com.abstractfactory.example.HumanFactory femaleHumanFactory = new FemaleFactory();

        com.abstractfactory.example.Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        com.abstractfactory.example.Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("----生产黄人女性-----");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();;
        femaleYellowHuman.talk();
        System.out.println("----生产黄人男性------");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        /**
         * 继续生产
         */

    }

    /**
     * Template Method Pattern
     */
    private static void car(){
        HummerModel h1 = new HummerH1Model();
        h1.run();

        HummerModel h2 = new HummerH2Model();
        h2.run();
    }

    /**
     * Builder Pattern
     */
    private static void builder(){
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("engine boom");
//        arrayList.add("stop");
//        arrayList.add("start");
//        BenzBuilder builder = new BenzBuilder();
//        builder.setSequence(arrayList);
//        BenzModel model = (BenzModel) builder.getCarModel();
//        model.run();

        Director director = new Director();

        for (int i=0;i<10000;i++){
            director.getABenzModel().run();
        }
        for (int i=0;i<100000;i++){
            director.getABMWModel().run();
        }
        //.......
    }

    /**
     * Proxy Pattern
     */
    private static void proxy(){
        IGamePlayer player = new GamePlayer("san");
        GamePlayerProxy playerProxy = new GamePlayerProxy(player);

        System.out.println("开始时间:10:22");
        playerProxy.login("zhangsan","password");
        playerProxy.killBoss();
        playerProxy.upgrade();
        System.out.println("结束时间:12:20");
    }

    /**
     * Prototype Pattern
     */
    private static void prototype(){
        int i=0;
        Mail mail = new Mail(new AdvTemplate());

        mail.setTail("Toryang's");

        while (i<MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation("Mr/Ms: "+getRandString(5));
            cloneMail.setReceiver(getRandString(8)+"@.com");
            sendMail(cloneMail);
            i++;
        }

    }

    private static void sendMail(Mail mail){
        System.out.println("titla:"+mail.getSubject()+"  receiver:"+mail.getReceiver()+"\t...send success");
    }

    private static String getRandString(int maxLength){
        String source = "abcdefghiJklmnopqrstuvwkyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }

        return sb.toString();
    }


    /**
     * Mediator Pattern
     */

    private static void mediator(){
        AbstractMediator mediator = new Mediator();

        System.out.println("-----采购人员采购电脑------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);

        System.out.println("-----销售人员销售电脑------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(100);

        System.out.println("------库房人员清理库存------");
        Stock stock = new Stock(mediator);
        stock.clearStock();


    }


    /**
     * Command Pattern
     */

    private static void command(){
        Invoker invoker = new Invoker();
        System.out.println("-----增加需求------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();

        System.out.println("-----删除需求-------");
        Command deleteCommand = new DeleteRequirementCommand();
        invoker.setCommand(deleteCommand);
        invoker.action();
    }


    /**
     * Chain of Responsibility Pattern
     */
    private static void responsibility(){
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i=0;i<5;i++){
            arrayList.add(new Women(random.nextInt(4),"出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);
        for (IWomen women: arrayList ){
            father.handleMessage(women);
        }

    }

    /**
     * Decorator Pattern
     */
    private static void decorator(){
        SchoolReport sr;
        sr = new ForthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);

        sr.report();

        sr.sign("Sam");
    }

    /**
     * Strategy Pattern
     */
    private static void strategy(){
        Context context;
        System.out.println("---one---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("---two---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("---three---");
        context = new Context(new BlockEnemy());
        context.operate();

    }

    /**
     * Adapter Pattern
     */
    private static void adapter(){
        IUserInfo yongGirl = new UserInfo();
        IUserInfo outerUser = new OuterUserInfo();
        for (int i=0;i<10;i++){
            yongGirl.getMobileNumber();
            outerUser.getMobileNumber();
        }
    }

    /**
     * Iterator Pattern
     */
    private static void iterator(){
        IProject project = new Project();
        project.add("ddddddd",10,100000);
        project.add("aaaaa",100,10000);
        project.add("ccccccc",123,13345555);

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }

    }

    /**
     * Composite Pattern
     */
    private static void composite(){
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));

    }

    public static Branch compositeCorpTree(){
        Branch root = new Branch("wang","manager",100000);
        Branch developDep = new Branch("liu","develop manager",10000);
        Branch salesDep = new Branch("ma","sales manager",20000);
        Branch financeDep = new Branch("zhao","finance manager",30000);

        Branch firstDev = new Branch("yang","fisrst dev",5000);
        Branch secondDev = new Branch("wu","second dev",6000);

        Leaf a = new Leaf("a","developer 1",2000);
        Leaf b = new Leaf("b","developer 2",2000);
        Leaf c = new Leaf("c","developer 3",2000);
        Leaf d = new Leaf("d","developer 1",2000);
        Leaf e = new Leaf("e","developer 2",2000);
        Leaf f = new Leaf("f","developer 3",2000);
        Leaf g = new Leaf("g","developer 1",2000);
        Leaf h = new Leaf("h","sales",2000);
        Leaf i = new Leaf("i","sales",2000);
        Leaf j = new Leaf("j","finance",2000);
        Leaf k = new Leaf("k","ceo sec",2000);

        Leaf zheng = new Leaf("zheng","develop vice",20000);


        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);

        developDep.addSubordinate(zheng);
        developDep.addSubordinate(firstDev);
        developDep.addSubordinate(secondDev);

        firstDev.addSubordinate(a);
        firstDev.addSubordinate(b);
        firstDev.addSubordinate(c);
        secondDev.addSubordinate(d);
        secondDev.addSubordinate(e);
        secondDev.addSubordinate(f);

        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);

        financeDep.addSubordinate(j);

        return root;
    }

    public static String getTreeInfo(Branch root){
        ArrayList<Crop> subordinateList = root.getSubordinate();
        String info = "";
        for (Crop s:subordinateList){
            if (s instanceof Leaf){
                info = info + s.getInfo() + "\n";
            }else {
                info = info + s.getInfo() +"\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }

    /**
     * Observable Pattern
     */
    public static void observerPattern(){
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.addObserver(liusi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }

    /**
     * Facade Pattern
     */
    public static void facade(){
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        String address = "Happy road No. 666";
        String context = "hello, it's me.....";
        hellRoadPostOffice.sendLetter(address,context);
    }


    /**
     * Memento Pattern
     */
    public static void memento(){
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("good mood");
        System.out.println("======now state=====");
        System.out.println(boy.getState());
//        Memento mem = boy.createMemento();
        caretaker.setMemento(boy.createMemento());

        boy.changeState();
        System.out.println("\n======after state=====");
        System.out.println(boy.getState());

        boy.restoreMemento(caretaker.getMemento());

        System.out.println("\n======restore state====");
        System.out.println(boy.getState());

    }

    /**
     * Visitor Pattern
     */
    public static void visitor() {
        for (Employee employee: mockEmployee()){
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee(){
        List<Employee> employeeList = new ArrayList<Employee>();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("Java Coder");
        zhangsan.setName("zhang san");
        zhangsan.setSalary(1800);
        zhangsan.setSex(Employee.MALE);
        employeeList.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("UI");
        lisi.setName("Li si");
        lisi.setSalary(1900);
        lisi.setSex(Employee.FEMALE);
        employeeList.add(lisi);

        Manager wangwu = new Manager();
        wangwu.setName("wang wu");
        wangwu.setPerformance("none");
        wangwu.setSalary(18750);
        wangwu.setSex(Employee.MALE);
        employeeList.add(wangwu);

        return employeeList;
    }

    /**
     * State Pattern
     */
    public static void state(){
//        ILift lift = new Lift();
//        lift.setState(ILift.STOPPING_STATE);
//        lift.open();
//        lift.close();
//        lift.run();
//        lift.stop();

        com.state.example.Context context = new com.state.example.Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }


    /**
     * Interpreter Pattern
     */
    public static void interpreter(){
        try {
            String expStr = getExpStr();
            HashMap<String,Integer> var = getValue(expStr);
            Calculator calculator = new Calculator(expStr);
            System.out.println("result:"+expStr + "=" + calculator.run(var));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getExpStr() throws IOException{
        System.out.println("input expression: ");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String,Integer> getValue (String exprStr) throws IOException{
        HashMap<String,Integer> map = new HashMap<>();

        for (char ch : exprStr.toCharArray()){
            if (ch != '+' && ch != '-'){
                if (!map.containsKey(String.valueOf(ch))){
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }

}
