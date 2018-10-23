package com.kevin.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 1/16/2018.
 */
public class TreeConvertToolsTester {

    public static void main(String[] args) {
        List<Node> testList = new ArrayList<>();

        // @formatter:off
        Node t1 = new Node("0","1","A","");
            Node t11 = new Node("1","11","A1","");
            Node t12 = new Node("1","12","A2","");
            Node t13 = new Node("1","13","A3","");
            Node t14 = new Node("1","14","A4","");

        Node t2 = new Node("0","2","B","");
            Node t21 = new Node("2","21","B1","");
            Node t22 = new Node("2","22","B2","");
                Node t221 = new Node("22","221","B21","");
                Node t222 = new Node("22","222","B22","");
                    Node t2221 = new Node("222","2221","B221","");
                    Node t2222 = new Node("222","2222","B222","");
                        Node t22221 = new Node("2222","22221","B2221","");
                        Node t22222 = new Node("2222","22222","B2222","");
                        Node t22223 = new Node("2222","22223","B2223","");
                        Node t22224 = new Node("2222","22224","B2224","");
                    Node t2223 = new Node("222","2223","B223","");
            Node t23 = new Node("2","23","B3","");
            Node t24 = new Node("2","24","B4","");

        Node t3 = new Node("0","3","C","");
        Node t4 = new Node("0","4","D","");
            Node t41 = new Node("4","41","D1","");
                Node t411 = new Node("41","411","D11","");
                Node t412 = new Node("41","412","D12","");
                Node t413 = new Node("41","413","D13","");
                Node t414 = new Node("41","414","D14","");
                Node t415 = new Node("41","415","D15","");
            Node t42 = new Node("4","42","D2","");
            Node t43 = new Node("4","43","D3","");
                Node t431 = new Node("43","431","D31","");
                Node t432 = new Node("43","432","D32","");
                    Node t4321 = new Node("432","4321","D321","");
                    Node t4322 = new Node("432","4322","D322","");
                    Node t4323 = new Node("432","4323","D323","");
                    Node t4324 = new Node("432","4324","D324","");
                    Node t4325 = new Node("432","4325","D325","");
                Node t433 = new Node("43","433","D33","");

        // @formatter:on

        /*testList.add(t1);
        testList.add(t11);
        testList.add(t12);
        testList.add(t13);
        testList.add(t14);
        testList.add(t2);
        testList.add(t21);
        testList.add(t22);
        testList.add(t221);
        testList.add(t222);
        testList.add(t2221);
        testList.add(t2222);
        testList.add(t2223);
        testList.add(t22221);
        testList.add(t22222);
        testList.add(t22223);
        testList.add(t22224);
        testList.add(t23);
        testList.add(t24);
        testList.add(t3);
        testList.add(t4);
        testList.add(t41);
        testList.add(t411);
        testList.add(t412);
        testList.add(t413);
        testList.add(t414);
        testList.add(t415);
        testList.add(t42);
        testList.add(t43);
        testList.add(t431);
        testList.add(t432);
        testList.add(t4321);
        testList.add(t4322);
        testList.add(t4323);
        testList.add(t4324);
        testList.add(t4325);
        testList.add(t433);*/

        testList.add(t4323);
        testList.add(t12);
        testList.add(t411);
        testList.add(t13);
        testList.add(t22223);
        testList.add(t21);
        testList.add(t221);
        testList.add(t4322);
        testList.add(t432);
        testList.add(t413);
        testList.add(t2221);
        testList.add(t415);
        testList.add(t2222);
        testList.add(t14);
        testList.add(t4325);
        testList.add(t1);
        testList.add(t22222);
        testList.add(t11);
        testList.add(t22224);
        testList.add(t23);
        testList.add(t414);
        testList.add(t22);
        testList.add(t4324);
        testList.add(t222);
        testList.add(t3);
        testList.add(t4);
        testList.add(t41);
        testList.add(t42);
        testList.add(t43);
        testList.add(t431);
        testList.add(t22221);
        testList.add(t4321);
        testList.add(t433);
        testList.add(t2);
        testList.add(t24);
        testList.add(t412);
        testList.add(t2223);

        List<Node> rootNodeList = TreeConvertTools.convertToTree(testList);
        List<Option> options = TreeConvertTools.toTreeString(rootNodeList);

        for (Option option : options) {
            System.out.println(option);
        }
    }
}
