import math
def Prob(x):
    mean = 100*2.4
    stddev = 2 * math.sqrt(100)
    probability = 0.5*(1+math.erf((x-mean)/(stddev*math.sqrt(2))))
    return probability
ans1 =Prob(250)
print('{:.4f}'.format(ans1))
