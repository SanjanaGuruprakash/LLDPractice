package DesignPatterns.Factory;

public class Flutter {
    SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Theme..");
    }
    public void setRefreshRate(){
        System.out.println("Setting refresh rate to 120Hz...");
    }
     public UIFactory getFactory(){
//        if(platform == SupportedPlatforms.IOS){
//            return new IOSUIFactory();
//        }
//        else if(platform == SupportedPlatforms.ANDROID){
//            return new AndroidUIFactory();
//        }
//        return null; VIOLATES OCP, DEPENDENCY INVERSION SO BETTER TO HAVE FACTORY OF UIFACTORY
         return UIFactoryFactory.getUIFactoryForPlatform(this.platform);
     }


}

