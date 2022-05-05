class SortingList
{
	void sort(int a1[])
	{
		int n = a1.length;
		for(int i=0; i<n-1;i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a1[j] > a1[j+1])
				{
					int temp =a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
	}
	void selection(int a1[])
	{
		int n = a1.length;
		for(int i=0; i<=n-1;i++)
		{
			int min=i;
			for(j=j+1; j<n; j++)
			{
				if(a1[j]< a1[min])
				{
					min = j;
				}
				
				int temp = a1[min];
				a1[min]=a1[i];
				a1[i]= temp;
				
			}
		}
		public void sort1(int a1[])
		{
			int n =a1.length;
			
			for(int i= n/2-1; i>=0;i--)
			{
				heapify(a1,n,i);
			}
			
			for(int i=n-1; i>0; i--)
			{
				int temp = a1[0];
				a1[0]=a1[i];
				a1[i]= temp;
				heapify(a1, i, 0)
			}
		}
		void heapify(int a1[], int n, int i)
		{
			int lorgest = i;
			int l = 2*i;
			int r = 2*i+1;
			
			if (l < n && a1[l] > a1[largest])
			largest = l;
		
		    if (r < n && a1[r] > a1[largest])
			largest = r;
		
		    if (largest !=1)
				
			int temp = a1[i];
			a1[i]=a1[largest];
			a1[lorgest] = temp;
			heapify(a1, n, largest);
		}
	}
	void insertion(int a1[])
	{
		int n=a1.length;
		for(int i=1; i<n; i++)
		{
			int k =a1[i];
			int j = i-1;
			
			while(j>=0; && a1[j]>k)
			{
				a1[j+1] = a1[j];
				j=j-1;
			}
		}
	}
	void display(int a1[])
	{
		int n = a1.length;
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a1[i]);
		}
	}
	public static void main(String args[])
	{
		SortingList s1 = new SortingList();
		int a1[] = {}

		
		
		
		
			
				
				