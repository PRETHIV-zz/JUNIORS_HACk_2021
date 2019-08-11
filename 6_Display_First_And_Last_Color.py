'''IP: RED GREEN WHITE BLACK
   OP: RED BLACK'''
l=list(input().split())
print(*[l[i] for i in range(len(l)) if i==0 or i==len(l)-1])
