package com.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wangqianfront on 2017/8/12.
 */
@Component
public class FirstProperties {

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    @Value("${firstProperties.name}")
    private String name;

    @Value("${firstProperties.title}")
    private String title;




}
