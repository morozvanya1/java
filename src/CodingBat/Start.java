package CodingBat;

import CodingBat.pages.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Start {

    public void printResultWarmup() {

        Print p = new Print();
        Warmup1 w = new Warmup1();

        //       assertEquals(w.parrotTrouble(true, 6), true);

        //        System.out.println(w.sleepIn(false, false));
        //        System.out.println(w.sleepIn(true, false));
        //        System.out.println(w.sleepIn(false, true));

        //        System.out.println(w.monkeyTrouble(true, true));
        //        System.out.println(w.monkeyTrouble(false, false));
        //        System.out.println(w.monkeyTrouble(true, false));

        //        System.out.println(w.sumDouble(1,2));
        //        System.out.println(w.sumDouble(3,2));
        //        System.out.println(w.sumDouble(2,2));

        //        System.out.println(w.diff21(19));
        //        System.out.println(w.diff21(10));
        //        System.out.println(w.diff21(23));

        //        System.out.println(w.parrotTrouble(true, 6));
        //        System.out.println(w.parrotTrouble(true, 7));
        //        System.out.println(w.parrotTrouble(false, 24));

        //        System.out.println(w.makes10(9, 10));
        //        System.out.println(w.makes10(9, 9));
        //        System.out.println(w.makes10(1, 9));

        //        System.out.println(w.nearHundred(93));
        //        System.out.println(w.nearHundred(90));
        //        System.out.println(w.nearHundred(89));

        //        System.out.println(w.posNeg(1, -1, false));
        //        System.out.println(w.posNeg(-1, 1, false));
        //        System.out.println(w.posNeg(-4, -5, true));

        //        System.out.println(w.notString("candy").equals("not candy"));
        //        System.out.println(w.notString("x").equals("not x"));
        //        System.out.println(w.notString("not bad").equals("not bad"));

        //        System.out.println(w.missingChar("kitten", 1).equals("ktten"));
        //        System.out.println(w.missingChar("kitten", 0).equals("itten"));
        //        System.out.println(w.missingChar("kitten", 4).equals("kittn"));

        //        System.out.println(w.frontBack("code").equals("eodc"));
        //        System.out.println(w.frontBack("a").equals("a"));
        //        System.out.println(w.frontBack("ab").equals("ba"));

        //        System.out.println(w.front3("Java").equals("JavJavJav"));
        //        System.out.println(w.front3("Chocolate").equals("ChoChoCho"));
        //        System.out.println(w.front3("abc").equals("abcabcabc"));

        //        p.printAllInConsole(w.backAround("cat"),"tcatt",
        //                w.backAround("Hello"),"oHelloo",
        //                w.backAround("a"), "aaa");

        //        System.out.println(w.or35(3));
        //        System.out.println(w.or35(10));
        //        System.out.println(w.or35(8));

        //        p.printAllInConsole(w.front22("kitten"),"kikittenki",
        //                w.front22("Ha"),"HaHaHa",
        //                w.front22("abc"),"ababcab");

        //        System.out.println(w.startHi("hi there"));
        //        System.out.println(w.startHi("hi"));
        //        System.out.println(w.startHi("hello hi"));

        //        p.printAllInConsole(w.delDel("adelbc"),"abc",
        //                                w.delDel("adelHello"), "aHello",
        //                                w.delDel("adedbc"),"adedbc");

        //        p.printAllInConsole(w.startOz("ozymandias"),"oz",
        //                w.startOz("bzoo"),"z",
        //                w.startOz("oxx"),"o");

        Warmup2 w2 = new Warmup2();

        //        System.out.println(w2.stringTimes("Hi", 2));

        //        System.out.println(w2.frontTimes("Chocolate", 2));

        //        System.out.println(w2.countXX("xxx"));

        //        System.out.println(w2.doubleX("axaxax"));
        //        System.out.println(w2.doubleX("xxxxx"));
        //        System.out.println(w2.doubleX("xaxxx"));

        //        System.out.println(w2.stringBits("Heeololeo"));

        //        System.out.println(w2.last2("hixxhi"));

        //        System.out.println(w2.stringMatch("xxcaazz", "xxbaaz"));
        //        System.out.println(w2.stringMatch("abc", "abc"));
        //        System.out.println(w2.stringMatch("abc", "axc"));

        //        System.out.println(w2.stringX("xxHxix"));

        //        System.out.println(w2.altPairs("kitten"));

        //        System.out.println(w2.stringYak("yakpak"));

        //        System.out.println(w2.has271(new int[]{2, 7, 4}));

        String1 s1 = new String1();

        //        System.out.println(s1.twoChar("Hello", 4));

        //        System.out.println(s1.deFront("away"));

        Array1 ar1 = new Array1();
        //        System.out.println(ar1.unlucky1(new int[]{1, 1, 1, 3, 1}));

        Logic1 l1 = new Logic1();

        //        System.out.println(l1.sumLimit(8, 1));

        String2 s2 = new String2();

        //        System.out.println(s2.starOut("ab**cd"));

        Array2 a2 = new Array2();

        //        System.out.println(a2.bigDiff(new int[]{10, 3, 5, 6}));
        //        System.out.println(a2.centeredAverage(new int[]{5, 3, 4, 6, 2}));
        //        System.out.println(a2.has77(new int[]{1, 7, 1, 7}));
        //        System.out.println(a2.withoutTen(new int[]{1, 10, 10, 2}));
        //        System.out.println(a2.fizzBuzz(1, 6));

        Logic2 l2 = new Logic2();

        //        System.out.println(l2.makeBricks(3, 2, 10));
        //        System.out.println(l2.makeChocolate(5, 4, 9));

        String3 s3 = new String3();

        //        System.out.println(s3.countYZ("fez day"));
        //        System.out.println(s3.withoutString("1111", "11"));
        //        System.out.println(s3.countTriple("abcXXXabc"));
        //        System.out.println(s3.sameEnds("xavaXYZjava"));
        //        System.out.println(s3.mirrorEnds("xxYxx"));
        //        System.out.println(s3.sumNumbers("aa11b33"));
        //        System.out.println(s3.notReplace("This-is"));

        Array3 a3 = new Array3();

        //        System.out.println(a3.maxSpan(new int[]{1, 2, 1, 1, 3}));
        //        System.out.println(a3.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
        //        System.out.println(a3.fix45(new int[]{4, 5, 4, 1, 5}));
        //        System.out.println(a3.canBalance(new int[]{1, 1, 1, 2, 1}));
        //        System.out.println(a3.squareUp(1));
        //        System.out.println(a3.seriesUp(3));
        //        System.out.println(a3.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        //        System.out.println(a3.countClumps(new int[]{1, 1, 1, 2, 1, 1}));

        AP1 ap1 = new AP1();

        //        System.out.println(ap1.hasOne(1));
        //        System.out.println(ap1.dividesSelf(32));
        //        System.out.println(ap1.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        //        System.out.println(ap1.userCompare("bb", 5, "bb", 1));
        //        System.out.println(ap1.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3));
        //        System.out.println(ap1.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));

        Functional1 f1 = new Functional1();

        //        System.out.println(f1.noX(Arrays.asList("ax", "bb", "cx")));

        Recursion1 r1 = new Recursion1();

        //        System.out.println(r1.fibonacci(8));
        //        System.out.println(r1.count8(8818));
        //        System.out.println(r1.countHi("xxhixx"));
        //        System.out.println(r1.array6(new int[]{1, 6, 4}, 0));
        //        System.out.println(r1.array220(new int[]{1, 2, 20}, 0));
        //        System.out.println(r1.countPairs("hihih"));
        //        System.out.println(r1.countAbc("abc"));
        //        System.out.println(r1.stringClean("yyzzza"));
        //        System.out.println(r1.countHi2("ahibhi"));
        //        System.out.println(r1.parenBit("xyz(abc)123"));
        //        System.out.println(r1.nestParen("(((x))"));
        //        System.out.println(r1.strCount("cacatcowcat", "cat"));

        Recursion2 r2 = new Recursion2();

        System.out.println(r2.groupSum6(0, new int[] {5, 6, 2}, 8));

    }
}
