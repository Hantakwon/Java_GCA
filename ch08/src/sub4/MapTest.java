package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 날짜 : 2025/07/22
 * 이름 : 한탁원
 * 내용 : 자바 집합(Map) 실습하기
 */
public class MapTest {
	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<Character, String>();
		
		// Map 데이터 추가
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// Map 크기
		System.out.println(map.size());
		
		// Map 데이터 출력
		System.out.println("Map의 A키 값: " + map.get('A'));
		System.out.println("Map의 A키 값: " + map.get('B'));
		System.out.println("Map의 A키 값: " + map.get('C'));
		
		// Map 반복문
		Set<Character> keySet = map.keySet();
		Iterator<Character> it = keySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(char key : keySet) {
			System.out.println(map.get(key));
		}
		
		// Map과 List 응용
		Map<Integer, Apple> m1 = new HashMap<Integer, Apple>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		System.out.println(m1);
		
		Map<Integer, Apple> m2 = new HashMap<Integer, Apple>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<Integer, Apple>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("인도", 1000));
		
		List<Map> list = new ArrayList<Map>();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// 한국 사과 출력
		Map<Integer, Apple> resultMap = list.get(0);
		Apple koreaApple = resultMap.get(101);
		koreaApple.show();
		
		// 호주 사과 출력
		resultMap = list.get(1);
		Apple AuApple = resultMap.get(203);
		AuApple.show();
	}
}
