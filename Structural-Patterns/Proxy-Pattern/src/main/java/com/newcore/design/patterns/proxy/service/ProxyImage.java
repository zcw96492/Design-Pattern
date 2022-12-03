package com.newcore.design.patterns.proxy.service;

/**
 * 影像代理类(核心代码)
 * @author zhouchaowei
 */
public class ProxyImage implements Image {

    /** 真实影像 */
    private RealImage realImage;

    /** 文件名称 */
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    /**
     * 显示影像方法
     */
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
