package com.wangzzleo.dingding.client;

import com.wangzzleo.dingding.msg.BaseDingDingMsg;

public class DingDingSignClient implements DingDingClient {
    @Override
    public String sendMsg(BaseDingDingMsg msg) {
        return null;
    }
//    private static String WEBHOOK_TOKEN = ParamsPertiesUtils.getProperty("WEBHOOK_TOKEN");
//    private static String SIGN_STRING = ParamsPertiesUtils.getProperty("DINGDING_SIGN");
//
//    private volatile static DingDingSignClient instance;
//    private HttpClient httpclient;
//    private HttpPost httppost;
//    private LocalDateTime createTime;
//    private static final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
//
//    public String send(DingDingMsg msg) {
//        String result = null;
//        try{
//            String textMsg = JSON.toJSONString(msg);
//            StringEntity se = new StringEntity(textMsg, "utf-8");
//            httppost.setEntity(se);
//            HttpResponse response = httpclient.execute(httppost);
//            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                result = EntityUtils.toString(response.getEntity());
//            }
//        }catch (Exception e){
//            log.error("钉钉提醒异常,异常原因：",e);
//        }
//        return result;
//    }
//
//    public static DingDingSignClient getInstance() throws Exception {
//        if (instance == null) {
//            readWriteLock.writeLock().lock();
//            try {
//                if (instance == null) {
//                    HttpPost httpPost = new HttpPost(WEBHOOK_TOKEN + dingDingSignString());
//                    httpPost.addHeader("Content-Type", "application/json; charset=utf-8");
//                    instance.setHttpclient(HttpClients.createDefault());
//                    instance.setHttppost(httpPost);
//                    instance.setCreateTime(LocalDateTime.now());
//                }
//            } catch (Exception e) {
//                log.error("DingDingClient创建失败", e);
//            } finally {
//                readWriteLock.writeLock().unlock();
//            }
//        }
//        return instance;
//    }
//
//
//    public static String dingDingSignString() throws Exception {
//        Long timestamp = System.currentTimeMillis();
//        String stringToSign = timestamp + "\n" + SIGN_STRING;
//        Mac mac = Mac.getInstance("HmacSHA256");
//        mac.init(new SecretKeySpec(SIGN_STRING.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
//        byte[] signData = mac.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8));
//        String sign = URLEncoder.encode(Base64.encode(signData),"UTF-8");
//        return "&timestamp=" + timestamp + "&sign=" + sign;
//    }

}
