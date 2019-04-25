public static void main(String[] args) {
        int size= 5;
        int a, b, t;
        int nums[]= {3, 4, 5, 6, 7};
        
        for (a=1; a< size; a++)
        {
            for (b= size-1; b >= a; b--)
            { 
                if (nums [b-1] > nums [b])
                {
                    t = nums[b-1];
                    nums [b-1] = nums[b];
        nums[b] = t;
                }
                
            }
        
    }
        for(int i=0;i<5;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
