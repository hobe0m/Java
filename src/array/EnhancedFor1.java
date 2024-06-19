package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for문
        // 각각의 요소를 탐색한다는 의미로 for-each문으로 불린다.
        // 배열 사용 시 기존 for문보다 더 편리하게 사용 가능

        // for (변수 : 배열 또는 컬렉션) {
        //     배열 또는 컬렉션의 요소를 순회하면서 수행할 작업 코드
        // }

        int[] numbers = {1, 2, 3, 4, 5};

        // iter : 향상된 for문을 만들어주는 단축키
        
        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문, 인덱스를 사용하지 않고 배열을 순회
        for (int number : numbers) {
            System.out.println(number);
        }

        // for-each문을 사용할 수 없는 경우, * 증가하는 index 값이 필요할 때(반복문 안에서 써야할 때) *
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번의 결과는 : " + numbers[1]);
        }
    }
}
