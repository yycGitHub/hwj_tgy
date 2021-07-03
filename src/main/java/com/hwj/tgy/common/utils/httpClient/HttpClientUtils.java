package com.hwj.tgy.common.utils.httpClient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.cookie.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpec;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class HttpClientUtils {


    /**
     * httpclient发送http get请求；
     * @param uriPath
     * @param ns
     * @param isHttps 是否HTTPS请求
     * @param skipSSL  是否跳过SSL
     * @return
     * @throws URISyntaxException
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String sendGetByUri(String uriPath, List<NameValuePair> ns,Boolean isHttps,Boolean skipSSL)
            throws URISyntaxException, ClientProtocolException, IOException {
        CloseableHttpClient httpclient = HttpClientTool.getHttpClient(isHttps,skipSSL);
        URIBuilder uri = new URIBuilder();
        uri.setPath(uriPath);
        uri.addParameters(ns);
        URI u = uri.build();
        HttpGet httpget = new HttpGet(u);
        httpget.addHeader("Content-Type", "text/html;charset=UTF-8");
        CloseableHttpResponse response = httpclient.execute(httpget);
        return EntityUtils.toString(response.getEntity());
    }


    /**
     *
     * @param uriPath
     * @param ns
     * @param isHttps
     * @param skipSSL
     * @return
     * @throws URISyntaxException
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String sendPostByUri(String uriPath, List<NameValuePair> ns,Boolean isHttps,Boolean skipSSL)
            throws URISyntaxException, ClientProtocolException, IOException {
        CloseableHttpClient httpclient = HttpClientTool.getHttpClient(isHttps,skipSSL);
        URIBuilder uri = new URIBuilder();
        uri.setPath(uriPath);
        uri.addParameters(ns);
        URI u = uri.build();
        HttpPost httpPost = new HttpPost(u);
        httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
        CloseableHttpResponse response = httpclient.execute(httpPost);
        return EntityUtils.toString(response.getEntity());
    }

    /**
     *get
     * @param url
     * @param isHttps 是否是Https请求
     * @param skipSSL 是否跳过SSL验证
     * @return
     */
    public static String sendGet(String url,Boolean isHttps,Boolean skipSSL){
        try {
            CloseableHttpClient httpclient = HttpClientTool.getHttpClient(isHttps,skipSSL);
            HttpGet get = new HttpGet(url);
            HttpResponse response = httpclient.execute(get);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * post
     * @param url
     * @param jsonParam
     * @param isHttps
     * @param skipSSL
     * @return
     */
    public static String sendPost(String url,String jsonParam,Boolean isHttps,Boolean skipSSL){
        CloseableHttpClient httpclient = HttpClientTool.getHttpClient(isHttps,skipSSL);
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json");
        try {
            httpPost.setEntity(new StringEntity(jsonParam));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}

