package com.shadowsocks;

import com.alibaba.fastjson.JSON;
import com.shadowsocks.entity.r.Configs;
import com.shadowsocks.entity.r.Gui;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Applicationr {
    public static void main(String[] args) {
        json(html());
        System.out.println("ShadowsocksR");
    }

    /**
     * 解析json
     *
     * @param list
     */
    public static void json(List<Configs> list) {

        // json文件路径
        File file = new File("C:" + File.separator + "ShadowsocksR-win-4.9.0" + File.separator + "gui-config.json");

        // 字符集
        String encoding = "UTF-8";

        // json字符串
        String text = null;

        // 从json文件读取json字符串
        try {
            text = FileUtils.readFileToString(file, encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化json类
        Gui gui = JSON.parseObject(text, Gui.class);

        // 添加非https://free-ss.site/配置到List中
        for (int i = 0; i < gui.getConfigs().size(); i++) {
            if (!gui.getConfigs().get(i).getGroup().equals("https://free-ss.site/")) {
                list.add(gui.getConfigs().get(i));
            }
        }

        // 设置配置
        gui.setConfigs(list);

        // 序列化json类
        String data = JSON.toJSONString(gui);

        // 输出到json文件
        try {
            FileUtils.writeStringToFile(file, data, encoding);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析html
     *
     * @return
     */
    public static List<Configs> html() {

        // 定义Configs列表
        List<Configs> list = new ArrayList<Configs>();

        // https://free-ss.site/文件路径
        File input = new File(FileSystemView.getFileSystemView().getHomeDirectory() + File.separator + "免费上网账号.html");

        // 定义Document
        Document doc = null;

        try {
            // 解析https://free-ss.site/
            doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }

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
                Map<String, Integer> th = new HashMap<>();

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
        return list;
    }
}