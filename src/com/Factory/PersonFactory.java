package com.Factory;

/**
 * 人物接口实现
 * Created by Toryang on 2015/4/18.
 */
public interface PersonFactory  {
    //boy 接口
    public Boy getBoy();
    //girl 接口
    public Girl getGirl();
}
