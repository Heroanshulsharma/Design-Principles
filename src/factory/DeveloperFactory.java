package factory;

public class DeveloperFactory {

    public static Developer getDeveloper(String profile){
        if (profile.equalsIgnoreCase("front"))
            return  new FrontendDeveloper();
        else if(profile.equalsIgnoreCase("back"))
            return  new BackendDeveloper();
        else
            return  null;

    }
}
