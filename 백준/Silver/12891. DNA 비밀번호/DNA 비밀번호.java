import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        //전체 문자역의 길이
        int S = Integer.parseInt(st.nextToken());
        //부분 문자열의 길이
        int P = Integer.parseInt(st.nextToken());
        //몇개의 부분문자열이 유효한지 저장하는 변수
        int Result = 0;
        //전체 문자열이 들어갈 배열
        char A[] = new char[S];
        //부분문자열에 포함되어야 할 각 문자의 개수 배열
        checkArr = new int[4];
        //현재 부분문자열
        myArr = new int[4];
        //비밀번호 유효성 검사 변수 (4인경우 유효 4이하인 경우 불용)
        checkSecret = 0;

        //전체문자열을 A에 할당 부분문자열의 필요 개수를 checkArr에 할당
        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for (int i=0; i<4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            //
            if(checkArr[i] == 0) {
                checkSecret++;
            }
        }

        //부분문자열의 길이만큼 첫 myArr 설정
        for (int i=0; i<P; i++) {
            Add(A[i]);
        }
        if(checkSecret==4) {
            Result++;
        }

        for(int i=P; i<S; i++){
            int j= i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4)
                Result++;
        }

        System.out.println(Result);
        bf.close();

    }

    //Add 하는 경우 먼저 myArr을 증가시킴
    public static void Add(char C) {
        switch ( C ) {
            case 'A' :
                myArr[0]++;
                if(myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            case 'C' :
                myArr[1]++;
                if(myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            case 'G' :
                myArr[2]++;
                if(myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            case 'T' :
                myArr[3]++;
                if(myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }

    public static void Remove(char C) {
        switch ( C ) {
            case 'A' :
                if(myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G' :
                if(myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }

    }
}