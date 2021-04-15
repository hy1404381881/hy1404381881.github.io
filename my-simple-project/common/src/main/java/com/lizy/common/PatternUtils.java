package com.lizy.common;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
    * 正则辅助类
 * 
 * @author River.li
    *  参考网址：https://www.cnblogs.com/shuqi/p/4427693.html
 */
public class PatternUtils {
	/**
	 * String类中的三个基本操作使用正则： 匹配：matches() 切割: split() 替换: replaceAll()
	 */
	@Test
	public void test1() {
		// 以空格分割
		String str1 = "1 2 3          4 54       5 6";
		String[] numbers = str1.split(" +");
		for (String temp : numbers) {
			System.out.println(temp);
		}

		// 替换，替换所有的数字为*
		String str2 = "abd123:adad46587:asdadasadsfgi#%^^9090";
		System.out.println(str2.replaceAll("[0-9]", "*"));
		System.out.println(str2.replaceAll("\\d", "*"));

		// 匹配匹配邮箱
		String mail1 = "ababc@asa.com";
		String mail2 = "ababc@asa.com.cn";
		String mail3 = "ababc@asa";
		// String mainRegex = "[0-9a-zA-Z_]+@[0-9a-zA-Z_]++(\\.[0-9a-zA-Z_]+{2,4})+";
		String mainRegex = "\\w+@\\w+(\\.\\w{2,4})+";

		System.out.println(mail1.matches(mainRegex));// true
		System.out.println(mail2.matches(mainRegex));// true
		System.out.println(mail3.matches(mainRegex));// false

	}
	/**
	* java中正则匹配的对象：
	* pattern:
	* 　　	Pattern 　　Pattern.complie(regexString)
	* 　　	Macther 　　Pattern.matches(regexString)
	* Matcher：
	* 　　	boolean 　  matcher.find() //查找下一个匹配对象
	* 　　	String 　　 matcher.guorp() //返回整个匹配模式匹配到的结果
	* 　　	boolean 　  matcher.matches() //尝试将整个区域与模式匹配
	* 　　 int 　　　　	matcher.groupCount() //返回匹配规则的分组，如：(aa)(bb)：这表示两组
	* 　　	String        matcher.group(int group)	//返回匹配对象对应分组的匹配结果
	* 　　	MatcheResult  matcher.toMatchResult()	//将匹配结果一MatchResult的形式返回
	*/
	@Test
	public void test2() {
		// 匹配出3个字符的字符串
        String str = "abc 124 ewqeq qeqe   qeqe   qeqe  aaaa  fs fsdfs d    sf sf sf  sf sfada dss dee ad a f s f sa a'lfsd;'l";
        Pattern pt = Pattern.compile("\\b\\w{3}\\b");
        Matcher match = pt.matcher(str);
        while (match.find()) {
            System.out.println(match.group());
        }
        System.out.println("==========================");
        // 匹配出邮箱地址
        String str2 = "dadaadad   da da   dasK[PWEOO-123- DASJAD@DHSJK.COM DADA@DAD.CN =0KFPOS9IR23J0IS ADHAJ@565@ADA.COM.CN shuqi@162.com UFSFJSFI-SI- ";
        Pattern pet2 = Pattern.compile("\\b\\w+@\\w+(\\.\\w{2,4})+\\b");
        Matcher match2 = pet2.matcher(str2);
        while (match2.find()) {
            System.out.println(match2.group());
        }
		
	}
	
	@Test
	public void test3() {
		String sr = "dada ada adad adsda ad asdda adr3 fas daf fas fdsf 234 adda";
        //包含两个匹配组，一个是三个字符，一个是匹配四个字符
        Pattern pet = Pattern.compile("\\b(\\w{3}) *(\\w{4})\\b");
        Matcher match = pet.matcher(sr);
        int countAll = match.groupCount();//2 
        while (match.find()) {
            System.out.print("匹配组结果：");
            for (int i = 0; i < countAll; i++) {
                System.out.print(String.format("\n\t第%s组的结果是:%s",i+1,match.group(i + 1)));
            }
            System.out.print("\n匹配的整个结果:");
            System.out.println(match.group());
        }
	}
	@Test
	public void test4() {
		String sr = "dada ada adad adsda ad asdda adr3 fas daf fas fdsf 234 adda";
        Pattern pet = Pattern.compile("\\b(\\w{3}) *(\\w{4})\\b");
        Matcher match = pet.matcher(sr);
        MatchResult ms = null;
        while (match.find()) {
            ms = match.toMatchResult();
            System.out.print("匹配对象的组结果：");
            for (int i = 0; i < ms.groupCount(); i++) {
                System.out.print(String.format("\n\t第%s组的结果是:%s",i+1,ms.group(i + 1)));
            }
            System.out.print("\n匹配的整个结果:");
            System.out.println(ms.group());
        }
	}
	
}
