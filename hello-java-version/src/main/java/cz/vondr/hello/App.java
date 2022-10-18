package cz.vondr.hello;

import org.apache.commons.lang3.StringUtils;

public class App {

    public static void main(String[] args) {
        String result = getStaticString();
        System.out.println(result);
    }

    public static String getStaticString() {
        return StringUtils.upperCase("this-is-text");
    }

}

