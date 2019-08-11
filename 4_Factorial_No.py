def p(n):
    return 1 if n==0 else n*p(n-1)
print(p(int(input())))
