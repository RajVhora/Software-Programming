import numpy as np
import sys


#Find the value of Polynomial at given point
def f(x,arr,degree):
    answer = 0.0
    for i in range(degree+1):
        answer = answer + (x**i)*arr[i]
    return answer


#Function that prints Polynomial
def printPoly(arr,degree):
    i = degree
    while(i >= 0):
        if(arr[i] >= 0):
            print("+")
        print(arr[i],"*(x^",i,") ")
        i = i - 1
    print("\n")
    return


def derivative(arr,degree):
    deri = []
    for i in range(1,degree+1):
        deri.append(arr[i]*i)
    return deri


def MinMax(arr,lower,upper,degree):
    min = sys.float_info.max
    max = sys.float_info.min
    i = lower
    while(i<=upper):
        val = f(i,arr,degree)
        if (val > max):
            max = val
        if (val < min):
            min = val
        i = i + 0.001
    return min,max


def FindRoots(arr,degree,x):
    deri = derivative(arr,degree)
    while abs(f(x,arr,degree)) != 0.0:
        slope = f(x,deri,degree-1)
        xinter = (slope*x - f(x,arr,degree))/slope
        x = xinter
    return x


#Accept Polynomial Coefficients as input
arr = []
degree = int(input("Enter the degree of polynomial : "))
for i in range(0,degree+1):
    arr.append(float(input()))
printPoly(arr,degree)


#Value of Polynomial at a point
x = float(input("Enter the number at which value of Polynomial is required : "))
print("\n","Value of Polynomial at ",x," is ",f(x,arr,degree))


#Finding Derivative
print("Derivative of polynomial is : ")
printPoly(derivative(arr,degree),degree-1)


#Finding Minimum and Maximum in the interval
lowerlim = float(input("Enter Lower Limit"))
upperlim = float(input("Enter Upper Limit"))
[min,max] = MinMax(arr,lowerlim,upperlim,degree)
print(min,max)


#Finding root
x = float(input("Enter a number around which root is likely : "))
root = FindRoots(arr,degree,x)
print("Root of polynomial is : ",round(root,3))




