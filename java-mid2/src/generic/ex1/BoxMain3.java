package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        // 생성 시점에 T 의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
//        integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류

        // Integer 타입 반환 (캐스팅 X)
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("문자");
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
