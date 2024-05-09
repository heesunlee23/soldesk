// 봤음
package chapter18.vector;

import java.util.List;
import java.util.Vector;

public class BoardMain {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		int i=0;
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		
		for(Board b : list) {
			b = list.get(i);
			i++;
			System.out.println(b.subject + "\t" + b.content + "\t" + b.writer);
		}
		list.remove(2);
		i=0;
		System.out.println("=============================");
		for(Board b : list) {
			b = list.get(i);
			i++;
			System.out.println(b.subject + "\t" + b.content + "\t" + b.writer);
		}
	}
}
