package com.shadowsocks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.filechooser.FileSystemView;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSON;
import com.shadowsocks.entity.Configs;
import com.shadowsocks.entity.Gui;

public class Application {
    public static void main(String[] args) {
        json(html());
        System.out.println("Shadowsocks");
    }

    /**
     * 解析json
     *
     * @param list
     */
    public static void json(List<Configs> list) {

        // json文件路径
        File file = new File("C:" + File.separator + "Shadowsocks" + File.separator + "gui-config.json");

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

        // 设置json的Configs列表信息
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

        // 获取第二个<thead>标签内容中的<th>标签内容
        Elements ths = doc.getElementsByTag("thead").get(1).getElementsByTag("th");

        // 定义config键值对属性用来存储属性的顺序
        Map<String, Integer> config = new HashMap<String, Integer>();

        // 判断属性顺序并存储
        for (int i = 0; i < ths.size(); i++) {
            if (ths.get(i).text().equals("V/T/U/M")) {
                config.put("V/T/U/M", i);
            }
            if (ths.get(i).text().equals("Address")) {
                config.put("Address", i);
            }
            if (ths.get(i).text().equals("Port")) {
                config.put("Port", i);
            }
            if (ths.get(i).text().equals("Method")) {
                config.put("Method", i);
            }
            if (ths.get(i).text().equals("Password")) {
                config.put("Password", i);
            }
        }

        // 获取<tbody>标签内容
        Elements tbodys = doc.getElementsByTag("tbody");

        // 遍历<tbody>标签内容
        for (int i = 0; i < tbodys.size(); i++) {

            // 第一个和最后一个<tbody>不遍历
            if (i > 0 && i < 3) {

                // 获取<tr>标签内容
                Elements trs = tbodys.get(i).getElementsByTag("tr");

                // 遍历<tr>标签内容
                for (Element tr : trs) {

                    // 获取<td>标签内容
                    Elements tds = tr.getElementsByTag("td");

                    // VTUM标识码
                    boolean VTUM = true;

                    // 第一个<td>按照/分割生成VTUM
                    String[] separators = tds.get(0).text().split("/");

                    // 遍历separators内容
                    for (String separator : separators) {

                        // VTUM不等于10就跳出<td>标签循环
                        if (!separator.equals("10")) {
                            VTUM = false;
                            break;
                        }
                    }

                    // VTUM都等于10则添加到Configs列表
                    if (VTUM == true) {

                        // 获取第二个到第五个<td>标签内容
                        String Address = tds.get(config.get("Address")).text();
                        String Port = tds.get(config.get("Port")).text();
                        String Method = tds.get(config.get("Method")).text();
                        String Password = tds.get(config.get("Password")).text();

                        // 定义Configs类并添加内容
                        Configs configs = new Configs();
                        configs.setServer(Address);
                        configs.setServer_port(Integer.parseInt(Port));
                        configs.setPassword(Password);
                        configs.setMethod(Method);

                        // 添加到Configs列表
                        list.add(configs);
                    }
                }
            }
        }
        return list;
    }
}