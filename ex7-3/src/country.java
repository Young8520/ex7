import java.util.*;

public class country {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(�� : Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			int num = scanner.nextInt();
			nations.put(nation, num);
		}
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next();
			if(nation.equals("�׸�"))
				break;
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + "����� �����ϴ�.");
			else
				System.out.println(nation + "�� �α��� " + n);
		}
		scanner.close();
	}

}
