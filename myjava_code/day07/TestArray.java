/*
һ������
���飺�򵥵�˵����һ����
Ŀ�ģ��������һ����

������ָ��ͬ�������͵����ݣ�����һ����˳�����еļ���/������
�������޸���ͬ���͵ı���ʹ��ͳһ���������й�����
���ͳһ�����ƾ��ǡ�����������
Ȼ��ÿһ������ʹ��һ����Ž���������ô�����ų�Ϊ���������±� index����
�����е�ÿһ�����ݾ�������ġ�Ԫ�� element����
һ��������Ԫ�ص��ܸ��������ǳ�Ϊ������ĳ��� length����

�±�ķ�Χ��[0, length-1]

���ͣ�Ϊʲô������±��[0]��ʼ��
��Ϊ��һ�������ڴ���Ҫռ��һ���λ�á����ʱ��������������¼������׵�ַ��
��ô��Ҫ���������Ԫ�أ���ͨ�����������±��ϵķ�ʽ���ʣ�
��ʾ���Ԫ�ص�λ�þ��롰�׵�ַ����Զ��
��һ��Ԫ�أ�������[0]����ʾ���롰�׵�ַ��[0]�����
�ڶ���Ԫ�أ�������[1]����ʾ���롰�׵�ַ��[1]�����
....

֮ǰ����������һ���ڴ�����

������һ������

���磺�洢һ��ͬѧ�ĳɼ�����һ������
      �洢һ��ͬѧ�ĳɼ�����һ������
	  
	  
*/
class TestArray{
	public static void main(String[] args){
		/*
		int score1 = 89;
		int score2 = 80;
		int score3 = 67;
		int score4 = 87;
		int score5 = 90;
		//....
		//����������߷֣������
		*/
		
		int[] scores = new int[5];
		scores[0] = 89;
		scores[1] = 80;
		scores[2] = 67;
		scores[3] = 87;
		scores[4] = 90;
		
		//��ʾ���гɼ�
		System.out.println("�ɼ����£�");
		for(int i=0; i<scores.length; i++){
			System.out.println(scores[i]);
		}
		
		int max = 0;
		for(int i=0; i<scores.length; i++){
			if(max < scores[i]){
				max = scores[i];
			}
		}
		System.out.println("��߷֣�" +max);
	}
	
}