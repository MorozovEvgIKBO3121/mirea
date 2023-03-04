package Lab25;

public class IPaddress {

        public static void main(String[] args) {
            String ip = "127.0.0.1";
            if (ip.matches("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")) {
                System.out.println("IP-адрес корректный");
            } else {
                System.out.println("IP-адрес некорректный");
            }
        }
    }

