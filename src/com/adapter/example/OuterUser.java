package com.adapter.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by toryang on 7/18/16.
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("username","zhangsan");
        baseInfoMap.put("mobilenumber","123456");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap office = new HashMap();
        office.put("jobPosition","position");
        office.put("officeTelNumber","345678");
        return office;
    }

    @Override
    public Map getUserHomeAddress() {
        HashMap homemap = new HashMap();
        homemap.put("homeTelNumber","234567");
        homemap.put("homeAddress","address");
        return homemap;
    }
}
