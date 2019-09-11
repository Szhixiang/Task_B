package main;

import domain.BuildConfig;
import yaml.Compile;
import yaml.YamlBuildConfigurationReader;

public class YmlProduct extends Product {
    @Override
    public void create() {
        YamlBuildConfigurationReader yamlConfigReader = new YamlBuildConfigurationReader("build.yaml");
        final BuildConfig yamlBuildConfig = yamlConfigReader.getBuildConfig();
        Compile compile = new Compile(yamlBuildConfig, "dist");
        compile.build(1);
    }
}
