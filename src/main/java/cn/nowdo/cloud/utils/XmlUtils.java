package cn.nowdo.cloud.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public final class XmlUtils {
    private static Logger logger = Logger.getLogger(XmlUtils.class);

    private XmlUtils() {}

    public static Element getRoot(String xml) {
        Element root = null;
        try {
            root = DocumentHelper.parseText(xml).getRootElement();
        } catch (Exception e) {
            logger.error("getRoot abort exception = ", e);
        }
        return root;
    }

    public static String readXmlStringFromStream(InputStream inputStream) {
        StringBuffer buffer = new StringBuffer();
        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line);
                }
            } catch (Exception e) {
                logger.error(e);
            }
        }
        return buffer.toString();
    }
}
