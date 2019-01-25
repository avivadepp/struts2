package pojo; /**
 * @program: struts2
 * @description: 上传文件
 * @autor:
 * @rewrite: Aviva Wang
 * @create: 2019-01-25-08
 **/

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction {

    File doc;
    String docFileName;
    String docContentType;

    public File getDoc() {
        return doc;
    }

    public void setDoc(File doc) {
        this.doc = doc;
    }

    public String getDocFileName() {
        return docFileName;
    }

    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }

    public String getDocContentType() {
        return docContentType;
    }

    public void setDocContentType(String docContentType) {
        this.docContentType = docContentType;
    }

    public String upload() {
        System.out.println(doc);
        System.out.println(docFileName);
        System.out.println(docContentType);
        return "success";
    }
}
