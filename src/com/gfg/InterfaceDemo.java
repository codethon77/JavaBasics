package com.gfg;

public class InterfaceDemo {
    public static void main(String[] args) {
        TataTiago tatatiago=new TataTiago();
        System.out.println(tatatiago.getPUC());
        SearchService searchService=new SearchService(new CountSortService());
        searchService.getListData("Java");
    }
}
