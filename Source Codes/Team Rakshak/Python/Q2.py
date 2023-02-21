#Converting a decimal number to equivalent binary number
def recursive_binary(num):
    if(num > 1):
        recursive_binary(int(num/2))
    print(num%2,end='')
    return

num = int(input("Enter a number : "))
recursive_binary(num)


#We also have a direct function to convert decimal numbers to equivalent binary numbers
print(bin(num).replace('0b',''))


#Binary to Decimal
def bin_to_dec(bin_num):
    decimal = 0
    i = 0
    while(bin_num != 0):
        bit = bin_num % 10
        decimal = decimal + bit*pow(2,i)
        i = i + 1
        bin_num = bin_num // 10
    return decimal
print(bin_to_dec(100))


#We also have a direct function for Binary to Decimal
bin_num = 1011101
int(str(bin_num),2)


#Decimal to Binary for Floating point numbers  
def dec_num_to_binary(num):
    intnum = int(num/1)
    fltnum = num%1
    intbistr = bin(intnum).replace('0b','')
    fltbistr = ""
    i = -1
    while(i != -10):
        if(fltnum >= pow(2,i)):
            fltbistr+="1"
            fltnum = fltnum - pow(2,-1)
        else:
            fltbistr+="0"
        i=i-1
    return intbistr+"."+fltbistr


dec_num_to_binary(50.75)


#Binary to Decimal for Floating point numbers
def bin_to_dec(num):
    inte,flt = num.split('.')
    intpart = int(inte,2)
    fltpart = 0
    for i in range(0,len(flt)):
        fltpart = fltpart + int(flt[i])*pow(2,-i-1)
    return intpart+fltpart


bin_to_dec('1001.10')


#Addition and Subtraction of binary numbers
num1 = input("Enter First Binary Number : ")
num2 = input("Enter Second Binary Number : ")
num1dec = bin_to_dec(num1)
num2dec = bin_to_dec(num2)
print("Addition : ",num1dec+num2dec)
print("Subtraction : ",num1dec-num2dec)





