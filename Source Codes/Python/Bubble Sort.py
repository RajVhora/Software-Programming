def Bubble_Sort():
    n=int(input("Enter the number of elements in list to be sorted:"))
    myarr = []
    print("Enter the elements")
    for x in range(0,n):
        y = int(input())
        myarr.append(y)
    for x in range(0,n):
        for y in range(0,n-1):
            if myarr[y]>myarr[y+1] :
                temp=myarr[y]
                myarr[y]=myarr[y+1]
                myarr[y+1]=temp
    for x in range(0,n):
        print(myarr[x])
Bubble_Sort()