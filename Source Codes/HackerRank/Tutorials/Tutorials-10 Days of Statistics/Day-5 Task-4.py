import math
mean = 70
stddev = 10
def Prob(x):
    probability = 0.5*(1+math.erf((x-70)/(10*math.sqrt(2))))
    return probability
ans1 = 1-Prob(80)
ans2 = 1-Prob(60)
ans3 = Prob(60)
print('{:.2f}'.format(ans1))
print('{:.2f}'.format(ans2))
print('{:.2f}'.format(ans3))
