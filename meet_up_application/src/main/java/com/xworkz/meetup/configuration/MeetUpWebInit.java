package com.xworkz.meetup.configuration;

public class MeetUpWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getServletConfigClass(){
        return new Class[]{MeetUpConfiguration.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
