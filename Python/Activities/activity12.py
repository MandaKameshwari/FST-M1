def calculateSum(num):
    if num:
        return num + calculateSum(num-1)
    else:
        return 0
 
# Call calculateSum() function
res = calculateSum(10)
 
# Print result
print(res)