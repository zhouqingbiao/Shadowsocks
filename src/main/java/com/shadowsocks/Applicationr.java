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
import com.shadowsocks.entity.r.Configs;
import com.shadowsocks.entity.r.Gui;

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

        // 获取ID为main的div标签
        Element div_main = doc.getElementsByClass("main").first();

        // 获取最后一个class为dataTables_wrapper dt-foundation no-footer的div标签
        Element div_table = div_main.getElementsByClass("dataTables_wrapper dt-foundation no-footer").last();

        // 获取第一个<thead>标签内容中的<th>标签内容
        Elements ths = div_table.getElementsByTag("thead").first().getElementsByTag("th");

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
        Elements tbodys = div_table.getElementsByTag("tbody");

        // 遍历<tbody>标签内容
        for (int i = 0; i < tbodys.size(); i++) {

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

        // 定义Configs类并添加内容--VONCOP
        Configs configs = new Configs();
        configs.setRemarks("美国BudgetVM");
        configs.setServer("us.vonc.tk");
        configs.setServer_port(28579);
        configs.setPassword("zhouqingbiao");
        configs.setMethod("aes-256-cfb");
        configs.setProtocol("auth_sha1_v4");
        configs.setObfs("tls1.2_ticket_auth");
        configs.setRemarks_base64("576O5Zu9QnVkZ2V0Vk0");
        configs.setGroup("VONCOP");

        // 添加到Configs列表--VONCOP
        list.add(configs);

        return list;
    }
}