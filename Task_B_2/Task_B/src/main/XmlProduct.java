package main;

import domain.Project;
import xml.Build;
import xml.XMLBuildConfigurationReader;

public class XmlProduct extends Product {
    @Override
    public void create() {
        XMLBuildConfigurationReader buildConfigurationReader = new XMLBuildConfigurationReader("build.xml");
        final Project xmlProject = buildConfigurationReader.getProject();
        Build build = new Build(xmlProject);
        build.build(1, "dist");
    }
}
