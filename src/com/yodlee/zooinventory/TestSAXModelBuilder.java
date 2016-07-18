package com.yodlee.zooinventory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by rbiswas on 7/4/2014.
 */
public class TestSAXModelBuilder {

    public static void main(String[] args) throws Exception{
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        XMLReader parser = saxParser.getXMLReader();

        SAXModelBuilder mb = new SAXModelBuilder();
        parser.setContentHandler(mb);

        parser.parse(new InputSource("src/com/yodlee/zooinventory/zooinventory.xml"));
        Inventory inventory =(Inventory)mb.getModel();
        System.out.println("Animals = " + inventory.animalList);
        Animal cocoa = (Animal)(inventory.animalList.get(1));
        FoodRecipe recipe = cocoa.foodRecipe;
        System.out.println("Recipe = " + recipe);
    }
}
