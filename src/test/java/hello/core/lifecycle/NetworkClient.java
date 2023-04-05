package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);

    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스를 시작할 때 호출하는 메서드
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message = " + message);
    }

    // 서비스 종료할 때 안전하게 서비스 연결이 끊어지게 해주는 메서드
    public void disconnect() {
        System.out.println("close " + url);
    }

    /**
     * 의존관계 주입이 끝나면 호출되는 메서드다.
     */
    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    /**
     * bean이 종료될 때 호출되는 메서드다.
     */
    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }


}
