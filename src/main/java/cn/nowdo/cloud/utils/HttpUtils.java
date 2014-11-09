package cn.nowdo.cloud.utils;

import java.io.IOException;
import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import cn.nowdo.cloud.utils.json.GsonUtils;

public class HttpUtils {
    private static Logger logger = Logger.getLogger(HttpUtils.class);

    public static <T> T getResponseGenericObjWithHttpGet(URI uri, Class<T> classOfT) {
        final String content = getResponseStringWithHttpGet(uri);
        T result = GsonUtils.fromJson(content, classOfT);
        return result;
    }

    public static <T> T getResponseGenericObjWithHttpGet(String url, Class<T> classOfT) {
        final String content = getResponseStringWithHttpGet(url);
        T result = GsonUtils.fromJson(content, classOfT);
        return result;
    }

    public static <T> T getGenericObjWithHttpPost(URI uri, Class<T> classOfT, Object postData) {
        HttpPost httpPost = new HttpPost(uri);
        try {
            StringEntity stringEntity = new StringEntity(GsonUtils.toJson(postData), ContentType.create(
                    "application/json", "utf-8"));
            httpPost.setEntity(stringEntity);
            final String content = getResponseString(httpPost);
            return GsonUtils.fromJson(content, classOfT);
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

    public static boolean sendDataWithHttpPost(URI requestURI, Object postData) {
        final HttpPost httpPost = new HttpPost(requestURI);
        try {
            httpPost.setEntity(new StringEntity(GsonUtils.toJson(postData)));
            return performRequestAndCheckResponseStatus(httpPost);
        } catch (Exception e) {
            logger.error(e);
        }

        return false;
    }

    public static String getResponseStringWithHttpPost(URI uri) {
        return getResponseString(new HttpPost(uri));
    }

    public static String getResponseStringWithHttpPost(String url) {
        return getResponseString(new HttpPost(url));
    }

    public static String getResponseStringWithHttpGet(URI uri) {
        return getResponseString(new HttpGet(uri));
    }

    public static String getResponseStringWithHttpGet(String url) {
        return getResponseString(new HttpGet(url));
    }

    private static String getResponseString(HttpRequestBase request) {
        return performRequest(request, new ResponseHandler<String>() {
            @Override
            public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                return entityToString(response.getEntity());
            }
        });
    }

    private static boolean performRequestAndCheckResponseStatus(HttpRequestBase request) {
        return performRequest(request, new ResponseHandler<Boolean>() {
            @Override
            public Boolean handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                return response.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
            }
        });
    }

    private static <T> T performRequest(HttpRequestBase request, ResponseHandler<T> handler) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            return httpclient.execute(request, handler);
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

    private static String entityToString(HttpEntity entity) {
        try {
            return EntityUtils.toString(entity);
        } catch (Exception e) {
            logger.error(e);
        }
        return null;
    }

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(entityToString(null));
    }
}
