/**'''
 方法中如果有HttpConnectionManagerParams 或者HttpURLConnection，必须要有setConnectionTimeout
 '''
 **/
public class HttpConnectionTimeoutCheck {

    public static String doTestHttpConnGet(){
        HttpConnectionManagerParams managerParams = httpClient.getHttpConnectionManager().getParams();
        managerParams.setConnectionTimeout(100);

    }

    public static String doTestHttpURLGet(){
        if (true){
            HttpURLConnection conn = null; // Noncompliant {{Connection Variable's connection timeout not set}}
        }
        HttpURLConnection conn = null; // Noncompliant {{Connection Variable's connection timeout not set}}
    }
    public static String doTestHttpURLGetRight(){
        if (true){
            if (true)
            HttpURLConnection conn = null; // Noncompliant {{Connection Variable's connection timeout not set}}
        }
        HttpURLConnection conn = null; // Noncompliant {{Connection Variable's connection timeout not set}}


    }
}