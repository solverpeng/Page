package com.solverpeng.util;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solverpeng.bean.Employee;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.util.List;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/23
 *      desc  : JSON工具类
 * </pre>
 */
public abstract class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将 POJO 转换为 JSON
     *
     * @param obj POJO对象
     * @return JSON字符串
     */
    public static <T> String toJson(T obj) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将 JSON 转换为 POJO
     *
     * @param json JSON字符串
     * @param type POJO Class 类型
     * @return POJO对象
     */
    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        try {
            pojo = OBJECT_MAPPER.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return pojo;
    }

    public static void main(String[] args) {
        String json = "{\n" +
                "  \"data\": [\n" +
                "    [\n" +
                "      \"Tiger Nixon\", \n" +
                "      \"System Architect\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"5421\", \n" +
                "      \"2011/04/25\", \n" +
                "      \"$320,800\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Garrett Winters\", \n" +
                "      \"Accountant\", \n" +
                "      \"Tokyo\", \n" +
                "      \"8422\", \n" +
                "      \"2011/07/25\", \n" +
                "      \"$170,750\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Ashton Cox\", \n" +
                "      \"Junior Technical Author\", \n" +
                "      \"San Francisco\", \n" +
                "      \"1562\", \n" +
                "      \"2009/01/12\", \n" +
                "      \"$86,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Cedric Kelly\", \n" +
                "      \"Senior Javascript Developer\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"6224\", \n" +
                "      \"2012/03/29\", \n" +
                "      \"$433,060\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Airi Satou\", \n" +
                "      \"Accountant\", \n" +
                "      \"Tokyo\", \n" +
                "      \"5407\", \n" +
                "      \"2008/11/28\", \n" +
                "      \"$162,700\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Brielle Williamson\", \n" +
                "      \"Integration Specialist\", \n" +
                "      \"New York\", \n" +
                "      \"4804\", \n" +
                "      \"2012/12/02\", \n" +
                "      \"$372,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Herrod Chandler\", \n" +
                "      \"Sales Assistant\", \n" +
                "      \"San Francisco\", \n" +
                "      \"9608\", \n" +
                "      \"2012/08/06\", \n" +
                "      \"$137,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Rhona Davidson\", \n" +
                "      \"Integration Specialist\", \n" +
                "      \"Tokyo\", \n" +
                "      \"6200\", \n" +
                "      \"2010/10/14\", \n" +
                "      \"$327,900\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Colleen Hurst\", \n" +
                "      \"Javascript Developer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"2360\", \n" +
                "      \"2009/09/15\", \n" +
                "      \"$205,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Sonya Frost\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"1667\", \n" +
                "      \"2008/12/13\", \n" +
                "      \"$103,600\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jena Gaines\", \n" +
                "      \"Office Manager\", \n" +
                "      \"London\", \n" +
                "      \"3814\", \n" +
                "      \"2008/12/19\", \n" +
                "      \"$90,560\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Quinn Flynn\", \n" +
                "      \"Support Lead\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"9497\", \n" +
                "      \"2013/03/03\", \n" +
                "      \"$342,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Charde Marshall\", \n" +
                "      \"Regional Director\", \n" +
                "      \"San Francisco\", \n" +
                "      \"6741\", \n" +
                "      \"2008/10/16\", \n" +
                "      \"$470,600\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Haley Kennedy\", \n" +
                "      \"Senior Marketing Designer\", \n" +
                "      \"London\", \n" +
                "      \"3597\", \n" +
                "      \"2012/12/18\", \n" +
                "      \"$313,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Tatyana Fitzpatrick\", \n" +
                "      \"Regional Director\", \n" +
                "      \"London\", \n" +
                "      \"1965\", \n" +
                "      \"2010/03/17\", \n" +
                "      \"$385,750\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Michael Silva\", \n" +
                "      \"Marketing Designer\", \n" +
                "      \"London\", \n" +
                "      \"1581\", \n" +
                "      \"2012/11/27\", \n" +
                "      \"$198,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Paul Byrd\", \n" +
                "      \"Chief Financial Officer (CFO)\", \n" +
                "      \"New York\", \n" +
                "      \"3059\", \n" +
                "      \"2010/06/09\", \n" +
                "      \"$725,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Gloria Little\", \n" +
                "      \"Systems Administrator\", \n" +
                "      \"New York\", \n" +
                "      \"1721\", \n" +
                "      \"2009/04/10\", \n" +
                "      \"$237,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Bradley Greer\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"London\", \n" +
                "      \"2558\", \n" +
                "      \"2012/10/13\", \n" +
                "      \"$132,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Dai Rios\", \n" +
                "      \"Personnel Lead\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"2290\", \n" +
                "      \"2012/09/26\", \n" +
                "      \"$217,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jenette Caldwell\", \n" +
                "      \"Development Lead\", \n" +
                "      \"New York\", \n" +
                "      \"1937\", \n" +
                "      \"2011/09/03\", \n" +
                "      \"$345,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Yuri Berry\", \n" +
                "      \"Chief Marketing Officer (CMO)\", \n" +
                "      \"New York\", \n" +
                "      \"6154\", \n" +
                "      \"2009/06/25\", \n" +
                "      \"$675,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Caesar Vance\", \n" +
                "      \"Pre-Sales Support\", \n" +
                "      \"New York\", \n" +
                "      \"8330\", \n" +
                "      \"2011/12/12\", \n" +
                "      \"$106,450\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Doris Wilder\", \n" +
                "      \"Sales Assistant\", \n" +
                "      \"Sidney\", \n" +
                "      \"3023\", \n" +
                "      \"2010/09/20\", \n" +
                "      \"$85,600\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Angelica Ramos\", \n" +
                "      \"Chief Executive Officer (CEO)\", \n" +
                "      \"London\", \n" +
                "      \"5797\", \n" +
                "      \"2009/10/09\", \n" +
                "      \"$1,200,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Gavin Joyce\", \n" +
                "      \"Developer\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"8822\", \n" +
                "      \"2010/12/22\", \n" +
                "      \"$92,575\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jennifer Chang\", \n" +
                "      \"Regional Director\", \n" +
                "      \"Singapore\", \n" +
                "      \"9239\", \n" +
                "      \"2010/11/14\", \n" +
                "      \"$357,650\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Brenden Wagner\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"1314\", \n" +
                "      \"2011/06/07\", \n" +
                "      \"$206,850\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Fiona Green\", \n" +
                "      \"Chief Operating Officer (COO)\", \n" +
                "      \"San Francisco\", \n" +
                "      \"2947\", \n" +
                "      \"2010/03/11\", \n" +
                "      \"$850,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Shou Itou\", \n" +
                "      \"Regional Marketing\", \n" +
                "      \"Tokyo\", \n" +
                "      \"8899\", \n" +
                "      \"2011/08/14\", \n" +
                "      \"$163,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Michelle House\", \n" +
                "      \"Integration Specialist\", \n" +
                "      \"Sidney\", \n" +
                "      \"2769\", \n" +
                "      \"2011/06/02\", \n" +
                "      \"$95,400\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Suki Burks\", \n" +
                "      \"Developer\", \n" +
                "      \"London\", \n" +
                "      \"6832\", \n" +
                "      \"2009/10/22\", \n" +
                "      \"$114,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Prescott Bartlett\", \n" +
                "      \"Technical Author\", \n" +
                "      \"London\", \n" +
                "      \"3606\", \n" +
                "      \"2011/05/07\", \n" +
                "      \"$145,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Gavin Cortez\", \n" +
                "      \"Team Leader\", \n" +
                "      \"San Francisco\", \n" +
                "      \"2860\", \n" +
                "      \"2008/10/26\", \n" +
                "      \"$235,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Martena Mccray\", \n" +
                "      \"Post-Sales support\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"8240\", \n" +
                "      \"2011/03/09\", \n" +
                "      \"$324,050\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Unity Butler\", \n" +
                "      \"Marketing Designer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"5384\", \n" +
                "      \"2009/12/09\", \n" +
                "      \"$85,675\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Howard Hatfield\", \n" +
                "      \"Office Manager\", \n" +
                "      \"San Francisco\", \n" +
                "      \"7031\", \n" +
                "      \"2008/12/16\", \n" +
                "      \"$164,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Hope Fuentes\", \n" +
                "      \"Secretary\", \n" +
                "      \"San Francisco\", \n" +
                "      \"6318\", \n" +
                "      \"2010/02/12\", \n" +
                "      \"$109,850\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Vivian Harrell\", \n" +
                "      \"Financial Controller\", \n" +
                "      \"San Francisco\", \n" +
                "      \"9422\", \n" +
                "      \"2009/02/14\", \n" +
                "      \"$452,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Timothy Mooney\", \n" +
                "      \"Office Manager\", \n" +
                "      \"London\", \n" +
                "      \"7580\", \n" +
                "      \"2008/12/11\", \n" +
                "      \"$136,200\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jackson Bradshaw\", \n" +
                "      \"Director\", \n" +
                "      \"New York\", \n" +
                "      \"1042\", \n" +
                "      \"2008/09/26\", \n" +
                "      \"$645,750\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Olivia Liang\", \n" +
                "      \"Support Engineer\", \n" +
                "      \"Singapore\", \n" +
                "      \"2120\", \n" +
                "      \"2011/02/03\", \n" +
                "      \"$234,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Bruno Nash\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"London\", \n" +
                "      \"6222\", \n" +
                "      \"2011/05/03\", \n" +
                "      \"$163,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Sakura Yamamoto\", \n" +
                "      \"Support Engineer\", \n" +
                "      \"Tokyo\", \n" +
                "      \"9383\", \n" +
                "      \"2009/08/19\", \n" +
                "      \"$139,575\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Thor Walton\", \n" +
                "      \"Developer\", \n" +
                "      \"New York\", \n" +
                "      \"8327\", \n" +
                "      \"2013/08/11\", \n" +
                "      \"$98,540\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Finn Camacho\", \n" +
                "      \"Support Engineer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"2927\", \n" +
                "      \"2009/07/07\", \n" +
                "      \"$87,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Serge Baldwin\", \n" +
                "      \"Data Coordinator\", \n" +
                "      \"Singapore\", \n" +
                "      \"8352\", \n" +
                "      \"2012/04/09\", \n" +
                "      \"$138,575\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Zenaida Frank\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"New York\", \n" +
                "      \"7439\", \n" +
                "      \"2010/01/04\", \n" +
                "      \"$125,250\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Zorita Serrano\", \n" +
                "      \"Software Engineer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"4389\", \n" +
                "      \"2012/06/01\", \n" +
                "      \"$115,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jennifer Acosta\", \n" +
                "      \"Junior Javascript Developer\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"3431\", \n" +
                "      \"2013/02/01\", \n" +
                "      \"$75,650\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Cara Stevens\", \n" +
                "      \"Sales Assistant\", \n" +
                "      \"New York\", \n" +
                "      \"3990\", \n" +
                "      \"2011/12/06\", \n" +
                "      \"$145,600\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Hermione Butler\", \n" +
                "      \"Regional Director\", \n" +
                "      \"London\", \n" +
                "      \"1016\", \n" +
                "      \"2011/03/21\", \n" +
                "      \"$356,250\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Lael Greer\", \n" +
                "      \"Systems Administrator\", \n" +
                "      \"London\", \n" +
                "      \"6733\", \n" +
                "      \"2009/02/27\", \n" +
                "      \"$103,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Jonas Alexander\", \n" +
                "      \"Developer\", \n" +
                "      \"San Francisco\", \n" +
                "      \"8196\", \n" +
                "      \"2010/07/14\", \n" +
                "      \"$86,500\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Shad Decker\", \n" +
                "      \"Regional Director\", \n" +
                "      \"Edinburgh\", \n" +
                "      \"6373\", \n" +
                "      \"2008/11/13\", \n" +
                "      \"$183,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Michael Bruce\", \n" +
                "      \"Javascript Developer\", \n" +
                "      \"Singapore\", \n" +
                "      \"5384\", \n" +
                "      \"2011/06/27\", \n" +
                "      \"$183,000\"\n" +
                "    ], \n" +
                "    [\n" +
                "      \"Donna Snider\", \n" +
                "      \"Customer Support\", \n" +
                "      \"New York\", \n" +
                "      \"4226\", \n" +
                "      \"2011/01/25\", \n" +
                "      \"$112,000\"\n" +
                "    ]\n" +
                "  ]\n" +
                "}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        System.out.println(jsonObject);

    }
}