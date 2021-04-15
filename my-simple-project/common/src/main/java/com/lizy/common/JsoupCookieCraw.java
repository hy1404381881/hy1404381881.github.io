package com.lizy.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.Instrument;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * 模拟Jsoup跳过登陆进行爬虫
 * 
 * @author liqiang
 *
 */
public class JsoupCookieCraw {
	private static Map<String, String> cookies = null;

	public static void main(String[] args) throws IOException {
		// 先模拟登录获取到cookie和sessionid并存到全局变量cookies中
		login();

		String url = "http://www.tydzsh.com/Home/Index";
		// 直接获取DOM树，带着cookies去获取
		Document document = Jsoup.connect(url).cookies(cookies).get();
		System.out.println(document.toString());
	}

	/**
	 * 模拟登录获取cookie和sessionid
	 */
	public static void login() throws IOException {
		String urlLogin = "http://www.tydzsh.com/Login";
		Connection connect = Jsoup.connect(urlLogin);
		// 伪造请求头
		connect.header("Accept",
				"text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		connect.header("Accept-Encoding", "gzip, deflate");
		connect.header("Accept-Language", "zh-CN,zh;q=0.9").header("Connection", "keep-alive");
		connect.header("Content-Length", "72");
		connect.header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		connect.header("Host", "www.tydzsh.com");
		connect.header("Referer", "http://www.tydzsh.com/Login");
		connect.header("User-Agent",
				"Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");
		connect.header("X-Requested-With", "XMLHttpRequest");
		// 携带登陆信息
		connect.data("user_Name", "admin").data("pwd_No", "admin");

		// 请求url获取响应信息
		Response res = connect.ignoreContentType(true).method(Method.POST).execute();// 执行请求
		// 获取返回的cookie
		cookies = res.cookies();
	}

	/**
	 * 爬 的博客园文章
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void test() throws IOException, InterruptedException {
		String url = "https://www.cnblogs.com/mvc/AggSite/PostList.aspx";
		System.out.println(url);
		Map<String, String> map=new HashMap<>();
		map.put("CategoryId", "808");
		map.put("CategoryType", "SiteHome");
		map.put("ItemListActionName", "PostList");
		map.put("PageIndex", "3");
		map.put("ParentCategoryId", "0");
		map.put("ParentCategoryId", "0");
		map.put("TotalPostCount", "4000");
		Document document = Jsoup.connect(url).data(map).post();
		Elements links = document.select("a.titlelnk");
		for (Element element : links) {
			System.out.println(element.text());
		}

	}

}