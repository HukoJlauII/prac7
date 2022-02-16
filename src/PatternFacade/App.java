package PatternFacade;

public class App {
    AppPower appPower;
    AppInfo appInfo;
    AppAction appAction;

    public App(AppPower appPower, AppInfo appInfo, AppAction appAction) {
        this.appPower = appPower;
        this.appInfo = appInfo;
        this.appAction = appAction;
    }
    public void activate()
    {
        appPower.powerOn();
        appInfo.downloadInfo();
        appAction.appActivate();
    }

}
