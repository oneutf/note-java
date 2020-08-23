package com.oneutf.composite;

import lombok.AllArgsConstructor;

/**
 * @author oneutf
 * @desc 文本文件类，充当叶子构件类
 */
@AllArgsConstructor
public class TextFile extends AbstractFile {

    private String name;

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持改方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持改方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持改方法！");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对文本文件" + name + "进行杀毒");
    }
}
