from sklearn import linear_model
ar1 = list(map(int, input().rstrip().split()))
x = []
y = []
for i in range(0,ar1[1]):
    ar2 = list(map(float, input().rstrip().split()))
    y.append(ar2[ar1[0]])
    ar2.remove(y[i])
    x.append(ar2)
lm = linear_model.LinearRegression()
lm.fit(x, y)
a = lm.intercept_
b = lm.coef_
testcases = int(input())
for i in range(0,testcases):
    ar3 = list(map(float, input().rstrip().split()))
    ans = a
    for j in range(0,ar1[0]):
        ans = ans + (b[j]*ar3[j])
    print(ans)