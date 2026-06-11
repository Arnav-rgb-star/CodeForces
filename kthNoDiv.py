import math
import sys

input = sys.stdin.readline;
t=int(input());

for _ in range(t):
    n,k=map(int,input().split());
    
    grp=math.ceil(k/(n-1));
    cnt=(grp-1)*(n-1);
    lb=n*(grp-1);
    l=k-cnt;
    
    number=l+lb;
    print(number);