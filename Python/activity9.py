numlist1 = [10,19,27,5,4,3]
numlist2 = [2,3,5,6,8,7,90]
print ("List 1 is : ", numlist1)
print("List 2 is : ",numlist2)
numlist3 = []

for num in numlist1:
    if(num%2 == 0):
        numlist3.append(num)
for num in numlist2:
    if (num%2 ==0):
        numlist3.append(num)
print("The result is : ", numlist3)