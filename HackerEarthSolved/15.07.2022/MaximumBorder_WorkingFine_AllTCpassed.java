import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass 
{
    public static int r_id=0,c_id=0,ans=0,tempAns=0,temp=0;
    public static int [][] arr;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    
    public static void main(String args[] ) throws Exception 
    {
        String[] tempRow;             
        int n_numMtrxRows;
        int m_numMtrxCols;
        char [] tempCharArray;
        int t_testCaseCount=Integer.parseInt(br.readLine());
        while(t_testCaseCount>0)
        {
            tempAns=0;
            ans=0;
            tempRow=(br.readLine()).split(" ");
            n_numMtrxRows=Integer.parseInt(tempRow[0]);
            m_numMtrxCols=Integer.parseInt(tempRow[1]);
            arr= new int[n_numMtrxRows][m_numMtrxCols];
                for(r_id=0 ; r_id < n_numMtrxRows ; r_id++)
                {
                    tempCharArray = (br.readLine()).toCharArray();
                    arr[r_id][0]=tempCharArray[0];
                    for(c_id=1 ; c_id < m_numMtrxCols ; c_id++)
                    { 
                        arr[r_id][c_id]=tempCharArray[c_id];
                        if(arr[r_id][c_id] == 35)
                        {
                            if(arr[r_id][c_id-1]==35)
                            {
                                tempAns++;
                            }
                        }
                        else
                        {
                            if(tempAns > ans)
                            {
                                ans = tempAns;
                            }
                            tempAns=0;
                            // continue;
                        }
                    }
                    tempAns=0;
                }
                tempAns=0;
                for(c_id=0 ; c_id<m_numMtrxCols ; c_id++)
                {
                    for(r_id=1 ; r_id<n_numMtrxRows ; r_id++)
                    { 
                        if(arr[r_id][c_id] == 35)
                        {
                            if(arr[r_id-1][c_id] == 35)
                            {
                                tempAns++;
                            }
                        }
                        else
                        {
                            if(tempAns > ans)
                            {
                                ans = tempAns;
                            }
                            tempAns=0;
                            // continue;
                        }
                    }
                    tempAns=0;
                }
                System.out.println(ans+1);
                System.gc();
            t_testCaseCount--;
        }
    }
}
