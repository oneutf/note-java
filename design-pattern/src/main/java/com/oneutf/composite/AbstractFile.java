package com.oneutf.composite;

/**
 * @author oneutf
 * @desc 抽象文件类，充当抽象构件类
 */
public abstract class AbstractFile {

    /**
     * 添加
     *
     * @param file
     */
    public abstract void add(AbstractFile file);

    /**
     * 移除
     *
     * @param file
     */
    public abstract void remove(AbstractFile file);

    /**
     * 获取子节点
     * @param i
     * @return
     */
    public abstract AbstractFile getChild(int i);

    /**
     * 杀毒方法
     */
    public abstract void killVirus();
}
