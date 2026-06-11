
import sys
mod=10**9+7;

input = sys.stdin.readline;
t=int(input());

for _ in range(t):
    gubba,bhaalu=map(int,input().split())
    
    ans=1;
    for i in range(0,bhaalu):
        ans=(ans*gubba)%mod;
    
    print(ans);

    