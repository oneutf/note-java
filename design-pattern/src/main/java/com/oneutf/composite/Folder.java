package com.oneutf.composite;

import lombok.AllArgsConstructor;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

/**
 * @author oneutf
 * @desc 文件夹类，充当容器构件类
 */
public class Folder extends AbstractFile {

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    private List<AbstractFile> fileList = new ArrayList<>();

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹" + name + "进行杀毒");

        // 递归调用成员构件的killVirus()方法
        for (AbstractFile abstractFile : fileList) {
            abstractFile.killVirus();
        }
    }
}
