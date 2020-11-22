package com.example.demo007.bean;

import com.example.demo007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "PRADA手提包", "鼎丰白醋", "惠普打印机", "华格仕不锈钢锅", "可口可乐", "青花瓷器","新疆水汪汪葡萄","刷子","VANS板鞋","海尔油烟机"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Prada/普拉达女包-腋下包单肩斜挎手提包",
            "鼎丰白醋500ml-多用途配制醋",
            "惠普261彩色喷墨打印机家用手机无线wifi扫描复印",
            "华格仕不粘锅304不锈钢炒锅无涂层无油烟多功能家用炒菜锅",
            "肥宅快乐水，带走你的烦恼",
            "景德镇陶瓷器花瓶",
            "新疆大葡萄，",
            "尼龙毛刷软毛清洁刷小刷子",
            "万斯官方旗舰店官网OS经典款帆布蝎子男板鞋",
            "好太太抽油烟机家用厨房侧吸式烟机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6790, 9, 499, 299, 3, 500,19,2,500,1005};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.bao_s, R.drawable.beicu_s, R.drawable.daying_s,
            R.drawable.guo_s, R.drawable.kele_s, R.drawable.ping_s,
            R.drawable.putao_s,R.drawable.shuazi_s,R.drawable.xie_s,R.drawable.yyj_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.bao, R.drawable.beicu, R.drawable.daying,
            R.drawable.guo, R.drawable.kele, R.drawable.ping,
            R.drawable.putao,R.drawable.shuazi,R.drawable.xie,R.drawable.yyj
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
