public class Test5 {
    public static void main(String[] args) {
        int p=36,c=87,m=25,o=84;
        if(p<35 || c<35 || m<35||o<35)
        {
            System.out.println("Fail");
        }
        if(p<35)
        System.out.println("Fail in physics");
        if(c<35)
        System.out.println("fail in che");
        if(m<35)
        System.out.println("fail in maths");
        if(o<35)
        System.out.println("fail in optional");
        int total =p+c+m+o;
        if(p>=35)
        {
            if(c>=35)
             {
                if(m>=35)
                {
                    if(o>=35)
                    {
                        float per = (total*100)/400;
                        System.out.println(per);
                    }
                }
             }
           
            

    }
}
}