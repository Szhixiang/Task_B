package main;

public class BuildTarget {
    public configuration getConfig(String ConfigType){
        if (ConfigType == null){
            return null;
        }
        if (ConfigType.equalsIgnoreCase("build.xml")){
            return new ConfigIml(new XmlProduct());
        }else if(ConfigType.equalsIgnoreCase("build.yaml")){
            return new ConfigIml(new YmlProduct());
        }
        return null;
    }
}
