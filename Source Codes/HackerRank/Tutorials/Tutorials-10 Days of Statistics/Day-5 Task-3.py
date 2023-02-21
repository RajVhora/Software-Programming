import math
mean = 20
stddev = 2
def Prob(x):
    probability = 0.5*(1+math.erf((x-20)/(2*math.sqrt(2))))
    return probability
ans1 = Prob(19.5)
ans2 = Prob(22) - Prob(20)
print('{:.3f}'.format(ans1))
print('{:.3f}'.format(ans2))
