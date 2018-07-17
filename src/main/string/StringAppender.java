package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAppender {
    public static void main(String args[]){
        String[] items = new String[50000];
        for(int i=0; i < 50000; i++){
            items[i] = "String" + i;
        }

        long startTime = System.nanoTime();
        System.out.println(addStringItems(items, false));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Using String: " + totalTime);

        startTime = System.nanoTime();
        System.out.println(addStringItemsUsingStringBuilder(items, true));
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Using StringBuilder without collection: " + totalTime);

        startTime = System.nanoTime();
        System.out.println(addStringItemsUsingCollection(items, true));
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("Using StringBuilder with Collection: " + totalTime);
    }

    public static String addStringItems(String[] items, boolean forceUpperCase) {
        String returnValue="";
        for(int i = 0; i < items.length; i++) {
            returnValue+=items[i];
        }
        return forceUpperCase?returnValue.toUpperCase():returnValue;
    }

    public static String addStringItemsUsingStringBuilder(String[] items, boolean forceUpperCase) {
        StringBuilder returnValue= new StringBuilder();
        for(String item : items){
            returnValue.append(item);
        }
        return forceUpperCase?returnValue.toString().toUpperCase():returnValue.toString();
    }

    public static String addStringItemsUsingCollection(String[] items, boolean forceUpperCase) {
        List<String> itemsList= new ArrayList<>();
        StringBuilder returnValue= new StringBuilder();
        itemsList.addAll(Arrays.asList(items));
        for(String item : itemsList){
            returnValue.append(item);
        }
        return forceUpperCase?returnValue.toString().toUpperCase():returnValue.toString();
    }
}
