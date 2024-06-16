package cond;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 59;
        String transportationMode;

        if (distance <= 1) {
            transportationMode = "도보";
            System.out.println("거리에 따른 적합한 운송 수단은 " + transportationMode + "입니다.");
        } else if (distance > 1 && distance <= 10) {
            transportationMode = "자전거";
            System.out.println("거리에 따른 적합한 운송 수단은 " + transportationMode + "입니다.");
        } else if (distance > 10 && distance <= 100) {
            transportationMode = "자동차";
            System.out.println("거리에 따른 적합한 운송 수단은 " + transportationMode + "입니다.");
        } else {
            transportationMode = "비행기";
            System.out.println("거리에 따른 적합한 운송 수단은 " + transportationMode + "입니다.");
        }

        System.out.println(transportationMode + "를 이용하세요.");
    }
}
