def calculate_Sum(num):
    sum = 0
    for number in num:
        sum+=number
    return sum
numberlist = [10,40,60,80,94,83]
result = calculate_Sum(numberlist)
print("The sum of all the numbers is: " + str(result))
