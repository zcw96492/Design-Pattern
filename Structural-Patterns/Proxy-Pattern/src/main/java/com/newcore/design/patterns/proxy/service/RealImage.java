package com.newcore.design.patterns.proxy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 真实影像实现类
 * @author zhouchaowei
 */
public class RealImage implements Image{

    private static final Logger logger = LoggerFactory.getLogger(RealImage.class);

    private String fileName;

    /**
     * 构造方法
     * @param fileName 文件名称
     */
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    /**
     * 从磁盘上加载文件
     * @param fileName 文件名称
     */
    private void loadFromDisk(String fileName){
        logger.info("文件【{}】加载中......", fileName);
    }

    /**
     * 显示影像方法
     */
    @Override
    public void display() {
        logger.info("文件【{}】正在放映......", fileName);
    }
}
