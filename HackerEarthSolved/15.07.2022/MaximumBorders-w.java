import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.*;
class TestClass {
    public static int r_id=0,c_id=0,ans=0,tempAns=0,temp=0;
    public static int [][] arr;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /*
    //plan-with-function
    public static void countAns(long rowCount,long colCount)
    {
        arr= new char[rowCount][colCount];
        for(r_id=0L ; r_id<rowCount ; r_id++)
        {
            for(c_id=0L ; c_id<colCount ; c_id++)
            { 
                temp=br.read();
                if(temp!='\n')
                {
                    arr[r_id][c_id]=temp;
                }
                if(c_id==0)
                {
                    continue;
                }
                if(arr[r_id][c_id] == 35L)
                {
                    if(arr[r_id][c_id-1]==35L)
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
                    tempAns=0L;
                    // continue;
                }

            }
            tempAns=0L;
        }
        tempAns=0L;
        for(c_id=0L ; c_id<colCount ; c_id++)
        {
            for(r_id=1L ; r_id<colCount ; r_id++)
            { 
                if(arr[r_id][c_id] == 35L)
                {
                    if(arr[r_id-1][c_id] == 35L)
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
                    tempAns=0L;
                    // continue;
                }

            }
            tempAns=0L;
        }
        System.out.println(ans);
        System.gc();
    }
    */

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        
        String[] tempRow;             // Reading input from STDIN
        int n_numMtrxRows;
        int m_numMtrxCols;
        char [] tempCharArray;
        int t_testCaseCount=Integer.parseInt(br.readLine());
        while(t_testCaseCount>0)
        {
            tempRow=(br.readLine()).split(" ");
            n_numMtrxRows=Integer.parseInt(tempRow[0]);
            m_numMtrxCols=Integer.parseInt(tempRow[1]);
            /*
            //plan-with-function
            countAns(n_numMtrxRows,m_numMtrxCols);*/
                //arr= new char[rowCount][colCount];
                arr= new int[n_numMtrxRows][m_numMtrxCols];
                for(r_id=0 ; r_id<n_numMtrxRows ; r_id++)
                {
                    tempCharArray = (br.readLine()).toCharArray();
                    arr[r_id][0]=tempCharArray[0];
                    for(c_id=1 ; c_id<m_numMtrxCols ; c_id++)
                    { 
                        arr[r_id][c_id]=tempCharArray[c_id];
                        // temp=br.read();
                        // if(temp!='\n')
                        // {
                        //     arr[r_id][c_id]=(temp);
                        // }
                        // else
                        // {
                        //     break;
                        // }
                        // if(c_id==0)
                        // {
                        //     continue;
                        // }
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
                System.out.println(ans);
                System.gc();
            t_testCaseCount--;
        }
    }
}
