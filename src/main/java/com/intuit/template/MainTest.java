package com.intuit.template;

import com.x5.template.Chunk;
import com.x5.template.Theme;

/**
 * Created by sn1 on 11/18/15.
 */
public class MainTest {
    public static void main(String[] args) {
        Theme theme = new Theme("test");

        Chunk xml = theme.makeChunk("xml_file#sub_snippet", "xml");
        xml.set("name", "Hello");
        System.out.println(xml.toString());
    }
}
