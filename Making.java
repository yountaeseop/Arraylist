package Java2021_10_28_ArrayList;

import java.util.ArrayList;

public class Making {

	public static void main(String[] args) {
		
		// 배열의 한계점
		// 배열을 적게 만들면 데이터 저장을 많이 못한다.
		// 길이 고정 공간을 효율적 사용x
		// 추가 삭제 x
		// 따라서 불편한것들을 알고리즘으로 구현해야한다
		// 그래서 나온것이 ArrayList!!!!!
		
		//배열
		int[] arr = new int[10];
		
		//리스트 => ctrl(좌) + shift + O (import를 해줘야한다.)
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 변수, 배열 -> 데이터를 관리(추가, 삭제, 조회, 수정)
		
		// 추가 - > 가장 마지막 요소 뒤에 추가
		list.add(1);
		System.out.println(list.get(0));
		list.add(2);
		System.out.println(list.get(1));
		list.add(3);
		System.out.println(list.get(2));
		
		// 크기구하기
		System.out.println(list.size()); //list 크기 : 3
		
		// 삭제
		
		list.remove(1);  //index 1 제거
		list.clear();  //모든 값 제거
		
		
		// 검색
		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
		System.out.println(list.indexOf(1)); //1이 있는 index반환 없으면 -1
		

	}

}
