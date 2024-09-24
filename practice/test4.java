public class test4 {
    public static void main(String[] args) {
        int fc=1,price=0;
        String flavour =null;
        boolean topings=true;
        boolean dryfruits=true;
        if(fc==1)
        {
            price=100;
            flavour="vanilla";
        }
        if(fc==2)
        {
            price=115;
            flavour="kiwi";
        }
        if(fc==3)
        {
            price=135;
            flavour="Dragon";
        }
        if(topings==true)
        {
            price=price+20;
        }
        if(dryfruits==true)
        {
            price=price+30;
        }
        float gst=price*(18/100f);
        float total=price+gst;
        System.out.println(price);
        System.out.println(gst);
        System.out.println(total);
    }
}
