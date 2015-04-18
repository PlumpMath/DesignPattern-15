package com.Factory;

import java.util.Map;

/**
 * Created by Toryang on 2015/4/18.
 * 发型工厂
 *
 */
public class HairFactory {
    /**
     * 根据类型创建对象
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if ("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key)){
            return new RightHair();
        }

        return null;
    }

    /**
     * 根据类的名称调用
     * @param classname
     * @return
     */
    public HairInterface getHairByClass(String classname){

        try{
            HairInterface hair = (HairInterface) Class.forName(classname).newInstance();
            return hair;
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据key取class名
     * @param key
     * @return
     */

    public HairInterface getHairByClassKey(String key){

        try{
            Map<String,String>map = new PropertiesReader().getProperties();
            HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
            return hair;
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
