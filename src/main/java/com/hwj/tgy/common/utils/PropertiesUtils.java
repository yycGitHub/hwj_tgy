package com.hwj.tgy.common.utils;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties getTgyProperties(){
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties("tgy.properties");
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
