import math
def Prob(x):
    mean = 49*205
    stddev = 15 * math.sqrt(49)
    probability = 0.5*(1+math.erf((x-mean)/(stddev*math.sqrt(2))))
    return probability
ans1 =Prob(9800)
print('{:.4f}'.format(ans1))
