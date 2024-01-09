int n = 5;
int[] arr = {2,4,7,3,9};
int i = 0;
int max = arr[0];

while( i < n )
{
    if(arr[i]>max)
    {
        max = arr[i];
    }
    i = i + 1;
}
Console.Write(max);

max = arr[0];
for(int j=0;j<n;j++)
    {
        if (arr[j]>max)
        {
            max = arr[j];
        }
        
    }
    Console.Write(max);

max = arr[0];
foreach(int e in arr)
{
    if(e>max)
    {
        max=e;
    }

}
Console.Write(max);