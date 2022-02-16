package PatternFacade;

public class Main {
    public static void main(String[] args) {
        AppPower appPower=new AppPower();
        AppInfo appInfo=new AppInfo();
        AppAction appAction=new AppAction();
        App app=new App(appPower,appInfo,appAction);
        app.activate();
        appPower.powerOff();
    }
}
