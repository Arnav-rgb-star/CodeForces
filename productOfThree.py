import math
import sys

input =sys.stdin.readline;

t=int(input());

for _ in range(t):
    n=int(input());
    
    can=False;
    list=[];
    
    for i in range(2,10**5):
        if n%i ==0:
            n//=i
            list.append(i)
            if len(list)==2:
                break;
    
    if n>1:
        list.append(n);
        
    if(len(set(list))==3):
        can=True;
        
    if(can):
        print("YES");
        for i in (list):
            print(i,end=" ");
        print()
            
    else:
        print("NO")
    