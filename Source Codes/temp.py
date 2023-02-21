def nextMove(n,r,c,grid):
    pi,pj = 0,0
    ans = ""
    for i in range(0,n):
        for j in range(0,n):
            if(grid[i][j] == 'p'):
                pi = i
                pj = j
                break
    tv = pi - r
    th = pj - c
    print(tv,th)
    if ((abs(tv) > abs(th)) and (abs(tv) is not 0)):
        if(tv>0):
            ans = "DOWN"
        else:
            ans = "UP"
    if abs(tv) < abs(th) and abs(th) is not 0:
        if(th>0):
            ans = "RIGHT"
        else:
            ans = "LEFT"
    else:
        if(tv>0):
            ans = "DOWN"
        else:
            ans = "UP"
    return ans

n = int(input())
r,c = [int(i) for i in input().strip().split()]
grid = []
for i in range(0, n):
    grid.append(input())

print(nextMove(n,r,c,grid))