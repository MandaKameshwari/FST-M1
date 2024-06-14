fruit_shop =  {
    "blueberry" :10,
    "strawberry" :20,
    "gauva" :30,
    "mango" :40,
    "grapes" :50
}

available_fruit = input("Please enter the name of your desired fruit ? ").lower()
if(available_fruit in fruit_shop):
    print("The fruit is available")
else:
    print ("The fruit is not available")    