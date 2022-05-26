import cn.authing.sdk.java.client.ManagementClient;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * FreeMarkerUtils
 *
 * @author chho
 * @date 2021/08/26
 */
public final class FreeMarkerUtils {
    
    /**
     * @param reader 字符串模板
     * @param model  填充数据
     * @return 填充后的字符串
     * @throws IOException       IO
     * @throws TemplateException E
     */
    public static void process(Reader reader, Writer writer, Object model, String templateName) throws IOException, TemplateException {
        if (reader == null) {
            return;
        }
        new Template(templateName, reader, null).process(model, writer);
    }
    
    /**
     * 根据模板和数据 生成文件，写入指定目录
     *
     * @param template 模板路径
     * @param destDir  目标目录
     * @param filename 目标文件名
     * @param model    数据
     */
    public static void process(String template, String destDir, String filename, Object model) {
        File dirFile = new File(destDir);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        
        try (InputStream stream = FreeMarkerUtils.class.getClassLoader().getResourceAsStream(template)
        ) {
            assert stream != null;
            try (Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8);
                 Writer writer = new OutputStreamWriter(new FileOutputStream(destDir + File.separator + filename), StandardCharsets.UTF_8)
            ) {
                process(reader, writer, model, template);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
