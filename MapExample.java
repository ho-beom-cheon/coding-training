import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Map 인터페이스의 참조 변수를 HashMap 객체로 초기화
        Map<String, Integer> map = new HashMap<>();

        // 요소 추가
        map.put("HoBeom", 22);
        map.put("MinJu", 24);
        map.put("leeJun", 18);

        // 키를 이용하여 값 얻기
        int HoBeomAge = map.get("HoBeom");
        System.out.println("HoBeom's Age : "+ HoBeomAge);

        // 맵의 크기 확인
        System.out.println("Map size : " + map.size());

        // 맵의 모든 요소 출력
        System.out.println("[요소 전체 출력]");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 요소 삭제
        map.remove("MinJu");

        // 삭제 후 모든 요소 출력
        System.out.println("[MinJu 삭제 후 출력]");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
