package sizeyunsuan;
 

import java.util.*;
public class jisuan {
public static String yuefen(int a,int b){
        int y = 1;
        for(int i=a;i>=1;i--){
            if(a%i==0&&b%i==0){
                y = i;
                break;
            }
        }
        int z = a/y;
        int m = b/y;
        if(z==0) {
            return "0";
        }
        return ""+z+"/"+m;
    }

/**
 * �漴ȡx,yΪ1-100֮�䣬x��������y��yֵ
 * @param x
 * @param y
 * @return
 */
private static int decide(int x,int y){//ͨ���ݹ�ʵ������
    Random random=new Random();
    if(x%y!=0){
        y=random.nextInt(100)+1;
        return decide(x,y);
    }
    else{
        return y; 
    }
}
    public static void main(String[] args) {
    	
        // TODO Auto-generated method stub
        int x,y,i,a1,p;
        int d1=0,l=0;
       String d=null;
	     int d2=0;
        ArrayList<String> result1=new ArrayList<String>();
        String question1=new String();
        System.out.println("1����������ʽ��2����������ʽ��3�������ż���ʽ");
        Scanner scan1=new Scanner(System.in);
        p=scan1.nextInt();
if(p==1){
        System.out.println("����������");
        Scanner scan2=new Scanner(System.in);
        x=scan2.nextInt();
        int answer[]=new int [x];
        System.out.println("201571030117");
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*100);//�������һ��1-10������
            int b=(int)(Math.random()*100);//�������һ��1-10������             a>b
            int f=(int)(Math.random()*100);//�������һ��1-10������
            if(b>a){
            	 int temp=a;
                 a=b;
                 b=temp;
            }
            int c=(int)(Math.random()*4);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����,
            if(c==0)
            {
                d1=a+b+f;
                question1=a+"+"+b+"+"+f;
            }
            if(c==1)
            {
                d1=a-b+f;
                question1=a+"-"+b+"+"+f;
            }
            if(c==2)
            {
                d1=a*b*f;
                question1=a+"*"+b+"*"+f;
            }
            if(c==3)
            {
            	b=decide(a, b);
               d1=a/b+f;
               question1=a+"/"+b+"+"+f;
            }
            answer[i]=d1;
            result1.add(question1+"="+d1);
        }
      //�������list��ֵ  
		for ( int k = 0; k < result1.size(); k++){
			  System.out.println(result1.get(k));
			}
		WriteToFile write=new WriteToFile("result.txt",result1);
		System.out.println("д��ɹ���");
        }
if(p==2){
            int M,Z;
            System.out.println("��������Ŀ������");
            Scanner scan2=new Scanner(System.in);
            x=scan2.nextInt();
            String answer[]=new String [x];
            ArrayList<String> result2=new ArrayList<String>();
            String question2=new String();
            int x1,x2,B,m1,m2;
            System.out.println("201571030117");
            for(i=0;i<x;i++){
                m1=1+(int)(Math.random()*10);//�������һ��С��B�ķ�ĸ
                x1=1+(int)(Math.random()*m1);//����һ���ȷ�ĸС�ķ��ӣ�ʵ�������
                m2=1+(int)(Math.random()*10);//�������һ��С��B�ķ�ĸ
                x2=1+(int)(Math.random()*m2);//����һ���ȷ�ĸС�ķ��ӣ�ʵ�������
                int c=(int)(Math.random()*3);//���������
                if(c==0){
                    Z=x1*m2+x2*m1;
                    M=m1*m2;
                    d=yuefen(Z,M);
                    question2=x1+"/"+m1+"+"+x2+"/"+m2;
                }
                if(c==1){
                    Z=x1*m2-x2*m1;
                    M=m1*m2;
                    d=yuefen(Z,M);
                    question2=x1+"/"+m1+"-"+x2+"/"+m2;
                }
                if(c==2){
                    Z=x1*x2;
                    M=m1*m2;
                    d=d=yuefen(Z,M);
                    question2=x1+"/"+m1+"*"+x2+"/"+m2;
                }
         if(c==3){
                    Z=m1*x2;
                    M=m2*x1;
                    d=d=yuefen(Z,M);
                    question2=x1+"/"+m1+"/"+x2+"/"+m2;
                }
                answer[i]=d;
                result2.add(question2+"="+d);
            }
          //�������list��ֵ  
    		for ( int k = 0; k < result2.size(); k++){
    			  System.out.println(result2.get(k));
    			}
    		WriteToFile write=new WriteToFile("result.txt",result2);
    		System.out.println("д��ɹ���");
        }
if(p==3){
	
	System.out.println("����������");
    Scanner scan3=new Scanner(System.in);
    x=scan3.nextInt();
    int answer[]=new int [x];
    ArrayList<String> result3=new ArrayList<String>();
    String question3=new String();
    System.out.println("201571030117");
    for(i=0;i<x;i++){
        int a=(int)(Math.random()*100);//�������һ��1-10������
        int b=(int)(Math.random()*100);//�������һ��1-10������             a>b
        int f=(int)(Math.random()*100);//�������һ��1-10������
        if(b>a){
        	 int temp=a;
             a=b;
             b=temp;
        }
        int c=(int)(Math.random()*4);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����,
        if(c==0)
        	 if(c==0)
             {
                 d2=(a+b)+f;
                 question3="("+a+"+"+b+")"+"+"+f;
             }
             if(c==1)
             {
                 d2=(a-b)+f;
                 question3="("+a+"-"+b+")"+"+"+f;
             }
             if(c==2)
             {
                 d2=a*(b*f);
                 question3=a+"*"+"("+b+"*"+f+")";
             }
             if(c==3)
             {
            	 b=decide(a, b);
                l=(a/b);
                d2=l+f;
                question3="("+a+"/"+b+")"+"+"+f;
             }
             answer[i]=d2;
             result3.add(question3+"="+d2);
         }
  //�������list��ֵ  
	for ( int k = 0; k < result3.size(); k++){
		  System.out.println(result3.get(k));
		}
	WriteToFile write=new WriteToFile("result.txt",result3);
	System.out.println("д��ɹ���");
    }
}
        
    }

  