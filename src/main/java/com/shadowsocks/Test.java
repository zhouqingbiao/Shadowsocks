package com.shadowsocks;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.shadowsocks.entity.r.Configs;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {

        Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);

        WebClient webClient = new WebClient(BrowserVersion.CHROME, "127.0.0.1", 1080);

        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setActiveXNative(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setTimeout(30000);

        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

        HtmlPage htmlPage = null;

        try {
            htmlPage = webClient.getPage("https://free-ss.site/");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            webClient.close();
        }

        webClient.waitForBackgroundJavaScript(30000);

        String html = htmlPage.asXml();

        System.out.println(html);

        // 定义Configs列表
        List<Configs> list = new ArrayList<Configs>();

        Document doc = Jsoup.parse(html);

        // 获取table标签
        Elements tables = doc.getElementsByTag("table");

        //遍历table标签
        for (int i = 0; i < tables.size(); i++) {

            // 获取thead标签
            Elements theads = tables.get(i).getElementsByTag("thead");

            // 获取tbody标签
            Elements tbodys = tables.get(i).getElementsByTag("tbody");

            // 遍历thead标签
            for (int j = 0; j < theads.size(); j++) {

                // 获取th标签
                Elements ths = theads.get(j).getElementsByTag("th");

                //Map
                Map<String, Integer> th = new HashMap<String, Integer>();

                // 获取text位置
                for (int k = 0; k < ths.size(); k++) {
                    if (ths.get(k).text().equals("V/T/U/M")) {
                        th.put("V/T/U/M", k);
                    }
                    if (ths.get(k).text().equals("Address")) {
                        th.put("Address", k);
                    }
                    if (ths.get(k).text().equals("Port")) {
                        th.put("Port", k);
                    }
                    if (ths.get(k).text().equals("Password")) {
                        th.put("Password", k);
                    }
                    if (ths.get(k).text().equals("Method")) {
                        th.put("Method", k);
                    }
                }

                // 判断是否存在V/T/U/M
                if (th.get("V/T/U/M") != null) {

                    //遍历tbody标签
                    for (int k = 0; k < tbodys.size(); k++) {

                        // 获取tr标签
                        Elements trs = tbodys.get(k).getElementsByTag("tr");

                        // 遍历tr标签
                        for (int l = 0; l < trs.size(); l++) {

                            // 获取td标签
                            Elements tds = trs.get(l).getElementsByTag("td");

                            // VTUM标识码
                            boolean VTUM = true;

                            // 分割VTUM
                            String[] splits = tds.get(th.get("V/T/U/M")).text().split("/");

                            // 遍历V/T/U/M内容
                            split:
                            for (String split : splits) {

                                // VTUM其中有一个不等于10就跳出split循环
                                if (!split.equals("10")) {
                                    VTUM = false;
                                    break split;
                                }
                            }

                            // VTUM为true时添加到列表中
                            if (VTUM == true) {
                                String Address = tds.get(th.get("Address")).text();
                                String Port = tds.get(th.get("Port")).text();
                                String Method = tds.get(th.get("Method")).text();
                                String Password = tds.get(th.get("Password")).text();

                                System.out.println(Address);

                                // 定义Configs类并添加内容
                                Configs configs = new Configs();
                                configs.setServer(Address);
                                configs.setServer_port(Integer.parseInt(Port));
                                configs.setPassword(Password);
                                configs.setMethod(Method);
                                configs.setGroup("https://free-ss.site/");

                                // 添加到Configs列表
                                list.add(configs);
                            }
                        }
                    }
                }
            }
        }
    }
}
