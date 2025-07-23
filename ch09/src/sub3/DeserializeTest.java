package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2025/07/23
 * 이름 : 한탁원
 * 내용 : 역직렬화 실습
 */
public class DeserializeTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\GGG\\Desktop\\apple.data";

		try {
			// 역직렬화를 위한 기본스트림과 보조스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 역직렬화 : 외부의 객체파일을 내부의 객체로 불러오기
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 종료
			ois.close();
			fis.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		System.out.println("프로그램 종료...");
	}
}
